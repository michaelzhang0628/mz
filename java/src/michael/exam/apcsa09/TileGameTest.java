package michael.exam.apcsa09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TileGameTest {
    
    private TileGame getTestGame() {
        TileGame g = new TileGame();
        g.addTile(new NumberTile(4, 3, 7, 4));
        g.addTile(new NumberTile(6,4,3,3));
        g.addTile(new NumberTile(1,2,3,4));
        g.addTile(new NumberTile(3,2,5,2));
        g.addTile(new NumberTile(5,9,2,2));
        return g;
    }

    @Test
    void testGetIndexForFit() {
        TileGame g = this.getTestGame();
        int index = g.getIndexForFit(new NumberTile(4, 2, 9, 2));
        assertTrue( index == 3 || index == 4);
        assertEquals(-1, g.getIndexForFit(new NumberTile(4, 2, 9, 8)));
    }

    @Test
    void testInsertTile() {
        TileGame g = this.getTestGame();
        assertTrue(g.insertTile(new NumberTile(2, 4, 2, 9)));
        assertEquals(6, g.getBoard().size());
        assertTrue(g.insertTile(new NumberTile(4, 2, 9, 8)));
        assertEquals(7, g.getBoard().size());
        assertFalse(g.insertTile(new NumberTile(1, 1, 1, 1)));
        assertEquals(7, g.getBoard().size());
    }
}
