package michael.learn;

public class ItemCollection {
    private int last_ID;
    public void addItem(Item i) {
        if (i.getID() == last_ID) {
            System.out.println("ID" + i.getID() + " rejected; ");
        } else {
            last_ID = i.getID();
            System.out.println("ID " + i.getID() + " accepted; ");
        }
    }
    
}
