package michael.exam.apcsa00;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class WordCollectionTest {

    public WordCollection wc() {
        return new WordCollection(new ArrayList(Arrays.asList(new String[] {"at","bad","all","at"})));
    }
    
    @Test
    void testOccurrences() {
        WordCollection wc = wc();
        assertEquals(2, wc.occurrences("at"));
        assertEquals(1, wc.occurrences("bad"));
        assertEquals(1, wc.occurrences("all"));
        assertEquals(0, wc.occurrences("mud"));
    }
    
    @Test
    void testRemoveDuplicates() {
        WordCollection wc = wc();
        wc.removeDuplicates("hello");
        assertEquals(4, wc.getWords().size());
        wc.removeDuplicates("at");
        assertEquals(3, wc.getWords().size());
        wc.removeDuplicates("bad");
        assertEquals(3, wc.getWords().size());
    }

    @Test
    void testMostCommon() {
        WordCollection wc = wc();
        assertEquals("at", wc.mostCommon());
        List<String> l = new ArrayList<String> ();
        l.add("B");
        l.add("A");
        l.add("C");
        l.add("A");
        l.add("A");
        l.add("B");
        l.add("D");
        wc = new WordCollection(l);
        assertEquals("A", wc.mostCommon());
    }
}
