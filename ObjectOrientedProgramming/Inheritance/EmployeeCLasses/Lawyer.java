package lab4;

public class Lawyer extends Employee {
    public Lawyer() {
    }

    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }

    public String getVacationForm() {
        return "Pink";
    }

    public String sue() {
        return "I will see you in court.";
    }
}
