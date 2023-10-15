package michael.exam.apcsa16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomStringChooserTest {

    @Test
    void test() {
        String[] a = {"wheels", "on", "the", "bus"};
        RandomStringChooser c = new RandomStringChooser(a);
        for (int i = 0; i < 4; i++) {
            assertNotEquals("NONE", c.getNext());
        }
        for (int i = 0; i < 200; i++) {
            assertEquals("NONE", c.getNext());
        }
    }

}
