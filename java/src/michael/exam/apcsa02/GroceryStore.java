package michael.exam.apcsa02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GroceryStore {
    private Item[] items;
    
    public GroceryStore(Item[] items) {
        super();
        this.items = items;
    }
    
    public Item[] getItems() {
        return this.items;
    }

    public String[] getItems(char category) {
        List<String> itemsInCategory = new ArrayList<String>();
        for (int i = 0; i < items.length; i++) {
            if (items[i].getCategory() == category) {
                itemsInCategory.add(items[i].getName());
            }
        }
        return itemsInCategory.toArray(new String[0]);
    }

    // expect four items
    public void changePrices(InputStream in) throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        for (int i = 0; i < 4; i++) {
            String itemName = reader.readLine();
            double itemPrice = Double.valueOf(reader.readLine());
            for (int j = 0; j < items.length; j++) {
                if (itemName.equals(items[j].getName())) {
                    items[j].setPrice(itemPrice);
                }
            }
        }
        in.close();
        // next write the updated items to an output stream
        OutputStream out = new FileOutputStream("/Users/michaelzhang/git/mz/java/src/michael/exam/apcsa02/update-items.txt");
        PrintStream p = new PrintStream(out);
        for (Item i : items) {
            p.println(i);
        }
    }

    public String bargainItems(char category) {
        List<Item> itemsInCategory = new ArrayList<Item>();
        for (int i = 0; i < items.length; i++) {
            if (items[i].getCategory() == category) {
                itemsInCategory.add(items[i]);
            }
        }
        if (itemsInCategory.size() == 0) {
            return "none";
        }
        Item min = itemsInCategory.get(0);
        for (int i = 1; i < itemsInCategory.size(); i++) {
            if (itemsInCategory.get(i).getPrice()/itemsInCategory.get(i).getSize() <= min.getPrice()/min.getSize()) {
                min = itemsInCategory.get(i);
            }
        }
        return min.getName();
    }
}
