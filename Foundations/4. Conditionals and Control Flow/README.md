# Conditionals and Control Flow
### Alter the control flow of your programs with conditional statements. Learn how “if-then-else” statements give you power over which portions of your code will run

- [If-Then Statement](#If-Then-Statement)
- [If-Then-Else](#If-Then-Else)
- [If-Then-Else-If](#If-Then-Else-If)
- [Switch Statement](#Switch-Statement)
- [Conditional-And: &&](#Conditional-AND)
- [Conditional-Or: ||](#Conditional-OR)
- [Logical NOT: !](#Logical-NOT)
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

### Conditional AND

Let’s return to our student enrollment program. We’ve added an additional requirement: not only must students have the prerequisite, but their tuition must be paid up as well. We have *two* conditions that must be ```true``` before we enroll the student.

Here’s one way we could write the code:

```
if (tuitionPaid) {
  if (hasPrerequisite) {
    // enroll student
  }
}
```

We’ve nested two ```if-then``` statements. This does the job but we can be more concise with the *AND* operator:

```
if (tuitionPaid && hasPrerequisite) {
  // enroll student
}
```

The AND operator, ```&&```, is used between two boolean values and evaluates to a single boolean value. If the values **on both sides** are ```true```, then the resulting value is ```true```, otherwise the resulting value is ```false```.

This code illustrates every combination:

```
true && true
// true
false && true
// false
true && false
// false
false && false
// false
```

### Conditional OR

The requirements of our enrollment program have changed again. Certain courses have prerequisites that are satisfied by multiple courses. As long as students have taken **at least one** prerequisite, they should be allowed to enroll.

Here’s one way we could write the code:

```
if (hasAlgebraPrerequisite) {
  // Enroll in course
}

if (hasGeometryPrerequisite) {
  // Enroll in course
}
```

We’re using two different ```if-then``` statements with the **same code block**. We can be more concise with the *OR* operator:

```
if (hasAlgebraPrerequisite || hasGeometryPrerequisite) {
  // Enroll in course
}
```

The OR operator, ```||```, is used between two boolean values and evaluates to a single boolean value. If **either of the two values** is ```true```, then the resulting value is ```true```, otherwise the resulting value is ```false```.

This code illustrates every combination:

```
true || true
// true
false || true
// true
true || false
// true
false || false
// false
```

### Logical NOT

The *unary* operator NOT, ```!```, works on a **single** value. This operator evaluates to the opposite boolean to which it’s applied:

```
!false
// true
!true
// false
```

NOT is useful for expressing our intent clearly in programs. For example, sometimes we need the opposite behavior of an ```if-then```: run a code block **only if** the condition is ```false```.

```
boolean hasPrerequisite = false;

if (hasPrerequisite) {
  // do nothing
} else {
  System.out.println("Must complete prerequisite course!");
}
```

This code does what we want but it’s strange to have a code block that does nothing!

The logical NOT operator cleans up our example:

```
boolean hasPrerequisite = false;

if (!hasPrerequisite) {
  System.out.println("Must complete prerequisite course!");
}
```

We can write a succinct conditional statement without an empty code block.

## Basic Programs

- [Order](#Order)
- [Big Order](#Big-Order)
- [Bigger Order](#Bigger-Order)
- [Large Order](#Large-Order)
- [Reservation](#Reservation)
- [Early Reservation](#Early-Reservation)
- [Late Reservation](#Late-Reservation)
- [Car Loan](#Car-Loan)

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

### Reservation

1. Start with this code:

```
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    /* 
       Write conditional
       ~~~~~~~~~~~~~~~~~
       if restaurantCapacity is greater
       or equal to guestCount
       AND
       the restaurant is open:
         print "Reservation confirmed"
         set isConfirmed to true
       else:
         print "Reservation denied"
         set isConfirmed to false
    */
  }
  
  public void informUser() {
    System.out.println("Please enjoy your meal!");
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}
```

2. Our ```Reservation``` class has the method ```confirmReservation()``` which validates if a restaurant can accomodate a given reservation.

	We need to build the conditional logic into ```confirmReservation()``` using two parameters:

	- ```restaurantCapacity```
	- ```isRestaurantOpen```
	
	Use an ```if-then-else``` statement:

	If ```restaurantCapacity``` is greater than or equal to ```guestCount``` **and** the restaurant is open, print ```"Reservation confirmed"``` and set ```isConfirmed``` to ```true```.

	```else``` print ```"Reservation denied"``` and set ```isConfirmed``` to ```false```.

Example code can be found in the [Reservation.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/Reservation.java) file.

### Early Reservation

Shows how to use Conditional OR operator

1. Start with this code:

```
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    // Write conditional statement below
    
    
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    System.out.println("Please enjoy your meal!");
  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}
```

2. Let’s write a message inside the ```Reservation()``` constructor that warns against bad input.

	Our restaurants can’t seat parties of more than ```8``` people, and we don’t want reservations for ```0``` or less because that would be silly.

	Inside ```Reservation()```, write a conditional that uses ```||```.

	If ```count``` is less than ```1``` **OR** greater than ```8``` we want to write the following message: ```Invalid reservation!```.

Example code can be found in the [EarlyReservation.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/EarlyReservation.java) file.

### Late Reservation

1. Start with this code:

```
public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;
  
  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
		restaurantCapacity = capacity;
		isRestaurantOpen = open;
  }  
  
  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
			isConfirmed = false;
    }
  }
  
  public void informUser() {
    // Write conditional here

  }
  
  public static void main(String[] args) {
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}
```

2. Let’s make ```informUser()``` more informative. If their reservation is not confirmed, they should know!

	Write an ```if-then-else``` statement and use ```!``` with ```isConfirmed``` as the condition.

	If their reservation is **not** confirmed, write ```Unable to confirm reservation, please contact restaurant.```

	Else write: ```Please enjoy your meal!```

Example code can be found in the [LateReservation.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/LateReservation.java) file

### Car Loan

Let’s combine a few of the concepts that you have learned so far: conditionals, Boolean expressions, and arithmethic expressions.

In this project, you will write a program that will calculate the *monthly* car payment a user should expect to make after taking out a car loan. The program will include the following:

- Car loan amount
- Interest rate of the loan
- Length of the loan (in years)
- Down payment

1. Create an ```int``` variable called ```carLoan``` and set it equal to ```10000```.

2. Next, create an ```int``` variable called ```loanLength``` and set it equal to ```3```. This will represent a loan length of 3 years.

3. Now create an ```int``` variable called ```interestRate``` and set it equal to ```5```. This will represent an interest rate of 5% on the loan.

4. Next, create an ```int``` variable called ```downPayment``` and set it equal ```2000```. This will represent the down payment provided by a user for this car purchase.

5. Let’s build in some requirements that would prevent a buyer from taking out an invalid car loan. Write an ```if``` statement that checks whether the loan length is less than or equal to zero ```or``` whether the interest rate is less than or equal to zero.

6. Next, inside of the ```if``` statement, print out a helpful error message to the user. For example, you can print out something like: ```Error! You must take out a valid car loan```.

7. What if the down payment is more than the price of the car? Add to the ```if``` statement and use ```else if``` to check whether the down payment is greater than or equal to the car loan.

8. Inside of the ```else if``` block, print out a helpful message to the user about the down payment and car loan amounts. For example, you can print out something like: ```The car can be paid in full.```

9. Finally, if none of the previous Boolean expressions evaluate to ```true```, calculate the monthly payment in an ```else``` block.

10. Inside of the ```else``` block, create an ```int``` variable called ```remainingBalance``` and set it equal to ```carLoan``` minus ```downPayment```.

11. Since we need the *monthly* payment, we must convert the loan length from years to months. On the next line, create an ```int``` variable called ```months``` and set it equal to ```loanLength``` times ```12```.

12. Create an ```int``` variable called ```monthlyBalance``` and set it equal to ```remainingBalance``` divided by ```months```. This represents the monthly payment *without* interest included.

13. The user needs to pay interest on the loan borrowed. Create an ```int``` variable called ```interest``` and set it equal to the monthly balance times the interest rate, divided all by 100.

14. Calculate the final monthly payment. Create an ```int``` variable called ```monthlyPayment``` and set it equal to the monthly balance plus the interest.

15. On the next line, print out the monthly payment. If you correctly completed this project, the console should print out ```233``` as the monthly payment.

16. Add comments near the top of the program that describe what the program does.

Example code can be found in the [CarLoan.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/4.%20Conditionals%20and%20Control%20Flow/CarLoan.java) file.
