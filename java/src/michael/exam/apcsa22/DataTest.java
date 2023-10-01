package michael.exam.apcsa22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataTest {

    @Test
    void testRepopulate() {
        Data d = new Data(4, 3);
        d.repopulate();
        int[][] numbers = d.getGrid();
        assertEquals(4, numbers.length);
        assertEquals(3, numbers[0].length);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                assertTrue(numbers[i][j]>0);
                assertTrue(numbers[i][j]<=Data.MAX);
                assertEquals(0, numbers[i][j]%10);
                assertNotEquals(0, numbers[i][j]%100);
            }
        }

    }
}
