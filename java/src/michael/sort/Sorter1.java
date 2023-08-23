package michael.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sorter1 implements Sorter {

    public Sorter1() {
        System.out.println("Sorter1 is called");
    }

    private int getMin(List<Integer> list) {
        int min = list.get(0);
        int listSize = list.size();
        for (int i = 1; i < listSize; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    @Override
    public List<Integer> sort(List<Integer> unsortedList) {
        List<Integer> sortedList = new LinkedList<Integer>();
        List<Integer> newUnsortedList = new ArrayList<>(unsortedList);
        while (newUnsortedList.size() > 0) {
            int min = getMin(newUnsortedList);
            sortedList.add(min);
            newUnsortedList.remove(newUnsortedList.indexOf(min));
        }
        return sortedList;
    }
}
