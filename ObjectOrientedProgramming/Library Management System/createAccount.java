package lms;
import java.util.Scanner;
public class createAccount extends login {
    static int c = 3;
    public static void ask() {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Do you wish to create account or log into an existing account?");
        System.out.println("press l for login and c for create");
        char a = input.next().charAt(0);
        if (a == 'l' || a == 'L') {
            login.log();;
        }
        else if (a == 'c' || a == 'C') {
            System.out.println("Enter a user ID for your account, should be integers");
            userData[c][0] = input.nextInt();            
            System.out.println("Enter a password for your account, should be integers");
            userData[c][1] = input.nextInt();
            c++;
            System.out.println("You have successfully made an account!");                        
            login.log();
        }
    }
}
