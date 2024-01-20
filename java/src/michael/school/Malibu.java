package michael.school;

import java.util.Scanner;

public class Malibu {
    public static Die die1 = new Die();
    public static Die die2 = new Die();
    public static Die die3 = new Die();
    private static int highestPoint = 0;

    // After submitting it, it says that I didn't test getPoints. However, I used it in roll3Dice many times and was hoping that was good enough as a test
    private static int getPoints(int total, boolean hasTriple, boolean hasPair) {
        int points = 0;
        if (total == 13 && hasPair) {
            points += 10;
            System.out.println("Sough: 10 points");
        }
        if (total == 6 || total == 15) {
            points += 4;
            System.out.println("Easy Rider: 4 points");
        }
        if (total == 9 || total == 12) {
            points += 3;
            System.out.println("Straight Road: 3 points");
        }
        if (hasTriple) {
            points += 5;
            System.out.println("Triple Crown: 5 points");
        }
        if (hasPair && points != 10 && !hasTriple) {
            points += 3;
            System.out.println("Two of a Kind: 3 points");
        }
        if (total == 13 && !hasPair) {
            points += 6;
            System.out.println("Lucky Joe: 6 points");
        }
        if (total == 1) {
            points += 7;
            System.out.println("Low and Mean: 7 points");
        }
        if (total == 18) {
            points += 12;
            System.out.println("High Roller: 12 points");
        }
        if (total == 7) {
            points -= 2;
            System.out.println("Dreaded 7: -2 points");
        }
        return points;
    }

    public static int roll3Dice() {
        die1.roll();
        die2.roll();
        die3.roll();
        int compRoll1 = die1.getRoll();
        int compRoll2 = die2.getRoll();
        int compRoll3 = die3.getRoll();
        int total = compRoll1 + compRoll2 + compRoll3;
        boolean hasTriple = (compRoll1 == compRoll2 && compRoll2 == compRoll3);
        boolean hasPair = (compRoll1 == compRoll2 || compRoll2 == compRoll3 || compRoll1 == compRoll3);
        System.out.println(compRoll1 + " " + compRoll2 + " " + compRoll3);
        int points = getPoints(total, hasTriple, hasPair);
        return points;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to the game of Malibu");
        System.out.println();
        System.out.println("What is your name?");
        String playerName = scnr.nextLine();
        System.out.println();
        System.out.println("Hi " + playerName + ", please press enter when ready to start.");
        scnr.nextLine();
        System.out.println();
        System.out.println();
        System.out.println("We will play 5 rounds");
        System.out.println();
        int numRounds = 1;
        Player player = new Player(playerName, false);
        Player computer = new Player();
        int gamesPlayed = 1;
        while (numRounds <= 5) {
            System.out.println("ROUND " + numRounds);
            System.out.print(player.toString() + " - " + computer.toString());
            System.out.println();
            System.out.println(computer.getName() + " goes first:");
            int compPoints = roll3Dice();
            System.out.println();
            System.out.println("Your rolls:");
            int playerPoints = roll3Dice();
            System.out.println();
            computer.scoreRound(compPoints);
            computer.scoreRound(-playerPoints);
            player.scoreRound(playerPoints);
            player.scoreRound(-compPoints);
            if (player.getBestRound() > highestPoint) {
                highestPoint = player.getBestRound();
            } 
            if (computer.getBestRound() > highestPoint) {
                highestPoint = computer.getBestRound();
            }
            System.out.println("After round " + numRounds + " the scores are:");
            System.out.print(player.toString() + " - " + computer.toString());
            System.out.println();
            System.out.println("Press enter to continue...");
            scnr.nextLine();
            System.out.println("##############################################");
            System.out.println();
            numRounds++;
            if (numRounds == 6) {
                System.out.println("Good job " + player.getName() + "!");
                if (computer.getScore() > player.getScore()) {
                    System.out.println("But not good enough. The Computer won.");
                } else if (computer.getScore() < player.getScore()) {
                    System.out.println("You are the winner!");
                } else {
                    System.out.println("You and the Computer tied");
                }
                System.out.println();
                System.out.println("Would you like to play again (Yes/No)?");
                String yesOrNo = scnr.nextLine();
                if (yesOrNo.equals("Yes")) {
                    numRounds = 1;
                    gamesPlayed++;
                    player.resetScore();
                    computer.resetScore();
                }
                System.out.println("##############################################");
                System.out.println("##############################################");
                System.out.println();
            }
        }
        System.out.println("Hightest points earned in " + gamesPlayed + " round(s) was " + highestPoint);
        System.out.println();
        System.out.println("Thanks for playing");
        
    }
}
