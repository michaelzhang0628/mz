package michael.exam.apcsa17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DigitsTest {

    @Test
    void testDigits() {
        Digits d1 = new Digits(15704);
        assertEquals(5, d1.getDigitList().size());
        assertEquals(1, d1.getDigitList().get(0));
        assertEquals(5, d1.getDigitList().get(1));
        assertEquals(7, d1.getDigitList().get(2));
        assertEquals(0, d1.getDigitList().get(3));
        assertEquals(4, d1.getDigitList().get(4));
        Digits d2 = new Digits(0);
        assertEquals(1, d2.getDigitList().size());
        assertEquals(0, d2.getDigitList().get(0));
    }
    
    @Test
    void testIsStrictlyIncreasing() {
        assertTrue(new Digits(7).isStrictlyIncreasing());
        assertTrue(new Digits(1356).isStrictlyIncreasing());
        assertFalse(new Digits(1336).isStrictlyIncreasing());
        assertFalse(new Digits(1536).isStrictlyIncreasing());
        assertFalse(new Digits(65310).isStrictlyIncreasing());
    }   

}
