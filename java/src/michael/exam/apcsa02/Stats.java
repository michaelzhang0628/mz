package michael.exam.apcsa02;
import java.util.ArrayList;
import java.util.List;


public class Stats {
    private int[] tally;

    public Stats(int[] tally) {
        super();
        this.tally = tally;
    }
    
    public int findMax() {
        int most = tally[0];
        for (int i = 1; i < tally.length; i++) {
            if (tally[i] > most) {
                most = tally[i];
            }
        }
        return most;
    }
    
    public int[] calculateModes() {
        int max = findMax();
        List<Integer> modes = new ArrayList<Integer>();
        for (int i = 0; i < tally.length; i++) {
            if (tally[i] == max) {
                modes.add(i);
            }
        }
        return modes.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int kthDataValue(int index) {
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < tally.length; i++) {
            if (tally[i] > 0) {
                for (int j = 0; j < tally[i]; j++) {
                    numbers.add(i);
                }
            }  
        }
        return numbers.get(index - 1);
    }
    
}
