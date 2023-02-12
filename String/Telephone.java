package task.pkg3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String r; 
        char alph;
        boolean flag;         
        alph = 's';
        flag = false;
        System.out.println("Hi, this program will tell you the number that corresponds to entered alphabet on the telephone");
            do {
                System.out.println("give the character");
                alph = input.next().charAt(0);
                if (alph >= '0' && alph <= '9') {
                    flag = true;
                    System.out.println("Invalid Letter");
                }
                else
                    flag = false;
            } while (flag == true);
            if ((alph >= 'A' && alph <= 'C') || (alph >= 'a' && alph <= 'c')) {
                System.out.println("The letter " + alph + " corresponds to " + "1" + " on the telephone");
            }
            if ((alph >= 'D' && alph <= 'F') || (alph >= 'd' && alph <= 'f')) {

                System.out.println("The letter " + alph + " corresponds to " + "2" + " on the telephone");
            }
            if ((alph >= 'G' && alph <= 'I') || (alph >= 'g' && alph <= 'i')) {
                System.out.println("The letter " + alph + " corresponds to " + "3" + " on the telephone");
            }
            if ((alph >= 'J' && alph <= 'L') || (alph >= 'j' && alph <= 'l')) {
                System.out.println("The letter " + alph + " corresponds to " + "4" + " on the telephone");
            }
            if ((alph >= 'M' && alph <= 'O') || (alph >= 'm' && alph <= 'o')) {
                System.out.println("The letter " + alph + " corresponds to " + "5" + " on the telephone");
            }
            if ((alph >= 'P' && alph <= 'S') || (alph >= 'p' && alph <= 's')) {
                System.out.println("The letter " + alph + " corresponds to " + "6" + " on the telephone");
            }
            if ((alph >= 'T' && alph <= 'V') || (alph >= 't' && alph <= 'v')) {
                System.out.println("The letter " + alph + " corresponds to " + "7" + " on the telephone");
            }
            if ((alph >= 'W' && alph <= 'Z') || (alph >= 'w' && alph <= 'z')) {
                System.out.println("The letter " + alph + " corresponds to " + "8" + " on the telephone");
            }            
    }
}
