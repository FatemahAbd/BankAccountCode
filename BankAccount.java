public class BankAccount {
//declare a variable its type private to see it inside this class not outside it
    private double balance;
//a constractore without inial balance, name of the constractor must be the same of your class
    public BankAccount() {
        balance = 0;
    }
//a costractore with inial balance 
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
//a method called deposit (type: void it means return nothing) which increase the value of the balance
    public void deposit(double amount) {
        balance = balance + amount;
    }
//a method called withdraw (type: void it means return nothing) which decrease the value of the balance
    public void withdraw(double amount) {
        balance = balance - amount;
    }
//a method of the type double returns the balance 
    public double getBalance() {
        return balance;
    }
//a method called addInsert (type: void it means return nothing) which add interest on the balance
    public void addInsert(double x) {
        balance = balance + balance * x / 100;
    }

}
