package michael.exam.apcsa05;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class HotelTest {
    
    private Reservation[] getRooms() {
        Reservation[] rooms = new Reservation[5];
        rooms[0] = new Reservation("Paul", 0);
        rooms[1] = new Reservation("Sean", 1);
        rooms[2] = new Reservation("Tia", 2);
        rooms[4] = new Reservation("Ian", 4);
        return rooms;
    }
    
    @Test
    void testRequestRoom() {
        Reservation[] rooms = getRooms();
        ArrayList<String> waitList = new ArrayList<String>();
        Hotel h = new Hotel(rooms, waitList);
        assertEquals(new Reservation("Cole", 3), h.requestRoom("Cole"));
        assertNull(h.requestRoom("Jacob"));
    }
    
    @Test
    void testCancelAndReassign() {
        Reservation[] rooms = getRooms();
        rooms[3] = new Reservation("Alexa", 3);
        ArrayList<String> waitList = new ArrayList<String>();
        waitList.add("Izzy");
        Hotel h = new Hotel(rooms, waitList);
        assertEquals(new Reservation("Izzy", 3), h.cancelAndReassign(new Reservation("Alexa", 3)));
        assertNull(h.cancelAndReassign(new Reservation("Tia", 3)));
    }
}
