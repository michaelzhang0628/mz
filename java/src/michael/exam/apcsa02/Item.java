package michael.exam.apcsa02;

public class Item {
    private String name;
    private double price;
    private int size;
    private char category;
    
    public Item(String name, double price, int size, char category) {
        super();
        this.name = name;
        this.price = price;
        this.size = size;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public char getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + ", size=" + size + ", category=" + category + "]";
    }
    
    
}
