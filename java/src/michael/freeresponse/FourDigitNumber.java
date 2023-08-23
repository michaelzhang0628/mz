package michael.freeresponse;

public class FourDigitNumber {
    private int value;
    private int thouDigit;
    private int hundDigit;
    private int tensDigit;
    private int onesDigit;

    // creates a FourDigitNumber from aValue
    // 999 <= aValue <= 9999

    public FourDigitNumber(int aValue) {
        value = aValue;
        thouDigit = value / 1000;
        hundDigit = value / 100 % 10;
        tensDigit = value % 100 / 10;
        onesDigit = value % 10;
    }

    public int getValue() {
        return this.value;
    }

    public int getThouDigit() {
        return this.thouDigit;
    }

    public int getHundDigit() {
        return this.hundDigit;
    }

    public int getTensDigit() {
        return this.tensDigit;
    }

    public int getOnesDigit() {
        return this.onesDigit;
    }
}
