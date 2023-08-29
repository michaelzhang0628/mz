package michael.learn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BallContainerTest {

    @Test
    void testContainer() {
       BallContainer bc = new BallContainer();
       assertTrue(bc.add(new Ball(200, 5)));
       assertEquals(200, bc.getCapacity());
       assertTrue(bc.add(new Ball(100, 5)));
       assertEquals(300, bc.getCapacity());   
       assertTrue(bc.add(new Ball(200, 5)));
       assertEquals(500, bc.getCapacity());
       assertFalse(bc.remove(new Ball(50, 5)));
       assertEquals(500, bc.getCapacity()); 
       assertTrue(bc.remove(new Ball(200, 5)));
       assertEquals(300, bc.getCapacity());   
       assertTrue(bc.contains(new Ball(100, 5)));
       assertFalse(bc.contains(new Ball(50, 5)));
       bc.clear();
       assertEquals(0, bc.getCapacity());
    }
}
