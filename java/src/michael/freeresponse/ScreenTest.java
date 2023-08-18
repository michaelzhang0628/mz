package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScreenTest {

    @Test
    void testScreen() {
        Screen s = new Screen(3, 4);
        s.pixelOn(1, 2);
        s.pixelOn(1, 2);
        s.pixelOn(2, 0);
        s.pixelOn(33, 22);
        assertNotNull(s.pixelAt(1, 2));
        assertNotNull(s.pixelAt(2, 0));
        assertEquals(new Pixel(1, 2), s.pixelAt(1, 2));
        assertEquals(new Pixel(2, 0), s.pixelAt(2, 0));
        assertNull(s.pixelAt(2, 1));
        assertNull(s.pixelAt(2, 2));
        assertNull(s.pixelAt(0, 2));
        assertNull(s.pixelAt(33, 22));
    }

}
