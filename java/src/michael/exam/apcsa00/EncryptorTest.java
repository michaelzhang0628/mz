package michael.exam.apcsa00;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EncryptorTest {

    public Encryptor e() {
        char[][] myMat = new char[][] {
            {'S','T', 'U', 'V', 'W', 'X'},
            {'Y', 'Z', '0', '1', '2', '3'},
            {'4', '5', '6', '7', '8', '9'},
            {'A', 'B', 'C', 'D', 'E', 'F'},
            {'G', 'H', 'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', 'P', 'Q', 'R'}
        };
        Encryptor e = new Encryptor(myMat);
        return e;
    }
    
    @Test
    void testGetCoordinates() {
        Encryptor e = e();
        assertEquals(new Point(5, 3), e.getCoordinates('P'));
        assertEquals(new Point(2, 4), e.getCoordinates('8'));
        assertEquals(new Point(5, 0), e.getCoordinates('M'));
    }
    
    @Test
    void testEncrpytTwo() {
        Encryptor e = e();
        assertEquals("FN", e.encryptTwo("BR"));
        assertEquals("QB", e.encryptTwo("NE"));
        assertEquals("BW", e.encryptTwo("ET"));
        assertEquals("QF", e.encryptTwo("RE"));
        assertEquals("HT", e.encryptTwo("TH"));
        assertEquals("RP", e.encryptTwo("PR"));
        assertEquals("GG", e.encryptTwo("GG"));
    }
    
    @Test
    void testEncrpytWord() {
        Encryptor e = e();
        assertEquals("OCPMTUFQ", e.encryptWord("COMPUTER"));
        assertEquals("UAKCOBE", e.encryptWord("SCIENCE"));
        assertEquals("TSVCBQST", e.encryptWord("STUDENTS"));
    }
}
