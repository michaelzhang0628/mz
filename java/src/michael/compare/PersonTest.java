package michael.compare;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import michael.sort.BubbleSorter;

class PersonTest {

    @Test
    void testCompareByHeight() {
        Person m = new Person("m", 15, 150, 71);
        Person c = new Person("c", 21, 135, 65);
        Person x = new Person("x", 52, 145, 61);
        Person g = new Person("g", 53, 200, 73);
        List f = Arrays.asList(m, c, x, g);
        f = new BubbleSorter().sort(f, new HeightComparator());
        assertEquals(Arrays.asList(x, c, m, g), f);
    }

    @Test
    void testCompareAge() {
        Person m = new Person("m", 15, 150, 71);
        Person c = new Person("c", 21, 135, 65);
        Person x = new Person("x", 52, 145, 61);
        Person g = new Person("g", 53, 200, 73);
        List f = Arrays.asList(m, c, x, g);
        f = new BubbleSorter().sort(f, new AgeComparator());
        assertEquals(Arrays.asList(m, c, x, g), f);
    }

    @Test
    void testCompareWeight() {
        Person m = new Person("m", 15, 150, 71);
        Person c = new Person("c", 21, 135, 65);
        Person x = new Person("x", 52, 145, 61);
        Person g = new Person("g", 53, 200, 73);
        List f = Arrays.asList(m, c, x, g);
        f = new BubbleSorter().sort(f, new WeightComparator());
        assertEquals(Arrays.asList(c, x, m, g), f);
    }

}
