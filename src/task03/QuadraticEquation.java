/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task03;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Zadejte koeficienty kvadratické rovnice (ax^2 + bx + c):");

        System.out.print("Zadejte koeficient a: ");
        double a = input.nextDouble();

        System.out.print("Zadejte koeficient b: ");
        double b = input.nextDouble();

        System.out.print("Zadejte koeficient c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Rovnice má dva skutečné kořeny:");
            System.out.println("Kořen 1: " + root1);
            System.out.println("Kořen 2: " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Rovnice má jeden skutečný kořen:");
            System.out.println("kořen: " + root);
        } else {
           
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Rovnice má dva složité kořeny:");
            System.out.println("Kořen 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Kořen 2: " + realPart + " - " + imaginaryPart + "i");
        }

        input.close();
    }
}
