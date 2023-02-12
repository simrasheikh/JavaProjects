package lab4task2;

public class CheckingAccount extends BankAccount {
    private static double FEE = 15.0;

    public CheckingAccount(String name, double amount) {
        super(name, amount);
        super.setAccountNumber(super.getAccountNumber() + "-10");
    }

    public boolean withdraw(double amount) {
        return super.withdraw(FEE + amount);
    }
}
