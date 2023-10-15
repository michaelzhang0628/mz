package michael.exam.apcsa16;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class StringFormatterTest {

    @Test
    void test() {
        List<String> wordList1 = new ArrayList<String> ();
        wordList1.add("AP");
        wordList1.add("COMP");
        wordList1.add("SCI");
        wordList1.add("ROCKS");
        assertEquals(14, StringFormatter.totalLetters(wordList1));
        assertEquals(2, StringFormatter.basicGapWidth(wordList1, 20));
        assertEquals(0, StringFormatter.leftoverSpaces(wordList1, 20));
        assertEquals("AP  COMP  SCI  ROCKS", StringFormatter.format(wordList1, 20));
        
        List<String> wordList2 = new ArrayList<String> ();
        wordList2.add("GREEN");
        wordList2.add("EGGS");
        wordList2.add("AND");
        wordList2.add("HAM");
        assertEquals(15, StringFormatter.totalLetters(wordList2));
        assertEquals(1, StringFormatter.basicGapWidth(wordList2, 20));
        assertEquals(2, StringFormatter.leftoverSpaces(wordList2, 20));
        assertEquals("GREEN  EGGS  AND HAM", StringFormatter.format(wordList2, 20));
        
        List<String> wordList3 = new ArrayList<String> ();
        wordList3.add("BEACH");
        wordList3.add("BALL");
        assertEquals(9, StringFormatter.totalLetters(wordList3));
        assertEquals(11, StringFormatter.basicGapWidth(wordList3, 20));
        assertEquals(0, StringFormatter.leftoverSpaces(wordList3, 20));
        assertEquals("BEACH           BALL", StringFormatter.format(wordList3, 20));
    }

}
