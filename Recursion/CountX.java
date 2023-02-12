package countx;
import java.util.Scanner;
public class CountX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
        countX("xxhixx") → 4
        countX("xhixhix") → 3
        countX("hi") → 0*/
        System.out.println("give ur string");
        String x = input.next();
        System.out.println("number of small x is: " + counter(x));
    }
    public static int counter(String x) {
        if (x.length() == 0)
            return 0;
        else if (x.charAt(0) == 'x') {
            x = x.substring(1);
            return 1 + counter(x);
        }
        else
            x = x.substring(1);
            return counter(x);        
    }
}
