package recursionpractice;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        /*Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
        Compute the result recursively (without loops).*/
        Scanner input = new Scanner(System.in);
        System.out.println("give ur number");
        int n = input.nextInt();
        System.out.println("facotrial of " + n + " is " + factorial(n));
    }
    public static long factorial (int n) {
        long factorial = 0;
        if (n == 1 || n == 0) {
            return 1;
        }
        else {            
        factorial = n * factorial(n-1);     
        }
        return factorial;
    }
}
