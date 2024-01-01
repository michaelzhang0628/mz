package michael.exam.apcsa04;

public class Robot {
    private int[] hall;
    private int pos;
    private boolean facingRight;

    public Robot(int[] hall, int pos, boolean facingRight) {
        super();
        this.hall = hall;
        this.pos = pos;
        this.facingRight = facingRight;
    }

    public int getPos() {
        return pos;
    }

    public boolean forwardMoveBlocked() {
        if ((facingRight && pos == hall.length - 1) || (!facingRight && (pos == 0))) {
            return true;
        }
        return false;
    }

    public void move() {
        if (hall[pos] > 0) {
            hall[pos]--;
        }
        if (hall[pos] == 0) {
            if (forwardMoveBlocked()) {
                facingRight = !facingRight;
            } else {
                if (facingRight) {
                    pos++;
                } else {
                    pos--;
                }
            }
        }
    }

    public int clearHall() {
        int moves = 0;
        while (!hallIsClear()) {
            move();
            moves++;
        }
        return moves;
    }

    private boolean hallIsClear() {
        for (int i = 0; i < hall.length; i++) {
            if (hall[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
