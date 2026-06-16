package abstraction;

public class Main {
    public static void main(String[] args) {

        SavingsAccount account =
                new SavingsAccount(10000);

        account.calculateInterest();

        account.showBalance();
    }
}
