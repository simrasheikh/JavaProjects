/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gcd;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class GCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter first positive integer");
        int first = input.nextInt();
        System.out.println("Enter second positive integer");
        int second = input.nextInt();
        int smallest; 
        int largest;
        int gcd = 0;
        if (first>second) {
            smallest = second;
            largest = first;
        }               
        
        else {
            smallest = first;
            largest = second;
        }
        // alternate to if else loop, u can use math.min
       
        for (int d = 1; d <= smallest; d++) {
            if (smallest%d == 0 && largest%d == 0)
                gcd = d;
        }
        System.out.println("The GCD is " + gcd);
    }
    
}
