package michael.exam.apcsa05;

import java.util.ArrayList;

public class Hotel {
    private Reservation[] rooms;
    private ArrayList<String> waitList;

    public Hotel(Reservation[] rooms, ArrayList<String> waitList) {
        super();
        this.rooms = rooms;
        this.waitList = waitList;
    }

    public Reservation requestRoom(String guestName) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }

    public Reservation cancelAndReassign(Reservation res) {
        int roomNumber = res.getRoomNumber();
        if (waitList.size() > 0) {
            String guestName = waitList.remove(0);
            rooms[roomNumber] = new Reservation(guestName, roomNumber);
            return rooms[roomNumber];
        } 
        return null;
    }
}
