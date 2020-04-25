# Classes and Objects

- [Classes](#Classes)
	- [Syntax](#Syntax)
	- [Constructors](#Constructors)
- [Basic Programs](#Basic-Programs)

## Introduction to Classes

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

## Classes

### Syntax 

The fundamental concept of object-oriented programming is the class.

A *class* is the set of instructions that describe how an instance can behave and what information it contains.

Java has pre-defined classes such as ```System```, which we’ve used in logging text to our screen, but we also need to write our own classes for the custom needs of a program.

Here’s a definition of a Java class:

```
public class Car {
// scope of Car class starts after curly brace

  public static void main(String[] args) {
    // scope of main() starts after curly brace

    // program tasks

  }
  // scope of main() ends after curly brace

}
// scope of Car class ends after curly brace
```

This example defines a ```class``` named ```Car```. ```public``` is an *access level modifier* that allows **other** classes to interact with this class.

This class has a ```main()``` method, which lists the tasks performed by the program. ```main()``` runs when we execute the compiled **Car.class** file.

### Constructors

We create objects (instances of a class) using a constructor method. The constructor is defined within the class.

Here’s the Car class with a constructor:

```
public class Car {
  public Car() {
  //constructor method starts after curly brace

    //instructions for creating a Car instance

  }
  //constructor method ends after curly brace

  public static void main(String[] args) {

    // program tasks

  }
}
```

The constructor, ```Car()```, shares a name with the class.

We create instances by *calling* or *invoking* the constructor within ```main()```. This example assigns an instance to the variable ```ferrari```:

```
public class Car {

  public Car() {
  }

  public static void main(String[] args) {
    /*
    invoke a constructor using 
    'new', the name, and parentheses:
    new Car()
    */
    Car ferrari = new Car(); 
  }
}
```

As with other variable declarations, we specify the type: ```Car```, and name: ```ferrari```. Variables that reference an instance have a type of the class name.

We invoke the constructor method: ```Car()```, and use the keyword ```new``` to indicate that we’re creating an instance. 

**Omitting ```new``` causes an error**.

This is the first time we’ve called a method that we’ve also defined. ```main()``` is run automatically and we did not define the ```println()``` method.

Introducing a second method is a big step in your programming journey, congratulations!

# Basic Programs
- [Store](#Store)
- [Shop](#Shop)
- [Mart](#Mart)

## Store

[Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Store.java) contains a complete class definition that we’ll build up as we progress through the lesson.

Run the code to see it in action.

## Shop

1. In a code editor, create a ```public``` ```Shop``` class.

2. Your program will not compile without a ```main()``` method.

	Define one within ```Shop```.

Example code can be found in the [Shop.Java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Shop.java) file.

## Mart

Demonstrates the use of a constructor

1. Start with this code:

```
public class Mart {
  
  // new method: constructor!
  public Mart() {

  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    
    // print the instance below
    
  }
}
```

2. Let’s explore how code execution moves around the file with two methods.

	Add a print statement inside our ```Store``` constructor with the message: ```I am inside the constructor method.```

	We’ll see this message whenever we create an instance of ```Store``` by calling the constructor.

3. We did not see our constructor message printed because **we haven’t run the code inside the constructor**.

	Inside ```main()```, create an instance of ```Store``` called ```lemonadeStand```. Don’t forget the ```new``` keyword!

	We should see the constructor message.

4. Inside ```main()```, print ```lemonadeStand``` to see how Java represents this instance.

	Review the order of the printed messages:

		1. Running the program invokes ```main()```
		2. We create an instance so we move from ```main()``` to ```Store()```
		3. The code inside ```Store()``` runs
		4. When ```Store()``` finishes execution, we **return** to ```main()```

Example code can be found in the [Mart.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Mart.java) file.