package michael.learn;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class BoxTest {

    @Test
    void testConstructor() {
       Box b = new Box(400);
       assertEquals(400, b.getSize());
    }
    
    @Test
    void testAdd() {
       Box b = new Box(400);
       assertTrue(b.add(new Ball(200, 5)));
       assertEquals(200, b.getCapacity());
       assertTrue(b.add(new Ball(100, 5)));
       assertEquals(300, b.getCapacity());
       assertFalse(b.add(new Ball(200, 5)));
       assertEquals(300, b.getCapacity());
    }

    @Test
    void testGetBallsFromSmallest() {
       Box b = new Box(100000);
       b.add(new Ball(200, 5));
       b.add(new Ball(100, 5));
       b.add(new Ball(300, 5));
       b.add(new Ball(5, 5));
       b.add(new Ball(10000, 5));
       b.add(new Ball(3, 5));
       
       List<Ball> expected = new ArrayList<Ball>();
       expected.add(new Ball(3, 5));
       expected.add(new Ball(5, 5));
       expected.add(new Ball(100, 5));
       expected.add(new Ball(200, 5));
       expected.add(new Ball(300, 5));
       expected.add(new Ball(10000, 5));

       assertEquals(expected, b.getBallsFromSmallest());
   }
}
