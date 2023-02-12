package typeofcharacter;
import java.util.Scanner;
public class Typeofcharacter {
public static void main(String[] args) {
    
    
    /*Write a program to input a character from user and check whether
    given character is small alphabet, capital alphabet, digit or special
    character, using if else.*/
    
    
        Scanner input = new Scanner(System.in);
        System.out.println("Give your character:");
        char x = input.next().charAt(0);
        
        if (x >= 'a' && x <= 'z') {
            System.out.println("Your character, " + x +", is small.");
        }
        else if (x >= 'A' && x <= 'Z') {
            System.out.println("Your character, " + x + ", is capital.");
        }
        else if (x >= '0' && x <= '9') {
            System.out.println("Your character, " + x + ", is a digit.");
        }
        else
            System.out.println("Your character, " + x + ", is a special symbol.");
        
        
        
    }
    
}
