package michael.learn;

import java.util.Scanner;
import java.util.Random;

public class Lab0404_DiceStats {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random(1);
        int i; // Loop counter iterates numRolls times
        int numRolls; // User defined number of rolls
        int numOnes = 0;
        int numTwos = 0;
        int numThrees = 0;
        int numFours = 0;
        int numFives = 0;
        int numSixes = 0; // Tracks number of 6s found
        int numSevens = 0; // Tracks number of 7s found
        int numEights = 0;
        int numNines = 0;
        int numTens = 0;
        int numElevens = 0;
        int numTwelves = 0;
        String histOnes = "";
        String histTwos = "";
        String histThrees = "";
        String histFours = "";
        String histFives = "";
        String histSixes = "";
        String histSevens = "";
        String histEights = "";
        String histNines = "";
        String histTens = "";
        String histElevens = "";
        String histTwelves = "";
        int die1; // Dice values
        int die2; // Dice values
        int rollTotal; // Sum of dice values
        boolean play = true;

        System.out.println("Enter number of rolls (0 to quit): ");
        numRolls = scnr.nextInt();
        if (numRolls == 0) {
            play = false;
        } else {
            play = true;
        }
        
        while (play) {
            if (numRolls >= 1) {
                // Roll dice numRoll times
                for (i = 0; i < numRolls; ++i) {
                    die1 = randGen.nextInt(6) + 1;
                    die2 = randGen.nextInt(6) + 1;
                    rollTotal = die1 + die2;
                    // Count number of sixs and sevens
                    if (rollTotal == 1) {
                        numOnes = numOnes + 1;
                    } else if (rollTotal == 2) {
                        numTwos = numTwos + 1;
                    } else if (rollTotal == 3) {
                        numThrees = numThrees + 1;
                    } else if (rollTotal == 4) {
                        numFours = numFours + 1;
                    } else if (rollTotal == 5) {
                        numFives = numFives + 1;
                    } else if (rollTotal == 6) {
                        numSixes = numSixes + 1;
                    } else if (rollTotal == 7) {
                        numSevens = numSevens + 1;
                    } else if (rollTotal == 8) {
                        numEights = numEights + 1;
                    } else if (rollTotal == 9) {
                        numNines = numNines + 1;
                    } else if (rollTotal == 10) {
                        numTens = numTens + 1;
                    } else if (rollTotal == 11) {
                        numElevens = numElevens + 1;
                    } else if (rollTotal == 12) {
                        numTwelves = numTwelves + 1;
                    }
                    System.out.println("Roll " + (i + 1) + " is " + rollTotal + " (" + die1 + "+" + die2 + ")");
                }

                for (int x = 0; x < numOnes; x++) {
                    histOnes += "*";
                }
                for (int x = 0; x < numTwos; x++) {
                    histTwos += "*";
                }
                for (int x = 0; x < numThrees; x++) {
                    histThrees += "*";
                }
                for (int x = 0; x < numFours; x++) {
                    histFours += "*";
                }
                for (int x = 0; x < numFives; x++) {
                    histFives += "*";
                }
                for (int x = 0; x < numSixes; x++) {
                    histSixes += "*";
                }
                for (int x = 0; x < numSevens; x++) {
                    histSevens += "*";
                }
                for (int x = 0; x < numEights; x++) {
                    histEights += "*";
                }
                for (int x = 0; x < numNines; x++) {
                    histNines += "*";
                }
                for (int x = 0; x < numTens; x++) {
                    histTens += "*";
                }
                for (int x = 0; x < numElevens; x++) {
                    histElevens += "*";
                }
                for (int x = 0; x < numTwelves; x++) {
                    histTwelves += "*";
                }
                // Print statistics on dice rolls
                System.out.println("\nDice roll statistics:");
                System.out.println("1s: " + numOnes);
                System.out.println("2s: " + numTwos);
                System.out.println("3s: " + numThrees);
                System.out.println("4s: " + numFours);
                System.out.println("5s: " + numFives);
                System.out.println("6s: " + numSixes);
                System.out.println("7s: " + numSevens);
                System.out.println("8s: " + numEights);
                System.out.println("9s: " + numNines);
                System.out.println("10s: " + numTens);
                System.out.println("11s: " + numElevens);
                System.out.println("12s: " + numTwelves);
            } else {
                System.out.println("Invalid rolls. Try again.");
            }
            System.out.println("\nDice roll histogram for 10 roll(s):");
            System.out.println("1: " + histOnes);
            System.out.println("2: " + histTwos);
            System.out.println("3: " + histThrees);
            System.out.println("4: " + histFours);
            System.out.println("5: " + histFives);
            System.out.println("6: " + histSixes);
            System.out.println("7: " + histSevens);
            System.out.println("8: " + histEights);
            System.out.println("9: " + histNines);
            System.out.println("10: " + histTens);
            System.out.println("11: " + histElevens);
            System.out.println("12: " + histTwelves);
            System.out.println("Enter number of rolls (0 to quit): ");
            
            numRolls = scnr.nextInt();
            if (numRolls == 0) {
                play = false;
            } else {
                play = true;
            }
        }
        System.out.println("Thank you for playing!");
    }
}
