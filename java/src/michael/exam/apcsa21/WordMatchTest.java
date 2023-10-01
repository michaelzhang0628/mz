package michael.exam.apcsa21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordMatchTest {

    @Test
    void test() {
        WordMatch g = new WordMatch("mississippi");
        assertEquals(4, g.scoreGuess("i"));
        assertEquals(18, g.scoreGuess("iss"));
        assertEquals(36, g.scoreGuess("issipp"));
        assertEquals(121, g.scoreGuess("mississippi"));
        g = new WordMatch("aaaabb");
        assertEquals(4, g.scoreGuess("a"));
        assertEquals(12, g.scoreGuess("aa"));
        assertEquals(18, g.scoreGuess("aaa"));
        assertEquals(16, g.scoreGuess("aabb"));
        assertEquals(0, g.scoreGuess("c"));
        g = new WordMatch("concatenation");
        assertEquals(9, g.scoreGuess("ten"));
        assertEquals(36, g.scoreGuess("nation"));
        assertEquals("nation", g.findBetterGuess("ten", "nation"));
        assertEquals(9, g.scoreGuess("con"));
        assertEquals(9, g.scoreGuess("cat"));  
        assertEquals("con", g.findBetterGuess("con", "cat"));
    }
}
