package michael.learn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void testBook() {
        Book example = new Book("The Da Vinci Code");
        assertEquals("The Da Vinci Code", example.getTitle());
        assertFalse(example.isBorrowed());
        example.borrowed();
        assertTrue(example.isBorrowed());
        example.returned();
        assertFalse(example.isBorrowed());
    }

}
