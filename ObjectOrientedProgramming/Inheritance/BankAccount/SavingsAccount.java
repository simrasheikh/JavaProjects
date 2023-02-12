package lab4task2;

public class SavingsAccount extends BankAccount {
    private double rate = 0.025;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
        ++this.savingsNumber;
    }

    public SavingsAccount(BankAccount oldAccount, double amount) {
        super(oldAccount, amount);
        this.accountNumber = this.getAccountNumber() + "-" + this.savingsNumber;
        ++this.savingsNumber;
    }

    public void postInterst() {
        double interest = super.getBalance() * this.rate * 0.0;
        super.deposit(interest);
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }
}
