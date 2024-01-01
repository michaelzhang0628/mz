package michael.exam.apcsa12;

public class ClimbInfo {
    private String name;
    private int time;
    
    public ClimbInfo(String peakName, int climbTime) {
        name = peakName;
        time = climbTime;
    }
    
    public String getName() {
        return name;
    }
    
    public int getTime() {
         return time;    
    }
}
