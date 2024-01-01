package michael.school;
import java.util.Scanner;

public class Lab0402_PopulationGrowth {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numOrganisms; 
        int growthRate;
        int numHours;
        int numHoursPopulation;
       
        System.out.println("Please enter positive numbers only:");
        System.out.println("Number of organisms: ");
        numOrganisms = scnr.nextInt();
        System.out.println("Rate of growth: ");
        growthRate = scnr.nextInt();
        System.out.println("Number of Hours to achieve the rate: ");
        numHours = scnr.nextInt();
        
    }
}
