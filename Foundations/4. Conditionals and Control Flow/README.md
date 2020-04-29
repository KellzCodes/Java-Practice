# Conditionals and Control Flow
### Alter the control flow of your programs with conditional statements. Learn how “if-then-else” statements give you power over which portions of your code will run.

- [If-Then Statement](#If-Then-Statement)
- [If-Then-Else](#If-Then-Else)
- [If-Then-Else-If](#If-Then-Else-If)
- [Switch Statement](#Switch-Statement)
- [Basic Programs](#Basic-Programs)

Imagine we’re writing a program that enrolls students in courses.

- *If* a student has completed the prerequisites, *then* they can enroll in a course.
- *Else*, they need to take the prerequisite courses.

They can’t take Physics II without finishing Physics I.

We represent this kind of decision-making in our program using *conditional* or *control flow* statements. Before this point, our code runs line-by-line from the top down, but conditional statements allow us to be selective in which portions will run.

Conditional statements check a ```boolean``` condition and run a *block* of code depending on the condition. Curly braces mark the scope of a conditional block similar to a method or class.

Here’s a complete conditional statement:

```
if (true) {

  System.out.println("Hello World!");

}
```

If the condition is ```true```, then the block is run. So ```Hello World!``` is printed.

But suppose the condition is different:

```
if (false) {

  System.out.println("Hello World!");

}
```

If the condition is ```false```, then the block does not run.

This code is also called *if-then* statements: “If ```(condition)``` is ```true```, then do something”.

### If Then Statement

The *if-then* statement is the most simple control flow we can write. It tests an expression for truth and executes some code based on it.

```
if (flip == 1) {

  System.out.println("Heads!");

}
```

- The ```if``` keyword marks the beginning of the conditional statement, followed by parentheses ```()```.
- The parentheses hold a ```boolean``` datatype.

For the condition in parentheses we can also use variables that reference a boolean, or comparisons that evaluate to a boolean.

The boolean condition is followed by opening and closing curly braces that mark a block of code. This block runs if, and only if, the boolean is ```true```.

```
boolean isValidPassword = true;

if (isValidPassword) {

  System.out.println("Password accepted!");

}

// Prints "Password accepted!"

int numberOfItemsInCart = 9;

if (numberOfItemsInCart > 12) {

  System.out.println("Express checkout not available");

}

// Nothing is printed.
```

If a conditional is brief we can omit the curly braces entirely:

```
if (true) System.out.println("Brevity is the soul of wit");
```

**Note**: Conditional statements do not end in a semicolon.

### If Then Else

We’ve seen how to conditionally execute one block of code, but what if there are two possible blocks of code we’d like to execute?

Let’s say *if* a student has the required prerequisite, *then* they enroll in the selected course, *else* they’re enrolled in the prerequisite course instead.

We create an alternate conditional branch with the ```else``` keyword:

```
if (hasPrerequisite) {

  // Enroll in course

} else {

  // Enroll in prerequisite

}
```

This conditional statement ensures that exactly one code block will be run. If the condition, ```hasPrerequisite```, is ```false```, the block after ```else``` runs.

There are now two separate code blocks in our conditional statement. The first block runs if the condition evaluates to ```true```, the second block runs if the condition evaluates to ```false```.

This code is also called an *if-then-else* statement:

- If *condition* is true, then do something.
- Else, do a different thing.

### If Then Else If

The conditional structure we’ve learned can be chained together to check as many conditions as are required by our program.

Imagine our program is now selecting the appropriate course for a student. We’ll check their submission to find the correct course enrollment.

The conditional statement now has multiple conditions that are evaluated from the top down:

```
String course = "Theatre";

if (course.equals("Biology")) {

  // Enroll in Biology course

} else if (course.equals("Algebra")) {

  // Enroll in Algebra course

} else if (course.equals("Theatre")) {

  // Enroll in Theatre course

} else {

  System.out.println("Course not found!");

}
```

**The first** condition to evaluate to ```true``` will have that code block run. Here’s an example demonstrating the order:

```
int testScore = 72;

if (testScore >= 90) {

  System.out.println("A");

} else if (testScore >= 80) {

  System.out.println("B");

} else if (testScore >= 70) {

  System.out.println("C");

} else if (testScore >= 60) {

  System.out.println("D");

} else {

  System.out.println("F");

}
// prints: C
```

This chained conditional statement has two conditions that evaluate ```true```. Because ```testScore >= 70``` comes before ```testScore >= 60```, only the earlier code block is run.

**Note**: Only one of the code blocks will run.

### Switch Statement

An alternative to chaining if-then-else conditions together is to use the ```switch``` statement. This conditional will check a given value against any number of conditions and run the code block where there is a match.

Here’s an example of our course selection conditional as a ```switch``` statement instead:

```
String course = "History";

switch (course) {
  case "Algebra": 
    // Enroll in Algebra
    break; 
  case "Biology": 
    // Enroll in Biology
    break;
  case "History": 
    // Enroll in History
    break;
  case "Theatre":
    // Enroll in Theatre
    break;
  default:
    System.out.println("Course not found");
}
```

This example enrolls the student in History class by checking the value contained in the parentheses, ```course```, against each of the ```case``` labels. If the value after the case label matches the value within the parentheses, the *switch block* is run.

In the above example, ```course``` references the string ```"History"```, which matches ```case "History":```.

When no value matches, the ```default``` block runs. Think of this as the ```else``` equivalent.

Switch blocks are different than other code blocks because they are not marked by curly braces and we use the ```break``` keyword to exit the switch statement.

Without ```break```, code below the matching ```case``` label is run, *including code under other case labels*, which is rarely the desired behavior.

```
String course = "Biology";

switch (course) {
  case "Algebra": 
    // Enroll in Algebra
  case "Biology": 
    // Enroll in Biology
  case "History": 
    // Enroll in History
  case "Theatre":
    // Enroll in Theatre
  default:
    System.out.println("Course not found");
}

// enrolls student in Biology... AND History and Theatre!
```

## Basic Programs

- [Order](#Order)
- [Big Order](#Big-Order)
- [Bigger Order](#Bigger-Order)
- [Large Order](#Large-Order)

### Order

Shows how to use *if-then* statement

1. Start with this code:

```
public class Order {
  
  public static void main(String[] args) {
    
    double itemCost = 30.99;
    
    // Write an if-then statement:
    
    
  }
  
}
```

2. The code contains an ```Order``` class to track retail shipments.

	Write an ```if-then``` statement that prints ```High value item!``` when ```itemCost``` is greater than ```24.00```.

Example code can be found in the [Order.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/Order.java) file.

### Big Order

Shows how to use if-then-else statement

1. Start with this code:

```
public class Order {
  
  public static void main(String[] args) {
    
    boolean isFilled = false;
    
    // Write an if-then-else statement:
    
    
  }
  
}
```

2. In the code, there is an ```isFilled``` value, that represents whether the order is ready to ship.

	Write an if-then-else statement that:

	- When ```isFilled``` is ```true```, print ```Shipping```.
	- When ```isFilled``` is ```false```, print ```Order not ready```.

Example code can be found in the [BigOrder.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/BigOrder.java) file.

### Bigger Order

Shows how to use if-then-else-if statements

1. Start with this code:

```
public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
	 	// declare conditional statement here
    
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}

```

2. We need to calculate the shipping costs for our orders.

	There’s a new instance field, ```String shipping```, that we use to calculate the cost.

	Use a chained ```if-then-else``` to check for different values within the ```calculateShipping()``` method.

	When the ```shipping``` instance field equals ```"Regular"```, the method should return ```0```.

	When the ```shipping``` instance field equals ```"Express"```, the method should return ```1.75```.

	Else the method should return ```.50```.

Example code can be found in the [BiggerOrder.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/BiggerOrder.java) file.

### Large Order

Shows how to use Switch Statement

1. Start with this order:

```
public class Order {
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public Order(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
    double shippingCost;
	 	// declare switch statement here
    
    
    return shippingCost;
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    Order book = new Order(true, 9.99, "Express");
    Order chemistrySet = new Order(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}

```

2. We’ll rewrite the ```calculateShipping()``` method so it uses a ```switch``` statement instead.

	There’s an uninitialized variable ```shippingCost``` in ```calculateShipping()```. Assign the correct value to ```shippingCost``` using a ```switch``` statement:

	We’ll check the value of the instance field ```shipping```.

	- When ```shipping``` matches ```"Regular"```, ```shippingCost``` should be ```0```.
	- When ```shipping``` matches ```"Express"```, ```shippingCost``` should be ```1.75```.
	- The default should assign ```.50``` to ```shippingCost```.
	
	**Make sure the method returns ```shippingCost``` after the ```switch``` statement.**

Example code can be found in the [LargeOrder.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/LargeOrder.java) file.