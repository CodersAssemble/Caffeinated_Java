package abstraction;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance){
        super(balance);
    }

    @Override
    public void calculateInterest() {
      balance +=balance *0.05;
      System.out.println("5% Interest Added");
    }
}
