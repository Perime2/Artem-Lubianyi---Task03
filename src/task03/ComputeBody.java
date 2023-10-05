/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task03;

import java.util.Scanner;

/**
 *
 * @author Артем
 */
public class ComputeBody {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Zadejte délky ploch krychle(a, b, c): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        
        double volumeCube = a * b * c;
        double surfaceAreaCube = 2 * (a * b + b * c + a * c);

       
        System.out.println("Objem krychle:" + volumeCube);
        System.out.println("Plocha krychle: " + surfaceAreaCube);

        
        double radiusSphere = Math.cbrt(volumeCube);

        
        double sideLengthCube = Math.pow(volumeCube, 1.0 / 3);

        
        double sideLengthTetrahedron = Math.cbrt(3 * volumeCube / Math.sqrt(2));

        
        System.out.println("Poloměr koule se stejným objemem: " + radiusSphere);
        System.out.println("Délka strany krychle se stejným objemem: " + sideLengthCube);
        System.out.println("Délka strany čtyřstěnu se stejným objemem: " + sideLengthTetrahedron);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
