package michael.exam.apcs2022;

public class Game {
    private Level levelOne;
    private Level levelTwo;
    private Level levelThree;

    public Game() {
        
    }

    public boolean isBonus() {
        return false;
    }

    public void play() {

    }

    public int getScore() {
        int score = 0;
        if (levelOne.goalReached()) {
            score += levelOne.getPoints();
            if (levelTwo.goalReached()) {
                score += levelTwo.getPoints();
                if (levelThree.goalReached()) {
                    score += levelThree.getPoints();
                }
            }
        }
        if (isBonus()) {
            score *= 3;            
        }
        return score;
    }

    public int playManyTimes(int num) {
        int bestScore = 0;
        for (int i = 0; i < num; i++) {
            play();
            int score = getScore();
            if (score > bestScore) {
                bestScore = score;
            }
        }
        return bestScore;
    }
}
