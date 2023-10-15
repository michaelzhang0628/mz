package michael.math;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        
        //
        System.out.println("triangle1 base: ");
        //
        triangle1.setBase(scnr.nextDouble());
        //
        System.out.println("triangle1 height: ");
        //
        triangle1.setHeight(scnr.nextDouble());
        
        //
        System.out.println("triangle2 base: ");
        //
        triangle2.setBase(scnr.nextDouble());
        //
        System.out.println("triangle2 height: ");
        //
        triangle2.setHeight(scnr.nextDouble());
        
        System.out.println("Triangle with larger area:");
        if (triangle1.getArea() > triangle2.getArea()) {
            triangle1.printInfo();
        } else {
            triangle2.printInfo();
        }
    }
}
