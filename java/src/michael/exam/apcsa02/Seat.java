package michael.exam.apcsa02;

import java.util.Objects;

public class Seat {
    private Passenger passenger;
    private String type;
    
    public Seat(Passenger passenger, String type) {
        super();
        this.passenger = passenger;
        this.type = type;
    }

    public Passenger getPassenger() {
        return passenger;
    }
    
    public String getType() {
        return type;
    }
    
    public void setPassenger(Passenger p) {
        passenger = p;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passenger, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Seat))
            return false;
        Seat other = (Seat) obj;
        return Objects.equals(passenger, other.passenger) && Objects.equals(type, other.type);
    }
    
    
}
