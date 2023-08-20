package michael.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadraticFunctionTest {

    @Test
    void testRootCount() {
        QuadraticFunction q = new QuadraticFunction(1, 3, 2);
        assertEquals(2, q.rootCount());
        q = new QuadraticFunction(1, 0, 0);
        assertEquals(1, q.rootCount());
        q = new QuadraticFunction(-1, 2, -4);
        assertEquals(0, q.rootCount());
    }

    @Test
    void testAxisOfSymmetry() {
        QuadraticFunction q = new QuadraticFunction(1, 3, 2);
        assertEquals(-1.5, q.axisOfSymmetry());
        q = new QuadraticFunction(1, 0, 0);
        assertEquals(0, q.axisOfSymmetry());
        q = new QuadraticFunction(-1, 2, -4);
        assertEquals(1, q.axisOfSymmetry());
    }

    @Test
    void testIsUShaped() {
        QuadraticFunction q = new QuadraticFunction(1, 3, 2);
        assertTrue(q.isUShaped());
        q = new QuadraticFunction(1, 0, 0);
        assertTrue(q.isUShaped());
        q = new QuadraticFunction(-1, 2, -4);
        assertFalse(q.isUShaped());
    }

}
