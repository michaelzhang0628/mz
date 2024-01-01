package michael.exam.apcsa14;

import java.util.Objects;

public class Student {
    private String name;
    private int absenceCount;
    
    public Student(String name, int absenceCount) {
        super();
        this.name = name;
        this.absenceCount = absenceCount;
    }

    public String getName() {
        return name;
    }
    
    public int getAbsenceCount() {
        return absenceCount;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Student))
            return false;
        Student other = (Student) obj;
        return Objects.equals(name, other.name);
    }
}
