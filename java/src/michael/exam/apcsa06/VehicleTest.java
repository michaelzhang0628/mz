package michael.exam.apcsa06;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehicleTest {

    @Test
    void testVehicle() {
        Vehicle v = new Vehicle(0.10, 20000.00, 2500.00);
        assertEquals(22500.00, v.getListPrice());
        assertEquals(24750.00, v.purchasePrice());
        v.changeMarkup(1000.00);
        assertEquals(21000.00, v.getListPrice());
        assertEquals(23100.00, v.purchasePrice());
    }

}
