package lab4task2;

public class BankAccount {
    private double balance;
    private String owner;
    private String accountNumber;
    protected static int numberOfAccounts = 100001;

    public BankAccount() {
        this.balance = 0.0;
        this.accountNumber = "" + numberOfAccounts;
        ++numberOfAccounts;
    }

    public BankAccount(String name, double amount) {
        this.owner = name;
        this.balance = amount;
        this.accountNumber = "" + numberOfAccounts;
        ++numberOfAccounts;
    }

    public BankAccount(BankAccount oldAccount, double amount) {
        this.balance = amount;
        this.owner = oldAccount.owner;
        this.accountNumber = oldAccount.accountNumber;
        ++numberOfAccounts;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getOwner() {
        return this.owner;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double amount) {
        this.balance = amount;
    }

    public void setAccountNumber(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }
}
