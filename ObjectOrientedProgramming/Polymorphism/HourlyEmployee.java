package lab6task1;
public class HourlyEmployee extends Employee{
    
    private double hourly_wage;
    private int no_hours_worked;
    
    public HourlyEmployee(String fname, String lname, double hourly_wage, int no_hours_worked) {
        super(fname,lname);
        this.hourly_wage = hourly_wage;
        this.no_hours_worked = no_hours_worked;
    }
    public double getHourlyWage(double hourly_wage) {
        return hourly_wage;
    }
    public void setHourlyWage(double hourly_wage) {
        hourly_wage = this.hourly_wage;
    }
    public int getNoOfHours(int no_hours_worked) {
        return no_hours_worked;
    }
    public void setNoOfHours(int no_hours_worked) {
        no_hours_worked = this.no_hours_worked;
    }
    public double earnings() {
        double earnings = no_hours_worked * hourly_wage;
        return earnings;
    }
    public String toString() {
        return "Name: " + getFname() + " " + getLname() + "\nEarnings: " + earnings();
    }
}
