package michael.exam.apcsa13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SkyViewTest {

    @Test
    void testConstructor() {
        double[] scanned = new double[] {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
        SkyView sv = new SkyView(4, 3, scanned);
        double[][] x = new double[4][3];
        x[0][0] = 0.3;
        x[0][1] = 0.7;
        x[0][2] = 0.8;
        x[1][0] = 1.1;
        x[1][1] = 1.4;
        x[1][2] = 0.4;
        x[2][0] = 0.2;
        x[2][1] = 0.5;
        x[2][2] = 0.1;
        x[3][0] = 0.9;
        x[3][1] = 0.6;
        x[3][2] = 1.6;
        assertArrayEquals(x, sv.getView());
        double[] scanned2 = new double[] {0.3, 0.7, 0.8, 0.4, 1.4, 1.1};
        SkyView sv2 = new SkyView(3, 2, scanned2);
        double[][] y = new double[3][2];
        y[0][0] = 0.3;
        y[0][1] = 0.7;
        y[1][0] = 0.4;
        y[1][1] = 0.8;
        y[2][0] = 1.4;
        y[2][1] = 1.1;
        assertArrayEquals(y, sv2.getView());
    }
    
    @Test
    void testGetAverage() {
        double[] scanned = new double[] {0.3, 0.7, 0.8, 0.4, 1.4, 1.1, 0.2, 0.5, 0.1, 1.6, 0.6, 0.9};
        SkyView nightSky = new SkyView(4, 3, scanned);
        double[][] x = new double[4][3];
        x[0][0] = 0.3;
        x[0][1] = 0.7;
        x[0][2] = 0.8;
        x[1][0] = 1.1;
        x[1][1] = 1.4;
        x[1][2] = 0.4;
        x[2][0] = 0.2;
        x[2][1] = 0.5;
        x[2][2] = 0.1;
        x[3][0] = 0.9;
        x[3][1] = 0.6;
        x[3][2] = 1.6;
        assertEquals(0.8, nightSky.getAverage(1, 2, 0, 1));
    }

}
