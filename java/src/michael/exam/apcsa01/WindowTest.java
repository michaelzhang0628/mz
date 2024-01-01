package michael.exam.apcsa01;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WindowTest {

    @Test
    void testIsInBounds() {
        int[][] example = new int[5][4];
        Window w = new Window(example);
        assertTrue(w.isInBounds(0, 0));
        assertTrue(w.isInBounds(2, 1));
        assertTrue(w.isInBounds(4, 3));
        assertFalse(w.isInBounds(5, 3));
        assertFalse(w.isInBounds(3, -1));
        assertFalse(w.isInBounds(8, 8));
    }

    @Test
    void testColorSquare() { 
        int[][] myMat = new int[5][6];
        myMat[0][0] = 10;
        myMat[0][1] = 10;
        myMat[0][2] = 10;
        myMat[0][3] = 10;
        myMat[0][4] = 10;
        myMat[0][5] = 10;
        myMat[1][0] = 10;
        myMat[1][1] = 10;
        myMat[1][2] = 10;
        myMat[1][3] = 20;
        myMat[1][4] = 20;
        myMat[1][5] = 20;
        myMat[2][0] = 20;
        myMat[2][1] = 20;
        myMat[2][2] = 30;
        myMat[2][3] = 30;
        myMat[2][4] = 30;
        myMat[2][5] = 30;
        myMat[3][0] = 30;
        myMat[3][1] = 30;
        myMat[3][2] = 40;
        myMat[3][3] = 40;
        myMat[3][4] = 40;
        myMat[3][5] = 40;
        myMat[4][0] = 40;
        myMat[4][1] = 40;
        myMat[4][2] = 50;
        myMat[4][3] = 50;
        myMat[4][4] = 50;
        myMat[4][5] = 50;
        Window w = new Window(myMat);
        int[][] expected = new int[5][6];
        expected[0][0] = 10;
        expected[0][1] = 10;
        expected[0][2] = 10;
        expected[0][3] = 10;
        expected[0][4] = 10;
        expected[0][5] = 10;
        expected[1][0] = 10;
        expected[1][1] = 10;
        expected[1][2] = 10;
        expected[1][3] = 20;
        expected[1][4] = 20;
        expected[1][5] = 20;
        expected[2][0] = 20;
        expected[2][1] = 66;
        expected[2][2] = 66;
        expected[2][3] = 66;
        expected[2][4] = 30;
        expected[2][5] = 30;
        expected[3][0] = 30;
        expected[3][1] = 66;
        expected[3][2] = 66;
        expected[3][3] = 66;
        expected[3][4] = 40;
        expected[3][5] = 40;
        expected[4][0] = 40;
        expected[4][1] = 66;
        expected[4][2] = 66;
        expected[4][3] = 66;
        expected[4][4] = 50;
        expected[4][5] = 50;
        w.colorSquare(2, 1, 3, 66);
        assertArrayEquals(expected, w.getMyMat());
        expected[2][4] = 77;
        expected[2][5] = 77;
        expected[3][4] = 77;
        expected[3][5] = 77;
        expected[4][4] = 77;
        expected[4][5] = 77;
        w.colorSquare(2, 4, 3, 77);
        assertArrayEquals(expected, w.getMyMat());
    }
    
    @Test
    void testExtractRectangle() {
        int[][] myMat = {
                {00, 00, 00, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 20, 20, 20, 20, 20, 20, 20, 20}, 
                {20, 55, 99, 33, 66, 20, 20, 20, 30, 30, 20},
                {30, 22, 88, 77, 44, 30, 30, 30, 40, 40, 40},
                {40, 40, 40, 40, 30, 30, 30, 50, 50, 50, 50},
                {50, 50, 50, 40, 40, 40, 40, 30, 30, 30, 30},
                {60, 60, 50, 50, 50, 40, 40, 40, 30, 30, 20},
                {70, 70, 70, 50, 50, 50, 40, 40, 40, 30, 30},
                {80, 80, 70, 70, 60, 60, 50, 50, 40, 40, 30},
                {90, 80, 70, 60, 60, 50, 50, 40, 40, 30, 20}
        };
        int[][] expected = {
                {55, 99, 33, 66},
                {22, 88, 77, 44}
        };
        Window w = new Window(myMat);
        assertArrayEquals(expected, w.extractRectangle(new Rectangle(2, 1, 2, 4)));
    }
    
    @Test
    void testEnlarge() {
        int[][] myMat = {
                {00, 00, 00, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 20, 20, 20, 20, 20, 20, 20, 20}, 
                {20, 55, 99, 33, 66, 20, 20, 20, 30, 30, 20},
                {30, 22, 88, 77, 44, 30, 30, 30, 40, 40, 40},
                {40, 40, 40, 40, 30, 30, 30, 50, 50, 50, 50},
                {50, 50, 50, 40, 40, 40, 40, 30, 30, 30, 30},
                {60, 60, 50, 50, 50, 40, 40, 40, 30, 30, 20},
                {70, 70, 70, 50, 50, 50, 40, 40, 40, 30, 30},
                {80, 80, 70, 70, 60, 60, 50, 50, 40, 40, 30},
                {90, 80, 70, 60, 60, 50, 50, 40, 40, 30, 20}
        };
        Window w = new Window(myMat);
        int[][] expected = {
                {00, 00, 00, 10, 10, 10, 10, 10, 10, 10, 10},
                {10, 10, 10, 20, 20, 20, 20, 20, 20, 20, 20}, 
                {20, 55, 55, 55, 99, 99, 99, 33, 33, 33, 66},
                {30, 55, 55, 55, 99, 99, 99, 33, 33, 33, 66},
                {40, 55, 55, 55, 99, 99, 99, 33, 33, 33, 66},
                {50, 22, 22, 22, 88, 88, 88, 77, 77, 77, 44},
                {60, 22, 22, 22, 88, 88, 88, 77, 77, 77, 44},
                {70, 22, 22, 22, 88, 88, 88, 77, 77, 77, 44},
                {80, 80, 70, 70, 60, 60, 50, 50, 40, 40, 30},
                {90, 80, 70, 60, 60, 50, 50, 40, 40, 30, 20}
        };
        w.enlarge(new Rectangle(2, 1, 2, 4), 3);
        assertArrayEquals(expected, w.getMyMat());
    }  
}
