package michael.exam.apcsa12;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ClimbingClubTest {

    @Test
    void testAddClimb1() {
        ClimbingClub club = new ClimbingClub();
        club.addClimb1("Monadnock", 274);
        club.addClimb1("Whiteface", 301);
        club.addClimb1("Algonquin", 225);
        club.addClimb1("Monadnock", 344);
        assertEquals(4, club.distinctPeakNames());
        assertEquals(3, club.distinctPeakNames2());
    }
    
    @Test
    void testAddClimb2() {
        ClimbingClub club = new ClimbingClub();
        club.addClimb2("Monadnock", 274);
        club.addClimb2("Whiteface", 301);
        club.addClimb2("Algonquin", 225);
        club.addClimb2("Monadnock", 344);
        
        assertEquals(3, club.distinctPeakNames());
        assertEquals(3, club.distinctPeakNames2());
    }
    
    @Test
    void testAddClimb3() {
        ClimbingClub club = new ClimbingClub();
        club.addClimb3("Monadnock", 274);
        club.addClimb3("Whiteface", 301);
        club.addClimb3("Algonquin", 225);
        club.addClimb3("Monadnock", 344);
        
        assertEquals(3, club.distinctPeakNames());
        assertEquals(3, club.distinctPeakNames2());
    }

}
