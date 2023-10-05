/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task03;

import java.util.Scanner;
public class QuadrantPoint {
 


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Zadejte souřadnici x: ");
        double x = input.nextDouble();

        System.out.print("Zadejte souřadnici y:");
        double y = input.nextDouble();

        if (x > 0 && y > 0) {
            System.out.println("Bod je v prvním kvadrantu.");
        } else if (x < 0 && y > 0) {
            System.out.println("Bod je ve druhém kvadrantu.");
        } else if (x < 0 && y < 0) {
            System.out.println("Bod je ve třetím kvadrantu.");
        } else if (x > 0 && y < 0) {
            System.out.println("Bod je ve čtvrtém kvadrantu.");
        } else if (x == 0 && y == 0) {
            System.out.println("Bod je v počátku.");
    
}
