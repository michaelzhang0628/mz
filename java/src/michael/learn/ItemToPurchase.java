package michael.learn;

public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;
    
    public ItemToPurchase() {
        itemName = "None";
        itemPrice = 0;
        itemQuantity = 0;
    }

    public void setName(String n) {
        itemName = n;
    }

    public String getName() {
        return itemName;
    }

    public void setPrice(int p) {
        itemPrice = p;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setQuantity(int q) {
        itemQuantity = q;
    }

    public int getQuantity() {
        return itemQuantity;
    }
}
