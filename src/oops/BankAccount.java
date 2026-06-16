package oops;

public class BankAccount {

    private double balance = 10000;
    public void deposit(double amount) {
        if(amount > 0) {
            balance +=amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}
