package michael.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OctalTest {

    @Test
    void testStringConstuctor() {
        Octal o = new Octal("15");
        assertEquals(13, o.getDecimal());
        assertEquals("15", o.toString());
        o = new Octal("1234");
        assertEquals(668, o.getDecimal());
        assertEquals("1234", o.toString());
    }

    @Test
    void testDecimalConstuctor() {
        Octal o = new Octal(13);
        assertEquals(13, o.getDecimal());
        assertEquals("15", o.toString());
        o = new Octal(668);
        assertEquals(668, o.getDecimal());
        assertEquals("1234", o.toString());
    }

}
