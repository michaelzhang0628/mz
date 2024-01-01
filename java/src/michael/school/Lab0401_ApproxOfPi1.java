package michael.school;
import java.util.Scanner;

public class Lab0401_ApproxOfPi1 {
    public static void main(String[] args) {
        // Part 1
        Scanner scnr = new Scanner(System.in);
        int userNumOfIter;
        System.out.println("How many iterations would you like to do: ");
        userNumOfIter = scnr.nextInt();
        int numOfIter = 0;
        double piApprox = 0.0;
        int denom = 1;
        
        while (numOfIter < userNumOfIter) {
            if (numOfIter % 2 == 0) {
                piApprox += 4 * (1.0 / denom);
            } else {
                piApprox -= 4 * (1.0 / denom);
            }
            denom += 2;
            numOfIter++;
        }
        System.out.println("pi:   " + piApprox);
    }
}
