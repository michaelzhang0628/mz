package michael.exam.apcsa00;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class ModeTest {    
    // GZ used getTestData and used array initializer
    private Mode getTestData() {
        return new Mode(new int[]{3,5,9,10,12,11,9,4});
    }

    @Test
    void testIsMode() {
        Mode m = getTestData();
        assertTrue(m.isMode(4));
        assertFalse(m.isMode(5));
        // GZ added 0, 7, -1, 8
        assertFalse(m.isMode(0));
        assertFalse(m.isMode(7));
        assertFalse(m.isMode(-1));
        assertFalse(m.isMode(8));
    }
    
    @Test
    void testModeIndex() {
        assertEquals(4, getTestData().modeIndex());
        // GZ added a test without mode
        assertEquals(-1, new Mode(new int[]{3,5,9,10,12}).modeIndex());
    }
    
    @Test
    void testPrintHistogram() throws IOException {
        File f = new File("/Users/michaelzhang/git/mz/java/src/michael/exam/apcsa00/histogram.txt");
        f.delete();
        if (f.exists()) {
            fail("damn the fie still there");
        }
        getTestData().printHistogram(20, 'x');
        if (!f.exists()) {
            fail("damn the fie doesn't exist");
        }
    }
}
