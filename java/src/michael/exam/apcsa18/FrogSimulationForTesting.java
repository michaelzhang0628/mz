package michael.exam.apcsa18;

public class FrogSimulationForTesting extends FrogSimulation {
    private int[] distances;
    private int i = 0;
    public FrogSimulationForTesting(int dist, int numHops, int[] distances) {
        super(dist, numHops);
        this.distances = distances;
    }
    
    @Override
    protected int hopDistance() {
        return distances[i++];
    }

}
