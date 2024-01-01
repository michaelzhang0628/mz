package michael.exam.apcsa11;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class FuelDepotTest {
    public FuelDepot getTestData() {
        List<FuelTank> tanks = new ArrayList<FuelTank> ();
        tanks.add(new FuelTankImpl(20));
        tanks.add(new FuelTankImpl(30));
        tanks.add(new FuelTankImpl(80));
        tanks.add(new FuelTankImpl(55));
        tanks.add(new FuelTankImpl(50));
        tanks.add(new FuelTankImpl(75));
        tanks.add(new FuelTankImpl(20));
        FuelRobot fr = new FuelRobotImpl(2, false);
        return new FuelDepot(fr, tanks);
    }
    
    @Test
    void testNextTankToFill() {
        FuelDepot fd = getTestData();
        assertTrue(fd.nextTankToFill(50) ==  0 || fd.nextTankToFill(50) == 6);
        assertEquals(2, fd.nextTankToFill(15));        
    }
    
    @Test
    void testMoveToLocation() {
        FuelDepot fd = getTestData();
        fd.moveToLocation(5);
        assertEquals(true, fd.getFiller().isFacingRight());
        assertEquals(5, fd.getFiller().getCurrentIndex());
        fd.moveToLocation(0);
        assertEquals(false, fd.getFiller().isFacingRight());
        assertEquals(0, fd.getFiller().getCurrentIndex());

    }

}
