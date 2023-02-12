package cryptography;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ur number for encryption");
        String x = input.next();
        int size = x.length();
        
        String boi;
        int boy;
        String con = "";
        
        for (int i = 0; i < size; i++) {           
           String tt= "" + x.charAt(i);
           boy = Integer.parseInt(tt) + 65;
           char y = (char) boy;
           boi = "" + y;
           con = "" + boi + con;
        }
        System.out.println("your cypher text is: " + con);        
    }
    
}
