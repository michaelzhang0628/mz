package michael.exam.apcsa22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;
    
    public Game() {
        // TODO     
    }
    
    public boolean isBonus() {
        // TODO
        return false;
    }
    
    public void play() {
        // TODO
    }
    
    public int getScore() {
        int score = 0;
        if (levelOne.goalReached()) {
            score = levelOne.getPoints();
            if (levelTwo.goalReached()) {
                score += levelTwo.getPoints();
                if (levelThree.goalReached()) {                  
                    score += levelThree.getPoints();
                }
            }
        }
        if (isBonus()) {
            score = 3 * score;
        }
        return score;
    }
    
    public int playManyTimes(int num) {
        int max = 0;
        for (int i = 0; i < num; i++) {
            play();
            int current = getScore();
            if (current > max) {
                max = current;
            }
        }
        return max;
    } 
}


