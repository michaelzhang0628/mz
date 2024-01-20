package michael.exam.apcs2022;

public class Level {
    private int points;
    private boolean goalReached;
    
    public Level(int points, boolean goalReached) {
        super();
        this.points = points;
        this.goalReached = goalReached;
    }

    public boolean goalReached() {
        return goalReached;
    }
    
    public int getPoints() {
        return points;
    }
}
