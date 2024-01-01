package michael.exam.apcsa07;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SelfDivisorTest {

    @Test
    void testIsSelfDivisor() {
        assertTrue(SelfDivisor.isSelfDivisor(128));
        assertFalse(SelfDivisor.isSelfDivisor(26));
        assertFalse(SelfDivisor.isSelfDivisor(100));
    }

    @Test
    void testFirstNumSelfDivisors() {
        int[] sd = new int[] {11, 12, 15};
        assertArrayEquals(sd, SelfDivisor.firstNumSelfDivisors(10, 3));
        sd = new int[] {15, 22, 24};
        assertArrayEquals(sd, SelfDivisor.firstNumSelfDivisors(15, 3));
    }
}
