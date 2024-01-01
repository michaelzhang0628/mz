package michael.exam.apcsa12;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HorseBarnTest {

    @Test
    void testFindHorseSpace() {
        Horse[] hs = new Horse[7];
        hs[0] = new HorseImpl("Trigger", 1340);
        hs[2] = new HorseImpl("Silver", 1210);
        hs[3] = new HorseImpl("Lady", 1575);
        hs[5] = new HorseImpl("Patches", 1350);
        hs[6] = new HorseImpl("Duke", 1410);
        HorseBarn sweetHome = new HorseBarn(hs);
        assertEquals(0, sweetHome.findHorseSpace("Trigger"));
        assertEquals(2, sweetHome.findHorseSpace("Silver"));
        assertEquals(-1, sweetHome.findHorseSpace("Coco"));
    }
    
    @Test
    void testConsolidate() {
        Horse[] hs = new Horse[7];
        hs[0] = new HorseImpl("Trigger", 1340);
        hs[2] = new HorseImpl("Silver", 1210);
        hs[5] = new HorseImpl("Patches", 1350);
        hs[6] = new HorseImpl("Duke", 1410);
        HorseBarn sweetHome = new HorseBarn(hs);
        sweetHome.consolidate();
        Horse[] result = sweetHome.getSpaces();
        Horse[] expected = new Horse[7];
        expected[0] = new HorseImpl("Trigger", 1340);
        expected[1] = new HorseImpl("Silver", 1210);
        expected[2] = new HorseImpl("Patches", 1350);
        expected[3] = new HorseImpl("Duke", 1410);
        assertArrayEquals(expected, result);
    }

}
