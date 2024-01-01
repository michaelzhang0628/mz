package michael.exam.apcsa08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import michael.exam.apcsa09.NumberTile;
import michael.exam.apcsa09.TileGame;

class TripTest {

    private Trip getTrip() {
        ArrayList<Flight> f = new ArrayList<Flight> ();
        f.add(new Flight(new Time(690), new Time(735)));
        f.add(new Flight(new Time("1:15 PM"), new Time(945)));
        f.add(new Flight(new Time(960), new Time(1125)));
        f.add(new Flight(new Time(1335), new Time(1380)));
        return new Trip(f);
    }
    
    @Test
    void testTime() {
        Time t1 = new Time(780);
        Time t2 = new Time(855);
        assertEquals(75, t1.minutesUntil(t2));
        assertEquals(-75, t2.minutesUntil(t1));
    }
    
    @Test
    void testGetDuration() {
        Trip t = this.getTrip();
        assertEquals(690, t.getDuration());
    }

    @Test
    void testGetShortestLayover() {
        Trip t = this.getTrip();
        assertEquals(15, t.getShortestLayover());
    }
    
}
