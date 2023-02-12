package lab4;

public class LegalSecretary extends Secretary {
    public LegalSecretary() {
    }

    public double getSalary() {
        return super.getSalary() + 5000.0;
    }

    public String fileLegalBriefs() {
        return "I could file all day!";
    }
}
