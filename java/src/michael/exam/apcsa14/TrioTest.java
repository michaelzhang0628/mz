package michael.exam.apcsa14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrioTest {

    @Test
    void test() {
        Trio trio1 = new Trio(new Sandwich("Cheeseburger", 2.75), new Salad("Spinach Salad", 1.25), new Drink("Orange Soda", 1.25));
        Trio trio2 = new Trio(new Sandwich("Club Sandwich", 2.75), new Salad("Coleslaw", 1.25), new Drink("Cappuccino", 3.50));
        assertEquals("Cheeseburger/Spinach Salad/Orange Soda Trio", trio1.getName());
        assertEquals("Club Sandwich/Coleslaw/Cappuccino Trio", trio2.getName());
        assertEquals(4.00, trio1.getPrice());
        assertEquals(6.25, trio2.getPrice());
    }

}
