package michael.exam.apcs2022;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TextBookTest {

    @Test
    void testTextBook() {
        TextBook bio2015 = new TextBook("Biology", 49.75, 2);
        TextBook bio2019 = new TextBook("Biology", 39.75, 3);
        assertEquals(3, bio2019.getEditionNumber());
        assertEquals("Biology-39.75-3", bio2019.getBookInfo());
        assertTrue(bio2019.canSubstituteFor(bio2015));
        assertFalse(bio2015.canSubstituteFor(bio2019));
        TextBook math = new TextBook("Calculus", 45.25, 1);
        assertFalse(bio2015.canSubstituteFor(math));
    }

}
