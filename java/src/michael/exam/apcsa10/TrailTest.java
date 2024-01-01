package michael.exam.apcsa10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrailTest {

    @Test
    void testTrail() {
        int[] markers = new int[] {100, 150, 105, 120, 90, 80, 50, 75, 75, 70, 80, 90, 100};
        Trail t = new Trail(markers);
        assertTrue(t.isLevelTrailSegment(7, 10));
        assertFalse(t.isLevelTrailSegment(2, 12));
        assertTrue(t.isDifficult());
    }

}
