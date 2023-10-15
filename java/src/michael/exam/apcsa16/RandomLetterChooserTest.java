package michael.exam.apcsa16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomLetterChooserTest {

    @Test
    void testRandomLetterChooser() {
        RandomLetterChooser c = new RandomLetterChooser("MichaeL");
        for (int i = 0; i < 7; i++) {
            assertNotEquals("NONE", c.getNext());
        }
        for (int i = 0; i < 200; i++) {
            assertEquals("NONE", c.getNext());
        }
    }

}
