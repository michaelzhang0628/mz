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

    @Test
    void testGetRoots() {
        QuadraticFunction q = new QuadraticFunction(1, 3, 2);
        float[] roots = q.getRoots();
        assertEquals(2, roots.length);
        assertEquals(-2, roots[0]);
        assertEquals(-1, roots[1]);
        q = new QuadraticFunction(1, 0, 0);
        roots = q.getRoots();
        assertEquals(1, roots.length);
        assertEquals(0, roots[0]);
        q = new QuadraticFunction(-1, 2, -4);
        roots = q.getRoots();
        assertEquals(0, roots.length);
    }

}
