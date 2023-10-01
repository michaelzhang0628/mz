package michael.exam.apcsa19;

import java.util.ArrayList;
import java.util.List;

public class StepTracker2 {
    private int minNumOfSteps;
    private List<Integer> daily = new ArrayList<Integer>();

    public StepTracker2(int minNumOfSteps) {
        super();
        this.minNumOfSteps = minNumOfSteps;
    }
    
    public void addDailySteps(int steps) {
        this.daily.add(steps);
    }
    
    public int activeDays() {
        int active = 0;
        for (int dailySteps: this.daily) {
            if (dailySteps >= minNumOfSteps) {
                active++;
            }       
        }
        return active;
    }
    
    public double averageSteps() {
        int totalSteps = 0;
        for (int dailySteps: this.daily) {
            totalSteps += dailySteps;
        }
        if (this.daily.size() > 0) {
            return ((double) totalSteps) / this.daily.size();
        }
        return 0;
    }
}
