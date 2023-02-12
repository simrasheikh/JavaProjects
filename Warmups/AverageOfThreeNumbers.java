package average.of.three.numbers;
import java.util.Scanner;
public class AverageOfThreeNumbers {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        
        double avg = (n1 + n2 + n3)/3;
        
        System.out.println("The average of " + n1 + " " + n2 + " " + n3 + " is: " + avg);
        
    }
    
}
