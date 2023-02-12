package triangle;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("give number of row");
        int n = input.nextInt();
        if (counter(n) == 1) {
            System.out.println("ur triangle is made of " + counter(n) + " block.");        
        }
        else
            System.out.println("ur triangle is made of " + counter(n) + " blocks.");
    }
    public static int counter (int n) {
        int blocks = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) 
            return 1;
        blocks = (n) + counter(n-1);
        return blocks;        
    }
}
