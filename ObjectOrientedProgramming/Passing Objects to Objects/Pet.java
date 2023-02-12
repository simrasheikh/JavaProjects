package LabTask2;
public class Pet {
    
    public String name;
    public String breed;
    public int age;    
    
    public Pet(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;        
    }
    
    public void getDetails() {
        System.out.println("Pet Name: " + name);
        System.out.println("Pet Breed: " + breed);
        System.out.println("Pet Age: " + age);        
    }
}
