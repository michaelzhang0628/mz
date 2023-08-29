package michael.learn;

import java.util.LinkedList;
import java.util.List;

import michael.freeresponse.Tour;

public class Library {
    public String libraryAdddress;
    private List<Book> books = new LinkedList<Book>();
    
    public Library(String library) {
        this.libraryAdddress = library;
    }
    
    public String returnBook(String str) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(str)) {
                if (book.isBorrowed()) {
                    book.returned();
                    return "You successfully returned The Lord of the Rings";
                }
            } 
        }
        return null;
    }  

    public void printAvailableBooks() {
        System.out.println(getStringForAvailableBooks());
    }

    public String getStringForAvailableBooks() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (!book.isBorrowed()) {
                str.append(book.getTitle());
                str.append('\n');
            }
        }
        if (str.length() > 0) {
            if (str.charAt(str.length() - 1) == '\n') {
                str.deleteCharAt(str.length() - 1);
            }
        }
        return str.toString();
    }
    
    public String borrowBook(String str) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(str)) {
                if (!book.isBorrowed()) {
                    book.borrowed();
                    return "You successfully borrowed The Lord of the Rings";
                } else {
                    return "Sorry, this book is already borrowed.";
                }
            } 
        }
        return "Sorry, this book is not in our catalog.";
    }

    public String getAddress() {
        return libraryAdddress;
    }
    
    public void printAddress() {
        System.out.println(getAddress());
    }

    public static String getStringForOpeningHours() {
        return "Libraries are open daily from 9am to 5pm.";
    }
    
    public static void printOpeningHours() {
        System.out.println(getStringForOpeningHours());
    }

    public void addBook(Book book) {
        books.add(book);
    }

    
    
}