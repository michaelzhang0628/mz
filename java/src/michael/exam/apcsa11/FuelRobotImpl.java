package michael.exam.apcsa11;

public class FuelRobotImpl implements FuelRobot {
    private int currentIndex;
    private boolean isFacingRight;

    public FuelRobotImpl(int currentIndex, boolean isFacingRight) {
        super();
        this.currentIndex = currentIndex;
        this.isFacingRight = isFacingRight;
    }

    @Override
    public int getCurrentIndex() {
        return currentIndex;
    }

    @Override
    public boolean isFacingRight() {
        return isFacingRight;
    }

    @Override
    public void changeDirection() {
        isFacingRight = !isFacingRight;
    }

    @Override
    public void moveForward(int numLocs) {
        if (isFacingRight) {
            for (int i = 0; i < numLocs; i++) {
                currentIndex++;
            }
        } else {
            for (int i = 0; i < numLocs; i++) {
                currentIndex--;
            }

        }
    }
}
