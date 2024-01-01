package michael.exam.apcsa14;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ScramblerTest {

    @Test
    void testScrambleWord() {
        assertEquals("TNA", Scrambler.scrambleWord("TAN"));
        assertEquals("BARCADABARA", Scrambler.scrambleWord("ABRACADABRA"));
        assertEquals("WHOA", Scrambler.scrambleWord("WHOA"));
        assertEquals("ARADVRAK", Scrambler.scrambleWord("AARDVARK"));
        assertEquals("EGGS", Scrambler.scrambleWord("EGGS"));
        assertEquals("A", Scrambler.scrambleWord("A"));
        assertEquals("", Scrambler.scrambleWord(""));
    }
    
    @Test
    void testScrambleOrRemove() {
        List<String> wordList = new ArrayList<String> ();
        wordList.add("TAN");
        wordList.add("ABRACADABRA");
        wordList.add("WHOA");
        wordList.add("APPLE");
        wordList.add("EGGS");
        Scrambler.scrambleOrRemove(wordList);
        assertEquals(3, wordList.size());
        assertEquals("TNA", wordList.get(0));
        assertEquals("BARCADABARA", wordList.get(1));
        assertEquals("PAPLE", wordList.get(2));
    }

}
