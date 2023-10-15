package michael.exam.apcsa16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CrosswordTest {

    @Test
    void test() {
        boolean[][] isBlack = new boolean[7][9];
        for (int i = 0; i < isBlack.length; i++) {
            for (int j = 0; j < isBlack[0].length; j++) {
                isBlack[i][j] = false;
            }
        }
        isBlack[0][0] = true;
        isBlack[0][3] = true;
        isBlack[0][4] = true;
        isBlack[0][5] = true;
        isBlack[1][4] = true;
        isBlack[2][6] = true;
        isBlack[2][7] = true;
        isBlack[2][8] = true;
        isBlack[3][2] = true;
        isBlack[3][6] = true;
        isBlack[4][0] = true;
        isBlack[4][1] = true;
        isBlack[4][2] = true;
        isBlack[5][4] = true;
        isBlack[6][3] = true;
        isBlack[6][4] = true;
        isBlack[6][5] = true;
        isBlack[6][8] = true;

        Crossword puzzle = new Crossword(isBlack);
        
        assertFalse(puzzle.getSquare(3, 0).isBlack());
        assertEquals(11, puzzle.getSquare(3, 0).getNum());
        assertFalse(puzzle.getSquare(3, 1).isBlack());
        assertEquals(0, puzzle.getSquare(3, 1).getNum());
        assertTrue(puzzle.getSquare(3, 2).isBlack());
        assertEquals(0, puzzle.getSquare(3, 2).getNum());
        assertFalse(puzzle.getSquare(3, 3).isBlack());
        assertEquals(12, puzzle.getSquare(3, 3).getNum());
        
        assertFalse(puzzle.getSquare(6, 6).isBlack());
        assertEquals(22, puzzle.getSquare(6, 6).getNum());
        assertFalse(puzzle.getSquare(6, 7).isBlack());
        assertEquals(0, puzzle.getSquare(6, 7).getNum());
        assertTrue(puzzle.getSquare(6, 8).isBlack());
        assertEquals(0, puzzle.getSquare(6, 8).getNum());

    }

}
