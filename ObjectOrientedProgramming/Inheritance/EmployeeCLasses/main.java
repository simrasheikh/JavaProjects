package lab4;

public class Lab4 {
    public Lab4() {
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Lawyer law = new Lawyer();
        Secretary sec = new Secretary();
        LegalSecretary lsec = new LegalSecretary();
        Marketer mark = new Marketer();
        Janitor jan = new Janitor();
      
        System.out.println("Attributes for Employee:");
        System.out.println("Hours: " + emp.getHours());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Vacation Days: " + emp.getVacationDays());
        System.out.println("Vacation Form: " + emp.getVacationForm());
        System.out.println("");
      
        System.out.println("Attributes for Lawyer:");
        System.out.println("Hours: " + law.getHours());
        System.out.println("Salary: " + law.getSalary());
        System.out.println("Vacation Days: " + law.getVacationDays());
        System.out.println("Vacation Form: " + law.getVacationForm());
        System.out.println(law.sue());
        System.out.println("");
      
        System.out.println("Attributes for Secretary:");
        System.out.println("Hours: " + sec.getHours());
        System.out.println("Salary: " + sec.getSalary());
        System.out.println("Vacation Days: " + sec.getVacationDays());
        System.out.println("Vacation Form: " + sec.getVacationForm());
        System.out.println(sec.takeDictation());
        System.out.println("");
      
        System.out.println("Attributes for Legal Secretary:");
        System.out.println("Hours: " + lsec.getHours());
        System.out.println("Salary: " + lsec.getSalary());
        System.out.println("Vacation Days: " + lsec.getVacationDays());
        System.out.println("Vacation Form: " + lsec.getVacationForm());
        System.out.println(lsec.takeDictation());
        System.out.println(lsec.fileLegalBriefs());
        System.out.println("");
      
        System.out.println("Attributes for Marketer:");
        System.out.println("Hours: " + mark.getHours());
        System.out.println("Salary: " + mark.getSalary());
        System.out.println("Vacation Days: " + mark.getVacationDays());
        System.out.println("Vacation Form: " + mark.getVacationForm());
        System.out.println(mark.advertise());
        System.out.println("");
      
        System.out.println("Attributes for Janitor:");
        System.out.println("Hours: " + jan.getHours());
        System.out.println("Salary: " + jan.getSalary());
        System.out.println("Vacation Days: " + jan.getVacationDays());
        System.out.println("Vacation Form: " + jan.getVacationForm());
        System.out.println(jan.clean());
    }
}
