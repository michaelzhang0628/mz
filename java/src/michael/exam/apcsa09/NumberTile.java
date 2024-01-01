package michael.exam.apcsa09;

public class NumberTile {
    private int topEdgeValue;
    private int rightEdgeValue;
    private int bottomEdgeValue;
    private int leftEdgeValue;
    
    public NumberTile(int topEdgeValue, int rightEdgeValue, int bottomEdgeValue, int leftEdgeValue) {
        super();
        this.topEdgeValue = topEdgeValue;
        this.rightEdgeValue = rightEdgeValue;
        this.bottomEdgeValue = bottomEdgeValue;
        this.leftEdgeValue = leftEdgeValue;
    }
    
    public void rotate() {
        int t = topEdgeValue;
        int r = rightEdgeValue;
        int b = bottomEdgeValue;
        int l = leftEdgeValue;
        topEdgeValue = l;
        rightEdgeValue = t;
        bottomEdgeValue = r;
        leftEdgeValue = b;
    }
    
    public int getLeft() {
        return leftEdgeValue;
    }
    
    public int getRight() {
        return rightEdgeValue;
    }

    public int getTopEdgeValue() {
        return topEdgeValue;
    }

    public int getBottomEdgeValue() {
        return bottomEdgeValue;
    }

    @Override
    public String toString() {
        return "[" + topEdgeValue + ", " + rightEdgeValue + ", "
                + bottomEdgeValue + ", " + leftEdgeValue + "]";
    }
}
