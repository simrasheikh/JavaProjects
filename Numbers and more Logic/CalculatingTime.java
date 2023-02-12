package problem.pkg5;
import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        System.out.println("give hours, minutes, and seconds of your time");
        System.out.println("hours:");
        int hrs = input.nextInt();
        System.out.println("minutes:");
        int mins = input.nextInt();
        System.out.println("seconds:");
        int secs = input.nextInt();
        System.out.println("your time is: " + hrs + ":" + mins + ":" + secs);
        System.out.println("do you wish to add or subtract time? press Y for yes and N for no");
        char r = input.next().charAt(0);        
        System.out.println("press A for adding and S for subtracting");
        char o = input.next().charAt(0);
        System.out.println("enter the time in seconds");
        int t = input.nextInt();
        int temp = 0;
        if (o == 'a' || o == 'A') {
            if (t < 60) {
                secs += t;
            }
            if (t >= 60) {
                secs += t%60;
                mins += t/60;
            }
            if (t >=3600) {                
                hrs += t/3600;
                temp = t%3600;
                if (temp >= 60) {
                    secs += temp%60;
                    mins += temp/60;
                }
                else
                    secs += temp;
            }
            if (secs >= 60) {
                mins++;
                secs -= 60;
            }
            if (mins >= 60) {
                hrs++;
                mins -= 60;
            }
            if (hrs > 23) {
                hrs = 24 - hrs;
            }       
        }
        if (o == 's' || o == 'S') {
            if (t < 60) {
                secs -= t;
            }
            if (t >= 60) {
                secs -= t%60;
                mins -= t/60;
            }
            if (t >=3600) {                
                hrs -= t/3600;
                temp = t%3600;
                if (temp >= 60) {
                    secs -= temp%60;
                    mins -= temp/60;
                }
                else
                    secs -= temp;
            }
            if (secs < 0) {
                mins--;
                secs += 60;
            }
            if (mins < 0) {
                hrs--;
                mins += 60;
            }
            if (hrs < 0) {
                hrs = 24 + hrs;
            }
        }
        System.out.println("your operated time is: " + hrs + ":" + mins + ":" + secs);        
    }
    
}
