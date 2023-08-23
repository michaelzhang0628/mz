package michael.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberTest {
    @Test
    void testStringConstuctor() {
        Number n = new Number("12", 12);
        assertEquals(14, n.getDecimal());
        assertEquals("12", n.toString());
        n = new Number("12", 5);
        assertEquals(7, n.getDecimal());
        assertEquals("12", n.toString());
    }
    
    @Test
    void testDecimalConstuctor() {
        Number n = new Number(14, 12);
        assertEquals(14, n.getDecimal());
        assertEquals("12", n.toString());
        n = new Number(7, 5);
        assertEquals(7, n.getDecimal());
        assertEquals("12", n.toString());
    }
    
    @Test
    void testSomething() {
        Number n1 = new Number("12", 5);
        assertEquals(7, n1.getDecimal());  
        Number n2 = new Binary("111");
        assertEquals(7, n2.getDecimal());  
        assertTrue(n1.equals(n2));
        assertEquals(n1.hashCode(), n2.hashCode());
    }

}
