package michael.exam.apcsa18;

public class CodeWordChecker implements StringChecker{
    private int minLength;
    private int maxLength;
    private String notIn;

    public CodeWordChecker(int minLength, int maxLength, String notIn) {
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.notIn = notIn;
    }

    public CodeWordChecker(String notIn) {
        this.minLength = 6;
        this.maxLength = 20;
        this.notIn = notIn;
    }

    public boolean isValid(String str) {
        if (str.length() >= minLength && str.length() <= maxLength) {
            if (str.indexOf(notIn) == -1) {
                return true;
            }
        } 
        return false;
    }
}
