package michael.sort;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSearchSorter implements Sorter {

    /**
     * Search for the first number that is bigger or equal to the specified x in a
     * sorted list, starting at start for length number of times
     */
    public abstract int searchInOrderedList(Comparable x, List<Comparable> sortedList, int start, int length);

    public List<Comparable> sort(List<Comparable> unsortedList) {
        List<Comparable> sortedList = new ArrayList<Comparable>();
        for (int i = 0; i < unsortedList.size(); i++) {
            Comparable x = unsortedList.get(i);
            int index = searchInOrderedList(x, sortedList, 0, sortedList.size());
            sortedList.add(index, x);
        }
        return sortedList;
    }

}
