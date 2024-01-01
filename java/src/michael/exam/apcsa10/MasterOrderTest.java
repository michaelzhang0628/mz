package michael.exam.apcsa10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MasterOrderTest {

    @Test
    void testMasterOrder() {
        MasterOrder goodies = new MasterOrder();
        goodies.addOrder(new CookieOrder("Chocolate Chip", 1));
        goodies.addOrder(new CookieOrder("Shortbread", 5));
        goodies.addOrder(new CookieOrder("Macaroon", 2));
        goodies.addOrder(new CookieOrder("Chocolate Chip", 3));
        assertEquals(11, goodies.getTotalBoxes());
        assertEquals(4, goodies.removeVariety("Chocolate Chip"));
        assertEquals(0, goodies.removeVariety("Brownies"));
        assertEquals(7, goodies.getTotalBoxes());
    }

}
