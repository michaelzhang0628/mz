package michael.school;
import java.util.Scanner;

public class Lab0401_ApproxOfPi2 {
    public static void main(String[] args) {
        // Part 2
        Scanner scnr = new Scanner(System.in);
        double threshold;
        System.out.println("What is the threshold you wish to use: ");
        threshold = scnr.nextDouble();
        double piApprox = 0.0;
        int numOfIter = 0;
        int denom = 1;
        
        while (Math.abs(Math.PI - (Math.abs(piApprox))) > threshold) {
            if (numOfIter % 2 == 0) {
                piApprox += 4 * (1.0 / denom);
            } else {
                piApprox -= 4 * (1.0 / denom);
            }
            denom += 2;
            numOfIter++;
        }
        System.out.println("Math.PI:   " + Math.PI);
        System.out.println("pi:   " + piApprox);
        System.out.println("Number of iterations: " + numOfIter);        
    }
}
