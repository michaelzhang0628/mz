package michael.exam.apcsa13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TokenPassTest {

    @Test
    void testConstructor() {
        TokenPass tp = new TokenPass(6);
        assertEquals(6, tp.getBoard().length);
        assertTrue(tp.getCurrentPlayer() >= 0 && tp.getCurrentPlayer() <= 5);
        for (int i = 0; i < 6; i++) {
            assertTrue(tp.getBoard()[i] >= 1 && tp.getBoard()[i] <= 10);
        }
        
    }

    @Test
    void testDistributeCurrentPlayerTokens() {
        TokenPass tp = new TokenPass(new int[]{3, 2, 6 ,10}, 2);
        tp.distributeCurrentPlayerTokens();
        assertEquals(5, tp.getBoard()[0]);
        assertEquals(3, tp.getBoard()[1]);
        assertEquals(1, tp.getBoard()[2]);
        assertEquals(12, tp.getBoard()[3]);
    }
}
