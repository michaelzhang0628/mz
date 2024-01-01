package michael.exam.apcsa08;

import java.util.Objects;

public class StringPart {
    private int start;
    private int length;
    
    public StringPart(int start, int length) {
        this.start = start;
        this.length = length;
    }
    
    public int getStart() {
        return start;
    }
    
    public int getLength() {
        return length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, start);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof StringPart))
            return false;
        StringPart other = (StringPart) obj;
        return length == other.length && start == other.start;
    }
}
