package michael.exam.apcsa18;

public class FrogSimulation {
    private int goalDistances;
    private int maxHops;
    
    public FrogSimulation(int dist, int numHops) {
        this.goalDistances = dist;
        this.maxHops = numHops;
    }
    
    protected int hopDistance() {
        return (int) (Math.random() * 40 - 8);
    }
    
    public boolean simulate() {
        int position = 0;
        int hopsLeft = maxHops;
        while (position < goalDistances && position >= 0 && hopsLeft > 0) {
            position += hopDistance();
            hopsLeft--;
        }
        if (position >= goalDistances) {
            return true;
        }
        return false;
    }
    
    public double runSimulations(int num) {
        int successfulRuns = 0;
        for (int i = 0; i < num; i++) {
            if (simulate()) {
                successfulRuns++;
            }
        }
        return ((double) successfulRuns) / num;
    }
}
