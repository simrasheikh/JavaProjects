package connectfourfinal;
import java.util.*;
public class Connectfourfinal {
    //some colours for aesthetics
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33;1m";
    public static final String ANSI_RED = "\u001B[31;1m";
    public static void main(String[] args) throws NumberOutOfRangeException {
        Scanner input = new Scanner(System.in);
        char response = ' ';
        boolean colFullFlag = false;
        int col = 0, movez = 0;
        //fill the grid with blank spaces
        String [][] grid = new String [6][7];
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 7; c++) {
                grid[r][c] = " ";}
        }
        welcome101(grid); //welcome the players, explain the game
        System.out.println("So, do you want to play the best Connect 4 game in the world?");
        System.out.println("Press any key for yes and 'n' for no (dont say no please) ._.");
        takeresponse101 (response); //this method records response and ends program if it's no
        String player = "", code = "", colour = "", name = "";
        //take names from players for more user-friendly experience
        System.out.println("Player " + ANSI_YELLOW + "one" + ANSI_RESET + ", enter your first name");
        String nameone = input.next();
        System.out.println("Player " + ANSI_RED + "two" + ANSI_RESET + ", enter your first name");
        String nametwo = input.next();
        do {
            if (movez%2 == 0) { //even numbered moves mean first player (yellow)
                player = "one";
                code = "Y";
                colour = "yellow";
                name = nameone;
            }
            else if (movez%2 != 0) { //odd numbered moves mean second player (red)
                player = "two"; //this is done to coordinate turns
                code = "R";
                colour = "red";
                name = nametwo;
            }
            System.out.print(name); //display initiation message to take column input
            if (code == "Y") {
                System.out.print(", your colour is " + ANSI_YELLOW + "Yellow." + ANSI_RESET);
            }
            else if (code == "R") {
                System.out.print(", your colour is " + ANSI_RED + "Red." + ANSI_RESET);
            }
            System.out.println();
            System.out.println("Enter the number of column you wish to fill.");
            boolean right = true;
            do {
            do { //pass the input through exceptions
                try {
                    col = input.nextInt() - 1;
                    validateColRange101(col);
                    right = false;
                }
                catch (InputMismatchException | ArrayIndexOutOfBoundsException | NumberOutOfRangeException ex) {
                    System.out.println("Wrong column label, it should be a positive whole integer between 1 and 7, enter again.");
                    input.nextLine();
                }//here i've made a custom exception so that the numbers entered are strictly between 1 and 7, no less, no more
            }
            while (right);
                for (int r = 5; r >= 0; r--) { //enter the disk in the desired column
                    if (grid[r][col] == "R" || grid[r][col] == "Y") {
                        colFullFlag = true;
                        continue;
                    }
                    else {
                        grid[r][col]= code;
                        movez++;
                        colFullFlag = false;
                        break;
                    }
                }//if a certain column is full, take input again
                if (colFullFlag) {//bascially the code has a do-while loop which begins at the input stage again if column is full
                    System.out.println("This column is full, can't u see?");
                    System.out.println("Enter some other column -.-");
                }
            } while (colFullFlag);
            System.out.println("The game looks like this now:");
            display101(grid); //display the grid after successful storing
            //check for victory and display victory messages
            if (verticalChecker101(grid) == true || horizontalChecker101(grid) == true || diagonalChecker101(grid) == true) {
                System.out.println("OMG YOU'RE A GENIUS YOU'VE DONE IT, WOOT WOOT!");
                if (player == "one") {
                    System.out.print(ANSI_YELLOW + name + ANSI_RESET);
                }
                if (player == "two") {
                    System.out.print(ANSI_RED + name + ANSI_RESET);
                }
                System.out.print(", you've won! Proud of you buddy.");
                System.out.println();
                System.out.println("Do you want to play again? Press any key for yes and 'n' for no");
                takeresponse101 (response); //ask if they want to play again
                if (response != 'n') {
                    movez = 0;
                    grid = new String [6][7];
                    for (int r = 0; r < 6; r++) {
                        for (int c = 0; c < 7; c++) {
                            grid[r][c] = " ";}
                    }//restart initiation and take names again in case new players this time
                    System.out.println("Player " + ANSI_YELLOW + "one" + ANSI_RESET + ", enter your first name");
                    nameone = input.next();
                    System.out.println("Player " + ANSI_RED + "two" + ANSI_RESET + ", enter your first name");
                    nametwo = input.next();
                }
            }//if there's no victory and moves are 42, the game must've been draw, display message accordingly
            else if (movez == 42) {
                System.out.println("Oh no, this game was a draw!");
                System.out.println("Do you want to play again? Press any key for yes and 'n' for no");
                takeresponse101 (response);//ask if they want to play again
                if (response != 'n') {
                    movez = 0;
                    grid = new String [6][7];
                    for (int r = 0; r < 6; r++) {
                        for (int c = 0; c < 7; c++) {
                            grid[r][c] = " ";}
                    }//reinitiate
                    System.out.println("Player " + ANSI_YELLOW + "one" + ANSI_RESET + ", enter your first name");
                    nameone = input.next();
                    System.out.println("Player " + ANSI_RED + "two" + ANSI_RESET + ", enter your first name");
                    nametwo = input.next();
                }
            }
        }//if no win and no draw, the game will continue from where it was
        while (response != 'n' || response != 'N');
    }
    public static void takeresponse101 (char response) {
        Scanner input = new Scanner(System.in); //method to end game if user says no
        response = input.next().charAt(0);
        if (response == 'n' || response == 'N' ) {
            System.out.println("okay bye man :(");
            System.exit(0);
        }
    }
    public static void welcome101 (String[][] grid) {
        System.out.println("Hello and welcome to the best Connect 4 in the world! :)");
        System.out.println("Continue reading for the game guidelines.");
        System.out.println();
        System.out.println("Connect 4 is a turn-based 2-player game played on a 7x6 board. ");
        System.out.println("Each player places their checkers from the lowest row until the highest one.");
        System.out.println("The goal is to align 4 checkers horizontally, vertically, or diagonally.");
        System.out.println("Whoever does it first wins.");
        System.out.println();
        System.out.println("Player one's colour is " + ANSI_YELLOW + "Yellow" + ANSI_RESET );
        System.out.println("Player two's colour is " + ANSI_RED + "Red" + ANSI_RESET);
        System.out.println();
        System.out.println("You are supposed to use the column lables like this:");
        for (int i = 1; i <= 7; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 8; c++) {
                System.out.print("| ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void validateColRange101(int col) throws NumberOutOfRangeException{        
        if (col < 0 || col > 6) { //custom exception
            throw new NumberOutOfRangeException();
        }
    }
    public static void display101 (String[][] grid) {
        for (int i = 1; i <= 7; i++) {
            System.out.print(" " + i);
        }
        System.out.println();
        for (int r = 0; r < 6; r++) {
            for (int c = 0; c < 7; c++) {
                System.out.print("|");
                if (grid[r][c] != "R" && grid[r][c] != "Y") {
                    System.out.print(grid[r][c]);
                }
                if (grid[r][c] == "Y") {
                    System.out.print(ANSI_YELLOW + grid[r][c] + ANSI_RESET);
                }
                if (grid[r][c] == "R") {
                    System.out.print(ANSI_RED + grid[r][c] + ANSI_RESET);
                }
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static boolean verticalChecker101 (String[][] grid) {
        boolean verticalflag = false;
        int piececount = 0;
        for (int c = 0; c < 7; c++) {
            piececount = 0;
            for (int r = 5; r >= 0; r--) {
                if (grid[r][c] == "Y") {
                    piececount++;
                    if (piececount >= 4) {
                        verticalflag = true;
                        break;
                    }
                }
                else
                    piececount = 0;
            }
        }
        for (int c = 0; c < 7; c++) {
            piececount = 0;
            for (int r = 5; r >= 0; r--) {
                if (grid[r][c] == "R") {
                    piececount++;
                    if (piececount >= 4) {
                        verticalflag = true;
                        break;
                    }
                }
                else
                    piececount = 0;
            }
        }
        return verticalflag;
    }
    public static boolean horizontalChecker101 (String[][] grid) {
        boolean horizontalflag = false;
        int piececount = 0;
        for (int r = 5; r >= 0; r--) {
            piececount = 0;
            for (int c = 0; c < 7; c++) {
                if (grid[r][c] == "Y") {
                    piececount++;
                    if (piececount >= 4) {
                        horizontalflag = true;
                        break;
                    }
                }
                else
                    piececount = 0;
            }
        }
        for (int r = 5; r >= 0; r--) {
            piececount = 0;
            for (int c = 0; c < 7; c++) {
                if (grid[r][c] == "R") {
                    piececount++;
                    if (piececount >= 4) {
                        horizontalflag = true;
                        break;
                    }
                }
                else
                    piececount = 0;
            }
        }
        return horizontalflag;
    }
    public static boolean diagonalChecker101 (String[][] grid) {
        boolean diagonalflag = false;
        for (int r = 3; r < 6; r++) {
            for (int c = 3; c < 7; c++) {
                if (grid[r][c] != " ") {
                    if (grid[r][c] == grid[r-1][c-1] && grid[r-1][c-1] == grid[r-2][c-2] && grid[r-2][c-2] == grid[r-3][c-3]) {
                        diagonalflag = true;
                        break;
                    }
                }
            }
        }
        for (int r = 3; r < 6; r++) {
            for (int c = 0; c < 4; c++) {
                if (grid[r][c] != " ") {
                    if (grid[r][c] == grid[r-1][c+1] && grid[r-1][c+1] == grid[r-2][c+2] && grid[r-2][c+2] == grid[r-3][c+3]) {
                        diagonalflag = true;
                        break;
                    }
                }
            }
        }
        return diagonalflag;
    }    
}
