package sudokuthefinal;
import java.util.Scanner;
public class Sudokuthefinal {
    public static final String ANSI_RESET = "\u001B[0m";  
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);        
        int [][] grid = {
            {5, 3, 0,   0, 7, 0,   0, 0, 0},
            {6, 0, 0,   1, 9, 5,   0, 0, 0},
            {0, 9, 8,   0, 0, 0,   0, 6, 0},
           /*-------------------------------*/ 
            {8, 0, 0,   0, 6, 0,   0, 0, 3},
            {4, 0, 0,   8, 0, 3,   0, 0, 1},
            {7, 0, 0,   0, 2, 0,   0, 0, 6},
           /*-------------------------------*/  
            {0, 6, 0,   0, 0, 0,   0, 0, 0},
            {0, 0, 0,   4, 1, 9,   0, 0, 5},
            {0, 0, 0,   0, 8, 0,   0, 7, 9},
        };
        int [][] original = {
            {5, 3, 0,   0, 7, 0,   0, 0, 0},
            {6, 0, 0,   1, 9, 5,   0, 0, 0},
            {0, 9, 8,   0, 0, 0,   0, 6, 0},
           /*-------------------------------*/ 
            {8, 0, 0,   0, 6, 0,   0, 0, 3},
            {4, 0, 0,   8, 0, 3,   0, 0, 1},
            {7, 0, 0,   0, 2, 0,   0, 0, 6},
           /*-------------------------------*/  
            {0, 6, 0,   0, 0, 0,   0, 0, 0},
            {0, 0, 0,   4, 1, 9,   0, 0, 5},
            {0, 0, 0,   0, 8, 0,   0, 7, 9},
        }; 
        int [][] emptygrid = new int [9][9];
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                emptygrid[r][c] = 0;
            }
        }
        char response;
        int row;
        int col;
        int zerocount;
        int movez = 0;
        welcome101();
        System.out.println("So, do you want to play the best Sudoku in the world?");
        System.out.println("Press 'y' for yes and 'n' for no (dont say no please) ._.");
        response = input.next().charAt(0);
            if (response == 'n' || response == 'N' ) {
                System.out.println("okay bye man :(");
                System.exit(0);
            }
        printOGgrid101(grid, original, emptygrid);    
        do {
            System.out.println("Enter coordinates of the position you wish to fill");
            System.out.println("Enter row:");
            row = input.nextInt() - 1;
            System.out.println("Enter column:");
            col = input.nextInt() - 1;
            System.out.println("Enter your answer:");
            int ans = input.nextInt();
            movez++;
            //error messages
            if (alterCheck101(row, col) == true) {
                System.out.println("oops, Invalid input, you can't alter the original grid, enter again!");
                movez--;
            }
            if (rowCheck101(grid, row, col, ans) == true && columnCheck101(grid, row, col, ans) == false) {
                System.out.println("oops, Invalid input, " + ans + " is already in this row, enter again!");                            
            }
            if (columnCheck101(grid, row, col, ans) == true && rowCheck101(grid, row, col, ans) == false) {
                System.out.println("oops, Invalid input, " + ans + " is already in this column, enter again!");                            
            }
            if (rowCheck101(grid, row, col, ans) == true && columnCheck101(grid, row, col, ans) == true) {
                System.out.println("oops, Invalid input, " + ans + " is already in this row and column, enter again!");                            
            }
            if ((boxCheck101(grid, row, col, ans) == true)) {
                System.out.println("oops, Invalid input, " + ans + " is already in this box, enter again!");                            
            }           
            //otherwise let it store and set the desired value and print the newgrid
            else if (alterCheck101(row, col) == false && rowCheck101(grid, row, col, ans) == false
                    && columnCheck101(grid, row, col, ans) == false && boxCheck101(grid, row, col, ans) == false) {
                grid [row][col] = ans;
                emptygrid [row][col] = ans;
                System.out.println("Your grid looks like this now:");
                printOGgrid101(grid, original, emptygrid);          
            }
            zerocount = 0;
            for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    if (emptygrid[r][c] == 0) {
                        zerocount++;
                    }
                }
            }            
            if (zerocount == 28) {
                System.out.println("OMG YOU'RE A GENIUS YOU'VE DONE IT, WOOT WOOT!");
                System.out.println("You did it in " + movez + " moves :)");
                System.exit(0);
            }    
            System.out.println("Do you want to continue playing? Press 'y' for yes and 'n' for no (dont say no please) ._.");
                response = input.next().charAt(0);
            if (response == 'n' || response == 'N' ) {
                System.out.println("okay bye man :(");
                System.exit(0);
            }
        }
        while (response != 'n' || response != 'N');        
    }
    public static void welcome101 () {
        System.out.println("Hello and welcome to the best Sudoku in the world! :)");
        System.out.println("Continue reading for the game guidelines.");
        System.out.println();
        System.out.println("A Sudoku grid consists of 9x9 spaces.");
        System.out.println("You can use only numbers from 1 to 9.");
        System.out.println("Each 3×3 block can only contain numbers from 1 to 9.");
        System.out.println("Each vertical column can only contain numbers from 1 to 9.");
        System.out.println("Each horizontal row can only contain numbers from 1 to 9.");
        System.out.println();
        System.out.println("You are supposed to use the row and column lables like this:");
        String [][] emptygrid = new String [9][9];
        System.out.print("  ");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                emptygrid[r][c] = "*";
            }
        }
        for (int r = 0; r < 9; r++) {           
            System.out.print(r + 1 + " ");            
            for (int c = 0; c < 9; c++) {
                System.out.print(emptygrid[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void printOGgrid101(int grid[][], int original[][], int emptygrid[][]) {        
        for (int r = 0; r < 9; r++) {
                System.out.print("|");
                for (int c = 0; c < 9; c++) {                    
                    if (emptygrid [r][c] != 0) {
                        System.out.print(ANSI_YELLOW + emptygrid [r][c] + ANSI_RESET);
                    }
                    if (original [r][c] != 0) {
                        System.out.print(original [r][c]);
                    }
                    if (grid [r][c] == 0) {
                        System.out.print(" ");
                    }                    
                    if (c == 2 || c == 5 || c == 8) {
                        System.out.print("|");
                    }
                    if (c != 2 && c != 5) {
                        System.out.print(" ");
                    }                   
                }
                System.out.println();
                if (r == 2 || r == 5) {
                        System.out.print("-------------------");
                        System.out.println("");
                    }
            }
    }    
    public static boolean alterCheck101(int row, int col) {
        int [][] referenceGrid = {
            {5, 3, 0,   0, 7, 0,   0, 0, 0},
            {6, 0, 0,   1, 9, 5,   0, 0, 0},
            {0, 9, 8,   0, 0, 0,   0, 6, 0},
           /*-------------------------------*/ 
            {8, 0, 0,   0, 6, 0,   0, 0, 3},
            {4, 0, 0,   8, 0, 3,   0, 0, 1},
            {7, 0, 0,   0, 2, 0,   0, 0, 6},
           /*-------------------------------*/  
            {0, 6, 0,   0, 0, 0,   0, 0, 0},
            {0, 0, 0,   4, 1, 9,   0, 0, 5},
            {0, 0, 0,   0, 8, 0,   0, 7, 9},
        }; 
        boolean alterFlag = false;
        for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    if (referenceGrid[row][col] != 0) {
                        alterFlag = true;
                    }
                }                
            }
        return alterFlag;
    }  
    public static boolean editCheck101(int emptygrid[][], int row, int col) {
        boolean editFlag = false;
        for (int r = 0; r < 9; r++) {
                for (int c = 0; c < 9; c++) {
                    if (emptygrid[row][col] >= 1 && emptygrid[row][col] <= 9) {
                        editFlag = true;
                    }
                }                
            }
        return editFlag;
    }
    public static boolean rowCheck101(int grid[][], int row, int col, int ans) {
        boolean rowFlag = false;
        for (int c = 0; c < 9; c++) {
                if (ans == grid[row][c]) {
                    rowFlag = true;
                }
            }
        return rowFlag;
    }    
    public static boolean columnCheck101(int grid[][], int row, int col, int ans) {
        boolean columnFlag = false;
        for (int r = 0; r < 9; r++) {
                if (ans == grid[r][col]) {
                    columnFlag = true;
                }
            }
        return columnFlag;
    }
    public static boolean boxCheck101(int grid[][], int row, int col, int ans) {
        boolean boxFlag = false;
        //boxes 1, 4, 7
            int rr = (row/3)*3;
            int cc = (col/3)*3;
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    if (ans == grid[rr + c][cc + r]) {
                        boxFlag = true;
                    }
                }
            }            
        return boxFlag;
    }    
}
