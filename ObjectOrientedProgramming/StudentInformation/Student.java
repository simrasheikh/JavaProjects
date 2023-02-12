package lab3task3;
public class Student {
    public String fname;
    public String lname;
    String[] courses = new String[]{"maths", "", "science", "", "english", "", "urdu", "", "chinese", ""};

    public Student(String fn, String ln) {
        this.fname = fn;
        this.lname = ln;
        this.numGenerator(this.courses);
    }
    private int numGenerator(String[] courses) {
        int x = 0;
        for(int i = 1; i < 10; i += 2) {
            x = (int)(Math.random() * 101.0D);
            courses[i] = "" + x;
        }
        return x;
    }
    public String CalculateGrade(int x) {
        String grade = "";
        if (x >= 90) {
            grade = "A+";
        }
        if (x >= 80 && x < 90) {
            grade = "A";
        }
        if (x >= 70 && x < 80) {
            grade = "B";
        }
        if (x >= 50 && x < 70) {
            grade = "C";
        }
        if (x >= 33 && x < 50) {
            grade = "D";
        }
        if (x < 33) {
            grade = "F";
        }
        return grade;
    }
    public void getDetails() {
        System.out.println("Name: " + this.fname + " " + this.lname);
        for(int i = 0; i < 10; i += 2) {
            System.out.println(this.courses[i] + ": " + this.courses[i + 1] + 
                    " " + this.CalculateGrade(Integer.parseInt(this.courses[i + 1])));
        }
    }
    public static String getBest(Student obj) {
        return ("Best Student: \n" + "First Name: " + obj.fname + "\n" + "Last Name: " + obj.lname);
    }    
}
