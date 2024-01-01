package michael.exam.apcsa11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RouteCipherTest {

    @Test
    void testFillBlock() {
        String[][] expected = new String[3][5];
        expected[0][0] = "M";
        expected[0][1] = "e";
        expected[0][2] = "e";
        expected[0][3] = "t";
        expected[0][4] = " ";
        expected[1][0] = "a";
        expected[1][1] = "t";
        expected[1][2] = " ";
        expected[1][3] = "n";
        expected[1][4] = "o";
        expected[2][0] = "o";
        expected[2][1] = "n";
        expected[2][2] = "A";
        expected[2][3] = "A";
        expected[2][4] = "A";
        RouteCipher rc = new RouteCipher(3, 5);
        rc.fillBlock("Meet at noon");
        assertArrayEquals(expected, rc.getLetterBlock());
        }
        
    @Test
    void testFillBlock2() {
        String[][] expected = new String[3][5];
        expected[0][0] = "M";
        expected[0][1] = "e";
        expected[0][2] = "e";
        expected[0][3] = "t";
        expected[0][4] = " ";
        expected[1][0] = "a";
        expected[1][1] = "t";
        expected[1][2] = " ";
        expected[1][3] = "m";
        expected[1][4] = "i";
        expected[2][0] = "d";
        expected[2][1] = "n";
        expected[2][2] = "i";
        expected[2][3] = "g";
        expected[2][4] = "h";
        RouteCipher rc = new RouteCipher(3, 5);
        rc.fillBlock("Meet at midnight");
        assertArrayEquals(expected, rc.getLetterBlock());
    }
    
    @Test
    void testEncryptBlock() {
        RouteCipher rc = new RouteCipher(2, 3);
        rc.fillBlock("Meet a");
        assertEquals("Mte ea", rc.encryptBlock());
        rc.fillBlock("t midn");
        assertEquals("ti dmn", rc.encryptBlock());
        rc.fillBlock("ight");
        assertEquals("itgAhA", rc.encryptBlock());
    }
    
    @Test
    void testEncryptMessage() {
        RouteCipher rc = new RouteCipher(2, 3);
        assertEquals("Mte eati dmnitgAhA", rc.encryptMessage("Meet at midnight"));       
    }

}
