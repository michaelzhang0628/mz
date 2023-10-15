package michael.exam.apcsa16;

import java.util.ArrayList;

public class RandomStringChooser {
    private ArrayList<String> remainingValues;
    
    public RandomStringChooser(String[] values) {
        remainingValues = new ArrayList<String>();
        for (String value : values) {
            remainingValues.add(value);
        }
    }

    public String getNext() {
        if (remainingValues.size() == 0) {
            return "NONE";
        }
        int index = (int) (Math.random() * remainingValues.size());
        return remainingValues.remove(index);
    }
}
