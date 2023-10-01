package michael.exam.apcsa22;

public class Book {
    private String title;
    private double price;
    
    public Book(String bookTitle, double bookPrice) {
        this.title = bookTitle;
        this.price = bookPrice;
    }
    
    public String getTitle() {
        return title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getBooksinfo() {
        return title + "-" + price;
    }
}
