package parenbit;
import java.util.Scanner;
public class ParenBit {
    public static void main(String[] args) {
        /*Given a string that contains a single pair of parenthesis, 
        compute recursively a new string made of only of the parenthesis and 
        their contents, so "xyz(abc)123" yields "(abc)".
        parenBit("xyz(abc)123") → "(abc)"
        parenBit("x(hello)") → "(hello)"
        parenBit("(xy)1") → "(xy)"*/        
        Scanner input = new Scanner(System.in);
        System.out.println("give string");
        String x = input.next();
        System.out.println("your string is now: " + parenBit(x));
    }
    public static String parenBit(String x) {
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(') {
                x = x.substring(i);}           
            if (x.charAt(i) == ')') {
                x = x.substring(0, i + 1);}                       
        }return x;
    }
}
