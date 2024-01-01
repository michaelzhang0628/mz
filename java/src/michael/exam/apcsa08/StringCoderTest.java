package michael.exam.apcsa08;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class StringCoderTest {

    @Test
    void testDecodeString() {
        String masterString = "sixtyzipperswerequicklypickedfromthewovenjutebag";
        StringCoder sc = new StringCoder(masterString);
        ArrayList<StringPart> parts = new ArrayList<StringPart> ();
        parts.add(new StringPart(37, 3));
        parts.add(new StringPart(14, 2));
        parts.add(new StringPart(46, 2));
        parts.add(new StringPart(9, 2));
        assertEquals("overeager", sc.decodeString(parts));
    }
    
    @Test
    void testEncodeString() {
        String masterString = "sixtyzipperswerequicklypickedfromthewovenjutebag";
        StringCoder sc = new StringCoder(masterString);
        ArrayList<StringPart> parts = new ArrayList<StringPart> ();
        parts.add(new StringPart(37, 3));
        parts.add(new StringPart(14, 2));
        parts.add(new StringPart(46, 2));
        parts.add(new StringPart(9, 2));
        assertEquals(parts, sc.encodeString("overeager"));
    }

}
