package binary.conversion;
import java.util.Scanner;
public class BinaryConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Give your integer");
        int num = input.nextInt();
        int rem;
        int digit = 0;
        while (num != 0) {
        rem = num%2;
        digit = digit*10 + rem;
        num /= 2;
        
        }
        System.out.println("The binary is " + digit);
        
    }
    
}
