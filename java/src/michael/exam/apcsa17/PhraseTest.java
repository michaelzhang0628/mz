package michael.exam.apcsa17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PhraseTest {

    @Test
    void testFindNthOccurrence() {
        Phrase phrase1 = new Phrase("A cat ate late.");
        assertEquals(3, phrase1.findNthOccurrence("at", 1));
        Phrase phrase2 = new Phrase("A cat ate late.");
        assertEquals(-1, phrase2.findNthOccurrence("at", 6));
        Phrase phrase3 = new Phrase("A cat ate late.");
        assertEquals(-1, phrase3.findNthOccurrence("bat", 2));
        Phrase phrase4 = new Phrase("aaaa");
        assertEquals(0, phrase4.findNthOccurrence("aa", 1));
        Phrase phrase5 = new Phrase("aaaa");
        assertEquals(1, phrase5.findNthOccurrence("aa", 2));
    }

    @Test
    void testReplaceNthOccurrence() {
        Phrase phrase1 = new Phrase("A cat ate late.");
        phrase1.replaceNthOccurrence("at", 1, "rane");
        assertEquals("A crane ate late.", phrase1.toString());
        Phrase phrase2 = new Phrase("A cat ate late.");
        phrase2.replaceNthOccurrence("at", 6, "xx");
        assertEquals("A cat ate late.", phrase2.toString());
        Phrase phrase3 = new Phrase("A cat ate late.");
        phrase3.replaceNthOccurrence("bat", 2, "xx");
        assertEquals("A cat ate late.", phrase3.toString());
        Phrase phrase4 = new Phrase("aaaa");
        phrase4.replaceNthOccurrence("aa", 1, "xx");
        assertEquals("xxaa", phrase4.toString());
        Phrase phrase5 = new Phrase("aaaa");
        phrase5.replaceNthOccurrence("aa", 2, "bbb");
        assertEquals("abbba", phrase5.toString());
    }

    @Test
    void testFindLastOccurrence() {
        Phrase phrase1 = new Phrase("A cat ate late.");
        assertEquals(11, phrase1.findLastOccurrence("at"));
        assertEquals(2, phrase1.findLastOccurrence("cat"));
        assertEquals(-1, phrase1.findLastOccurrence("bat"));

    }
}
