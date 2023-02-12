package pangram;
import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your sentence:");
        String sen = input.nextLine().toLowerCase();
        
        int ucount = 0; //unique alphabet count       
        boolean pangram = false;
        
        //compare whether the letter at each index has the same ascii value as small a to small z
        for (int i = 97; i <= 122; i++) {
            for (int j = 0; j <= sen.length() - 1; j++) {
                char ex = sen.charAt(j);
                String x = "" + ex; //to convert char to string to replace
                int v = ex;
                if (v == i) {
                    for (int k = 0; k < sen.lastIndexOf(ex); k++) {
                        sen = sen.replaceFirst(x, ""); //replace every occurence except last so that the count is unique
                    }
                    ucount++;
                }                
            }
        }
        
        //boolean determining
        if (ucount == 26)
            pangram = true;        
        
        //final printing statement
        if (pangram == true)
            System.out.println("Your sentence is a pangram!");
        else if (pangram == false)
            System.out.println("Your sentence is not a pangram!");
    }
}
