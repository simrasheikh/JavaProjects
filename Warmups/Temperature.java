package temperature;
import java.util.Scanner;
public class Temperature {

    public static void main(String[] args) {
        System.out.println("Type in the Celcius value:");
        Scanner input = new Scanner(System.in);
        double celcius = input.nextDouble();
        double fahrenheit = 9.0/5.0 * celcius + 32.0;
        System.out.println("Fahrenheit is: " + fahrenheit);       
               
    }
    
}
