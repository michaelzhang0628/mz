package michael.exam.apcsa18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FrogSimulationTest {

    @Test
    void testSimulate() {
        assertTrue(new FrogSimulationForTesting(24, 5, new int[]{5, 7, -2, 8, 6}).simulate());
        assertTrue(new FrogSimulationForTesting(24, 5, new int[]{6, 7, 6, 6}).simulate());
        assertTrue(new FrogSimulationForTesting(24, 5, new int[]{6, -6, 31}).simulate());
        assertFalse(new FrogSimulationForTesting(24, 5, new int[]{4, 2, -8}).simulate());
        assertFalse(new FrogSimulationForTesting(24, 5, new int[]{5, 4, 2, 4, 3}).simulate());  
        System.out.println(new FrogSimulation(24, 5).runSimulations(100));
    }

}
