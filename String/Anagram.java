package anangramtry3;
import java.util.Scanner;
public class Anangramtry3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Give your first word:");
        String first = input.next();
        System.out.println("Give your second word:");
        String second = input.next();
        
        String empty = ""; //to convert character to string by concatenation
        Boolean anagram;
        
        /*first check if length same or not to rule out non-anagrams (not necessary anymore hence this part is commented)
        if (first.length() != second.length()) {
            System.out.println("Your words are not anagrams!");
            System.exit(0);
        }*/
        
        //check whether anagrams or not by replacing everytime you find similar letter with blank space, basically tallying
        for (int i = 0; i <= first.length() -1; i++) {
            char x = first.charAt(i);
            int index = second.indexOf(x);
                if (index != -1) {
                    char rep = second.charAt(index);
                    String replace = empty + rep;
                    String with = "";
                    second = second.replaceFirst(replace, with);
                }
        }
        
        //if the words are anagrams then all letters tallied will be crossed out and the length will be zero
        if (second.length() == 0) {                
                anagram = true;
            }
            else
                anagram = false;
        
        //final printing statement
        if (anagram == true) {
            System.out.println("Your words are anagrams!");
        }
        else if (anagram == false) {
            System.out.println("Your words are not anagrams!");
        }
        //TADA I DID IT WITHOUT ARRAYS WOOHOO YAYYYYYY
    }
    
}
