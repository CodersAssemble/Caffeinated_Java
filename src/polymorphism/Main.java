package polymorphism;

public class Main {

    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount salary = new SalaryAccount();
        savings.calculateBenefit();
        salary.calculateBenefit();
    }
}
