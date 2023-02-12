package vowelorconsonant;

import java.util.Scanner;

public class Vowelorconsonant {
    public static void main(String[] args) {
        
        
        /*Write a Program that read an alphabet (e.g. a,b,c,d,…..z) and display
        whether the input alphabet is a vowel (i.e. a, e, i, o, u) or consonant.*/
        
        Scanner input = new Scanner(System.in);
        System.out.println("Give an alphabet (no symbols):");
        char x = input.next().charAt(0);
        
        if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || 
            x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
            System.out.println("Your alphabet, " + x + ", is a vowel.");
        }
        
        else
            System.out.println("Your alphadet, " + x + ", is a consonant.");
        
        
        
        
        
        
        
    }
    
}
