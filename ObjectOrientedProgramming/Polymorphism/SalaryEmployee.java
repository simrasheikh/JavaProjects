public class SalaryEmployee extends Employee{    
    private double weeklySalary;
    
    SalaryEmployee(String fname, String lname, double weeklySalary) {
        super(fname,lname);
        this.weeklySalary = weeklySalary;       
    }
    public double getWeeklySalary(double weeklySalary) {
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        weeklySalary = this.weeklySalary;
    }
    public double earnings() {
        double earnings = weeklySalary * 4;
        return earnings;
    }
    public String toString() {
        return "Name: " + getFname() + " " + getLname() + "\nEarnings: " + earnings();
    }
}
