package michael.sort;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.junit.jupiter.api.Test;

class SorterTests {

    @Test
    void testSort1() {
        validateSorter(new Sorter1());
    }

    @Test
    void testSort2() {
        validateSorter(new Sorter2());
    }

    @Test
    void testSort3() {
        validateSorter(new Sorter3());
    }

    @Test
    void testBubbleSorter() {
        validateSorter(new BubbleSorter());
    }

    private List<Comparable> randomIntList() {
        List<Comparable> testData = new ArrayList<Comparable>();
        Random rand = new Random();
        for (int i = 0; i <= 10000; i++) {
            int intRandom = rand.nextInt(2000) - 1000;
            testData.add(intRandom);
        }
        return testData;
    }

    @Test
    void testSorterPerformance() {
        List<Comparable> testData = randomIntList();

        Sorter firstSorter = new Sorter1();
        long beginSorter1 = new Date().getTime();
        firstSorter.sort(testData);
        long endSorter1 = new Date().getTime();
        System.out.println("Sorter1 time: " + (endSorter1 - beginSorter1 + " milliseconds"));

        Sorter secondSorter = new Sorter2();
        long beginSorter2 = new Date().getTime();
        secondSorter.sort(testData);
        long endSorter2 = new Date().getTime();
        System.out.println("Sorter2 time: " + (endSorter2 - beginSorter2 + " milliseconds"));

        Sorter thirdSorter = new Sorter3();
        long beginSorter3 = new Date().getTime();
        thirdSorter.sort(testData);
        long endSorter3 = new Date().getTime();
        System.out.println("Sorter3 time: " + (endSorter3 - beginSorter3 + " milliseconds"));

        Sorter bubbleSorter = new BubbleSorter();
        long beginBubbleSorter = new Date().getTime();
        bubbleSorter.sort(testData);
        long endBubbleSorter = new Date().getTime();
        System.out.println("BubbleSorter time: " + (endBubbleSorter - beginBubbleSorter + " milliseconds"));
}

    @Test
    void testAll4Sorters() {
        List<Comparable> testData = randomIntList();

        Sorter firstSorter = new Sorter1();
        List<Comparable> sorter1Result = firstSorter.sort(testData);

        Sorter secondSorter = new Sorter2();
        List<Comparable> sorter2Result = secondSorter.sort(testData);

        Sorter thirdSorter = new Sorter3();
        List<Comparable> sorter3Result = thirdSorter.sort(testData);
        
        Sorter bubbleSorter = new BubbleSorter();
        List<Comparable> bubbleSorterResult = bubbleSorter.sort(testData);

        assertEquals(sorter1Result, sorter2Result);
        assertEquals(sorter1Result, sorter3Result);
        assertEquals(sorter1Result, bubbleSorterResult);
    }

    private void validateSorter(Sorter sorter) {
        List<Comparable> testdata = new ArrayList<Comparable>();
        testdata.add(1);
        testdata.add(3);
        testdata.add(2);
        testdata.add(9);
        testdata.add(0);

        List<Comparable> expected = new ArrayList<Comparable>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(9);

        assertEquals(expected, sorter.sort(testdata));
    }

}
