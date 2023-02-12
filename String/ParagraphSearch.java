package paragraphsearch;

import java.util.Scanner;

public class Paragraphsearch {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Give your paragraph");        
        String para = input.nextLine();        
        
        System.out.println("If you want to find/replace one by one or all at once enter 1");
        System.out.println("If you want to know number of words enter 3");
        System.out.println("If you want to know number of sentences enter 4");
        System.out.println("If you want to know number of articles enter 5");
        System.out.println("If you want to know number of spaces enter 6");
        System.out.println("If you want to find/replace one by one or all at once enter 1");        
        int choice = input.nextInt();        
        
        int spaces = 0;
        int fullstops = 0;             
               
        switch (choice) {
        case 1: 
            System.out.println("Press 1 for one by one"
                    + "Press 2 for replacing all");
            int op = input.nextInt();
            if (op== 1) {
                System.out.println("What do you wan to replace?");
                String replace = input.next();
                System.out.println("Replace with what?");
                String with = input.next();
                String newPara = para.replaceFirst(replace, with);
                System.out.println("After alterations your paragraph is:");
                System.out.println(newPara);
            }
            else if (op== 2) {
                System.out.println("What do you wan to replace?");
                String replace = input.next();
                System.out.println("Replace with what?");
                String with = input.next();
                String newPara = para.replaceAll(replace, with);
                System.out.println("After alterations your paragraph is:");
                System.out.println(newPara);
            }
        break;    
                      
        case 3:
            int size = para.length();
        for (int i = 0; i <= size-1; i++ ) {
            char sp = para.charAt(i);
            if (sp == ' ') {
                spaces++;
            }
        }
        int words = spaces + 1;
        System.out.println("Number of words is " + words);
        break;
        
        case 4:
            size = para.length();
        for (int i = 0; i <= size-1; i++ ) {
            char ft = para.charAt(i);
            if (ft == '.') {
                fullstops++;
            }
        }
        System.out.println("Number of sentences is " + fullstops);
        break;
        
        case 5:
            String [] acount = para.split(" a ");
            String [] ancount = para.split(" an ");
            String [] thecount = para.split(" the ");
            System.out.println("Your article stats are:");
            System.out.println("a: " + acount.length);
            System.out.println("an: " + ancount.length);
            System.out.println("the: " + thecount.length);
        break;            
            
        case 6:
            size = para.length();
        for (int i = 0; i <= size-1; i++ ) {
            char sp = para.charAt(i);
            if (sp == ' ') {
                spaces++;
            }
        }
        System.out.println("Number of spaces is " + spaces);
        break;
        }
                              
        
    }
    
}
