package gmt;
public class GMT {
    public static void main(String[] args) {
        
        
        long totalmillisecs = System.currentTimeMillis();
        // System.out.println("Total Milliseconds: " + totalmillisecs);
        
        long onlysecs = totalmillisecs/1000;
        
        long hrs = (onlysecs/3600)%24;
        long mins = (onlysecs%3600)/60;
        long secs = (onlysecs%3600)%60; 
        System.out.println("The time right now is: " + hrs + " hrs " + mins + " mins " + secs + " secs");
        
        
        
    }
    
}
