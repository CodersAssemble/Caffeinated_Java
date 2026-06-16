package polymorphism;

public class SavingsAccount extends BankAccount{
    @Override
    public void calculateBenefit(){
        System.out.println("5% Interest Added");
    }
}
