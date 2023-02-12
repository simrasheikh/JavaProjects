package task.pkg2;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give an integer value less than 1 till where you want the sum of squares:");
        int v = input.nextInt();
        int sum = 0;
        if (v < 1) {
            System.out.println("Sorry, number shouldn't be greater than 1");
            System.exit(0);
        }
        System.out.println("The sum of squares till the number " + v + " is " + summer(v, sum));
    }
    public static int summer (int v, int sum) {
        if (v == 1) {
            return 1;
        }
        else {
            sum = v*v + (summer(v - 1, sum));
        }
        return sum;
    }
}
