package michael.exam.apcsa01;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class StationTest {

    @Test
    void testResetAll() {
        Pump[] myPumps = new Pump[4];
        myPumps[0] = new Pump();
        myPumps[1] = new Pump();
        myPumps[2] = new Pump();
        myPumps[3] = new Pump();
        myPumps[0].setGallonsSold(20.0);
        myPumps[1].setGallonsSold(10.0);
        myPumps[2].setGallonsSold(1.0);
        myPumps[3].setGallonsSold(10.0);
        Station s = new Station(1.0, myPumps);
        s.resetAll();
        assertEquals(0.0, s.getPumps()[0].getGallonsSold());
        assertEquals(0.0, s.getPumps()[1].getGallonsSold());
        assertEquals(0.0, s.getPumps()[2].getGallonsSold());
        assertEquals(0.0, s.getPumps()[3].getGallonsSold());
    }
    
    @Test
    void testTotalSales() {
        Pump[] myPumps = new Pump[4];
        myPumps[0] = new Pump();
        myPumps[1] = new Pump();
        myPumps[2] = new Pump();
        myPumps[3] = new Pump();
        myPumps[0].setGallonsSold(20.0);
        myPumps[1].setGallonsSold(10.0);
        myPumps[2].setGallonsSold(1.0);
        myPumps[3].setGallonsSold(10.0);
        Station s = new Station(1.0, myPumps);
        assertEquals(48.5, s.totalSales());
    }
    
    @Test
    void testCloseStation() throws IOException {
        Pump[] myPumps = new Pump[4];
        myPumps[0] = new Pump();
        myPumps[1] = new Pump();
        myPumps[2] = new Pump();
        myPumps[3] = new Pump();
        myPumps[0].setGallonsSold(20.0);
        myPumps[1].setGallonsSold(10.0);
        myPumps[2].setGallonsSold(1.0);
        myPumps[3].setGallonsSold(10.0);
        Station s = new Station(1.0, myPumps);
        
        File f = new File("/Users/michaelzhang/git/mz/java/src/michael/exam/apcsa01/station-total-sales.txt");
        f.delete();
        if (f.exists()) {
            fail("damn the fie still there");
        }
        
        s.closeStation();
        
        if (!f.exists()) {
            fail("damn the fie doesn't exist");
        }
        
        assertEquals(0.0, s.getPumps()[0].getGallonsSold());
        assertEquals(0.0, s.getPumps()[1].getGallonsSold());
        assertEquals(0.0, s.getPumps()[2].getGallonsSold());
        assertEquals(0.0, s.getPumps()[3].getGallonsSold());
    }

}

