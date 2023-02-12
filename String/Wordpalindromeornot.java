package wordpalindromeornot;

import java.util.Scanner;

public class Wordpalindromeornot {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter your magic word ty");
        String word = input.next().toLowerCase();
        
        int size = word.length();
        boolean flag = false;
        
        for (int i = 0; i < size/2; i++ ) {
            if (word.charAt(i) == word.charAt(size-i-1)) {
                flag = true;
            }
            else {
                flag = false;
                break;
            }          
        }   
        
        if (flag == true) {
            System.out.println(word + " is a palindrome :)");
        }
        else if (flag == false) {
            System.out.println(word + " is not a palindrome :(");
        }
 
    }
    
}
