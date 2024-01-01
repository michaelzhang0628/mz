package michael.exam.apcsa02;

import java.util.Objects;

public class Passenger {
    private String name;
    
    public Passenger(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Passenger))
            return false;
        Passenger other = (Passenger) obj;
        return Objects.equals(name, other.name);
    }
    
    
}
