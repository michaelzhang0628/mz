import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class sort {
	public final static void main(String[] args) {
		// create a list to be sorted
		List<Integer> testData = new ArrayList<Integer>();
		Random rand = new Random(); 
	    for (int i = 0; i <= 50000; i++) {
	    	int intRandom = rand.nextInt(2000) - 1000;
	    	testData.add(intRandom);
	    }
	    
	    
		Sorter firstSorter = new Sorter1();
	    long beginSorter1 = new Date().getTime();   
		List<Integer> sorter1Result = firstSorter.sort(testData);
	    long endSorter1 = new Date().getTime();   
		System.out.println("Sorter1 time: " + (endSorter1 - beginSorter1 + " milliseconds"));
		
	    Sorter secondSorter = new Sorter2();
	    long beginSorter2 = new Date().getTime();   
		List<Integer> sorter2Result = secondSorter.sort(testData);
	    long endSorter2 = new Date().getTime();   
		System.out.println("Sorter2 time: " + (endSorter2 - beginSorter2 + " milliseconds"));
		
		Sorter thirdSorter = new Sorter3();
	    long beginSorter3 = new Date().getTime();   
		List<Integer> sorter3Result = thirdSorter.sort(testData);
	    long endSorter3 = new Date().getTime();   
		System.out.println("Sorter3 time: " + (endSorter3 - beginSorter3 + " milliseconds"));

		System.out.println(sorter1Result.equals(sorter2Result));
		System.out.println(sorter1Result.equals(sorter3Result));
		
	}
}