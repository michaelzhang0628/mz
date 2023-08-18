package michael.freeresponse;

public class Tour {
    private int actDate;
    // times are represented in military format
    // 1430 for 2:30 pm  
    private int startTime;
    private int endTime; 
    private String activity;

    /* Constructs a Tour
     * All instance fields are initialized from parameters
     */

    Tour(int actDate, int startTime, int endTime, String activity) {
        this.actDate = actDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.activity = activity;
    }

    public int getActDate() {
        return actDate;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public String getActivity() {
        return activity;
    }
    
    @Override
    public String toString() {
        return super.toString() + " " + activity + " from " + this.startTime + " to " + this.endTime + " on " + this.actDate;
    }
}

