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

    private List<Integer> randomIntList() {
        List<Integer> testData = new ArrayList<Integer>();
        Random rand = new Random();
        for (int i = 0; i <= 50000; i++) {
            int intRandom = rand.nextInt(2000) - 1000;
            testData.add(intRandom);
        }
        return testData;
    }

    @Test
    void testSorterPerformance() {
        List<Integer> testData = randomIntList();

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
    }

    @Test
    void testAll3Sorters() {
        List<Integer> testData = randomIntList();

        Sorter firstSorter = new Sorter1();
        List<Integer> sorter1Result = firstSorter.sort(testData);

        Sorter secondSorter = new Sorter2();
        List<Integer> sorter2Result = secondSorter.sort(testData);

        Sorter thirdSorter = new Sorter3();
        List<Integer> sorter3Result = thirdSorter.sort(testData);

        assertEquals(sorter1Result, sorter2Result);
        assertEquals(sorter1Result, sorter3Result);
    }

    private void validateSorter(Sorter sorter) {
        List<Integer> testdata = new ArrayList<Integer>();
        testdata.add(1);
        testdata.add(3);
        testdata.add(2);
        testdata.add(9);
        testdata.add(0);

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(9);

        assertEquals(expected, sorter.sort(testdata));
        assertTrue(expected.size() == 5);
    }

}
