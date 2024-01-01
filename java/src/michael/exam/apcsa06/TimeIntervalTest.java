package michael.exam.apcsa06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeIntervalTest {

    @Test
    void testOverlapsWith() {
        TimeInterval t1 = new TimeInterval(60, 100);
        TimeInterval t2 = new TimeInterval(80, 120);
        assertTrue(t1.overlapsWith(t2));
        t2 = new TimeInterval(40, 80);
        assertTrue(t1.overlapsWith(t2));
        t2 = new TimeInterval(70, 90);
        assertTrue(t1.overlapsWith(t2));
        t2 = new TimeInterval(40, 120);
        assertTrue(t1.overlapsWith(t2));
        t2 = new TimeInterval(80, 100);
        assertTrue(t1.overlapsWith(t2));
        t2 = new TimeInterval(40, 60);
        assertFalse(t1.overlapsWith(t2));
        t2 = new TimeInterval(60, 100);
        assertTrue(t1.overlapsWith(t2));
        t1 = new TimeInterval(30, 90);
        t2 = new TimeInterval(30, 180);
        assertTrue(t1.overlapsWith(t2));
        assertTrue(t2.overlapsWith(t1));
    }

}
