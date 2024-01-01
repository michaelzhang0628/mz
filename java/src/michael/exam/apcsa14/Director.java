package michael.exam.apcsa14;

import java.awt.Color;

public class Director implements Rock {
    private Color color;

    public Director() {
        color = Color.RED;
    }

    public void act() {
        if (color == Color.RED) {
            color = Color.GREEN;
        } else if (color == Color.GREEN) {
            color = Color.RED;
            // TODO turn any Actor objects in neighboring cells 90 degrees to their right
        }
    }

}
