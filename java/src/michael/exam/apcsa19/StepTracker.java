package michael.exam.apcsa19;

public class StepTracker {
    private int minNumOfSteps;
    private int days;
    private int reachedGoal;
    private int steps;
    
    public StepTracker(int minNumOfSteps) {
        super();
        this.minNumOfSteps = minNumOfSteps;
    }

    public void addDailySteps(int steps) {
        if (steps >= minNumOfSteps) {
            reachedGoal++;
        }       
        this.steps += steps;
        days++;
    }
    
    public int activeDays() {
        return reachedGoal;
    }
    
    public double averageSteps() {
        if (days > 0) {
            return ((double) steps) / days;
        }
        return 0;
    }
}
