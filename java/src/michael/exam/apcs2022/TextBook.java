package michael.exam.apcs2022;

public class TextBook extends Book{
    private int editionNumber;
    
    public TextBook(String title, double price, int editionNumber) {
        super(title, price);
        this.editionNumber = editionNumber;
    }
    
    public int getEditionNumber() {
        return editionNumber;
    }
    
    public String getBookInfo() {
        return super.getBookInfo() + "-" + editionNumber;
    }
    
    public boolean canSubstituteFor(TextBook otherTextBook) {
        return this.getTitle().equals(otherTextBook.getTitle()) && this.getEditionNumber() >= otherTextBook.getEditionNumber();
    }

}
