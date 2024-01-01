package michael.exam.apcsa11;

public class Sound {
    private int[] samples;

    public Sound(int[] samples) {
        super();
        this.samples = samples;
    }

    public int[] getSamples() {
        return samples;
    }
    
    public int limitAmplitude(int limit) {
        int changedNumbers = 0;
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] > Math.abs(limit)) {
                samples[i] = Math.abs(limit);
                changedNumbers++;
            } else if (samples[i] < - Math.abs(limit)) {
                samples[i] = -Math.abs(limit);
                changedNumbers++;
            }
        }
        return changedNumbers;
    }

    public void trimSilenceFromBeginning() {
        int amountOfStartingZeros = 0;
        while (samples[amountOfStartingZeros] == 0) {
            amountOfStartingZeros++;
        }
        int[] otherNumbers = new int[samples.length - amountOfStartingZeros];
        for (int i = amountOfStartingZeros; i < samples.length; i++) {
            otherNumbers[i - amountOfStartingZeros] = samples[i];
        }
        samples = otherNumbers;
    }
}
