/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boiling;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Boilingandfreezing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Give in the Temperature:");
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        if (temp >= 100) {
            System.out.println("The water's boiling boom");
        } else {
            if (temp <= 0){
                System.out.println("ur water freezing dumbass");
            } else {
                System.out.println("The water ain't boiling oops, its in the normal mundane state");
            }
            
        }
                
        
    }
    
}
