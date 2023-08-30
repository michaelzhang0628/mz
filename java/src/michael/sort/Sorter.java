package michael.sort;

import java.util.Comparator;
import java.util.List;

public interface Sorter {
    /**
     * Sort the specified unsortedList
     * 
     * @param unsortedList A list of unsorted integers
     * @return A list of integers that is sorted
     */
    public List<Comparable> sort(List<Comparable> unsortedList);

    /**
     * Sort the specified unsortedList using the specified comparator
     *
     * @param unsortedList A list of unsorted integers
     * @param comparator   A comparator
     * @return A list of integers that is sorted
     */
    // public List sort(List unsortedList, Comparator comparator);
}
