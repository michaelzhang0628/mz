package michael.exam.apcsa99;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class WordsTest {
   
    @Test
    void testWordIndex() {
        Words w = new Words(new ArrayList(Arrays.asList(new String[] {"apple","berry","pear", "quince"})));
        assertEquals(0, w.wordIndex("air"));
        assertEquals(0, w.wordIndex("apple"));
        assertEquals(2, w.wordIndex("orange"));
        assertEquals(4, w.wordIndex("raspberry"));
        assertEquals(4, w.wordIndex("zoo"));
         }
    
    @Test
    void testInsertInOrder() {
        Words w = new Words(new ArrayList(Arrays.asList(new String[] {"apple","berry","quince"})));        
        w.insertInOrder("pear");
        assertEquals(4, w.getWordList().size());
        assertEquals("apple", w.getWordList().get(0));
        assertEquals("berry", w.getWordList().get(1));
        assertEquals("pear", w.getWordList().get(2));
        assertEquals("quince", w.getWordList().get(3));
        w = new Words(new ArrayList(Arrays.asList(new String[] {"apple","berry","pear"}))); 
        w.insertInOrder("pear");
        assertEquals(3, w.getWordList().size());
        assertEquals("apple", w.getWordList().get(0));
        assertEquals("berry", w.getWordList().get(1));
        assertEquals("pear", w.getWordList().get(2));
        w = new Words(new ArrayList(Arrays.asList(new String[] {"apple","fig","peach"})));        
        w.insertInOrder("pear");
        assertEquals(4, w.getWordList().size());
        assertEquals("apple", w.getWordList().get(0));
        assertEquals("fig", w.getWordList().get(1));
        assertEquals("peach", w.getWordList().get(2));
        assertEquals("pear", w.getWordList().get(3));
        w = new Words(new ArrayList(Arrays.asList(new String[] {"quince","raisin","tart"})));        
        w.insertInOrder("pear");
        assertEquals(4, w.getWordList().size());
        assertEquals("pear", w.getWordList().get(0));
        assertEquals("quince", w.getWordList().get(1));
        assertEquals("raisin", w.getWordList().get(2));
        assertEquals("tart", w.getWordList().get(3));
    }
}
