package michael.exam.apcsa22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextBookTest {

    @Test
    void testTextBook() {
        TextBook bio2015 = new TextBook("biology", 49.75, 2);
        TextBook bio2019 = new TextBook("biology", 39.75, 3);
        assertEquals(3, bio2019.getEdition());
        assertEquals("biology-39.75-3", bio2019.getBookInfo());
        assertTrue(bio2019.canSubstituteFor(bio2015));
        assertFalse(bio2015.canSubstituteFor(bio2019));
        TextBook math = new TextBook("calculus", 49.25, 1);
        assertFalse(bio2015.canSubstituteFor(math));
    }

}
