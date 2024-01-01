package michael.exam.apcsa03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TreasureMapTest {

    public TreasureMap mapWithTreasure() {
        boolean[][] map = new boolean[6][9];
        map[0][1] = true;
        map[0][2] = true;
        map[0][4] = true;
        map[0][6] = true;
        map[1][1] = true;
        map[1][6] = true;
        map[2][1] = true;
        map[2][3] = true;
        map[2][4] = true;
        map[2][7] = true;
        map[2][8] = true;
        map[3][0] = true;
        map[3][2] = true;
        map[3][4] = true;
        map[3][5] = true;
        map[4][1] = true;
        map[4][4] = true;
        map[4][7] = true;
        map[5][0] = true;
        map[5][3] = true;
        map[5][5] = true;
        TreasureMap tm = new TreasureMap(map);
        return tm;
    }
    
    @Test
    void testHasTreasure() {
        TreasureMap tm = mapWithTreasure();
        assertTrue(tm.hasTreasure(0, 2));
        assertFalse(tm.hasTreasure(0, -1));
        assertTrue(tm.hasTreasure(2, 3));
        assertFalse(tm.hasTreasure(2, 2));
        assertFalse(tm.hasTreasure(4, 9));
    }
    
    @Test
    void testNumAjdacent() {
        TreasureMap tm = mapWithTreasure();
        assertEquals(5, tm.numAjdacent(3, 3));
        assertEquals(3, tm.numAjdacent(2, 4));
        assertEquals(0, tm.numAjdacent(4, 7));
    }
    
    @Test
    void testComputeCount() {
        boolean[][] map = new boolean[3][5];
        map[0][1] = true;
        map[0][3] = true;
        map[0][4] = true;
        map[1][0] = true;
        map[2][1] = true;
        map[2][2] = true;
        TreasureMap tm = new TreasureMap(map);
        int[][] requiredMap = new int[3][5];
        requiredMap[0][0] = 2;
        requiredMap[0][1] = 9;
        requiredMap[0][2] = 2;
        requiredMap[0][3] = 9;
        requiredMap[0][4] = 9;
        requiredMap[1][0] = 9;
        requiredMap[1][1] = 4;
        requiredMap[1][2] = 4;
        requiredMap[1][3] = 3;
        requiredMap[1][4] = 2;
        requiredMap[2][0] = 2;
        requiredMap[2][1] = 9;
        requiredMap[2][2] = 9;
        requiredMap[2][3] = 1;
        requiredMap[2][4] = 0;
        assertArrayEquals(requiredMap, tm.computeCounts());
    }

}
