package gradingmcqtest;
public class Gradingmcqtest {
    public static void main(String[] args) {
        
        String [][] sheet = {
            {"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
            {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
            {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
            {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
            {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
            {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
        };
        
        String [][] answer = {
            {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"},
        };
        
        int grades [] = new int [10];
        int marks = 0;
        for (int s = 0; s < 8; s++) {
            for (int q = 0; q < 10; q++) {
                if (sheet[s][q] == answer[0][q]) {
                    marks++;
                }
                grades [s] = marks;                
            }
            marks = 0;
        }
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Marks for student " + i + " is: " + grades [i]);
        }
        
    }
    
}
