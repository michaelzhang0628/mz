package michael.learn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LibraryTest {

    @Test
    void testLibrary() {
     // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        String openingHours = "Libraries are open daily from 9am to 5pm.";
        assertEquals(openingHours, Library.getStringForOpeningHours());
        assertEquals("10 Main St.", firstLibrary.getAddress());
        assertEquals("228 Liberty St.", secondLibrary.getAddress());

        // Try to borrow The Lords of the Rings from both libraries
        assertEquals("You successfully borrowed The Lord of the Rings", firstLibrary.borrowBook("The Lord of the Rings"));
        assertEquals("Sorry, this book is already borrowed.", firstLibrary.borrowBook("The Lord of the Rings"));
        assertEquals("Sorry, this book is not in our catalog.", secondLibrary.borrowBook("The Lord of the Rings"));

        // Print the titles of all available books from both libraries
        String expectedFirstBooks = "The Da Vinci Code\n"
                + "Le Petit Prince\n"
                + "A Tale of Two Cities";
        assertEquals(expectedFirstBooks, firstLibrary.getStringForAvailableBooks());
        assertEquals("", secondLibrary.getStringForAvailableBooks());
        
        // Return The Lords of the Rings to the first library
        assertEquals("You successfully returned The Lord of the Rings", firstLibrary.returnBook("The Lord of the Rings"));

        // Print the titles of available from the first library
        expectedFirstBooks = "The Da Vinci Code\n"
                + "Le Petit Prince\n"
                + "A Tale of Two Cities\n"
                + "The Lord of the Rings";
        assertEquals(expectedFirstBooks, firstLibrary.getStringForAvailableBooks());
    }

}
