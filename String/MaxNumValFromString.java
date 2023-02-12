package maxnumvalfromstring;
import java.util.Scanner;
public class MaxNumValFromString {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give your alphanumeric string:");
        String al = input.next().toLowerCase();
        
        String con = "";
        int max = 0;
        int intcon = 0;
        
        for (int i = 0; i <= al.length() - 1; i++) {
            char ex = al.charAt(i);
            String x = "" + ex;
            if (ex >= '0' && ex <= '9') {
                con = con + x;
                intcon = Integer.parseInt(con);                
            }
            if (ex >= 97 && ex <= 122) {
                    al = al.replaceFirst(x, " ");
            }
            
            if (intcon > max)
            max = intcon;
        }
        /*
        char p = '+';
        String plus = "" + p; 
        String newal = al.replaceAll(" ", plus);*/
        
        System.out.println("Maximun value is " + max);
        System.out.println(al);
        
    }
    
}
