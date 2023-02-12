package isbn.java;
import java.util.Scanner;
public class ISBNJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the 9-digit ISBN code for checksum:");
        int isbn = input.nextInt();
        int d2 = isbn%10;
        int d3 = (isbn%100)/10;
        int d4 = (isbn%1000)/100;
        int d5 = (isbn%10000)/1000;
        int d6 = (isbn%100000)/10000;
        int d7 = (isbn%1000000)/100000;
        int d8 = (isbn%10000000)/1000000;
        int d9 = (isbn%100000000)/10000000;
        int d10 = (isbn%1000000000)/100000000;
        int SumWithoutD1 = d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9 + d10*10;
        int x = (SumWithoutD1/11) + 1;
        int y = 11*x;
        int d1 = y - SumWithoutD1;
        if (d1 >= 11) {
            System.out.println("The complete 10-digit ISBN code is: " + d10 + d9 + d8 + d7 + 
                    d6 + d5 + d4 + d3 + d2 + 0);
        } else {
            System.out.println("The complete 10-digit ISBN code is: " + d10 + d9 + d8 + d7 + 
                    d6 + d5 + d4 + d3 + d2 + d1);
            
        }
               


        
    }
    
}
