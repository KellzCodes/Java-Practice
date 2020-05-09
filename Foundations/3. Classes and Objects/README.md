# Classes and Objects

- [Classes](#Classes)
	- [Syntax](#Syntax)
	- [Constructors](#Constructors)
	- [Instance Fields](#Instance-Fields)
	- [Constructor Parameters](#Constructor-Parameters)
	- [Assigning Values to Instance Fields](#Assigning-Values-to-Instance-Fields)
	- [Multiple Fields](#Multiple-Fields)
	- [Review](#Review)
- [Methods](#Methods)
	- [Defining Methods](#Defining-Methods)
	- [Calling Methods](#Calling-Methods)
	- [Scope](#Scope)
	- [Adding Parameters](#Adding-Parameters)
	- [Reassigning Instance Fields](#Reassigning-Instance-Fields)
	- [Returns](#Returns)
	- [The toString() Method](#The-toString-Method)
	- [Review](#Review)

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

Example code can be found in the [Introduction to classes](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Introduction%20to%20Classes) folder.

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

Example code can be found in the [Classes-Syntax](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Classes-Syntax) folder

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

Example code can be found in the [Classes-Constructors](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Classes-Constructors) folder.

### Instance Fields

The [Store.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Classes-Constructors/Store.java) program ends with printing an instance of ```Store```, which looks something like ```Store@6bc7c054```. The first part, ```Store```, refers to the class, and the second part ```@6bc7c054``` refers to the instance’s location in the computer’s memory.

We don’t care about memory location, but our instances have no other characteristics!

We’ll add associated data to an object by introducing *instance variables*, or *instance fields*. Instance fields are the state in our objects.

We want ```Car``` instances of different colors, so we declare a ```String color``` instance field.

```
public class Car {
  /*
  declare fields inside the class
  by specifying the type and name
  */
  String color;

  public Car() {
    /* 
    instance fields available in
    scope of constructor method
    */
  }

  public static void main(String[] args) {
    // body of main method
  }
}
```

The declaration is **within** the class and the instance variable will be available for assignment inside the constructor.

Fields are a type of state each instance will possess. One instance may have ```"red"``` as its ```color```, another ```"blue"```, etc.

Example code can be found in the [Classes-Instance Fields](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Classes-Instance%20Fields) folder.

### Constructor Parameters

We’ll use a combination of constructor method and instance field to create instances with individual state.

We need to alter the constructor method because now it needs to access data we’re assigning to the instance.

Our ```Car``` constructor now has a parameter: ```String carColor```.

```
public class Car {
  String color;

  // constructor method with a parameter
  public Car(String carColor) {
    // parameter value assigned to the field
    color = carColor;
  }
  public static void main(String[] args) {
    // program tasks
  }
}
```

We need a value for the instance field ```color```, so we’ve added ```String carColor``` as a parameter.

Parameters specify the type and name of data available for reference within a method’s scope.

We’ve already seen a parameter in the ```main()``` method: ```String[] args```, but this is the first time we’re using the parameter value within a method body.

The parameter ```carColor``` references the value passed in during a method call:

```
new Car("blue");
// carColor references "blue" inside constructor
new Car("yellow");
// carColor references "yellow" inside constructor
```

Within the constructor, we assign the parameter value to the instance field.

Instance fields are available for assignment inside the constructor because we declared them within the class.

Example code can be found in the [Classes-Constructor Parameters](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Classes-Constructor%20Parameters) folder.

### Assigning Values to Instance Fields

Now that our constructor has a parameter, we must pass values into the method call. These values become the state of the instance.

Here we create an instance, ```ferrari```, in the ```main()``` method with ```"red"``` as its ```color``` field:

```
public class Car {
  String color;

  public Car(String carColor) {
    // assign parameter value to instance field
    color = carColor;
  }

  public static void main(String[] args) {
    // parameter value supplied when calling constructor
    Car ferrari = new Car("red");
  }
}
```

We pass the String value ```"red"``` to our constructor method call: ```new Car("red");```.

The type of the value given to the invocation **must match** the type declared by the parameter.

Inside the constructor, the parameter ```carColor``` refers to the value passed in during the invocation: ```"red"```. This value is assigned to the instance field ```color```.

```color``` has already been declared, so we don’t specify the type during assignment.

The object, ```ferrari```, holds the state of ```color``` as an instance field referencing the value ```"red"```.

We access the value of this field with the dot operator (```.```):

```
/*
accessing a field:
objectName.fieldName
*/

ferrari.color;
// "red"
```

Example code can be found in the [Classes-Assigning values to instance fields](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Classes-Assigning%20values%20to%20instance%20fields) file.

### Multiple Fields

Objects are not limited to a single instance field. We can declare as many fields as are necessary for the requirements of our program.

Let’s change ```Car``` instances so they have multiple fields.

We’ll add a ```boolean isRunning```, that indicates the car engine is on and an ```int velocity```, that indicates the speed at which the car is traveling.

```
public class Car {
  String color;
  // new fields!
  boolean isRunning;
  int velocity;

  // new parameters that correspond to the new fields
  public Car(String carColor, boolean carRunning, int milesPerHour) {
    color = carColor;
    // assign new parameters to the new fields
    isRunning = carRunning;
    velocity = milesPerHour;
  }

  public static void main(String[] args) {
    // new values passed into the method call
    Car ferrari = new Car("red", true, 27);
    Car renault = new Car("blue", false, 70);

    System.out.println(renault.isRunning);
    // false
    System.out.println(ferrari.velocity);
    // 27
  }
}
```

The constructor now has multiple parameters to receive values for the new fields. We still specify the type as well as the name for each parameter.

Ordering matters! We must pass values into the constructor invocation in the same order that they’re listed in the parameters.

```
// values match types, no error
Car honda = new Car("green", false, 0);

// values do not match types, error!
Car junker = new Car(true, 42, "brown");
```

Example code can be found in the [Classes-Multiple Fields](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Classes-Multiple%20Fields) folder.

### Review

Java is an object-oriented programming language where every program has at least one class. Programs are often built from many classes and objects, which are the instances of a class.

Classes define the state and behavior of their instances. Behavior comes from methods defined in the class. State comes from instance fields declared inside the class.

Classes are modeled on the real-world things we want to represent in our program. Later we will explore how a program can be made from multiple classes. For now, our programs are a single class.

```
public class Dog {
  // instance field
  String breed;
  // constructor method
  public Dog(String dogBreed) {
    /* 
    value of parameter dogBreed 
    assigned to instance field breed
    */
    breed = dogBreed;
  }
  public static void main(String[] args) {
    /* 
    create instance: 
    use 'new' operator and invoke constructor
    */
    Dog fido = new Dog("poodle");
    /* 
    fields are accessed using: 
    the instance name, `.` operator, and the field name.
    */
    fido.breed;
    // "poodle"
  }
}
```

Example code can be found in the [Classes-Review](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Classes-Review) folder.

## Methods

In the last lesson, we created an instance of the ```Store``` class in the main method. We learned that objects have state and behavior:

![alt text](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/diagram%2Bof%2Ban%2Bobject-02.png)

We have seen how to give objects state through instance fields. Now, we’re going to learn about behavior. Remember our example of a Savings Account.

A savings account should know:
- The balance of money available

It should be able to perform:
- Depositing
	- Increasing the amount available
- Withdrawing
	- Decreasing the amount available
- Checking the balance
	- Displaying the amount available.

You have defined and called constructor methods, which create an instance of a class. You have also defined main methods, which are the tasks that execute when the program is run. These are specific examples of methods. We can also define our own that will take input, do something with it, and return the kind of output we want.

![alt text](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/methods-conceptual.gif)

What if it took 20 lines of code to make a sandwich? Our program would become very long very quickly if we were making multiple sandwiches. Methods are powerful because they allow us to create blocks of code that are repeatable and modular.

Example code can be found in the [Introduction to Methods](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Introduction%20to%20Methods) folder

### Defining Methods

Remember our ```Car``` example from the last lesson? Let’s add a method to this ```Car``` called ```startEngine()``` that will print:

	> Starting the car!
	> Vroom!


This method looks like:

```
public void startEngine() {
  System.out.println("Starting the car!");
  System.out.println("Vroom!");
}
```

The first line, ```public void startEngine()```, is the *method signature*. It gives the program some information about the method:
- public means that other classes can access this method. We will learn more about that later in the course.
- The ```void``` keyword means that there is no specific output from the method.
- ```startEngine()``` is the name of the method.

A ```checkBalance()``` method for the Savings Account we talked about earlier looks something like:

```
public void checkBalance(){
  System.out.println("Hello!");
  System.out.println("Your balance is " + balance);
}
```

The two print statements are inside the *body* of the method, which is defined by the curly braces.

Anything we can do in our ```main()``` method, we can do in other methods! All of the Java tools you know, like the math and comparison operators, can be used to make interesting and useful methods.

Example code can be found in the [Methods-Defining Methods](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Methods-Defining%20Methods) folder.

### Calling Methods

Great! When we add the ```startEngine()``` method to the ```Car``` class, it becomes available to use on any ```Car``` object. We can do this by *calling* the method on the ```Car``` object we created, for example.

Here is an example of *calling* a method on an object using the ```Car``` class:

```
class Car {

  String color;

  public Car(String carColor) {
    color = carColor;
  }

  public void startEngine() {
    System.out.println("Starting the car!");
    System.out.println("Vroom!");
  }

  public static void main(String[] args){
    Car myFastCar = new Car("red");
    myFastCar.startEngine();
  }
}
```

In the example above, we call the ```startEngine()``` method on the ```myFastCar``` object. This method call occurs inside the ```main()``` method. Running the program results in printing ```Vroom!``` to the output terminal.

Example code can be found in the [Methods-Calling Methods](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Methods-Calling%20Methods) folder.

### Scope

A method is a task that an object of a class performs.

We mark the domain of this task using curly braces: ```{```, and ```}```. Everything inside the curly braces is part of the task. This domain is called the *scope* of a method.

We can’t access variables that are declared inside a method in code that is outside the scope of that method.

Looking at the ```Car``` class again:

```
class Car {
  String color;
  int milesDriven;

  public Car(String carColor) {
    color = carColor;
    milesDriven = 0;         
  }

  public void drive() {
     String message = "Miles driven: " + milesDriven;
     System.out.println(message);
  }

  public static void main(String[] args){
     Car myFastCar = new Car("red");
     myFastCar.drive();
  }
}
```

The variable ```message```, which is declared and initialized inside of ```drive```, cannot be used inside of ```main()```! It only exists within the scope of the ```drive()``` method.

However, ```milesDriven```, which is declared at the top of the class, can be used inside all methods in the class, since it is in the scope of the whole class.

Example code can be found in the [Methods-Scope](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Methods-Scope) folder.

### Adding Parameters

We saw how a method’s scope prevents us from using variables declared in one method in another method. What if we had some information in one method that we needed to pass into another method?

Similar to how we added parameters to *constructors*, we can customize all other methods to accept parameters.

```
class Car {

  String color;

  public Car(String carColor) {
    color = carColor;         
  }

  public void startRadio(String station) {
    System.out.println("Turning on the radio to " + station + "!");
    System.out.println("Enjoy!");
  }

  public static void main(String[] args){
    Car myCar = new Car("red");
    myCar.startRadio("Meditation Station");
  }
}
```

In this code, we create a ```startRadio()``` method that accepts an ```String``` parameter called ```station```. In the ```main()``` method, we call the ```startRadio()``` method on the ```myCar``` object and provide a ```String``` argument of ```"Meditation Station"```.

A call to the ```startRadio()``` method on ```myCar``` results in printing:


	> Turning on the radio to Meditation Station!
	> Enjoy!

Example code can be found in the [Methods-Adding Parameters](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Methods-Adding%20Parameters) folder.

### Reassigning Instance Fields

Earlier, we thought about a Savings Account as a type of object we could represent in Java.

Two of the methods we need are depositing and withdrawing:

```
public SavingsAccount{
  double balance;
  public SavingsAccount(double startingBalance){
    balance = startingBalance;
  }

  public void deposit(double amountToDeposit){
     //Add amountToDeposit to the balance
  }

  public void withdraw(double amountToWithdraw){
     //Subtract amountToWithdraw from the balance
  }

  public static void main(String[] args){

  }
}
```

These methods would change the value of the variable ```balance```. We can *reassign* balance to be a new value by using our assignment operator, ```=```, again.

```
public void deposit(double amountToDeposit){
  double updatedBalance = balance + amountToDeposit;
  balance = updatedBalance;
}
```

Now, when we call ```deposit()```, it should change the value of the instance field ```balance```:

```
public static void main(String[] args){
  SavingsAccount myAccount = new SavingsAccount(2000);
  System.out.println(myAccount.balance);
  myAccount.deposit(100);
  System.out.println(myAccount.balance);
}
```

This code first prints ```2000```, the initial value of ```myAccount.balance```, and then prints ```2100```, which is the value of ```myAccount.balance``` after the ```deposit()``` method has run.

Changing instance fields is how we change the state of an object and make our objects more flexible and realistic.

Example code can be found in the [Methods-Reassigning Instance Fields](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Methods-Reassigning%20Instance%20Fields) folder.

### Returns 

Remember, variables can only exist in the *scope* that they were declared in.

We can use a value outside of the method it was created in if we *return* it from the method.

We return a value by using the keyword *return*:

```
public int numberOfTires() {
   int tires = 4;
   return tires;
}
```

This method, called ```numberOfTires```, returns ```4```. In past exercises, when creating new methods, we used the keyword ```void```. Here, we are replacing ```void``` with ```int```, to signify that the *return type* is an ```int```.

The void keyword (which means “completely empty”) indicates to the method that no value is returned after calling that method.

Alternatively, we can use datatype keywords (such as int, char, etc.) to specify that a method should return a value of that type.

```
public static void main(String[] args){
  Car myCar = new Car("red");
  int numTires = myCar.numberOfTires();
}
```

Within ```main()```, we called the ```numberOfTires()``` method on ```myCar```. Since the method returns an ```int``` value of 4, we store the value 4 in an integer variable called ```numTires```. If we printed ```numTires```, we would see ```4```.

Example code can be found in the [Methods-Returns](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Methods-Returns) folder.

### The toString Method

When we print out Objects, we often see a String that is not very helpful in determining what the Object represents. In the last lesson, we saw that when we printed our ```Store``` objects, we would see output like:


	> Store@6bc7c054


where ```Store``` is the name of the object and ```6bc7c054``` is its position in memory.

This doesn’t tell us anything about what the ```Store``` sells, the price, or the other instance fields we’ve defined. We can add a method to our classes that makes this printout more descriptive.

When we define a *toString()* method for a class, we can return a ```String``` that will print when we print the object:

```
class Car {

    String color;

    public Car(String carColor) {
        color = carColor;
    }

    public static void main(String[] args){
        Car myCar = new Car("red");
        System.out.println(myCar);
    }

   public String toString(){
       return "This is a " + color + " car!";
   }
}
```

When this runs, the command ```System.out.println(myCar)``` will print ```This is a red car!```, which tells us about the Object ```myCar```.

Example code can be found in the [Methods-toString](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Methods-toString) folder.

### Review

Methods are a powerful way to abstract tasks away and make them repeatable. They allow us to define behavior for classes, so that the Objects we create can do the things we expect them to. Let’s review everything we have learned about methods so far.

- *Defining a method*: Methods have a method signature that declares their return type, name, and parameters
- *Calling a method*: Methods are invoked with a ```.``` and ```()```
- *Parameters*: Inputs to the method and their types are declared in parentheses in the method signature
- *Changing Instance Fields*: Methods can be used to change the value of an instance field
- *Scope*: Variables only exist within the domain that they are created in
- *Return*: The type of the variables that are output are declared in the method signature

As you move through more Java material, it will be helpful to frame the tasks you create in terms of methods. This will help you think about what inputs you might need and what output you expect.

Example code can be found in the [Methods-Review](https://github.com/keldavis/Java-Practice/tree/master/Foundations/3.%20Classes%20and%20Objects/Methods-Review) folder