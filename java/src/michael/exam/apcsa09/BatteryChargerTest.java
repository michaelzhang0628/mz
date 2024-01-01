package michael.exam.apcsa09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BatteryChargerTest {
    private BatteryCharger getTestCharger() {
        return new BatteryCharger(new int[] {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60});
    }
    
    @Test
    void testGetChargingCost() {
        BatteryCharger c = getTestCharger();
        assertEquals(40, c.getChargingCost(12, 1));
        assertEquals(110, c.getChargingCost(0, 2));
        assertEquals(550, c.getChargingCost(22, 7));
        assertEquals(3710, c.getChargingCost(22, 30));
    }

    @Test
    void testGetChargeStartTime() {
        BatteryCharger c = getTestCharger();
        assertEquals(12, c.getChargeStartTime(1));
        assertTrue(c.getChargeStartTime(2) == 23 || c.getChargeStartTime(2) == 0);
        assertEquals(22, c.getChargeStartTime(7));
        assertEquals(22, c.getChargeStartTime(30));
    }
}
