package swapping;
import java.util.Scanner;
public class Swapping {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Give the value for x");
        int x = input.nextInt();
        System.out.println("Give the value for y");
        int y = input.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x is now " + x);
        System.out.println("y is now " + y);
    }
    
}
