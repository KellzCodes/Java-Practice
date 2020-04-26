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

```
Starting the car!
Vroom!
```

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

```
Turning on the radio to Meditation Station!
Enjoy!
```

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
	- [SmallStore](#SmallStore)
	- [Defining Method Scope](#Defining-Method-Scope)
	- [Big Store](#Big-Store)

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
```
	"Come spend some money!"
	"Selling productType!"
```
	where ```productType``` is replaced with the value in the variable ```productType```.

	However, we’re not going to see these Strings printed out yet!

Example code can be found in the [Salon.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/3.%20Classes%20and%20Objects/Salon.java) file.

## SmallStore

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

	```
	Selling cookies!
	```

	Right?

3. No! We got an error! The ```cookie``` variable cannot be accessed inside of the advertise method. The scope is wrong! Change it back to ```productType```:

```
	String message = "Selling " + productType + "!";
```

4. Inside of the ```main()``` method, print the String ```message```, which is declared in the ```advertise()``` method. This should print:

	```
		Selling Cookies!
	```

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