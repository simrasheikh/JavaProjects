package sumdigits;
import java.util.Scanner;
public class SumDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = -1;
        do {
        System.out.println("Give a non negative integer:");
        n = input.nextInt();
            if (n < 0) {
                System.out.println("non negaive kaha tha bhai");
            }
        } while (n < 0);
        System.out.println("the sum of ur digit(s) is " + sum(n));
    }
    public static int sum (int n) {
        int sum = 0;
        if (n/10 == 0)
            return n;
        sum = n%10 + sum(n/10);
        return sum;
    }
}
