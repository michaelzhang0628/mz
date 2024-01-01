package michael.exam.apcsa99;

import java.util.Objects;

public class StudentInfo {
    private String name;
    private int creditHours;
    private double gradePoints;
    private double GPA;
    
    public StudentInfo(String name, int creditHours, double gradePoints) {
        super();
        this.name = name;
        this.creditHours = creditHours;
        this.gradePoints = gradePoints;
    }
    
    public StudentInfo(String name, int creditHours, double gradePoints, double gPA) {
        super();
        this.name = name;
        this.creditHours = creditHours;
        this.gradePoints = gradePoints;
        GPA = gPA;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCreditHours() {
        return creditHours;
    }
    
    public double getGradePoints() {
        return gradePoints;
    }
    
    public double getGPA() {
        return GPA;
    }

    public void setGPA(double gPA) {
        GPA = gPA;
    }

    @Override
    public int hashCode() {
        return Objects.hash(creditHours, gradePoints, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof StudentInfo))
            return false;
        StudentInfo other = (StudentInfo) obj;
        return creditHours == other.creditHours
                && Double.doubleToLongBits(gradePoints) == Double.doubleToLongBits(other.gradePoints)
                && Objects.equals(name, other.name);
    }

    
}

