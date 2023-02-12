package correspondingmonth;

import java.util.Scanner;

public class Correspondingmonth {
    public static void main(String[] args) {
        
    /*Write a Program that reads an integer input in between (1 to 12) and
    stores it as month_of_year. Print the corresponding month of year. Use
    Switch Case statement.
    Example: Input is 4… Print “April”*/
 
        Scanner input = new Scanner(System.in);
        System.out.println("Give your number (1-12) for corresponding month:");
        System.out.println("(Only number input is recommended)");
        int m = input.nextInt();
        if (m <= 0 || m > 12) {
            System.out.println("Wrong number");
            System.exit(0);
        }
        else {
        switch (m) {
            case 1:
                System.out.println("Month is January");
                break;
            case 2:
                System.out.println("Month is February");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            case 6:
                System.out.println("Month is June");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is August");
                break;
            case 9:
                System.out.println("Month is September");
                break;
            case 10:
                System.out.println("Month is October");
                break;
            case 11:
                System.out.println("Month is November");
                break;
            case 12:
                System.out.println("Month is December");
                break;
            }
        }
    
        
    }
    
}
