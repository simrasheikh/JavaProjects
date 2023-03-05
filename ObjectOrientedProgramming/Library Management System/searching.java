package lms;
import java.util.Scanner;
public class searching extends books {
    
    public static void search() {
        Scanner input = new Scanner(System.in);
        System.out.println("What do you wish to search by?");
        System.out.println("Enter t for title" + "\n" + "Enter s for serial number" + 
                "\n" + "Enter w for writer" + "\n" + "Enter g for genre");
        char y = input.next().charAt(0);
        if (y == 't') searchByTitle();
        if (y == 's') searchBySerial();
        if (y == 'w') searchByWriter();
        if (y == 'g') searchByGenre();
    }
    
    public static int searchByTitle() {
        Scanner input = new Scanner(System.in);
        boolean av = false;
        int ind = 0;
        System.out.println("Enter your desired book title:");
        String response = input.nextLine();
        for (int i = 0; i < catalog.length; i++) {
            if (catalog[i].contains(response) == true) {
                ind = i;
                av = true;
                System.out.println("The book " + response + " exists!");
                break;     
            }
        }
        if (av = false)
            System.out.println("Sorry, this book is not available!");
        return ind;
    }
    
    public static int searchBySerial() {
        int ind = 0;
        boolean exist = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the serial number of the book:");
        int res = input.nextInt();
        for (int i = 0; i < serial.length; i++) {
            if (res == serial[i]) {
                exist = true;
                System.out.println("Your desired book is: " + catalog[i-0]);
                break;
            }
        }
        if (exist == false)
            System.out.println("Sorry, this serial number doesn't exist");
        return ind;
    }
    
    public static int searchByWriter() {
        int ind = 0;
        boolean exist = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the writer:");
        String res = input.nextLine();
        for (int i = 0; i < writer.length; i++) {
            if (writer[i].contains(res) == true) {
                exist = true;
                System.out.println("Your desired book is: " + catalog[i]);
                break;
            }
        }
        if (exist == false)
            System.out.println("Sorry, this writer doesn't exist in the catalog");
        return ind;
    }
    
    public static void searchByGenre() {
        int ind = 0;
        boolean found = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired genre:" + "\n" +
                "Press 1 for fiction, 2 for historical fiction, and 3 for contemporary");
        int response = input.nextInt();
        for (int i = 0; i < type.length; i++) {
            if (response == Integer.parseInt(type[i][0])) {
                ind = i;
                found = true;
                System.out.println("The books in the genre of " + response + " are:");
            }           
        }        
        if (found == true) {
            for (int j = 1; j < type[ind].length; j++) {
                System.out.println(type[ind][j]);
            }
        }
        else
            System.out.println("Sorry, this genre is not available!");
    }
}
