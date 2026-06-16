package polymorphism;

public class SalaryAccount extends BankAccount {
    @Override
    public void calculateBenefit(){
        System.out.println("Monthly Bonus Added");
    }
}
