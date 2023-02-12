package bunnyyears2;
import java.util.Scanner;
public class Bunnyyears2 {
    public static void main(String[] args) {
        /*We have bunnies standing in a line, numbered 1, 2, ... 
        The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) 
        we'll say have 3 ears, because they each have a raised foot. 
        Recursively return the number of "ears" in the bunny line 1, 2, ... n 
        (without loops or multiplication).
        bunnyEars2(0) → 0
        bunnyEars2(1) → 2
        bunnyEars2(2) → 5*/
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of bunnies");
        int n = input.nextInt();
        System.out.println("number of ears for " + n + " bunnies is " + ears(n));
    }
    public static int ears(int n) {
        int ears = 0;
        if (n == 0) {
            return 0;
        }
        if (n%2 == 1) {
            return 2 + ears(n-1);
        }
        return 3 + ears(n-1);       
    }
    
}
