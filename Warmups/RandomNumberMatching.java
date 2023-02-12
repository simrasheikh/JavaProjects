package randomnumbermatching;
import java.util.Scanner;
public class Randomnumbermatching {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);        
        char ask;
        do {                
        int counter = 0;              
        System.out.println("Enter a number until it matches my number. You have 5 attempts");        
        int count;
        int random = 0;
        random = (int)(Math.random()*101);
        for (count = 0; count < 5; count++) {
            int num = input.nextInt();
            
            if (num == random) {
                System.out.println("Your number matches woohoo!");
            }
            else if (num < random) {
                System.out.println("Your number is too low");
            }
            else
                System.out.println("Your number is too high");
        }
        System.out.println("Sorry you have rum out of attempts, oops, better luck next time. The number was " + random);
        System.out.println("If you want to continue, press y");
        ask = input.next().charAt(0);
        }
        while (ask =='y' || ask == 'Y');
    }    
}
