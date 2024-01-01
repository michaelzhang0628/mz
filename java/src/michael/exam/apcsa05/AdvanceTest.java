package michael.exam.apcsa05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AdvanceTest {

    @Test
    void testGetPrice() {
        Advance a = new Advance(1);
        assertEquals(40, a.getPrice());
        a = new Advance(100);
        assertEquals(30, a.getPrice());
        a = new Advance(9);
        assertEquals(40, a.getPrice());
        a = new Advance(10);
        assertEquals(30, a.getPrice());
    }
    
    @Test
    void testGetSerialNumber() {
        Advance a1 = new Advance(1);
        assertEquals(1, a1.getSerialNumber());
        Advance a2 = new Advance(1);
        assertEquals(2, a2.getSerialNumber());
        StudentAdvance sa = new StudentAdvance(10);
        assertEquals(3, sa.getSerialNumber());
    }

}
