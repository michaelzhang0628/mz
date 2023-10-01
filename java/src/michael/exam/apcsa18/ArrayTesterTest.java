package michael.exam.apcsa18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTesterTest {

    @Test
    void testGetColumn() {
        int[][] arr2D = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, { 9, 5, 3 } };
        assertArrayEquals(new int[] { 1, 4, 7, 5 }, ArrayTester.getColumn(arr2D, 1));
        assertArrayEquals(new int[] { 2 }, ArrayTester.getColumn(new int[][]{ { 0, 1, 2 } }, 2));
        assertArrayEquals(new int[] {}, ArrayTester.getColumn(new int[][]{}, 0));
    }

    @Test
    void testIsLatin() {
        // True
        int[][] arr1 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
        int[][] arr2 = { { 10, 30, 20, 0 }, { 0, 20, 30, 10 }, { 30, 0, 10, 20 }, { 20, 10, 0, 30 } };
        assertTrue(ArrayTester.isLatin(arr1));
        assertTrue(ArrayTester.isLatin(arr2));
        
        // False
        int[][] arr3 = { { 1, 2, 1 }, { 2, 1, 1 }, { 1, 1, 2 } };
        int[][] arr4 = { { 1, 2, 3 }, { 3, 1, 2 }, { 7, 8, 9 } };
        int[][] arr5 = { { 1, 2 }, { 1, 2 } };
        assertFalse(ArrayTester.isLatin(arr3));
        assertFalse(ArrayTester.isLatin(arr4));
        assertFalse(ArrayTester.isLatin(arr5));
    }
}
