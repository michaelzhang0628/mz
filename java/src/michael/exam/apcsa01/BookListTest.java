package michael.exam.apcsa01;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BookListTest {
    
    @Test
    void testInsert() {
        BookList bl = new BookList();
        bl.insertOne(new Book("I know Why the Caged Bird Sings", "Angelou", 16, 99)); //4
        bl.insertOne(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", 9, 99)); //2
        bl.insertOne(new Book("Madeline", "Bemelmans", 3, 8)); //0
        bl.insertOne(new Book("Holes", "Sacher", 12, 18)); //3
        bl.insertOne(new Book("The Lorax", "Seuss", 3, 10)); //1
        assertEquals(new Book("Madeline", "Bemelmans", 3, 8), bl.getMyList().get(0));
        assertEquals(new Book("The Lorax", "Seuss", 3, 10), bl.getMyList().get(1));
        assertEquals(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", 9, 99), bl.getMyList().get(2));
        assertEquals(new Book("Holes", "Sacher", 12, 18), bl.getMyList().get(3));
        assertEquals(new Book("I know Why the Caged Bird Sings", "Angelou", 16, 99), bl.getMyList().get(4));
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Phantom Tollbooth", "Juster", 9, 12));
        books.add(new Book("Invisible Man", "Ellison", 15, 99));
        books.add(new Book("Charlotte's Web", "White", 8, 12));
        bl.insertMany(books);
        assertEquals(new Book("Madeline", "Bemelmans", 3, 8), bl.getMyList().get(0));
        assertEquals(new Book("The Lorax", "Seuss", 3, 10), bl.getMyList().get(1));
        assertEquals(new Book("Charlotte's Web", "White", 8, 12), bl.getMyList().get(2));
        assertEquals(new Book("The Phantom Tollbooth", "Juster", 9, 12), bl.getMyList().get(3));
        assertEquals(new Book("Harry Potter and the Sorcerer's Stone", "Rowling", 9, 99), bl.getMyList().get(4));
        assertEquals(new Book("Holes", "Sacher", 12, 18), bl.getMyList().get(5));
        assertEquals(new Book("Invisible Man", "Ellison", 15, 99), bl.getMyList().get(6));
        assertEquals(new Book("I know Why the Caged Bird Sings", "Angelou", 16, 99), bl.getMyList().get(7));
    }

}
