package count8;
import java.util.Scanner;
public class Count8 {
    public static void main(String[] args) {
        /*Given a non-negative int n, compute recursively (no loops) the count
        of the occurrences of 8 as a digit, except that an 8 with another 8
        immediately to its left counts double, so 8818 yields 4.
        Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
        while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
        count8(8) → 1
        count8(818) → 2
        count8(8818) → 4*/
        Scanner input = new Scanner(System.in);
        System.out.println("give ur number");
        int n = input.nextInt();
        System.out.println("number of eights are: " + counter(n));
    }
    public static int counter (int n) {
        if (n < 1) 
            return 0;
        if (n % 10 == 8 && (n/10) % 10 == 8) 
            return 2 + counter(n/10);
        else if (n % 10 == 8) 
            return 1 + counter(n/10);
        else 
            return counter(n/10);
    }
}
