package boiling;
import java.util.Scanner;
public class Boilingandfreezing {

    public static void main(String[] args) {
        
        System.out.println("Give in the Temperature:");
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        if (temp >= 100) {
            System.out.println("The water's boiling boom");
        } else {
            if (temp <= 0){
                System.out.println("ur water freezing dumbass");
            } else {
                System.out.println("The water ain't boiling oops, its in the normal mundane state");
            }
            
        } 
        
    }    
}
