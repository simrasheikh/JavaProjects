package lab4task2;

public class Lab4Task2 {
    public Lab4Task2() {
    }

    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Simon", 500.0);
        obj.deposit(50.0);
        obj.withdraw(450.0);
        System.out.println("Balance: " + obj.getBalance());
        System.out.println("Name: " + obj.getOwner());
        System.out.println("AccNumber: " + obj.getAccountNumber());
        System.out.println();
      
        CheckingAccount obj1 = new CheckingAccount("Cowell", 1000.0);
        obj1.deposit(50.0);
        obj1.withdraw(450.0);
        System.out.println("Balance: " + obj1.getBalance());
        System.out.println("Name: " + obj1.getOwner());
        System.out.println("AccNumber: " + obj1.getAccountNumber());
        System.out.println();
      
        SavingsAccount obj2 = new SavingsAccount("Charlie", 5000.0);
        obj2.deposit(50.0);
        obj2.withdraw(450.0);
        System.out.println("Balance: " + obj2.getBalance());
        System.out.println("Name: " + obj2.getOwner());
        System.out.println("AccNumber: " + obj2.getAccountNumber());
        System.out.println();
      
        SavingsAccount obj3 = new SavingsAccount("Puth", 600.0);
        obj3.deposit(50.0);
        obj3.withdraw(450.0);
        System.out.println("Balance: " + obj3.getBalance());
        System.out.println("Name: " + obj3.getOwner());
        System.out.println("AccNumber: " + obj3.getAccountNumber());
        System.out.println();
    }
}
