package pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Give the number for pattern");
        int n = input.nextInt();
        int sum;
        for (int i = 1; i <= n; i++) {
            sum = 0;
            for (int j = 1; j <= i; j++) {
                if (i > j) {
                    System.out.print(j + " + ");
                }
                else
                    System.out.print(j);
            sum = sum + j;                            
                           
                       
        }
            System.out.print(" = " + sum);
            System.out.println("");
        }
        
 
    }
    
}
