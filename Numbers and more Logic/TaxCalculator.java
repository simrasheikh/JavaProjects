package tax.calculator;
import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Enter your Marital staus by the following criteria:"
                + "Enter 1 if Single or Enter 2 if Married but Joint or Enter 3 "
                + "if married but separate or Enter 4 if head of household");
        int status = input.nextInt();
        System.out.println("Enter your yearly income:");
        double i = input.nextDouble();
        double tax = 0;
        
        switch (status) {
            case 1:
                if (i <= 8350.0) {
                tax = .1*i; 
                }
                else if (i > 8350.0 && i <= 33950.0) {
                tax = .15*i;
                }    
                else if (i > 33950.0 && i <= 82250.0) {
                tax = .25*i;                    
                }
                else if (i > 82250.0 && i <= 171550.0) {
                tax = .28*i;
                }                 
                
                else if (i > 171550.0 && i <= 372950.0) {
                tax = .33*i;                    
                }
                else if (i > 372950.0) {
                tax = .35*i;                    
                }
                break;
                
            case 2:
                if (i <= 16700.0) {
                tax = .1*i; 
                }
                else if (i > 16700.0 && i <= 67900.0) {
                tax = .15*i;
                }    
                else if (i > 67900.0 && i <= 137050.0) {
                tax = .25*i;                    
                }
                else if (i > 137050.0 && i <= 208850.0) {
                tax = .28*i;
                }                 
                
                else if (i > 208850.0 && i <= 372950.0) {
                tax = .33*i;                    
                }
                else if (i > 372950.0) {
                tax = .35*i;                    
                }    
                break;
                
            case 3:
                if (i <= 8350.0) {
                tax = .1*i; 
                }
                else if (i > 8350.0 && i <= 33950.0) {
                tax = .15*i;
                }    
                else if (i > 33950.0 && i <= 68525.0) {
                tax = .25*i;                    
                }
                else if (i > 68525.0 && i <= 104425.0) {
                tax = .28*i;
                }                 
                
                else if (i > 104425.0 && i <= 186475.0) {
                tax = .33*i;                    
                }
                else if (i > 186475.0) {
                tax = .35*i;                    
                }
                break;
                
            case 4:
                if (i <= 11950.0) {
                tax = .1*i; 
                }
                else if (i > 119550.0 && i <= 45500.0) {
                tax = .15*i;
                }    
                else if (i > 45500.0 && i <= 117450.0) {
                tax = .25*i;                    
                }
                else if (i > 117450.0 && i <= 190200.0) {
                tax = .28*i;
                }                 
                
                else if (i > 190200.0 && i <= 372950.0) {
                tax = .33*i;                    
                }
                else if (i > 372950) {
                tax = .35*i;                    
                }
                break;
        }
        System.out.println("Your tax for the income " + i + " is: " + tax ); 
        
    }
    
}
