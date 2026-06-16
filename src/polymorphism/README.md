# Polymorphism
One thing can take many forms.
Polymorphism is an OOP concept that allows the same method to behave 
differently based on the object that invokes it. Runtime polymorphism 
is achieved through method overriding.

# Example
Suppose every bank account can calculate benefits.
But each account type calculates benefits differently.
All accounts have `calculateBenefit()` but each account behaves 
differently. This is polymorphism

## Method Overriding
Parent and child have same method but with different behavior.
Method overriding occurs when a child class provides its own 
implementation of a method already defined in the parent class.

## Why is this Polymorphism?
Because `calculateBenefit` takes multiple forms. For savings:
5% Interest Added. For Salary: Monthly Bonus Added. Same method
name. Different behavior.

## Difference between inheritance and polymorphism?
Inheritance - Reuses code
Polymorphism - Different behavior for different objects