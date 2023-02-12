package bunnyears;
import java.util.Scanner;
public class Bunnyears {
    public static void main(String[] args) {
        /*We have a number of bunnies and each bunny has two big floppy ears.
        We want to compute the total number of ears across all the bunnies recursively
        (without loops or multiplication).*/
        Scanner input = new Scanner(System.in);
        System.out.println("give number of bunnies");
        int n = input.nextInt();
        System.out.println("total ears for " + n + " bunnies are " + ears(n));
    }
    public static int ears(int n) {
        int ears = 0;
        if (n == 0) {
            return 0;
        }
        return 2 + ears(n - 1);
    }
}
