package michael.exam.apcsa03;

import java.util.Objects;

public class College {
    private String name;
    private String region;
    private int tuition;
    
    public College(String name, String region, int tuition) {
        super();
        this.name = name;
        this.region = region;
        this.tuition = tuition;
    }

    public String getName() {
        return name;
    }
    
    public String getRegion() {
        return region;
    }
    
    public int getTuition() {
        return tuition;
    }
    
    public void setTuition(int newTuition) {
        tuition = newTuition;;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, region, tuition);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof College))
            return false;
        College other = (College) obj;
        return Objects.equals(name, other.name) && Objects.equals(region, other.region) && tuition == other.tuition;
    }
    
    
}
