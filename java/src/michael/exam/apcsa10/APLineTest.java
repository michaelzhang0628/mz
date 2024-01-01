package michael.exam.apcsa10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class APLineTest {

    @Test
    void testAPLine() {
        APLine line1 = new APLine(5, 4, -17);
        assertEquals(-1.25, line1.getSlope());
        assertTrue(line1.isOnLine(5, -2));
        APLine line2 = new APLine(-25, 40, 30);
        assertEquals(0.625, line2.getSlope());
        assertFalse(line2.isOnLine(5, -2));
    }

}
