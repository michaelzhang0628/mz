package michael.exam.apcsa10;

public class APLine {
    private int a, b, c;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope() {
        return -(a / ((double) b));
    }

    public boolean isOnLine(int x, int y) {
        if (a * x + b * y + c == 0) {
            return true;
        }
        return false;
    }
}
