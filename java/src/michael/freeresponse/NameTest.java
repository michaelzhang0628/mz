package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameTest {

    @Test
    void testNameConstructor() {
        Name mz = new Name("Zhang", "Michael");
        assertEquals("Michael", mz.getFirstName());
        assertEquals("Zhang", mz.getLastName());
    }

    @Test
    void testToString() {
        Name mz = new Name("Zhang", "Michael");
        assertEquals("Zhang, Michael", mz.toString());
    }

}
