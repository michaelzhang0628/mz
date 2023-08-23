package michael.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTest {

    @Test
    void testStringConstuctor() {
        Binary b = new Binary("10110010");
        assertEquals(178, b.getDecimal());
        assertEquals("10110010", b.toString());
    }

    @Test
    void testDecimalConstuctor() {
        Binary b = new Binary(178);
        assertEquals(178, b.getDecimal());
        assertEquals("10110010", b.toString());
    }

}
