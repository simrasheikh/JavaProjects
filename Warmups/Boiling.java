package boiling;
import java.util.Scanner;
public class Boiling {
    
    public static void main(String[] args) {
        System.out.println("Give in the Temperature:");
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        if (temp >= 100) {
            System.out.println("The water's boiling boom");
        } else {
            System.out.println("The water ain't boiling oops");
        }
                
        
    }
    
}
