import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSearchSorter implements Sorter {
	
	/**
	 * Search for the first number that is bigger or equal to the specified x in a sorted list, 
	 * starting at start for length number of times
	 */
	public abstract int searchInOrderedList(int x, List<Integer> sortedList, int start, int length);
	
	public List<Integer> sort(List<Integer> unsortedList) {
		List<Integer> sortedList = new ArrayList<Integer>();
		for (int i = 0; i < unsortedList.size(); i++) {
			int number = unsortedList.get(i);
			int index = searchInOrderedList(number, sortedList, 0, sortedList.size());
			sortedList.add(index, number);
		}
		return sortedList;
	}

}
