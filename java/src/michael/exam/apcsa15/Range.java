package michael.exam.apcsa15;

public class Range implements NumberGroup {
    private int minValue, maxValue;
    
    public Range(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public boolean contains(int value) {
        return minValue <= value && value <= maxValue;
    }
}
