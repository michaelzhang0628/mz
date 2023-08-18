package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FourDigitNumberTest {

    @Test
    void test() {
        FourDigitNumber num = new FourDigitNumber(1234);
        assertEquals(1234, num.getValue());
        assertEquals(1, num.getThouDigit());
        assertEquals(2, num.getHundDigit());
        assertEquals(3, num.getTensDigit());
        assertEquals(4, num.getOnesDigit());
        num = new FourDigitNumber(9);
        assertEquals(9, num.getValue());
        assertEquals(0, num.getThouDigit());
        assertEquals(0, num.getHundDigit());
        assertEquals(0, num.getTensDigit());
        assertEquals(9, num.getOnesDigit());
    }

}
