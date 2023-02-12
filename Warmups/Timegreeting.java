package timegreeting;
public class Timegreeting {
    public static void main(String[] args) {

        
        /*Write a program to see greeting according to time using 24 hour format if
        time between is 5 to 11 it should greet “Good Morning”, if time is
        between 12 to 18 it should greet “Good Evening”, if time between 18 to
        24 it should greet “Good Night”.*/
        
        
        long totalmillisecs = System.currentTimeMillis();
        long onlysecs = totalmillisecs/1000;
        long hrs = ((onlysecs/3600)%24) + 5;
        
        if (hrs >= 5 && hrs <= 11) {
            System.out.println("Good Morning! Hour is " + hrs + " right now.");
        }
        else if (hrs >= 12 && hrs <= 18) {
            System.out.println("Good Evening! Hour is " + hrs + " right now.");
        }
        else
            System.out.println("Good Night! Hour is " + hrs + " right now.");    
           
                    
               
    }
    
}
