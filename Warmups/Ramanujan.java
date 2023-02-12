/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ramanujan;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ramanujan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an integer value");
        int num = input.nextInt();
        
      
        int a, b, c, d, ac = 0, bc = 0, cc = 0, dc = 0;
        for (a = 1; a <= num; a++) {
            ac = (int) Math.pow(a, 3);
            if (ac > num) break;
                    
        for (b = a; b <= num; b++) {
            bc = (int) Math.pow(b, 3);
            if (ac + bc > num) break;
            
        for (c = a + 1; c <= num; c++) {
            cc = (int) Math.pow(c, 3);
            if (cc > ac + bc) break;
            
        for (d = c; d <= num; d++) {
            dc = (int) Math.pow(d, 3);
            if (cc + dc > ac + bc) break;
            
            if (ac + bc == cc + dc) {
                System.out.println(a + " cubed + " + b + " cubed = " + c + " cubed + " + d + " cubed = " + (cc + dc));
            }
            
        }       
        }    
        }           
        }    
        
            
    }
    
}
