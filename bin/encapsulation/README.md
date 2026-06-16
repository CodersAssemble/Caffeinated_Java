# Encapsulation

## Definition
Encapsulation is the process of hiding data and providing controlled 
access through methods. In this process we make variables private &
providing controlled access through public methods such as getters &
setters.

## Why use it?
- Protects data
- Prevents invalid modifications
- Improves maintainability

## Example
In BankAccount.java, the balance variable is private and can only 
be modified through deposit() and withdraw() methods.

## Interview Questions

### What is encapsulation?
Encapsulation is the process of hiding internal data using private 
variables and providing controlled access through public methods.

### Why make variables private?
To prevent unauthorized or invalid modifications.

### What are getters and setters?
Methods used to read and update private variables in a controlled way.

### Getter?
A getter returns the value of a private variable.
Example:
`private double balance;
public double getBalance() {
return balance;
}`
Usage:
`System.out.println(account.getBalance());`
### Setter?
A setter updates the value of a private variable.
Example:
`private double balance;
public void setBalance(double balance) {
this.balance = balance;
}`
Usage:
`account.setBalance(10000);`
