package floatandint;

import java.util.Scanner;

public class Floatandint {
public static void main(String[] args) {

    
        /*Write a Program that reads a float (amount) and an int (num) input from
        user. Add both (amount and num) numbers and store them in two
        different int (a) and float (b) variables. Display the outputs of a and b
        variables. Also if outputs are greater than 16 print “value of a & b > 16”
        else print “value of a & b < 16”.*/ 
        
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the float value");
        float fl = input.nextFloat();
        System.out.println("Enter the integer value");
        int in = input.nextInt();
        
        int a = (int) (fl + in);
        float b = fl + in;
        
        System.out.println("Value of a is " + a);
        System.out.println("Value of b is " + b);
        
        if (a > 16 && b > 16) {
            System.out.println("value of a & b > 16");
        }
        else if (a < 16 && b < 16) {
            System.out.println("value of a & b < 16");
        }
        
    }
    
}
