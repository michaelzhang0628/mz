package michael.school;

import java.util.Random;
import java.util.Scanner;

public class Lab0502_DiceStatsWithArrays {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random(1);
        int numRolls = 0;   // User defined number of rolls
        int die1;       // Dice values
        int die2;       // Dice values
        int rollTotal;  // Sum of dice values
        int[] resultTotals = new int[11];

      // Get initial number of rolls from the user
        System.out.println("Enter number of rolls (0 to quit): ");
        numRolls = scnr.nextInt();

      // If the value of numRolls is 1 or more, roll the die and collect the data
        while (numRolls >= 1) {
            // Roll dice numRoll times
            for (int i = 0; i < numRolls; ++i) {
                die1 = randGen.nextInt(6) + 1;
                die2 = randGen.nextInt(6) + 1;
                rollTotal = die1 + die2;

                // Count number of times each dice total occurs
                if (rollTotal >= 2 && rollTotal <= 12) {
                    resultTotals[rollTotal - 2]++;
                }

                System.out.println("Roll " + (i+1) + " is " + 
                        rollTotal + " (" + die1 + 
                        "+" + die2 + ")");
            }

            //Print statistics on dice rolls
            System.out.println("\nDice roll statistics:");
            for (int i = 0; i < resultTotals.length; i++) {
                System.out.println((i + 2) + "s: " + resultTotals[i]);
            }

         // Print histogram of dice rolls
            System.out.println("\nDice roll histogram for " + numRolls + " roll(s):");
            for (int i = 0; i < resultTotals.length; i++) {
                String s = "";
                for (int x = 0; x < resultTotals[i]; x++) {
                    s += "*";
                }
                System.out.println((i + 2) + "s: " + s);
            }

         // reset counting variables
        for (int i = 0; i < resultTotals.length; i++) {
            resultTotals[i] = 0;
        }

         // Ask the user for another number of rolls
            System.out.print("\nEnter number of rolls (0 to quit): ");
            numRolls = scnr.nextInt();
            
        } 

        System.out.println("\nThank you for playing!");

    }
}


