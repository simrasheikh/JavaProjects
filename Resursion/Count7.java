package count7;
import java.util.Scanner;
public class Count7 {
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
        System.out.println("the count of 7 in ur number is " + counter(n));
    }
    public static int counter (int n) {
        int count = 0;
        if (n < 1)
            return 0;
        if (n%10 == 7) {
            return 1 + counter(n/10);
        }
        else
            return counter(n/10);
    }
        
}
