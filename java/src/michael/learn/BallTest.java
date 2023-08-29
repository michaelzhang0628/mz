package michael.learn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BallTest {

    @Test
    void test() {
        assertEquals(0, new Ball(200, 5).compareTo(new Ball(200, 10000)));
        assertTrue(new Ball(200, 5).compareTo(new Ball(1, 10000))>0);
        assertTrue(new Ball(200, 5).compareTo(new Ball(100000, 10000))<0);
    }
}
