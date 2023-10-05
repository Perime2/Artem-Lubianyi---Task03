/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task03;

/**
 *
 * @author Артем
 */
public class Task03 {

    private static final double RHO = 0.8;  
    private static final double BETA_MEN = 0.1;  
    private static final double R = 0.7;  
    
    public static void main(String[] args) {
        
      
                
   
      double Q = 250;  
      double p = 0.05;  
      double mConsumer = 70000; 
      double time = 2.5;
        
        
      double alcoholConsumed = Q * p;
      double remainingAlcohol = alcoholConsumed - (BETA_MEN * time);
      if (remainingAlcohol < 0) {
            remainingAlcohol = 0;
        }
      double bac = (remainingAlcohol / (mConsumer * R)) * 100;
        
      System.out.println("Zbytkový obsah alkoholu v krvi: " + remainingAlcohol + " g");
       System.out.println("Hladina alkoholu v krvi: " + bac + "‰");
                
        
        
        
        
        
        
        
        
    }
    
}
