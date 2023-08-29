package michael.sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sorter1 implements Sorter {
    private Comparable getMin(List<Comparable> newUnsortedList) {
        Comparable min = newUnsortedList.get(0);
        int listSize = newUnsortedList.size();
        for (int i = 1; i < listSize; i++) {
            if (min.compareTo(newUnsortedList.get(i)) > 0) {
                min = newUnsortedList.get(i);
            }
        }
        return min;
    }

    @Override
    public List<Comparable> sort(List<Comparable> unsortedList) {
        List<Comparable> sortedList = new LinkedList<Comparable>();
        List<Comparable> newUnsortedList = new ArrayList<Comparable>(unsortedList);
        while (newUnsortedList.size() > 0) {
            Comparable min = getMin(newUnsortedList);
            sortedList.add(min);
            newUnsortedList.remove(newUnsortedList.indexOf(min));
        }
        return sortedList;
    }
}
