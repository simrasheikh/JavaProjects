package LabTask2;
public class Person {
    
    public String name;
    public int age;    
    Pet pet;
    
    public Person(String name, int age, Pet pet) {
        this.name = name;
        this.age = age;
        this.pet = pet;
    }
    
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        pet.getDetails();
    }
}
