package michael.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HexDecimalTest {

    @Test
    void testStringConstuctor() {
        HexDecimal h = new HexDecimal("1d");
        assertEquals(29, h.getDecimal());
        assertEquals("1d", h.toString());
        HexDecimal h1 = h;
        h = new HexDecimal("1D");
        assertEquals(29, h.getDecimal());
        assertEquals("1d", h.toString());
        h = new HexDecimal("123FEd");
        assertEquals(1196013, h.getDecimal());
        assertEquals("123fed", h.toString());
    }

    @Test
    void testDecimalConstuctor() {
        HexDecimal h = new HexDecimal(29);
        assertEquals(29, h.getDecimal());
        assertEquals("1d", h.toString());
        h = new HexDecimal(1196013);
        assertEquals(1196013, h.getDecimal());
        assertEquals("123fed", h.toString());
    }
}
