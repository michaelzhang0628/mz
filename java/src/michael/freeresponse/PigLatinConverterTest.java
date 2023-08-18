package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class PigLatinConverterTest {

    @Test
    void testToPig() {
        assertEquals("Appleyay", PigLatinConverter.toPig("Apple"));
        assertEquals("ogday", PigLatinConverter.toPig("dog"));
        assertEquals("attleCay", PigLatinConverter.toPig("Cattle"));
        assertEquals("easyyay", PigLatinConverter.toPig("easy"));
    }

    @Test
    void testGetLineWords() {
        List<String> expectedWords = new ArrayList<String>();
        expectedWords.add("What");
        expectedWords.add("a");
        expectedWords.add("lovely");
        expectedWords.add("day");
        PigLatinConverter conv = new PigLatinConverter("What a lovely day");
        assertEquals(expectedWords, conv.getLineWords());       
    }
    
    @Test
    void pigLatin() {
        PigLatinConverter conv = new PigLatinConverter("What a lovely day");
        conv.pigLatin();
        assertEquals("hatWay ayay ovelylay ayday", conv.getLine());       
    }
}
