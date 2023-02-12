package task.pkg1;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your radius:");
        Double r = input.nextDouble();
        System.out.println("enter the letter for the operation you want:");
        System.out.println("C for Circumference, A for Area and D for Diameter");
        char x = input.next().charAt(0);
        Double ans = 0.0;
        if (x == 'a' || x == 'A') {
            ans = Math.PI * r * r;
            System.out.println("The area of a circle with radius " + r + " is " + ans);
        }
        else if (x == 'd' || x == 'D') {
            ans = 2 * r;
            System.out.println("The diameter of a circle with radius " + r + " is " + ans);
        }
        else if (x == 'c' || x == 'C') {
            ans = Math.PI * 2 * r;
            System.out.println("The circumference of a circle with radius " + r + " is " + ans);
        }
    }
}
