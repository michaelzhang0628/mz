package michael.exam.apcsa21;

public class MemberInfo {
    private String name;
    private int gradeYear;
    private boolean hasGoodStanding;
    
    public MemberInfo(String name, int gradeYear, boolean hasGoodStanding) {
        this.name = name; 
        this.gradeYear = gradeYear;
        this.hasGoodStanding = hasGoodStanding;
    }
    
    public int getGradeYear() {
        return gradeYear;
    }
    
    public boolean inGoodStanding() {
        return hasGoodStanding;
    }

    public String getName() {
        return name;
    }
}
