package michael.school;

public class Player {
    private String name;
    private boolean isComputer;
    private int playerScore = 50;
    private static int highestScore = 0;

    public Player(String name, boolean isComputer) {
        this.name = name;
        this.isComputer = isComputer;
    }

    public Player() {
        this("Computer", true);
    }

    public void scoreRound(int roundScore) {
        if (roundScore > highestScore) {
            highestScore = roundScore;
        }
        playerScore += roundScore;
    }

    public void resetScore() {
        playerScore = 50;
    }
    public int getScore() {
        return playerScore;
    }
    public String getName() {
        return name;
    }
    public static int getBestRound() {
        return highestScore;
    }

    public String toString() {
        return name + ": " + playerScore;
    }  
}
