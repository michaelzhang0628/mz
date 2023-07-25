package michael.sort;

import java.util.List;

public class Sorter2 extends AbstractSearchSorter implements Sorter {

	@Override
	public int searchInOrderedList(int x, List<Integer> sortedList, int start, int length) {
		return searchLinear(x, sortedList, start, length);
	}
	
	protected int searchLinear(int x, List<Integer> sortedList, int start, int length) {
		if (length == 0) {
			return start;
		}
		if (x < sortedList.get(start)) {
			return start;
		}
		for (int i = start + 1; i < start + length; i++) {
			 if (x < sortedList.get(i)) {
				 return i;
			 }
		}
		return start + length;
	}
}
