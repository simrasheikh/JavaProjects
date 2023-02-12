package password;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter password:");
        
        /* 1) It must be atleast 10 characters long
        2) Only letters and dgits are allowed
        3) Should have atleast 2 digits and 1 letter */
        
        String pw = input.next();
        
        int size = pw.length();
        int digit = 0;
        int letter = 0;
        
        boolean twod = false;
        boolean oneL = false;
        boolean symbol = true;
        
        for (int i = 0; i < size; i++ ) {
            char sym = pw.charAt(i);
            if (sym >= 'A' && sym <= 'Z' || sym >= 'a' && sym <= 'z' || sym >= '0' && sym <= '9') {
                symbol = false;
            }
            else {
                symbol = true;
                break;
            }
        }
        
        for (int i = 0; i < size; i++ ) {
            char dig = pw.charAt(i);
            if (dig >= '0' && digit <= '9') {
                digit++;
            }
            if (digit >= 2) {
                twod = true;
            }    
            else {
                twod = false;
            }
        }    
            
        for (int i = 0; i < size; i++ ) {
            char let = pw.charAt(i);
            if (let >= 'A' && let <= 'Z' || let >= 'a' && let <= 'z') {
                letter++;
            }
            if (letter >= 1) {
                oneL = true;
            }
            else {
                oneL = false;
            }
        }    
        
        if (size >= 10 && symbol == false && twod == true && oneL == true) {
            System.out.println("Your password is valid");
        }
        else {
            System.out.println("Your password is invalid");
        }
            

    }
    
}
