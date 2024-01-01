package michael.school;

import java.util.Scanner;
import java.text.DecimalFormat;

public class IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$#,##0.00");
        int singleTier1 = 9525;
        int singleTier2 = 38700;
        int singleTier3 = 82500;
        int singleTier4 = 157500;
        int singleTier5 = 200000;
        int singleTier6 = 500000;
        int doubleTier1 = singleTier1 * 2;
        int doubleTier2 = singleTier2 * 2;
        int doubleTier3 = singleTier3 * 2;
        int doubleTier4 = singleTier4 * 2;
        int doubleTier5 = singleTier5 * 2;
        int doubleTier6 = singleTier6 * 2;
        int salary;
        int fillingStatus;
        double incomeTax;

        System.out.println("Choose your filing status.");
        System.out.println("Please enter \"1\" for Single, \"2\" for Joint: ");
        fillingStatus = scnr.nextInt();
        System.out.println("Enter your yearly taxable income: ");
        salary = scnr.nextInt();

        if (fillingStatus == 1) {
            if (salary <= singleTier1) {
                incomeTax = salary * 0.10;
            } else if (salary <= singleTier2) {
                incomeTax = singleTier1 * 0.10 + (salary - singleTier1) * 0.12;
            } else if (salary <= singleTier3) {
                incomeTax = singleTier1 * 0.10 + (singleTier2 - singleTier1) * 0.12 + (salary - singleTier2) * 0.22;
            } else if (salary <= singleTier4) {
                incomeTax = singleTier1 * 0.10 + (singleTier2 - singleTier1) * 0.12 + (singleTier3 - singleTier2) * 0.22
                        + (salary - singleTier3) * 0.24;
            } else if (salary <= singleTier5) {
                incomeTax = singleTier1 * 0.10 + (singleTier2 - singleTier1) * 0.12 + (singleTier3 - singleTier2) * 0.22 + (singleTier4 - singleTier3) * 0.24
                        + (salary - singleTier4) * 0.32;
            } else if (salary <= singleTier6) {
                incomeTax = singleTier1 * 0.10 + (singleTier2 - singleTier1) * 0.12 + (singleTier3 - singleTier2) * 0.22 + (singleTier4 - singleTier3) * 0.24
                        + (singleTier5 - singleTier4) * 0.32 + (salary - singleTier5) * 0.35;
            } else {
                incomeTax = singleTier1 * 0.10 + (singleTier2 - singleTier1) * 0.12 + (singleTier3 - singleTier2) * 0.22 + (singleTier4 - singleTier3) * 0.24
                        + (singleTier5 - singleTier4) * 0.32 + (singleTier6 - singleTier5) * 0.35 + (salary - singleTier6) * 0.37;
            }
        } else {
            if (salary <= doubleTier1) {
                incomeTax = salary * 0.10;
            } else if (salary <= doubleTier2) {
                incomeTax = doubleTier1 * 0.10 + (salary - doubleTier1) * 0.12;
            } else if (salary <= doubleTier3) {
                incomeTax = doubleTier1 * 0.10 + (doubleTier2 - doubleTier1) * 0.12 + (salary - doubleTier2) * 0.22;
            } else if (salary <= doubleTier4) {
                incomeTax = doubleTier1 * 0.10 + (doubleTier2 - doubleTier1) * 0.12 + (doubleTier3 - doubleTier2) * 0.22
                        + (salary - doubleTier3) * 0.24;
            } else if (salary <= doubleTier5) {
                incomeTax = doubleTier1 * 0.10 + (doubleTier2 - doubleTier1) * 0.12 + (doubleTier3 - doubleTier2) * 0.22 + (doubleTier4 - doubleTier3) * 0.24
                        + (salary - doubleTier4) * 0.32;
            } else if (salary <= doubleTier6) {
                incomeTax = doubleTier1 * 0.10 + (doubleTier2 - doubleTier1) * 0.12 + (doubleTier3 - doubleTier2) * 0.22 + (doubleTier4 - doubleTier3) * 0.24
                        + (doubleTier5 - doubleTier4) * 0.32 + (salary - doubleTier5) * 0.35;
            } else {
                incomeTax = doubleTier1 * 0.10 + (doubleTier2 - doubleTier1) * 0.12 + (doubleTier3 - doubleTier2) * 0.22 + (doubleTier4 - doubleTier3) * 0.24
                        + (doubleTier5 - doubleTier4) * 0.32 + (singleTier6 - singleTier5) * 0.35 + (salary - doubleTier6) * 0.37;
            }
        }
        System.out.print("Income tax: ");
        System.out.println(df.format(incomeTax));
    }
}
