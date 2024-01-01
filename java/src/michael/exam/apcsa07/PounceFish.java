package michael.exam.apcsa07;

import java.util.ArrayList;

public class PounceFish extends Fish {
    private int range;
    // North is n
    // East is e
    // South is s
    // West is w
    private char directionFacing;
    private ArrayList<Fish> others;

    public PounceFish(int x, int y, int range, char directionFacing, ArrayList<Fish> others) {
        super(x, y);
        this.range = range;
        this.directionFacing = directionFacing;
        this.others = others;
    }

    public ArrayList<Fish> getOthers() {
        return others;
    }

    public char getDirectionFacing() {
        return directionFacing;
    }

    boolean isInEnv() {
        return others !=null && !others.isEmpty();
    }

    Fish findFish() {
        Fish found = null;
        int leastDistance = range;
        for (Fish other : others) {
            // 0 means it is not in the direction
            int currentDistance = 0;
            if (directionFacing == 'n' && other.getY() == y) {
                currentDistance = x - other.getX();
            } else if (directionFacing == 's' && other.getY() == y) {
                currentDistance = other.getX() - x;
            } else if (directionFacing == 'e' && other.getX() == x) {
                currentDistance = other.getY() - y;
            } else if (directionFacing == 'w' && other.getX() == x) {
                currentDistance = y - other.getY();
            }
            if (currentDistance > 0 && currentDistance <= range) {
                if (currentDistance <= leastDistance) {
                    found = other;
                    leastDistance = currentDistance;
                }
            }
        }
        return found;
    }

    public void act() {
        if (isInEnv()) {
            Fish f = findFish();
            if (f != null) {
                int otherX = f.getX();
                int otherY = f.getY();
                others.remove(f);
                x = otherX;
                y = otherY;
            }
        }
    }
}
