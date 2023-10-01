package michael.exam.apcsa21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CombinedTableTest {

    @Test
    void testCombinedTable() {
        SingleTable t1 = new SingleTable(4, 74, 60.0);
        SingleTable t2 = new SingleTable(8, 74, 70.0);
        SingleTable t3 = new SingleTable(12, 76, 75.0);
        CombinedTable c1 = new CombinedTable(t1, t2);
        assertTrue(c1.canSeat(9));
        assertFalse(c1.canSeat(11));
        assertEquals(65.0, c1.getDesirability());
        CombinedTable c2 = new CombinedTable(t2, t3);
        assertTrue(c2.canSeat(18));
        assertEquals(62.5, c2.getDesirability());
        t2.setViewQuality(80);
        assertEquals(67.5, c2.getDesirability());        
    }

}
