package michael.learn;

import java.util.List;

import michael.sort.Sorter3;

public class Box extends BallContainer{
    public int size;
    
    public Box(int size) {
        this.size = size;
    }
    
    public int getSize() {
        return this.size;
    }   
    
    @Override
    public boolean add(Ball ball) {
        if (getCapacity() + ball.getCapacity() <= size) {
            super.add(ball);
            return true;
        }
        return false;
    }
    
    /**
     * Return all the balls ordered by capacity from smallest to biggest
     * @return
    */
    public List getBallsFromSmallest() {
        List<Comparable> unsorted = (List<Comparable>)(List<? extends Comparable>)this.balls;
        return new Sorter3().sort(unsorted);
    }
}
