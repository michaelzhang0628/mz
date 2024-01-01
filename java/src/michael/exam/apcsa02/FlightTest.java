package michael.exam.apcsa02;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlightTest {

    public Flight f() {
        Seat[][] seats = new Seat[3][6];
        seats[0][0] = new Seat(new Passenger("Kelly"), "window");
        seats[0][1] = new Seat(new Passenger("Robin"), "middle");
        seats[0][2] = new Seat(new Passenger(""), "aisle");
        seats[0][3] = new Seat(new Passenger("Sandy"), "aisle");
        seats[0][4] = new Seat(new Passenger(""), "middle");
        seats[0][5] = new Seat(new Passenger("Fran"), "window");
        seats[1][0] = new Seat(new Passenger("Chris"), "window");
        seats[1][1] = new Seat(new Passenger("Alex"), "middle");
        seats[1][2] = new Seat(new Passenger(""), "aisle");
        seats[1][3] = new Seat(new Passenger(""), "aisle");
        seats[1][4] = new Seat(new Passenger("Pat"), "middle");
        seats[1][5] = new Seat(new Passenger("Sam"), "window");
        seats[2][0] = new Seat(new Passenger(""), "window");
        seats[2][1] = new Seat(new Passenger("A"), "middle");
        seats[2][2] = new Seat(new Passenger(""), "aisle");
        seats[2][3] = new Seat(new Passenger(""), "aisle");
        seats[2][4] = new Seat(new Passenger(""), "middle");
        seats[2][5] = new Seat(new Passenger("B"), "window");
        Flight f  = new Flight(seats);
        return f;
    }
    
    @Test
    void testEmptySeatCount() {
        Flight flight  = f();
        assertEquals(5, flight.emptySeatCount("aisle"));
        assertEquals(1, flight.emptySeatCount("window"));
        assertEquals(2, flight.emptySeatCount("middle"));
        assertEquals(8, flight.emptySeatCount("any"));
    }
    
    @Test
    void testFindBlock() {
        Flight flight  = f();
        assertTrue(flight.findBlock(0, 1) == 2 || flight.findBlock(0, 1) == 4);
        assertEquals(-1, flight.findBlock(0, 2));
        assertEquals(2, flight.findBlock(1, 2));
        assertEquals(2, flight.findBlock(2, 2));
        
        Seat[][] seats = new Seat[2][5];
        seats[0][0] = new Seat(new Passenger("Kelly"), "window");
        seats[0][1] = new Seat(new Passenger(""), "aisle");
        seats[0][2] = new Seat(new Passenger("Sandy"), "aisle");
        seats[0][3] = new Seat(new Passenger(""), "middle");
        seats[0][4] = new Seat(new Passenger("Fran"), "window");
        seats[1][0] = new Seat(new Passenger("Chris"), "window");
        seats[1][1] = new Seat(new Passenger(""), "aisle");
        seats[1][2] = new Seat(new Passenger(""), "aisle");
        seats[1][3] = new Seat(new Passenger("Pat"), "middle");
        seats[1][4] = new Seat(new Passenger(""), "window");
        flight  = new Flight(seats);
        assertEquals(-1, flight.findBlock(0, 3));
        assertEquals(-1, flight.findBlock(1, 3));
    }

    @Test
    void testAssignGroups() {
        Seat[][] seats = new Seat[2][5];
        seats[0][0] = new Seat(new Passenger("Kelly"), "window");
        seats[0][1] = new Seat(new Passenger(""), "aisle");
        seats[0][2] = new Seat(new Passenger("Sandy"), "aisle");
        seats[0][3] = new Seat(new Passenger(""), "middle");
        seats[0][4] = new Seat(new Passenger("Fran"), "window");
        seats[1][0] = new Seat(new Passenger("Chris"), "window");
        seats[1][1] = new Seat(new Passenger(""), "aisle");
        seats[1][2] = new Seat(new Passenger(""), "aisle");
        seats[1][3] = new Seat(new Passenger("Pat"), "middle");
        seats[1][4] = new Seat(new Passenger(""), "window");
        Flight flight  = new Flight(seats);
        Passenger[] adults = new Passenger[] {new Passenger("dude1"), new Passenger("dude2"), new Passenger("dude3")};
        assertFalse(flight.assignGroups(adults));
        Seat[][] expected = new Seat[2][5];
        expected[0][0] = new Seat(new Passenger("Kelly"), "window");
        expected[0][1] = new Seat(new Passenger(""), "aisle");
        expected[0][2] = new Seat(new Passenger("Sandy"), "aisle");
        expected[0][3] = new Seat(new Passenger(""), "middle");
        expected[0][4] = new Seat(new Passenger("Fran"), "window");
        expected[1][0] = new Seat(new Passenger("Chris"), "window");
        expected[1][1] = new Seat(new Passenger("Sam"), "aisle");
        expected[1][2] = new Seat(new Passenger("Alex"), "aisle");
        expected[1][3] = new Seat(new Passenger("Pat"), "middle");
        expected[1][4] = new Seat(new Passenger(""), "window");
        Passenger[] kids = new Passenger[] {new Passenger("Sam"), new Passenger("Alex")};
        assertTrue(flight.assignGroups(kids));
        assertArrayEquals(expected, flight.getFlight());
    }
}
