package michael.school;

import java.util.Random;

public class Die {
    private static Random gen = new Random(1);   // Random object using seed 1. DO NOT CHANGE. Use default constrctor of Random if you want to play the game competely random.
    private int numSides;
    private int faceValue;
    
    public Die(int numSides) {
        this.numSides = numSides;
    }

    public Die() {
        this(6);
    }
        
    public void roll() {
        faceValue = gen.nextInt(numSides) + 1;
    }
    
    public int getRoll() {
        return faceValue;
    }
}


