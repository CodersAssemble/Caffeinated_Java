package inheritance;

public class Main {

    public static void main(String[] args) {
        SavingsAccount savingsAccount =
                new SavingsAccount("SB101", 10000);
        savingsAccount.deposit(2000);
        savingsAccount.addInterest();
        savingsAccount.showBalance();
    }
}
