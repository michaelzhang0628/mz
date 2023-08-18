package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WashingMachineTest {

    @Test
    void testWashingMachineSalePrice() {
        WashingMachine wm = new WashingMachine(500, 0.1, 50);
        assertEquals(50, wm.getInstalltionCost());
        assertEquals(550, wm.getTotalPrice());
        assertEquals(495, wm.salePrice());
    }

    @Test
    void testDiscountItemSalePrice() {
        DiscountItem di = new DiscountItem(500, 0.1, "whatever");
        assertEquals(450, di.salePrice());
    }

}
