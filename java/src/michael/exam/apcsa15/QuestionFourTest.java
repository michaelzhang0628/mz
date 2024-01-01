package michael.exam.apcsa15;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class QuestionFourTest {

    @Test
    void test() {
        NumberGroup range1 = new Range(-3, 2);
        assertTrue(range1.contains(-3));
        assertTrue(range1.contains(0));
        assertTrue(range1.contains(2));
        assertFalse(range1.contains(-6));
        assertFalse(range1.contains(4));
        List<NumberGroup> list = new ArrayList<NumberGroup> ();
        list.add(new Range(5, 8));
        list.add(new Range(10, 12));
        list.add(new Range(1, 6));
        NumberGroup multiple1 = new MultipleGroups(list);
        assertTrue(multiple1.contains(2));
        assertFalse(multiple1.contains(9));
        assertTrue(multiple1.contains(6));
    }

}
