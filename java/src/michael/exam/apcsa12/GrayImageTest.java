package michael.exam.apcsa12;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrayImageTest {

    @Test
    void testCountWhitePixels() {
        int[][] x = new int[4][5];
        x[0][0] = 255;
        x[0][1] = 184;
        x[0][2] = 178;
        x[0][3] = 84;
        x[0][4] = 129;
        x[1][0] = 84;
        x[1][1] = 255;
        x[1][2] = 255;
        x[1][3] = 130;
        x[1][4] = 84;
        x[2][0] = 78;
        x[2][1] = 255;
        x[2][2] = 0;
        x[2][3] = 0;
        x[2][4] = 78;
        x[3][0] = 84;
        x[3][1] = 130;
        x[3][2] = 255;
        x[3][3] = 130;
        x[3][4] = 84;
        GrayImage gi = new GrayImage(x);
        assertEquals(5, gi.countWhitePixels());
    }

    @Test
    void testProccesImage() {
        int[][] x = new int[4][5];
        x[0][0] = 221;
        x[0][1] = 184;
        x[0][2] = 178;
        x[0][3] = 84;
        x[0][4] = 135;
        x[1][0] = 84;
        x[1][1] = 255;
        x[1][2] = 255;
        x[1][3] = 130;
        x[1][4] = 84;
        x[2][0] = 78;
        x[2][1] = 255;
        x[2][2] = 0;
        x[2][3] = 0;
        x[2][4] = 78;
        x[3][0] = 84;
        x[3][1] = 130;
        x[3][2] = 255;
        x[3][3] = 130;
        x[3][4] = 84;
        GrayImage gi = new GrayImage(x);
        gi.processImage();
        int[][] result = gi.getPixelValues();
        
        int[][] expected = new int[4][5];
        expected[0][0] = 221;
        expected[0][1] = 184;
        expected[0][2] = 100;
        expected[0][3] = 84;
        expected[0][4] = 135;
        expected[1][0] = 0;
        expected[1][1] = 125;
        expected[1][2] = 171;
        expected[1][3] = 130;
        expected[1][4] = 84;
        expected[2][0] = 78;
        expected[2][1] = 255;
        expected[2][2] = 0;
        expected[2][3] = 0;
        expected[2][4] = 78;
        expected[3][0] = 84;
        expected[3][1] = 130;
        expected[3][2] = 255;
        expected[3][3] = 130;
        expected[3][4] = 84;
        
        assertArrayEquals(expected, result);
    }
}
