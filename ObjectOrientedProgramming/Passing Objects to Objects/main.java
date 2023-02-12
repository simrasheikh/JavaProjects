package LabTask2;
public class labtwo {
    public static void main(String[] args) {                
        //Problem 3
        Pet pet = new Pet("Fido", "Labrador", 5);
        Person person = new Person("John", 25, pet);
        person.getDetails();                
    }    
}
