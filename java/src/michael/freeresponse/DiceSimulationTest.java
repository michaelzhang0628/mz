package michael.freeresponse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiceSimulationTest {

    @Test
    void testRoll() {
        DiceSimulation d = new DiceSimulation(10, 6);
        for (int i=0; i<1000;i++) {
            int number = d.roll();
            assertTrue(number<=6);
            assertTrue(number>=1);
        }
    }
    
    @Test
    void testSimulation() {
        DiceSimulation d = new DiceSimulation(10, 6);
        for (int i=0; i<1000;i++) {
            int percentage = d.runSimulation();
            assertTrue(percentage<=100);
            assertTrue(percentage>=0);
        }
    }
}
