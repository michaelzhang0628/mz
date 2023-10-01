package michael.exam.apcsa22;

public class TextBook extends Book{
    private int edition;
    
    public TextBook(String bookTitle, Double bookPrice, int editionInformation) {
        super(bookTitle, bookPrice);
        this.edition = editionInformation;
    }
    
    public String getBookInfo() {
        return getTitle() + "-" + getPrice() + "-" + edition;
    }
    
    public int getEdition() {
        return edition;
    }
    
    public boolean canSubstituteFor(TextBook book) {
        if (getTitle().equals(book.getTitle()) && getEdition() > book.getEdition()) {
            return true;
        }
        return false;
    }    
}
