package michael.exam.apcs2021;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordMatchTest {

    @Test
    void testScoreGuess() {
        WordMatch game = new WordMatch("mississippi");
        assertEquals(4, game.scoreGuess("i"));
        assertEquals(18, game.scoreGuess("iss"));
        assertEquals(36, game.scoreGuess("issipp"));
        assertEquals(121, game.scoreGuess("mississippi"));
        game = new WordMatch("aaaabb");
        assertEquals(4, game.scoreGuess("a"));
        assertEquals(12, game.scoreGuess("aa"));
        assertEquals(18, game.scoreGuess("aaa"));
        assertEquals(16, game.scoreGuess("aabb"));
        assertEquals(0, game.scoreGuess("c"));
    }
    
    @Test
    void testFindBetterGuess() {
        WordMatch game = new WordMatch("concatenation");
        assertEquals(9, game.scoreGuess("ten"));
        assertEquals(36, game.scoreGuess("nation"));
        assertEquals("nation", game.findBetterGuess("ten", "nation"));
        assertEquals(9, game.scoreGuess("con"));
        assertEquals(9, game.scoreGuess("cat"));
        assertEquals("con", game.findBetterGuess("con", "cat"));
    }

}
