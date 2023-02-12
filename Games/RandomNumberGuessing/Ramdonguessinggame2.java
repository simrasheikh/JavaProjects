package ramdonguessinggame2;
import java.util.Scanner;
public class Ramdonguessinggame2 {
    public static void main(String[] args) {        
        /*Write a program that randomly generates an integer between 0 and 100, 
        inclusive. The program prompts the user to enter a number continuously 
        until the number matches the randomly generated number. For each user 
        input, the program tells the user whether the input is too low or too 
        high, so the user can choose the next input intelligently.*/        
        Scanner input = new Scanner(System.in);        
        int r;
        int u = 0;
        int x = -1;
        char ask;                               
        do {
            r = (int) (Math.random()*101);

            System.out.println("Enter number:");
            for (int i = 0; i >= x; i++) {               
                u = input.nextInt();

                if (u == r) {
                    System.out.println("Your number matches!");
                    i = x;
                break;
                }
                else if (u > r) {
                    System.out.println("Your number is too high!");
                }
                else
                    System.out.println("Your number is too low!");
                }
            System.out.println("Do you want to continue?");
            System.out.println("Press y for yes, or any other key for no :)");
            ask = input.next().charAt(0);            
        } while ((u == r) && (ask == 'y' || ask == 'Y'));               
    }    
}
