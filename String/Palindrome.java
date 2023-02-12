package palindrome;
import java.util.Scanner;
public class Palindrome {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a 4 digit number and I'll do my magic and tell if it's a Plaindrome or not :3");
        
        int num = input.nextInt();
        
        if (num < 1000 || num > 9999) {
            System.out.println("Bro, I asked for a 4 digit number okay, no more no less");
            System.out.println("Run the program again and give proper input ty");
        }
        else {
            
            int a = num%10;
            int b = (num%100)/10;
            int c = (num%1000)/100;
            int d = (num%10000)/1000;

            int reverse = (d) + (c*10) + (b*100) + (a*1000);

            if (d==a && c==b) {
                System.out.println("The reverse of your number " + num + " is also " + reverse + ", and it is a Palindrome kudos.");
            }
            else {
                System.out.println("The reverse of your number " + num + " is " + reverse + ", and it is not a Palindrome, better luck next time.");
            }
        }

    }
    
}
