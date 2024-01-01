package michael.exam.apcsa04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RobotTest {

    @Test
    void testForwardMoveBlocked() {
        int[] hall = {1, 1, 2, 2};
        Robot r = new Robot(hall, 1, true);
        assertFalse(r.forwardMoveBlocked());
        r = new Robot(hall, 3, true);
        assertTrue(r.forwardMoveBlocked());
        r = new Robot(hall, 3, false);
        assertFalse(r.forwardMoveBlocked());
    }
    
    @Test
    void testMove() {
        int[] hall = {1, 1, 2, 2};
        Robot r = new Robot(hall, 0, true);
        r.move();
        assertEquals(1, r.getPos());
        r.move();
        assertEquals(2, r.getPos());
        r.move();
        assertEquals(2, r.getPos());
        r.move();
        assertEquals(3, r.getPos());
        r.move();
        assertEquals(3, r.getPos());
        r.move();
        assertEquals(3, r.getPos());
        r.move();
        assertEquals(2, r.getPos());
    }
    
    @Test
    void testClearHall() {
        int[] hall = {1, 1, 2, 2};
        Robot r = new Robot(hall, 1, true);
        assertEquals(9, r.clearHall());
        int[] h1 = {1, 1, 2, 2};
        r = new Robot(h1, 0, true);
        assertEquals(6, r.clearHall());
    }

}
