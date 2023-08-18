package michael.freeresponse;

public class FourDigitCode extends FourDigitNumber{
    private int checkDigit;
    private int checkSum;
    
    public FourDigitCode(int aCode) {
        super(aCode);
        checkDigit = getOnesDigit();
        checkSum = getThouDigit() + getHundDigit() + getTensDigit();
    }
    public boolean isValid() {
        if (getValue() < 1000 ||getValue() > 9999) {
            return false;
        }
        else if (this.checkSum % 7 == checkDigit) {
            return true;
        }
        else {
            return false;
        }
    }

}
