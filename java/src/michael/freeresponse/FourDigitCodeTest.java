package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FourDigitCodeTest {

    @Test
    void test() {
        FourDigitCode num = new FourDigitCode(3412);
        assertFalse(num.isValid());
        num = new FourDigitCode(7610);
        assertTrue(num.isValid());
        num = new FourDigitCode(894);
        assertFalse(num.isValid());
    }

}
