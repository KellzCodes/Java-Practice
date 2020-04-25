# Classes and Objects

- [Basic Programs](#Basic-Programs)

All programs require one or more classes that act as a model for the world.

For example, a program to track student test scores might have ```Student```, ```Course```, and ```Grade``` classes. Our real-world concerns, students and their grades, are inside the program as classes.

We represent each student as an *instance*, or *object*, of the ```Student``` class.

This is ```object-oriented programming``` because programs are built around objects and their interactions. An object contains state and behavior.

![alt text](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/diagram%2Bof%2Ban%2Bobject-01.png)

Classes are a blueprint for objects. Blueprints detail the general structure. For example, all students have an ID, all courses can enroll a student, etc.

An instance is the thing itself. *This* student has an ID of ```42```, this course enrolled *that* student, etc.

Let’s review with another example, a savings account at a bank.

What should a savings account know?
- The balance of money available.

What should a savings account do?
- Deposit money.
- Withdraw money.

![alt text](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/diagram%2Bof%2Ban%2Bobject-02.png)

Imagine two people have accounts that are instances of the ```SavingsAccount``` class. They share behavior (how they deposit and withdraw) but have individual state (their balances), and even with the same balance amount these accounts are separate entities.

# Basic Programs
- [Store](#Store)

## Store

[Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Store.java) contains a complete class definition that we’ll build up as we progress through the lesson.

Run the code to see it in action.