package michael.sort;

import java.util.List;

public class Sorter3 extends Sorter2 implements Sorter {
    @Override
    public int searchInOrderedList(Comparable x, List<Comparable> sortedList, int start, int length) {
        if (length < 30) {
            return searchLinear(x, sortedList, start, length);
        }
        int m = length / 2;
        if (sortedList.get(start + m) == x) {
            return start + m;
        } else if (x.compareTo(sortedList.get(start + m)) < 0) {
            return searchInOrderedList(x, sortedList, start, m);
        } else {
            return searchInOrderedList(x, sortedList, start + m, length - m);
        }
    }
}
