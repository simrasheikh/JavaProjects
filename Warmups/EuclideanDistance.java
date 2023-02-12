/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package euclideandistance;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EuclideanDistance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert the x value: ");
        int x = input.nextInt();
        System.out.println("Insert the y value: ");
        int y = input.nextInt();
        double distance = Math.pow(x, 2) + Math.pow(y, 2);
        System.out.println("The Euclidean Distance between the points x ad y is: " + Math.sqrt(distance));
    }
    
}
