package michael.exam.apcsa05;

import java.util.Objects;

public class Reservation {
    private String name;
    private int roomNum;
    
    public Reservation(String guestName, int roomNumber) {
        name = guestName;
        roomNum = roomNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRoomNumber() {
        return roomNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roomNum);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Reservation))
            return false;
        Reservation other = (Reservation) obj;
        return Objects.equals(name, other.name) && roomNum == other.roomNum;
    }
    
    
}
