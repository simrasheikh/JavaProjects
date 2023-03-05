package lms;
import java.util.Scanner;
public class login {   
    static int[][] userData = {
                            {27135, 69696},
                            {26906, 11111},
                            {27105, 12345},
                            {0, 0},
                            {0, 0},
                            {0, 0},
                            {0, 0},
                            {0, 0}
                            };    
    public static void log() {        
        boolean flag = true;
        boolean test = true;
        int index = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the LMS!");
        while (test == true) {
        System.out.println("Enter your user id:");
        int idinput = input.nextInt();    
            for (int i = 0; i < userData.length; i++) {
                if (idinput == userData[i][0]) {
                    index = i;
                test = false;                
                }
            }
            if (test == true) {
                System.out.println("Invalid ID!");
            }           
        }
        while (flag == true) {
        System.out.println("Enter password:");
        int pwinput = input.nextInt();
            if (pwinput != userData[index][1]) {
                System.out.println("Invalid password!"); 
                continue;
            }
            else {                
                System.out.println("You have successfully logged in!");                
                flag = false;
            }
        }
    }
}
