package michael.exam.apcsa15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiverseArrayTest {

    @Test
    void test() {
        int[] arr1 = new int[] {1, 3, 2, 7, 3};
        assertEquals(16, DiverseArray.arraySum(arr1));
        int[][] mat1 = {{1, 3, 2, 7, 3}, {10, 10, 4, 6, 2}, {5, 3, 5, 9, 6}, {7, 6, 4, 2, 1}};
        assertEquals(16, DiverseArray.rowSums(mat1)[0]);
        assertEquals(32, DiverseArray.rowSums(mat1)[1]);
        assertEquals(28, DiverseArray.rowSums(mat1)[2]);
        assertEquals(20, DiverseArray.rowSums(mat1)[3]);
        int[][] mat2 = {{1, 1, 5, 3, 4}, {12, 7, 6, 1, 9}, {8, 11, 10, 2, 5}, {3, 2, 3, 0, 6}};
        int[][] mat3 = {{12, 7, 6, 1, 9}, {1, 1, 5, 3, 4}, {8, 11, 10, 2, 5}, {3, 2, 3, 0, 6}};
        assertTrue(DiverseArray.isDiverse(mat1));
        assertFalse(DiverseArray.isDiverse(mat2));
        assertFalse(DiverseArray.isDiverse(mat3));
    }

}
