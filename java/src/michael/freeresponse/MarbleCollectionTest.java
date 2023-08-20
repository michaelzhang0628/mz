package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MarbleCollectionTest {

    @Test
    void testGetTotalMarbles() {
        MarbleCollection mc = new MarbleCollection();
        MarbleSet r = new MarbleSet("red", 3);
        MarbleSet g = new MarbleSet("green", 2);
        MarbleSet b = new MarbleSet("blue", 5);
        MarbleSet r2 = new MarbleSet("red", 4);
        mc.addSet(r);
        mc.addSet(g);
        mc.addSet(b);
        mc.addSet(r2);
        assertEquals(14, mc.getTotalMarbles());
    }

    @Test
    void testRemoveColor() {
        MarbleCollection mc = new MarbleCollection();
        MarbleSet r = new MarbleSet("red", 3);
        MarbleSet g = new MarbleSet("green", 2);
        MarbleSet b = new MarbleSet("blue", 5);
        MarbleSet r2 = new MarbleSet("red", 4);
        mc.addSet(r);
        mc.addSet(g);
        mc.addSet(b);
        mc.addSet(r2);
        assertEquals(7, mc.removeColor("red"));
        assertEquals(5, mc.removeColor("blue"));
        assertEquals(0, mc.removeColor("yellow"));
    }
}
