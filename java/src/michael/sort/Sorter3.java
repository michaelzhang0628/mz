package michael.sort;

import java.util.List;

public class Sorter3 extends Sorter2 implements Sorter {

    @Override
    public int searchInOrderedList(int x, List<Integer> sortedList, int start, int length) {
        if (length < 30) {
            return searchLinear(x, sortedList, start, length);
        }
        int m = length / 2;
        if (sortedList.get(start + m) == x) {
            return start + m;
        } else if (sortedList.get(start + m) > x) {
            return searchInOrderedList(x, sortedList, start, m);
        } else {
            return searchInOrderedList(x, sortedList, start + m, length - m);
        }
    }
}
