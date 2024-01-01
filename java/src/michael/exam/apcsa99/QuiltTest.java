package michael.exam.apcsa99;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;

import org.junit.jupiter.api.Test;

class QuiltTest {

    @Test
    void testConstructor() throws FileNotFoundException, IOException {
        File f = new File("/Users/michaelzhang/git/mz/java/src/michael/exam/apcsa99/pattern.txt");
        Quilt q = new Quilt(new FileInputStream(f), 3, 3);
        char[][] expected = {
                {'X', '.', '.', '.', 'X'},
                {'.', 'X', '.', 'X', '.'},
                {'.', '.', 'X', '.', '.'},
                {'.', '.', 'X', '.', '.'},
        };
        assertArrayEquals(expected, q.getBlock());
    }
    
    @Test
    void testQuiltToMat() throws FileNotFoundException, IOException {
        File f = new File("/Users/michaelzhang/git/mz/java/src/michael/exam/apcsa99/pattern.txt");
        Quilt q = new Quilt(new FileInputStream(f), 3, 3);
        char[][] expected = {
                {'X', '.', '.', '.', 'X', '.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X'},
                {'.', 'X', '.', 'X', '.', '.', '.', 'X', '.', '.', '.', 'X', '.', 'X', '.'},
                {'.', '.', 'X', '.', '.', '.', 'X', '.', 'X', '.', '.', '.', 'X', '.', '.'},
                {'.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X', '.', '.', 'X', '.', '.'},
                
                {'.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X', '.', '.', 'X', '.', '.'},
                {'.', '.', 'X', '.', '.', '.', 'X', '.', 'X', '.', '.', '.', 'X', '.', '.'},
                {'.', 'X', '.', 'X', '.', '.', '.', 'X', '.', '.', '.', 'X', '.', 'X', '.'},
                {'X', '.', '.', '.', 'X', '.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X'},
                
                {'X', '.', '.', '.', 'X', '.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X'},
                {'.', 'X', '.', 'X', '.', '.', '.', 'X', '.', '.', '.', 'X', '.', 'X', '.'},
                {'.', '.', 'X', '.', '.', '.', 'X', '.', 'X', '.', '.', '.', 'X', '.', '.'},
                {'.', '.', 'X', '.', '.', 'X', '.', '.', '.', 'X', '.', '.', 'X', '.', '.'}
        };
        assertArrayEquals(expected, q.quiltToMat());
    }
}
