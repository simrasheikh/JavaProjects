/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperature;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Type in the Celcius value:");
        Scanner input = new Scanner(System.in);
        double celcius = input.nextDouble();
        double fahrenheit = 9.0/5.0 * celcius + 32.0;
        System.out.println("Fahrenheit is: " + fahrenheit);
        
       
        
    }
    
}
