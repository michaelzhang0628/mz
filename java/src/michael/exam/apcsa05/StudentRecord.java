package michael.exam.apcsa05;

public class StudentRecord {
    private int[] scores;

    public StudentRecord(int[] scores) {
        super();
        this.scores = scores;
    }

    public double average(int first, int last) {
        int sum = 0;
        int numScores = 0;
        int firstIndex = 0;
        int lastIndex = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == first) {
                firstIndex= i;
            }
            if (scores[i] == last) {
                lastIndex = i;
            }
        }
        for (int i = firstIndex; i <= lastIndex; i++) {
            sum += scores[i];
            numScores++;
        }
        return sum / (double) numScores;
    }

    public boolean hasImproved() {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public double finalAverage() {
        int start = 0;
        if (hasImproved()) {
            start = scores.length / 2;
        }
        return average(scores[start], scores[scores.length - 1]);
    }
}
