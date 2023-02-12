/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swapping;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Swapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Give the value for x");
        int x = input.nextInt();
        System.out.println("Give the value for y");
        int y = input.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x is now " + x);
        System.out.println("y is now " + y);
    }
    
}
