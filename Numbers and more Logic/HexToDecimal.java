package hextodecimal;

import java.util.Scanner;

public class Hextodecimal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter your hexadecimal digit");
        String hexString = input.nextLine();
        
        char hex = Character.toUpperCase(hexString.charAt(0));
        if (hex >= 'A' && hex <= 'F') {
            int ans = hex - 'A' + 10;
            System.out.println("The decimal conversion is " + ans);
        }
        else if (hex >= '0' && hex <= '9') {
            System.out.println("The decimal conversion is " + hex);
        }
        else {
            System.out.println(hex + " is not a valid input");
        }
    }
    
}
