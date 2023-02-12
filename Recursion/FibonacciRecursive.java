package fibonaccirecursive;
import java.util.Scanner;
public class FibonacciRecursive {
    public static void main(String[] args) {
        /*The fibonacci sequence is a famous bit of mathematics, 
        and it happens to have a recursive definition. The first two values 
        in the sequence are 0 and 1 (essentially 2 base cases). Each subsequent 
        value is the sum of the previous two values, so the whole sequence is: 
        0, 1, 1, 2, 3, 5, 8, 13, 21 and so on. Define a recursive fibonacci(n) 
        method that returns the nth fibonacci number, with n=0 representing the start of the sequence.*/
        Scanner input = new Scanner(System.in);
        System.out.println("give the number of term u want");
        int n = input.nextInt();
        System.out.println("fibonacci sequence term number " + n + " is " + fib(n));
    }
    public static int fib (int n) {
        int fib = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        fib = fib(n-1) + fib(n-2);
        return fib;
    }    
}
