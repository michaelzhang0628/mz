package michael.exam.apcsa02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatsTest {

    @Test
    void testCalculateModes() {
        Stats s = new Stats(new int[]{0,0,10,5,10,0,7,1,0,6,0,10,3,0,0,1});
        assertArrayEquals(new int[]{2, 4, 11}, s.calculateModes());
    }
    
    @Test
    void testKthDataValue() {
        Stats s = new Stats(new int[]{0,0,10,5,10,0,7,1,0,6,0,10,3,0,0,1});
        assertEquals(2, s.kthDataValue(1));
        assertEquals(3, s.kthDataValue(14));
        assertEquals(3, s.kthDataValue(15));
        assertEquals(4, s.kthDataValue(16));
    }

}
