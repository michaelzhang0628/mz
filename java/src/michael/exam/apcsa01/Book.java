package michael.exam.apcsa01;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int lowAge;
    private int highAge;
    
    public Book(String title, String author, int lowAge, int highAge) {
        super();
        this.title = title;
        this.author = author;
        this.lowAge = lowAge;
        this.highAge = highAge;
    }

    public int getLowAge() {
        return lowAge;
    }

    public int getHighAge() {
        return highAge;
    }

    public boolean lessThan(Book b) {
        if (lowAge < b.getLowAge() || lowAge == b.getLowAge() && highAge < b.getHighAge()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, highAge, lowAge, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Book))
            return false;
        Book other = (Book) obj;
        return Objects.equals(author, other.author) && highAge == other.highAge && lowAge == other.lowAge
                && Objects.equals(title, other.title);
    }
    
    
}
