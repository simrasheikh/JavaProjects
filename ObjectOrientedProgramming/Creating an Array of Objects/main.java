package LabTask2;
public class labtwo {
    public static void main(String[] args) {        
        //Problem 2
        Car[] c = new Car[3];
        c[0]= new Car("Ford", "Mustang", 2020, "Red", 4, 2);
        c[1]= new Car("Honda", "Mustang", 2019, "White", 4, 4);
        c[2]= new Car("Tesla", "Model S", 2018, "Black", 4, 4);
        for (int i = 0; i < 3; i++) {
            c[i].details();
            System.out.println("");
        }       
        
    }
    
}
