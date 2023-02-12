package LabTask2;
public class Car {
    
    public String make;
    public String model;    
    public int year;   
    public String colour;
    public int wheels;
    public int doors;
    
    public Car(String make, String model, int year, String colour, int wheels, int doors) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.wheels = wheels;               
        this.doors = doors;
    }    
    
    public void details() {
        System.out.println("Make: " + make);
        System.out.println("model: " + model);
        System.out.println("year: " + year);
        System.out.println("colour: " + colour);
        System.out.println("Number of wheels: " + wheels);
        System.out.println("Number of doors: " + doors);
    }

}
