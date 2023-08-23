package michael.freeresponse;

public class DiceSimulation {
    private int numSampleSize;
    private int numFaces;

    public DiceSimulation(int numSamples, int faces) {
        numSampleSize = numSamples;
        numFaces = faces;
    }

    /*
     * generate an integer between 1 and numFaces
     */
    public int roll() {
        return (int) ((Math.random() * numFaces) + 1);
    }

    /**
     * Simulates rolling two dice with the number faces given, for the number of
     * sample size rolls. Returns the percentage of matches that were rolled as an
     * integer (eg. 0.50 would be 50)
     */
    public int runSimulation() {
        int dice1 = 0;
        int dice2 = 0;
        int sameFace = 0;
        for (int i = 0; i < numSampleSize; i++) {
            dice1 = roll();
            dice2 = roll();
            if (dice1 == dice2) {
                sameFace++;
            }
        }
        return (int) Math.round(((double) (sameFace * 100)) / numSampleSize);
    }

    public static final void main(String[] args) {
        System.out.println((int) 4.4);
        System.out.println((int) 4.9);
        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.9));
        System.out.println(4 * 100 / 10);
        System.out.println(11 * 100 / 20);
        System.out.println(Math.round(((double) (11 * 100)) / 200));
    }
}
