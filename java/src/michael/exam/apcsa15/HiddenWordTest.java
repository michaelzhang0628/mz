package michael.exam.apcsa15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HiddenWordTest {

    @Test
    void test() {
        HiddenWord puzzle = new HiddenWord("HARPS");
        assertEquals("+A+++", puzzle.getHint("AAAAA"));
        assertEquals("H****", puzzle.getHint("HELLO"));
        assertEquals("H*++*", puzzle.getHint("HEART"));
        assertEquals("HAR*S", puzzle.getHint("HARMS"));
        assertEquals("HARPS", puzzle.getHint("HARPS"));
        assertEquals("HAR****", puzzle.getHint("HARMFUL")); 
        assertEquals("HAR****+", puzzle.getHint("HARMFULS")); 
    }

}
