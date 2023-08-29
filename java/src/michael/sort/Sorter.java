package michael.sort;

import java.util.List;

public interface Sorter {
    /**
     * Sort the specified unsortedList
     * 
     * @param unsortedList A list of unsorted integers
     * @return A list of integers that is sorted
     */
    public List<Comparable> sort(List<Comparable> unsortedList);
}
