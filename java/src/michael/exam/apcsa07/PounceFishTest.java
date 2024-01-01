package michael.exam.apcsa07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class PounceFishTest {
    
    private PounceFish getTestFishWithRange(int range, char direction) {
        ArrayList<Fish> others = new ArrayList<Fish>();
        others.add(new Fish(0, 2));
        others.add(new Fish(1, 0));
        others.add(new Fish(1, 4));
        others.add(new Fish(2, 1));
        others.add(new Fish(1, 3));
        return new PounceFish(1, 1, range, direction, others);
    }

    @Test
    void testFindFish() {
        PounceFish p1 = getTestFishWithRange(3, 'e');
        Fish found = p1.findFish();
        assertEquals(1, found.getX());
        assertEquals(3, found.getY());
        PounceFish p2 = getTestFishWithRange(1, 'e');
        assertNull(p2.findFish());
        PounceFish p3 = getTestFishWithRange(29, 's');
        found = p3.findFish();
        assertEquals(2, found.getX());
        assertEquals(1, found.getY());
        PounceFish p4 = getTestFishWithRange(1, 's');
        found = p4.findFish();
        assertEquals(2, found.getX());
        assertEquals(1, found.getY());
    }

    @Test
    void testAct1() {
        PounceFish p1 = getTestFishWithRange(2, 'e');
        p1.act();
        assertEquals(1, p1.getX());
        assertEquals(3, p1.getY());
        ArrayList<Fish> others = p1.getOthers();
        assertEquals(4, others.size());
    }

    @Test
    void testAct2() {
        PounceFish p1 = getTestFishWithRange(1, 'e');
        p1.act();
        assertEquals(1, p1.getX());
        assertEquals(1, p1.getY());
        ArrayList<Fish> others = p1.getOthers();
        assertEquals(5, others.size());
    }


    @Test
    void testAct3() {
        PounceFish p1 = new PounceFish(1, 1, 1, 'e', null);
        p1.act();
        assertEquals(1, p1.getX());
        assertEquals(1, p1.getY());
        ArrayList<Fish> others = p1.getOthers();
        assertNull(others);
    }

}
