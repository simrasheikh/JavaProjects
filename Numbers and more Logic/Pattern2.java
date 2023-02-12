package pattern2;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Give number for pattern");
        int n = input.nextInt();
        
        for (int r = 1; r < n; r++) { //row
            
            for (int s = n-r-1; s > 0; s--) { // space printing
                System.out.print(" ");
            }
            
            for (int f = 1; f <= r; f++) {
                System.out.print(f);
            }
            
            for (int b = r-1; b > 0; b--) {
                System.out.print(b);
            }
            
               System.out.println(""); 
        }
        

    }
    
}
