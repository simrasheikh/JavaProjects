/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package average.of.three.numbers;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class AverageOfThreeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        
        double avg = (n1 + n2 + n3)/3;
        
        System.out.println("The average of " + n1 + " " + n2 + " " + n3 + " is: " + avg);
        
    }
    
}
