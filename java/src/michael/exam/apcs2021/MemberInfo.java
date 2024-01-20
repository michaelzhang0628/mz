package michael.exam.apcs2021;

import java.util.Objects;

public class MemberInfo {
    private String name;
    private int gradYear;
    private boolean hasGoodStanding;
    
    public MemberInfo(String name, int gradYear, boolean hasGoodStanding) {
        super();
        this.name = name;
        this.gradYear = gradYear;
        this.hasGoodStanding = hasGoodStanding;
    }
    
    public int getGradYear() {
        return gradYear;
    }
    
    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradYear, hasGoodStanding, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof MemberInfo))
            return false;
        MemberInfo other = (MemberInfo) obj;
        return gradYear == other.gradYear && hasGoodStanding == other.hasGoodStanding
                && Objects.equals(name, other.name);
    }
    
    
}
