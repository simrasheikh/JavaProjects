package longestsubstring;

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("gvie ur sring");
        String x = input.next();
        String temp = "";
        int size = x.length();
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            for (int j = x.lastIndexOf(x.charAt(0)); j < size; j++) {                
                if (x.charAt(i) == x.charAt(j)) {
                    temp = temp + x.charAt(i);
                    flag = true;
                    i++;
                }
                else {
                    flag = false;
                    break;
                }
            }          
        }
        if (flag == true) {
            System.out.println("same end is " + temp);
        }
        else
            System.out.println("none found");
        */
        System.out.println("String: ");
        String str = input.next();
        
        int a = str.lastIndexOf(str.charAt(0));
        int i = 0;
        Boolean flag = true;

        String s = "";

        do {
            if (str.charAt(i) == str.charAt(a)) {
                s += str.charAt(i);
            } else {
                flag = false;
                break;
            }
            i++;
            a++;
        } while (a < str.length());

        if (!flag) {
            System.out.println("No sameEnds founds");
        } else {
            System.out.println(s);
        }
    }
    
}
