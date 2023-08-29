package michael.learn;
import java.util.LinkedList;
import java.util.List;

public class BallContainer {
    public List<Ball> balls = new LinkedList<Ball>();
    public int capacity;

    public boolean add(Ball ball) {
        if (balls.add(ball)) {
            this.capacity += ball.getCapacity();
            return true;
        }
        return false;
    }
    
    public boolean remove(Ball ball) {
        if (balls.remove(ball)) {
            this.capacity -= ball.getCapacity();    
            return true;
        }
        return false;
    }
    
    public boolean contains(Ball ball) {
        for (int i = 0; i < balls.size(); i++) {
            if (balls.get(i).equals(ball)) {
                return true;
            }
        }
        return false;
    }

    public int getCapacity() {
        return this.capacity;
    }
    
    public void clear() {
        balls.clear();
        capacity = 0;
    }
    
}
