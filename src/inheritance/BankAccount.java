package inheritance;

// Parent Class
public class BankAccount {
    // protected allows access within the package and in the child class
    protected String accountNumber;
    protected double balance;

    //Constructor runs automatically when an object is created
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
        }
    }
    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
}
