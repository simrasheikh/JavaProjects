package lab3task3;
public class Lab3Task3 {
    public static void main(String[] args) {        
        
        String[] firstname = new String[10];
        String[] lastname = new String[10];
        Student[] studarray = new Student[20];
        firstname[0] = "alex";
        firstname[1] = "jade";
        firstname[2] = "charlie";
        firstname[3] = "jude";
        firstname[4] = "chaol";
        firstname[5] = "mikael";
        firstname[6] = "erica";
        firstname[7] = "peter";
        firstname[8] = "jane";
        firstname[9] = "violet";
        lastname[0] = "lee";
        lastname[1] = "stern";
        lastname[2] = "puth";
        lastname[3] = "carr";
        lastname[4] = "westfall";
        lastname[5] = "blomkvist";
        lastname[6] = "sinclair";
        lastname[7] = "james";
        lastname[8] = "blue";
        lastname[9] = "bearguard";

        int i;
        for(i = 0; i < studarray.length; ++i) {
            studarray[i] = new Student(nameGenerator(firstname), nameGenerator(lastname));
        }
        for(i = 0; i < studarray.length; ++i) {
            studarray[i].getDetails();
            System.out.println();
        }       

        // Task 3
        int highest = 0;
        int index = 0;
        Boolean flag = true;
        
        for (int j = 0; j < studarray.length; j++) {
            int total = 0;
            flag = true;
            for (int k = 1; k < 10; k+=2) {
                total += Integer.parseInt(studarray[j].courses[k]);
                if (Integer.parseInt(studarray[j].courses[k]) < 33) {
                    flag = false;
                }
            }
            if (total > highest && flag) {
                highest = total;
                index = j;
            }
        }               
        System.out.println(Student.getBest(studarray[index]));
    }

    public static String nameGenerator(String[] firstname) {
        String name = "";
        int x = (int)(Math.random() * 10.0D);
        name = firstname[x];
        return name;
    }   
}
