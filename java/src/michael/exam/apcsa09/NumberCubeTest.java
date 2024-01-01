package michael.exam.apcsa09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NumberCubeTest {

    @Test
    void testToss() {
        NumberCube nc = new NumberCube();
        for (int i=0;i<1000;i++) {
        assertTrue(nc.toss() >= 1 && nc.toss() <= 6);
        }
    }
    
    @Test
    void testGetCubeTosses() {
        NumberCube nc = new NumberCube();
        int count = 8;
        assertEquals(count, NumberCube.getCubeTosses(nc, count).length);
        count = 19;
        assertEquals(count, NumberCube.getCubeTosses(nc, count).length);
    }

    @Test
    void testGetLongestRun() {
        NumberCube nc = new NumberCube();
        int[] dieRolls = new int[] {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
        assertTrue(NumberCube.getLongestRun(dieRolls) == 6 || NumberCube.getLongestRun(dieRolls) == 14);
        dieRolls = new int[] {1, 2};
        assertTrue(NumberCube.getLongestRun(dieRolls) == -1);
        dieRolls = new int[] {1};
        assertTrue(NumberCube.getLongestRun(dieRolls) == -1);
    }

}
