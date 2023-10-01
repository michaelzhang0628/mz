package michael.exam.apcsa17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SuccessorsTest {

    @Test
    void testFindPosition() {
        int[][] arr2D = {{15, 5, 9, 10}, {12, 16, 11, 6}, {14, 8, 13, 7}};
        assertEquals(new Position (2, 1), Successors.findPosition(8, arr2D));
        assertEquals(null, Successors.findPosition(17, arr2D));
    }

    @Test
    void testGetSuccessorArray() {
        int[][] arr2D = {{15, 5, 9, 10}, {12, 16, 11, 6}, {14, 8, 13, 7}};
        Position[][] expected = {{new Position(1, 1), new Position(1, 3), new Position(0, 3), new Position(1, 2)}, {new Position(2, 2), null, new Position(1, 0), new Position(2, 3)}, {new Position(0, 0), new Position(0, 2), new Position(2, 0), new Position(2, 1)}};
        assertArrayEquals(expected , Successors.getSuccessorArray(arr2D));
    }
}
