package michael.exam.apcsa19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LightBoardTest {

    @Test
    void testEvaluateLight() {
        LightBoard lb = new LightBoardForTesting();
        assertFalse(lb.evaluateLight(0, 3));
        assertTrue(lb.evaluateLight(6, 0));
        assertFalse(lb.evaluateLight(4, 1));
        assertTrue(lb.evaluateLight(5, 4));
    }

}
