package michael.sort;

import java.util.List;

/*
bubble sort, which works as follows:
• Starting with the first element in the unsortedList compare successive elements 
(0 and 1, 1 and 2, 2 and 3, and so on).
• If the first element of any pair is greater than the second, interchange the two
elements.
• Repeat the process for the whole list until no interchanges are necessary. The list
elements will now be in ascending order.
 */
public class BubbleSorter implements Sorter {

    @Override
    public List<Comparable> sort(List<Comparable> unsortedList) {
        boolean dirty = true;
        while (dirty) {
            dirty = false;
            for (int i = 0; i < unsortedList.size() - 1; i++) {
                if (unsortedList.get(i).compareTo(unsortedList.get(i + 1)) > 0) {
                    Comparable a = unsortedList.get(i + 1);
                    unsortedList.set(i + 1, unsortedList.get(i));
                    unsortedList.set(i, a);
                    dirty = true;
                }
            }
        }   
        return unsortedList;
    }
}
