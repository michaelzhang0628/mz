package michael.exam.apcs2021;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayResizerTest {

    @Test
    void testIsNonZeroRow() {
        int[][] arr = {{2, 1, 0}, 
                       {1, 3, 2}, 
                       {0, 0, 0}, 
                       {4, 5, 6}};
        assertFalse(ArrayResizer.isNonZeroRow(arr, 0));
        assertTrue(ArrayResizer.isNonZeroRow(arr, 1));
        assertFalse(ArrayResizer.isNonZeroRow(arr, 2));
        assertTrue(ArrayResizer.isNonZeroRow(arr, 3));
    }
    
    @Test
    void testResize() {
        int[][] arr = {{2, 1, 0}, 
                       {1, 3, 2}, 
                       {0, 0, 0}, 
                       {4, 5, 6}};
        int[][] expected = {{1, 3, 2}, {4, 5, 6}};
        assertArrayEquals(expected, ArrayResizer.resize(arr));
    }

}
