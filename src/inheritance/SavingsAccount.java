package inheritance;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public void addInterest() {
        double interest = balance * 0.05;
        balance += interest;
        System.out.println("Interest Added... " + interest);
    }
}
