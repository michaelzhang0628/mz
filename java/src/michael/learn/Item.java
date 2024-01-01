package michael.learn;

public class Item {
    private int ID;
    public Item(int id) {
        ID = id;
    }
    
    public int getID() {
        return ID;
    }
    
    public void addToCollection(ItemCollection c) {
        c.addItem(this);
    }
}
