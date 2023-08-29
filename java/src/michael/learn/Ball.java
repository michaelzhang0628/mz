package michael.learn;

import java.util.Objects;

public class Ball implements Comparable<Ball> {
    private int capacity = 0;
    private int weight = 0;

    /**
     * Constructor that creates a new ball object with the specified weight and
     * capacity.
     * 
     * @param capacity Capacity of the new object.
     */
    public Ball(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    /**
     * Returns the capacity of the Ball.
     * 
     * @return the capacity of the Ball.
     */
    public int getCapacity() {
        return capacity;
    }
    
    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Ball))
            return false;
        Ball other = (Ball) obj;
        return capacity == other.capacity && weight == other.weight;
    }

    @Override
    public int compareTo(Ball that) {
        return this.capacity - that.capacity;
    }
}
