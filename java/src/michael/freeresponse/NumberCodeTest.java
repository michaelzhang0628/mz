package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberCodeTest {

    @Test
    void testToDigit() {
        assertEquals(5, NumberCode.toDigit("5"));
        assertEquals(1, NumberCode.toDigit("1"));
        assertEquals(-1, NumberCode.toDigit("w"));
        assertEquals(9, NumberCode.toDigit("9"));    
    }
    
    @Test
    void testGetNumberCode() {
        NumberCode nc = new NumberCode(2);
        assertEquals(14, nc.getNumberCode("12345"));
        NumberCode nc1 = new NumberCode(3);
        assertEquals(260, nc1.getNumberCode("23456789"));
        assertEquals(40, nc.getNumberCode("4w80"));
        assertEquals(480, nc1.getNumberCode("456w8"));   
    }
}
