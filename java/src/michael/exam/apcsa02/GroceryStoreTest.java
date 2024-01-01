package michael.exam.apcsa02;

import static org.junit.jupiter.api.Assertions.*;

import java.io.*;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class GroceryStoreTest {
    
    private GroceryStore getTestStore() {
        Item[] items = new Item[8];
        items[0] = new Item("avocado", 1.68, 8, 'P');
        items[1] = new Item("milk", 1.92, 64, 'D');
        items[2] = new Item("chicken", 4.48, 64, 'M');
        items[3] = new Item("broccoli", 1.92, 16, 'P');
        items[4] = new Item("yogurt", 0.96, 16, 'D');
        items[5] = new Item("spinach", 1.76, 16, 'P');
        items[6] = new Item("cornedbeef", 6.72, 48, 'M');
        items[7] = new Item("porkchops", 2.24, 32, 'M');
        return new GroceryStore(items);
    }

    @Test
    void testBargainItem() {
        GroceryStore gc = this.getTestStore();
        assertEquals("spinach", gc.bargainItems('P'));
        assertTrue("chicken".equals(gc.bargainItems('M')) || "porkchops".equals(gc.bargainItems('M')));
        assertEquals("none", gc.bargainItems('B'));
    }
    
    @Test
    void testChangePrices() throws IOException {
        GroceryStore gc = this.getTestStore();
        String newPrices = "cornedbeef\n7.99\nyogurt\n0.75\nmilk\n1.25\nbroccoli\n0.98";
        InputStream in = new ByteArrayInputStream(newPrices.getBytes());
        //InputStream in = new FileInputStream("/Users/michaelzhang/git/mz/java/src/michael/exam/apcsa02/update-prices.txt");
        gc.changePrices(in);
        Item[] updatedItems = gc.getItems();
        assertEquals(7.99, updatedItems[6].getPrice());
        assertEquals(0.75, updatedItems[4].getPrice());
        assertEquals(1.25, updatedItems[1].getPrice());
        assertEquals(0.98, updatedItems[3].getPrice());
    }

}
