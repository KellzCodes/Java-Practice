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

### Instance Fields

The [Mart.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Mart.java) program ends with printing an instance of ```Mart```, which looks something like ```Mart@6bc7c054```. The first part, ```Mart```, refers to the class, and the second part ```@6bc7c054``` refers to the instance’s location in the computer’s memory.

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

The variable ```message```, which is declared and initialized inside of ```drive```, cannot be used inside of ```main()```! It only exists within the scope of the drive() method.

However, ```milesDriven```, which is declared at the top of the class, can be used inside all methods in the class, since it is in the scope of the whole class.

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

### Review

Methods are a powerful way to abstract tasks away and make them repeatable. They allow us to define behavior for classes, so that the Objects we create can do the things we expect them to. Let’s review everything we have learned about methods so far.

- *Defining a method*: Methods have a method signature that declares their return type, name, and parameters
- *Calling a method*: Methods are invoked with a ```.``` and ```()```
- *Parameters*: Inputs to the method and their types are declared in parentheses in the method signature
- *Changing Instance Fields*: Methods can be used to change the value of an instance field
- *Scope*: Variables only exist within the domain that they are created in
- *Return*: The type of the variables that are output are declared in the method signature

As you move through more Java material, it will be helpful to frame the tasks you create in terms of methods. This will help you think about what inputs you might need and what output you expect.

# Basic Programs
- Classes
	- [Store](#Store)
	- [Shop](#Shop)
	- [Mart](#Mart)
	- [Emporium](#Emporium)
	- [Outlet](#Outlet)
	- [Boutique](#Boutique)
	- [Dog](#Dog)
	- [Savings Account](#Savings-Account)
- Methods
	- [Salon](#Salon)
	- [Small Store](#Small-Store)
	- [Defining Method Scope](#Defining-Method-Scope)
	- [Big Store](#Big-Store)
	- [Large Store](#Large-Store)
	- [Medium Store](#Medium-Store)
	- [Tiny Store](#Tiny-Store)
	- [Checking Account](#Checking-Account)
- Projects
	- [Calculator](#Calculator)
	- [Droid](#Droid)


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

## Market

Demonstrates use of instance fields

1. Start with this code:

```
public class Market {
  // declare instance fields here!
  
  
  // constructor method
  public Market() {
    System.out.println("I am inside the constructor method.");
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("This code is inside the main method.");
    
    Market lemonadeStand = new Market();
    
    System.out.println(lemonadeStand);
  }
}
```

2. Add some state to our ```Market``` class.

	Declare a ```String``` instance field for ```productType```.

Example code can be found in the [Market.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Market.java) file.

## Emporium

Demonstrates constructor parameters

1. Start with this code:

```
public class Emporium {
  // instance fields
  String productType;
  
  // constructor method
  public Emporium() {
    
  }
  
  // main method
  public static void main(String[] args) {
    
    
  }
}
```

2. Add the ```String``` parameter ```product``` to the ```Emporium()``` constructor.

3. Inside of the constructor method, set the instance variable ```productType``` equal to the ```product``` parameter.

Example code can be found in the [Emporium.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Emporium.java) file.

## Outlet

Assigning values to instance fields

1. Start with this code:

```
public class Outlet {
  // instance fields
  String productType;
  
  // constructor method
  public Outlet(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    
    
  }
}
```

2. Inside ```main()```, create an instance of ```Outlet``` and assign it to the variable ```lemonadeStand```. Use ```"lemonade"``` as the parameter value.

3. Print the instance field ```productType``` from ```lemonadeStand```.

Example code can be found in the [Outlet.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Outlet.java) file.

## Boutique

Multiple instance fields

1. Start with this code:

```
public class Boutique {
  // instance fields
  String productType;
  
  // constructor method
  public Boutique(String product) {
    productType = product;
  }
  
  // main method
  public static void main(String[] args) {
    
  }
}
```

2. Add two new instance fields for ```Boutique```.

	```inventoryCount``` of type ```int```. ```inventoryPrice``` of type ```double```.

3. Update the ```Boutique``` constructor method with the new parameters.

	The parameters should be ```product```, ```count```, and ```price```, **in that order**.

	You must use that order and include the types for each parameter.

	For example, ```product``` is of type ```String``` because that value is assigned to the instance field ```String productType```.

4. In the body of the ```Boutique``` constructor, assign the parameter values to the appropriate instance fields.

5. Inside ```main()```, create an instance of ```Boutique``` called ```cookieShop```.

	```cookieShop``` has ```"cookies"``` as the product.

	```cookieShop``` has ```12``` cookies to sell and each cookie costs ```3.75```.

Example code can be found in the [Boutique.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Boutique.java) file.

## Dog

This repo contains a [Dog.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Dog.java) file. Play around with the code!

Try to add and remove instance fields. Create instances with different values. Access and print different fields.

## Savings Account

We have made a [SavingsAccount](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/SavingsAccount.java) class without using any methods beyond ```main()``` and the constructor, ```SavingsAccount()```.

Run the code to see some account behavior happen.

Look at the main method! It’s so long! There is so much repeated code! Can you imagine how messy it would look if you needed to make 10 deposits?

Throughout this lesson, we will learn how to make methods that would make checking the balance, depositing, and withdrawing all behavior that would take only one line of code.

## Salon

Defining Methods

1. Start with this code:

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  
  // main method
  public static void main(String[] args) {
    
  }
}
```

2.  In between the constructor and the ```main()``` method, add a method called ```advertise()``` to the ```Store``` class. It should be accessible by other classes, and should have no output.

	You can leave the body of the method empty.

3. Inside the ```advertise()``` method, type two print statements. They should result in the printouts:
	> "Come spend some money!"
	> "Selling productType!"

	where ```productType``` is replaced with the value in the variable ```productType```.

	However, we’re not going to see these Strings printed out yet!

Example code can be found in the [Salon.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Salon.java) file.

## Small Store

Calling methods

1. Start with this code:

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
		System.out.println("Selling " + productType + "!");
    System.out.println("Come spend some money!");
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    
  }
}
```

2. Call the ```advertise()``` method on the ```lemonadeStand``` object in the ```main()``` method and see what the output is!

3. Now, call the ```advertise()``` method on the ```lemonadeStand``` object two more times. It should be called in the ```main()``` method three times total.

Example code can be found in the [SmallStore.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/SmallStore.java) file.

## Defining Method Scope

1. Start with this code:

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    String cookie = "Cookies";
    Store cookieShop = new Store(cookie);
    
    cookieShop.advertise();
  }
}
```

2. Inside of the ```advertise()``` method, change the ```productType``` variable to the ```cookie``` variable, which is declared in the ```main()``` method. This should also result in the printout:
	> Selling cookies!
	
	Right?

3. No! We got an error! The ```cookie``` variable cannot be accessed inside of the advertise method. The scope is wrong! Change it back to ```productType```:

```
	String message = "Selling " + productType + "!";
```

4. Inside of the ```main()``` method, print the String ```message```, which is declared in the ```advertise()``` method. This should print:
	> Selling Cookies!

	Right?

5. Foiled again! The ```message``` variable only exists inside the scope of the ```advertise()``` method!

	Delete the faulty print statement from the ```main()``` method.

## Big Store

Adding Parameters

1. Start with this code:

```
public class Store {
  // instance fields
  String productType;
  
  // constructor method
  public Store(String product) {
    productType = product;
  }
  
  // advertise method
  public void advertise() {
    String message = "Selling " + productType + "!";
		System.out.println(message);
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade");
    
  }
}
```

2. Add a method to the Store class called ```greetCustomer()```. It should be accessible by other classes, and return no output. For now, have it take no parameters and leave the body of the method empty.

3. Modify the ```greetCustomer()``` method so that it accepts a String parameter called ```customer```.

4. Inside of the ```greetCustomer()``` method, add a print statement to print:
```
	"Welcome to the store, " + customer + "!"
```

5. Inside the ```main()``` method, call the ```greetCustomer()``` method on the ```lemonadeStand``` object. Pass in a ```String``` argument of your choice!

Example code can be found in the [BigStore.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/BigStore.java) file.

## Large Store

Reassigning Instance Fields

1. Start with this code:

```
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    
  }
  
  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    
  }
}
```

2. We have added a ```price``` instance field to the Store class.

	However, to combat inflation costs, we’ve found ourselves increasing the price of our product over and over. We’ve added an empty ```increasePrice()``` method to the Store class. It takes a ```double``` parameter ```priceToAdd```.

	Inside of the ```increasePrice()``` method, create a variable called ```newPrice```. Declare it to be a ```double```, and set it equal to the ```price``` plus the ```priceToAdd```.

3. Inside of ```increasePrice()```, set the instance field price to be ```newPrice```!

4. In the ```main()``` method, increase the price at the lemonade stand by ```1.5```. Then, print the ```lemonadeStand.price``` to see how it has changed!

Example code can be found in the [LargeStore.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/LargeStore.java) file.

## Medium Store

Demonstrates method returns

1. Start with this code:

```
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);

  }
}
```

2. We want to have a method that returns the price plus tax.

	Define a method called ```getPriceWithTax()``` that is intended to return the price plus the tax. It should take in no parameters and return a ```double```.

	You can leave the body of the method empty for now. **Note**: the code will have an error until we return the correct type from the method, which we will do in the next step.

3. Inside the ```getPriceWithTax()``` method, create a ```double``` variable ```totalPrice``` that is equal to ```price + price * 0.08```. ```0.08``` is the tax applied to the price.

	Then, return ```totalPrice```.

4. Example code can be found in the [MediumStore.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/MediumStore.java) file.

## Tiny Store

Demonstrates the toString() method

1. Start with this code: 

```
public class Store {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public Store(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice;
  }
  
  // get price with tax method
  public double getPriceWithTax(){
    double tax = 0.08;
    double totalPrice = price + price*tax;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    Store lemonadeStand = new Store("Lemonade", 3.75);
    Store cookieShop = new Store("Cookies", 5);

  }
}
```

2. In the ```main()``` method, print the Objects ```lemonadeStand``` and ```cookieShop```. Are these printouts helpful in understanding these Objects?

3. Create a ```toString()``` method for the ```Store``` class. The method signature should say that it is ```public```, and that it returns a ```String```. It shouldn’t take in any parameters. For now, have it return the ```String``` ```"Store"```.

4. ```"Store"``` isn’t very helpful! What kind of Store is it?

	Change the ```toString()``` to return a ```String``` that describes this ```Store``` object.

	Your ```String``` should look like:
```
	This store sells productType at a price of price.
```
	where ```productType``` and ```price``` are the values in those instance fields. For example, if it was a hat store where hats cost 8, the ```String``` would say:
	> This store sells hats at a price of 8.

Example code can be found in the [TinyStore.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/TinyStore.java) file.

## Checking Account

1. Start with this code:

```
public class SavingsAccount {
  
  int balance;
  
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew "+300);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}

```

2. Now that we’ve learned about behavior, we can apply behavior to our ```CheckingAccount``` class using methods!

	We’ve added the functionality for each method inside ```main()``` now, but you will be rebuilding each above ```main()```. Note that your methods can directly access the ```balance``` field.

	First, write a method called ```checkBalance()``` that prints:
	> Hello! Your balance is

	with the balance of the account displayed.

	It should take in no parameters and return nothing.

3. Now, write a method called ```deposit()``` that takes in an ```int``` parameter ```amountToDeposit``` and adds it to the balance. It should return nothing.

	If you want, you can also have the method print:
	> You just deposited amountToDeposit

	with the value of ```amountToDeposit``` displayed.

4. Test out your methods by trying to replace some of the code in the ```main()``` method with the equivalent methods!

	Make sure to use ```checkBalance()```, ```deposit()```, and ```withdraw()``` at least once each.

5. Congratulations! You’ve made a basic ```SavingsAccount```.

	If you want, you can add more functionality to this! What other instance fields might you want to keep track of? What might a ```toString()``` look like for this class?

Example code can be found in the [CheckingAccount.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/CheckingAccount.java) file.

## Calculator
### A Basic Calculator

In this project, you will use classes, methods, and objects to create a simple arithmetic calculator. The calculator will be able to:

- Add two integers
- Subtract two integers
- Multiply two integers
- Divide two integers
- Apply the modulo operator on two integers

The instructions provided are general guidelines.

1. Create a public class called ```Calculator```.

2. Inside of the class, create a ```Calculator()``` constructor. You can leave the contents of the constructor empty.

3. Next, create a ```public``` method that returns an ```int``` and call it ```add()```.

4. The ```add()``` method should accept two int parameters. For example: ```int a, int b```.

5. The ```add``` method should add the two integer parameters that a user will specify. Inside of the ```add``` method, return the sum of ```a``` and ```b```.

6. Next, create another similar method called ```subtract()```. The ```subtract()``` method should accept two ```int``` parameters, just like the ```add()``` method does.

7. Inside of the ```subtract()``` method, return the difference of ```a``` and ```b```.

8. Create another method called ```multiply()```. The ```multiply()``` method should accept two ```int``` parameters.

9. Inside of the ```multiply``` method, return the product of ```a``` and ```b```.

10. Create another method called ```divide()```. It should accept two ```int``` parameters.

11. Inside of the ```divide()``` function, return ```a``` divided by ```b```.

12. Create another method called ```modulo```. It should accept two ```int``` parameters.

13. Inside of the ```modulo()``` function, return ```a``` modulo ```b```.

14. Next, create a ```main()``` method. Can you remember all the keywords necessary for a ```main()``` method?

15. Inside of ```main()```, create a ```Calculator``` object called ```myCalculator```.

16. Print out the value of calling the ```add()``` method on ```myCalculator```. Pass in ```5``` and ```7``` as parameters.

17. On the next line, print out the value of calling the ```subtract()``` method on ```myCalculator```. Pass in ```45``` and ```11``` as parameters.

18. If you completed this project correctly, the output should be ```12``` and ```34```. Feel free to explore more with the program. What are some ways in which the program could be improved?

19. Add comments near the top of the program that describe what the program does.

Example code can be found in the [Calculator.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Calculator.java) file.

## Droid
### Build A Droid

We’ve set up a robot workshop to build some droids. All that’s missing are the instructions on how to create the robots and what they’ll do.

Can we write a Java class to help?

We’ll need to define the state and behavior of the droids using instance fields and methods. Let’s get to work!

1. The **Droid.java** file is empty.

	Start by defining the class ```Droid```.

	Don’t forget to include a ```main()``` method! You can leave it empty for now.

	We want a ```Droid``` object that has the following state:

	- name
	- battery level

	and the following behavior:

	- performing a task
	- stating its battery level

2. Declare an instance field called ```batteryLevel```. We want to store whole number values in this field.

3. Declare another instance field called ```name``` which will store our droid’s name.

	What type should this be?

4. Create a constructor method for the ```Droid``` class.

	The method should have one parameter of ```String droidName```.

5. Inside the constructor, assign the parameter value of ```droidName``` to the appropriate instance field.

	Set the value of ```batteryLevel``` to ```100```. Every new instance of ```Droid``` will have a ```batteryLevel``` of ```100```.

6. Inside ```main()```, create a ```new``` instance of ```Droid``` named ```"Codey"```.

7. Print out the variable using ```System.out.println()```.

8. That output isn’t very informative!

	Define a ```toString()``` method within ```Droid```.

	The return type is ```String```.

	Inside ```toString()```, ```return``` a string that introduces the ```Droid``` using their name.

	Something like “Hello, I’m the droid: droidNameHere”

9. Define a new method: ```performTask()```. This method should have a single parameter: ```String task```.

	This method does not return any value.

10. Inside ```performTask()```, print a statement like “```name``` is performing task: ```task```“.

	For example, ```codey.performTask("dancing");``` will print:
	> Codey is performing task: dancing

11. Performing tasks is hard work. After the print statement, set ```batteryLevel``` to be ```10``` less than it was before.

	We’ll need to reassign the instance field to be the current value minus 10.

12. Have your ```Droid``` instance perform some tasks inside of ```main()```.

13. Create new instances and play around with methods. Here are some ideas to get you started:

	- Create a ```energyReport()``` method that prints the instance’s ```batteryLevel```.

	- Create another instance.

	- Create a method ```energyTransfer()``` that exchanges ```batteryLevel``` between instances.

Example code can be found in the [Droid.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Droid.java) file. 