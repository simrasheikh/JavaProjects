package problem.pkg3;
import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the money you have:");
        Double p = input.nextDouble();
        System.out.println("Enter the interest rate:");
        Double r = input.nextDouble();
        System.out.println("Enter the time in years:");
        int t = input.nextInt();
        Double amount = p*(Math.pow(((1 + (r/100))), t));
        Double ci = amount - p;
        System.out.println("Your accumulated profit on the principal amount of " + p + ", over " + t + " years, on "
                + "a rate of " + r + " is: " + ci);
    }    
}
