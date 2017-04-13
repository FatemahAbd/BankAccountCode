public class BankAccount {

    private double balance;

    public void BankAccount() {
        balance = 0;
    }

    public void BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public void addInsert(double x) {
        balance = balance + balance * x / 100;
    }

}
