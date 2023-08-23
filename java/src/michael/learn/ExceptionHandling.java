package michael.learn;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please input a number");
                String userInput = scanner.nextLine();
                double y = 2 / Double.parseDouble(userInput);
                System.out.println(y);
            } catch (ArithmeticException e) {
                System.out.println("Math problem: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Format problem: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Something went wrong." + e);
            } finally {
                System.out.println("The 'try catch' is finished.");
            }
        }
    }
}