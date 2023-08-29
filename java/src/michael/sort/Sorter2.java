package michael.sort;

import java.util.List;

public class Sorter2 extends AbstractSearchSorter implements Sorter {
    @Override
    public int searchInOrderedList(Comparable x, List<Comparable> sortedList, int start, int length) {
        return searchLinear(x, sortedList, start, length);
    }

    protected int searchLinear(Comparable x, List<Comparable> sortedList, int start, int length) {
        if (length == 0) {
            return start;
        }
        if (x.compareTo(sortedList.get(start)) < 0) {
            return start;
        }
        for (int i = start + 1; i < start + length; i++) {
            if (x.compareTo(sortedList.get(i)) < 0) {
                return i;
            }
        }
        return start + length;
    }
}
