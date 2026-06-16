# Abstraction
Hide Implementation.
Abstraction is the process of hiding implementation details and exposing only 
the essential functionality to the user.


## Example
Think about an ATM
We know Withdraw Money, Check Balance and Deposit Money.
But we don't know: Database Queries, Server Communication, and Authentication logic
The ATM shows what to do, but hides how it is done.
That's abstraction.

Suppose every bank account should calculate interest.We know every account must have:
`calculateInterest()` but different accounts calculate it differently. Saving Account
`-> 5% interest` , Fixed Deposite `-> 7% interest`. So we'll force child classes to implement it.

In this example, the BankAccount class declares an abstract method called calculateInterest() 
without providing an implementation. The SavingsAccount class provides the actual implementation. 
Users can call calculateInterest() without knowing how the interest is calculated internally.


## abstract keyword?
For normal class without (abstract keyword), objects can be created.
But for classes with abstract keyword, objects will not be created directly.
As those are incomplete and implementation needs to be done.

## abstract method?
`public abstract void calculateInterest();` implies {} is missing.
No implementation. We're only saying every account must calculate interest. But we are not saying how.

### Key Points
- Abstract classes cannot be instantiated.
- Abstract methods do not have a body.
- Child classes must implement abstract methods.
- Abstraction hides implementation details.
