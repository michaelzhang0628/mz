package michael.exam.apcsa21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayRealizerTest {

    @Test
    void test() {
        int[][] testData = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}};
        assertFalse(ArrayRealizer.isNonZeroRow(testData, 0));
        assertTrue(ArrayRealizer.isNonZeroRow(testData, 1));
        assertFalse(ArrayRealizer.isNonZeroRow(testData, 2));
        assertTrue(ArrayRealizer.isNonZeroRow(testData, 3));
        assertEquals(2, ArrayRealizer.numNonZeroRows(testData));
        assertArrayEquals(new int[]{1, 3, 2}, ArrayRealizer.resize(testData)[0]);
        assertArrayEquals(new int[]{4, 5, 6}, ArrayRealizer.resize(testData)[1]);
    }

}
