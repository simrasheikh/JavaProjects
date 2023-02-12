package lab4;

public class Marketer extends Employee {
    public Marketer() {
    }

    public double getSalary() {
        return super.getSalary() + 10000.0;
    }

    public String advertise() {
        return "Act now, while supplies last!";
    }
}
