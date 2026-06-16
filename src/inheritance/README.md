# Inheritance

## Definition
This is an OOPs concept where a child class acquires the properties
and methods of a parent class using the extends keyword. 

## Why use it?
- Code Reusability 
- Reduces duplication

## Example
A SavingsAccount is a type of Bank Account. Bank Account is a parent class
and SavingsAccount is a child class.

## Why protected?
protected allows access with in the same package and in the same class.

## Constructor?
A Constructor runs automatically when an object is created.

## Why Constructor is called automatically?
Because java knows `new BankAccount(...)` means:
- Allocate memory for the object
- Initialize the object
- Call the constructor

## this keyword?
The 'this' keyword refers to the current object. It is commonly 
used to differentiate instance variable from local variables or
constructor parameters having the same name.

### Understanding `this.accountNumber = accountNumber`?

The `this` keyword refers to the current object. In a constructor, 
it is common for the instance variable (class variable) and the 
constructor parameter to have the same name. In the statement 
`this.accountNumber = accountNumber;`, the left side (`this.accountNumber`) 
refers to the instance variable of the current object, while the right side 
(`accountNumber`) refers to the value passed to the constructor. This statement
assigns the constructor parameter value to the object's instance variable.

Example:
public class BankAccount {

    String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}

When `new BankAccount("SB101")` is executed, the value `"SB101"` is passed
to the constructor parameter and then stored in the object's `accountNumber` 
variable using `this.accountNumber = accountNumber;`.

## extends keyword?
Without `extends` keyword child class cannot inherit from parent.The `extends` 
keyword is used to create inheritance between a child class and a parent class. 
The child class inherits the accessible fields and methods of the parent class.

`class SavingsAccount extends BankAccount` means SavingsAccount IS-A BankAccount.
## super keyword?
Without `super()` we cannot access / call parent class.The `super` keyword 
refers to the parent class. It is commonly used to call the parent class 
constructor or access parent class methods and variables.

`super(accountNumber, balance);` means Call the parent constructor and initialize
the inherited fields.
