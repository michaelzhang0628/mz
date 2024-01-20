package michael.exam.apcs2022;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataTest {

    @Test
    void testRepopulate() {
        Data data = new Data(10, 2, 2);
        data.repopulate();
        assertArrayEquals(new int[][] {{10, 10}, {10, 10}}, data.getGrid());
        data = new Data(200, 2, 2);
        data.repopulate();
        for (int i = 0; i < data.getGrid().length; i++) {
            for (int j = 0; j < data.getGrid()[0].length; j++) {
                assertTrue(data.getGrid()[i][j] % 10 == 0 && data.getGrid()[i][j] % 100 != 0 );
            }
        }
    }
    
    @Test
    void testCountIncreasingCols() {
        Data data = new Data(600, 3, 3);
        int[][] grid = new int[][] {{10, 50, 40}, {20, 40, 20}, {30, 50, 30}};
        data.setGrid(grid);
        assertEquals(1, data.countIncreasingCols());
        grid = new int[][] {{10, 540, 440, 440}, {220, 450, 440, 190}};
        data.setGrid(grid);
        assertEquals(2, data.countIncreasingCols());
    }

}
