# Variables

- [Ints](#Ints)
- [Doubles](#Doubles)
- [Booleans](#Booleans)
- [Char](#Char)
- [String](#String)
- [Naming](#Naming)
- [Manipulating Variables](#Manipulating-Variables)
- [Basic Programs](#Basic-Programs)

Let’s say we need a program that connects a user with new jobs. We need the user’s name, their salary, and their employment status. All of these pieces of information are stored in our program.

We store information in *variables*, named locations in memory.

Naming a piece of information allows us to use that name later, accessing the information we stored.

Variables also give context and meaning to the data we’re storing. The value ```42``` could be someone’s age, a weight in pounds, or the number of orders placed. With a name, we **know** the value ```42``` is ```age```, ```weightInPounds```, or ```numOrdersPlaced```.

In Java, we specify the type of information we’re storing. *Primitive datatypes* are types of data built-in to the Java system.

We must *declare* a variable to reference it within our program. Declaring a variable requires that we specify the type and name:

```
// datatype variableName
int age;
double salaryRequirement;
boolean isEmployed;
```

The above variable types are ```int```, ```double```, and ```boolean```. 

The names of the variables are ```age```, ```salaryRequirement```, and ```isEmployed```.

These variables don’t have any associated value. To assign a value to a variable, we use the assignment operator ```=```:

```
age = 85;
```

It’s common to declare a variable and assign the value in one line!

For example, to assign ```2011``` to a variable named ```yearCodecademyWasFounded``` of type ```int```, we write:

```
int yearCodecademyWasFounded = 2011;
```

## Ints

The first type of data we will store is the whole number. Whole numbers are very common in programming. You often see them used to store ages, or maximum sizes, or the number of times some code has been run, among many other uses.

In Java, whole numbers are stored in the *int* primitive data type.

```int```s hold positive numbers, negative numbers, and zero. They do not store fractions or numbers with decimals in them.

The ```int``` data type allows values between -2,147,483,648 and 2,147,483,647, inclusive.

To declare a variable of type ```int```, we use the ```int``` keyword before the variable name:

```
// int variable declaration
int yearJavaWasCreated;
// assignment
yearJavaWasCreated = 1996;
// declaration and assignment
int numberOfPrimitiveTypes = 8;
```

## Doubles

Whole numbers don’t accomplish what we need for every program. What if we wanted to store the price of something? We need a decimal point. What if we wanted to store the world’s population? That number would be larger than the ```int``` type can hold.

The ```double``` primitive data type can help. ```double``` can hold decimals as well as very large and very small numbers. The maximum value is 1.797,693,134,862,315,7 E+308, which is approximately 17 followed by 307 zeros. The minimum value is 4.9 E-324, which is 324 decimal places!

To declare a variable of type ```double```, we use the ```double``` keyword in the declaration:

```
// doubles can have decimal places:
double price = 8.99;
// doubles can have values bigger than what an int could hold:
double gdp = 12237700000;
```

## Booleans

Often our programs face questions that can only be answered with yes or no.

Is the oven on? Is the light green? Did I eat breakfast?

These questions are answered with a *boolean*, a type that references one of two values: ```true``` or ```false```.

We declare boolean variables by using the keyword ```boolean``` before the variable name.

```
boolean javaIsACompiledLanguage = true;
boolean javaIsACupOfCoffee = false;
```

## Char

How do we answer questions like: What grade did you get on the test? What letter does your name start with?

The ```char``` data type can hold any character, like a letter, space, or punctuation mark.

It must be surrounded by single quotes, ```'```.

For example:

```
char grade = 'A';
char firstLetter = 'p';
char punctuation = '!';
```

## String

So far, we have learned primitive data types, which are the simplest types of data with no built-in behavior. Our programs will also use ```String```s, which are *objects*, instead of primitives. Objects have built-in behavior.

Strings hold sequences of characters. We’ve already seen instances of a String, for example when you printed out ```"Hello World"```.

Just like with a primitive, we declare the variable by specifying the type first:

```
String greeting = "Hello World";
```

## Static Checking

The Java programming language has *static* typing. Java programs will not compile if a variable is assigned a value of an incorrect type. This is a *bug*, specifically a type declaration bug.

Bugs are dangerous! They cause our code to crash, or produce incorrect results. Static typing helps because bugs are caught during programming rather than during execution of the code.

The program will not compile if the declared type of the variable does not match the type of the assigned value:

```
int greeting = "Hello World";
```

The String ```"Hello World"``` cannot be held in a variable of type ```int```.

For the example above, we see an error in the console at compilation:

```
error: incompatible types: String cannot be converted to int
    int greeting = "Hello World";
```

When bugs are not caught at compilation, they interrupt execution of the code by causing *runtime errors*. The program will crash.

Java’s static typing helps programmers avoid runtime errors, and thus have much safer code that is free from bugs.

## Naming

Let’s imagine we’re storing a user’s name for their profile. Which code example do you think is better?

```
String data = "Delilah";
```

or

```
String nameOfUser = "Delilah";
```

While both of these will compile, the second example is way more easy to understand. Readers of the code will know the purpose of the value: ```"Delilah"```.

Naming variables according to convention leads to clear, readable, and maintainable code. When someone else, or our future self, reads the code, there is no confusion about the purpose of a variable.

In Java, variable names are case-sensitive. ```myHeight``` is a different variable from ```myheight```. The length of a variable name is unlimited, but we should keep it concise while keeping the meaning clear.

A variable starts with a valid letter, or a ```$```, or a ```_```. No other symbols or numbers can begin a variable name. ```1stPlace``` and ```*Gazer``` are not valid variable names.

Variable names of only one word are spelled in all lowercase letters. Variable names of more than one word have the first letter lowercase while the beginning letter of each subsequent word is capitalized. This style of capitalization is called *camelCase*.

```
// good style
boolean isHuman;

// bad styles
// no capitalization for new word
boolean ishuman;
// first word should be lowercase
boolean IsHuman;
// underscores don't separate words
boolean is_human;
```

## Manipulating Variables

- [Addition and Subtraction](#Addition-and-Subtraction)
- [Multiplication and Division](#Multiplication-and-Division)
- [Modulo](#Modulo)
- [Greater Than and Less Than](#Greater-Than-and-Less-Than)
- [Equals and Not Equals](#Equals-and-Not-Equals)
- [Greater/Less Than or Equal To](#Greater-less-than-or-equal-to)
- [Equals](#Equals)
- [String Concatenation](#String-Concatenation)

Let’s say we are writing a program that represents a user’s bank account.

With variables, we know how to store a balance! We’d use a ```double```, the primitive type that can hold big decimal numbers.

But how would we deposit and withdraw from the account?

Java has built-in math operations that perform calculations on numeric values!

To deposit:

```
// declare initial balance
double balance = 20000.99;
// declare deposit amount
double depositAmount = 1000.00;
// store result of calculation in new variable
double updatedBalance = balance + depositAmount;
```

## Addition and Subtraction

In our bank account example from the last exercise, we used ```+``` to add!

```
double balance = 20000.99;
double depositAmount = 1000.0;
double updatedBalance = balance + depositAmount;
//updatedBalance now holds 21000.99
```

If we wanted to withdraw from the balance, we would use ```-```:

```
double withdrawAmount = 500;
double updatedBalance = balance - withdrawAmount;
//updatedBalance now holds 19500.99
```

Addition and subtraction work with ```int```s as well!

```
int numPicturesOfCats = 60 + 24;
```

If you had 60 pictures of cats on your phone, and you took 24 more, you could use the above line of code to store ```84``` in ```numPicturesOfCats```.

## Multiplication and Division

Let’s say that our employer is calculating our paycheck and depositing it to our bank account. We worked 40 hours last week, at a rate of 15.50 an hour. Java can calculate this with the multiplication operator ```*```:

```
double paycheckAmount = 40 * 15.50;
//paycheckAmount now holds 620.0
```

If we want to see how many hours our total balance represents, we use the division operator ```/```:

```
double balance = 20010.5;
double hourlyRate = 15.5;
double hoursWorked = balance / hourlyRate;
//hoursWorked now holds 1291.0
```

Division has different results with integers. The ```/``` operator does integer division, which means that any remainder is lost.

```
int evenlyDivided = 10 / 5;
//evenlyDivided holds 2, because 10 divided by 5 is 2
int unevenlyDivided = 10 / 4;
//unevenlyDivided holds 2, because 10 divided by 4 is 2.5
```

```evenlyDivided``` stores what you expect, but ```unevenlyDivided``` holds ```2``` because ```int```s cannot store decimals!

Java removes the 0.5 to fit the result into an ```int``` type!

## Modulo

If we baked 10 cookies and gave them out in batches of 3, how many would we have leftover after giving out all the full batches we could?

The modulo operator ```%```, gives us the **remainder** after two numbers are divided.

```
int cookiesBaked = 10;
int cookiesLeftover = 10 % 3;
//cookiesLeftover holds 1
```

You have 1 cookie left after giving out all the batches of 3 you could!

Modulo can be a tricky concept, so let’s try another example.

Imagine we need to know whether a number is even or odd. An even number is divisible by 2.

Modulo can help! Dividing an even number by 2 will have a **remainder** of 0. Dividing an odd number by 2 will have a **remainder** of 1.

```
7 % 2
// 1, odd!
8 % 2
// 0, even!
9 % 2
// 1, odd!
```

## Greater Than and Less Than

Now, we’re withdrawing money from our bank account program, and we want to see if we’re withdrawing less money than what we have available.

Java has *relational operators* for numeric datatypes that make ```boolean``` comparisons. These include less than (```<```) and greater than (```>```), which help us solve our withdrawal problem.

```
double balance = 20000.01;
double amountToWithdraw = 5000.01;
System.out.print(amountToWithdraw < balance);
//this will print true, since amountToWithdraw is less than balance
```

You can save the result of a comparison as a ```boolean```.

```
double myBalance = 200.05;
double costOfBuyingNewLaptop = 1000.05;
boolean canBuyLaptop = myBalance > costOfBuyingNewLaptop;
//canBuyLaptop is false, since 200.05 is not more than 1000.05
```

## Equals and Not Equals

So how would we validate our paycheck to see if we got paid the right amount?

We can use another relational operator to do this. ```==``` will tell us if two variables are equal:

```
double paycheckAmount = 620;
double calculatedPaycheck = 15.50 * 40;
System.out.print(paycheckAmount == calculatedPaycheck);
//this will print true, since paycheckAmount equals calculatedPaycheck
```

Notice that the equality check is **two** equal signs, instead of one. One equal sign, ```=```, is how we assign values to variables! It’s easy to mix these up, so make sure to check your code for the right number of equal signs.

To check if two variables are **not** equal, we can use ```!=```:

```
double balance = 20000.0;
double amountToDeposit = 620;
double updatedBalance = balance + amountToDeposit;
boolean balanceHasChanged = balance != updatedBalance;
//depositWorked holds true, since balance does not equal updatedBalance
```

## Greater Less Than or Equal To

How could we make sure we got paid at least the amount we expected in our paycheck? We could use greater than or equal to, ```>=```, or less than or equal to, ```<=```!

```
double paycheckAmount = 620;
double calculatedPaycheck = 15.50 * 40;
System.out.println(paycheckAmount >= calculatedPaycheck);
//this will print true, since paycheckAmount equals calculatedPaycheck
```

## Equals

**.equals()**

So far, we’ve only been using operations on primitive types. It doesn’t make much sense to multiply ```String```s, or see if one ```String``` is less than the other. But what if we had two users logging into a site, and we wanted to see if their usernames were the same?

With objects, such as ```String```s, we can’t use the primitive equality operator. To test equality with ```String```s, we use a built-in method called ```.equals()```.

To use it, we call it on one ```String```, by using ```.```, and pass in the ```String``` to compare against in parentheses:

```
String person1 = "Paul";
String person2 = "John";
String person3 = "Paul";

System.out.println(person1.equals(person2));
//prints false, since "Paul" is not "John"

System.out.println(person1.equals(person3));
//prints true, since "Paul" is "Paul"
```

## String Concatenation

We have covered a lot of built-in functionality in Java throughout this lesson. We’ve seen ```+```, ```-```, ```<```, ```==```, and many other operators. Most of these only work on primitives, but some work on ```String```s too!

Let’s say we want to print out a variable, and we want to describe it as we print it out. For our bank account example, imagine we want to tell the user:

```
Your username is: <username>
```

With the value of the variable ```username``` displayed.

The ```+``` operator, which we used for adding numbers together, can be used to *concatenate* ```String```s. In other words, we can use it to join two ```String```s together!

```
String username = "PrinceNelson";
System.out.println("Your username is: " + username);
```

This code will print:

```
Your username is: PrinceNelson
```

We can even use a primitive datatype as the second variable to concatenate, and Java will intelligently make it a ```String``` first:

```
int balance = 10000;
String message = "Your balance is: " + balance;
System.out.println(message);
```

This code will print:

```
Your balance is: 10000
```

# Basic Programs
- [Creator](#Creator)
- [Count Comment](#Count-Comment)
- [Market Share](#Market-Share)
- [Booleans](#Booleans)
- [Char](#Char)
- [Song](#Song)
- [Mess](#Mess)
- [Bad Names](#Bad-Names)
- [My Profile](#My-Profile)
- [Mad Libs](#Mad-Libs)
- [Guessing Game](#Guessing-Game)
- [Plus and Minus](#Plus-and-Minus)
- [Mult and Divide](#Mult-and-Divide)
- [Modulo](#Modulo)
- [Greater Less Than](#Greater-Less-Than)
- [Equal Not Equal](#Equal-Not-Equal)
- [Greater Than Equal To](#Greater-Than-Equal-To)
- [Sing](#Sing)
- [Zoo](#Zoo)
- [Bank Account](#Bank-Account)
- [Magic](#Magic)

## Creator

Demonstrates the printing of variables

1. Start with this code:

```
public class Creator {
  public static void main(String[] args) {
    String name = "James Gosling";
    int yearCreated = 1995;
  }
}
```

2. Inside ```main()```, use ```System.out.println()``` to print out the variable ```name```.

3. Use the same command to print out ```yearCreated```.

Example code can be found in the [Creator.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Creator.java) file.

## Count Comment

Demonstrates use of ```int``` data type

1. Start with this code:


```
//This is the class declaration
public class CountComment {
  //This is the main method that runs when you compile
  public static void main(String[] args) {
    //This is where you will define your variable
    
    //This is where you will print your variable
    
  }
  
  //This is the end of the class
}

//This is outside the class
```

2. The file **CountComment.java** has a number of comments in it.

    In your head, count the number of comments. Then, inside the ```main()``` method, declare a variable called ```numComments``` that holds how many comments you counted.

3. Print out ```numComments```.

Example code can be found in the [CountComment.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/CountComment.java) file.

## Market Share

Demonstrates the use of the ```double``` data type

1. Start with this code:

```
public Class MarketShare{
  public static void main(String[] args){

  }
}
```

2. As of 2016, Android has 81.7 percent of the market share for mobile operating systems. Create a variable called ```androidShare``` that holds this percentage as a ```double```.

3. Print out ```androidShare``` to the console.

Example code can be found in the [MarketShare.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/MarketShare.java) file.

## Booleans

Demonstrates the use of the ```boolean``` data type

1. Start with this code:

```
public class Booleans{
  public static void main(String[] args){

  }
}
```

2. Create a variable called ```intsCanHoldDecimals```. Set it to ```true``` if the ```int``` type can hold a decimal number. Set it to ```false``` if the ```int``` type cannot do this.

3. Print out your ```intsCanHoldDecimals``` variable.

Example code can be found in the [Booleans.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Booleans.java) file. 

## Char

Demonstrates the use of the ```char``` data type

1. Start with this code:

```
public class Char {
  public static void main(String[] args) {   

  }
}
```

2. Create a variable called ```expectedGrade``` of type ```char```.

    Fill it with a single letter, representing the grade you think you would get in a graded Java course where the grades ```A```, ```B```, ```C```, ```D``` and ```F``` are possible.

3. Print out your ```expectedGrade``` variable!

Example code can be found in the [Char.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Char.java) file.

## Song

Demonstrates the use of the ```String``` data type

1. Start with this code:

```
public class Song {
  public static void main(String[] args) {   

  }
}
```

2. Create a variable called ```openingLyrics``` that holds ```"Yesterday, all my troubles seemed so far away"```.

3. Call ```System.out.println()``` to print out ```openingLyrics```.

Example code can be found in the [Song.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Song.java) file.

## Mess

Demonstrates static checking

1. Start with this code:

```
public class Mess {
  public static void main(String[] args) {   
    String year = 2001;
    double title = "Shrek";
    int genre = 'C';
    boolean runtime = 1.58;
    char isPG = true;
  }
}
```

2. In the Mess.java file, we have declared a bunch of variables with the wrong type. Try to compile the file using the command:

```
javac Mess.java
```

3. Change the types of the variables so that they correspond with the type of the assignment values.

    For example, ```year``` is assigned ```2001```, so it should be an ```int```.

4. Compile the file again. Look at how it compiles with no errors now!

Example code can be found in the [Mess.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Mess.java) file.

## Bad Names

Demonstrates proper variable names

1. Start with this code:

```
public class BadNames {
  public static void main(String[] args) {   
    String 1stName = "Samira";
    String blah = "Smith";
    String .com = "samira@google.com";
    int salaryexpectation = 100000;
    int year_of_birth = 1955;
    
    System.out.println("The program runs!");
  }
}
```

2. In the **BadNames.java** file, we declared variables with confusing names. Run the file and look at the error messages you get when trying to compile.

3. Some of these variable names are *illegal*! Change the ones that are preventing the file from compiling.

Example code can be found in the [BadNames.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/BadNames.java) file.

## My Profile

1. Start with this code:

```
public class MyProfile {
  public static void main(String[] args) {   

  }
}
```

2. The file **MyProfile.java** contains a class that represents your hiring profile as presented to potential employers.

    In the ```main()``` method, create a variable called ```name``` that holds your name, as a sequence of characters.

3. Create a variable called ```age``` that holds your age as a whole number.

4. Create a variable called ```desiredSalary``` that holds your desired salary per year to a precision of two decimal points.

5. Create a variable called ```gender``` that holds a single character, ```m``` (male), ```f``` (female), ```n``` (for none), or ```o``` (for other).

6. Create a variable called ```lookingForJob``` that holds whether or not you are currently open to job offers.

Example code can be found in the [MyProfile.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/MyProfile.java) file.

## Mad Libs

In this project, we’ll use Java to write a [Mad Libs](https://en.wikipedia.org/wiki/Mad_Libs) word game! Mad Libs have short stories with blank spaces that a player can fill in. The result is usually funny (or strange).

Mad Libs require:
- A short story with blank spaces (asking for different types of words).
- Words from the player to fill in those blanks.

“Roses are Red” poem example:

![alt text](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/madlibs.svg)

1. Start with this code:

```
public class MadLibs {
  /*
  Your description here
  */
    public static void main(String[] args){
      
      
      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
    }       
}

```

2. Let’s create a comment that describes the program!

The ```/*``` and ```*/``` are already in place for you. In between them, write a description that looks something like:

```
This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
```

3. Take a look at the variable named story. It is set equal to a string that will contain our story.

    All of these variables will need to be declared and initialized before the code will compile without errors.

4. The story is going to need a protagonist.

    Create a String called name1 that stores the name of the main character.

5. You will need to provide three [adjectives](https://en.wikipedia.org/wiki/Adjective).

    Create three Strings, ```adjective1```, ```adjective2```, and ```adjective3``` and store different adjectives in them.

6. You’ll also need to provide one [verb](https://en.wikipedia.org/wiki/Verb).

    Create a String called ```verb1``` and store a verb in it.

7. The story also needs six [nouns](https://en.wikipedia.org/wiki/Noun).

    Create six Strings, ```noun1```, ```noun2```, ```noun3```, ```noun4```, ```noun5```, and ```noun6``` and initialize them to your favorite nouns.

8. Our story needs another character. Declare a String variable called ```name2``` and initialize it to the value of another name.

9. Our story requires one number. Declare an ```int``` variable called number and set it to any whole number you like.

10. There’s one more variable! Declare a String called ```place1``` and store any place in it. This could be a city, or a town, or a country, or a planet!

11. Alright! It seems like we have all the variables we need. Save the file to see it run. Does it compile without errors?

12. Time to read the story! Use ```System.out.println()``` to print the story variable.

Example code can be found in the [MadLibs.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/MadLibs.java) file.

## Guessing Game

Introduces math operations

1. Start with this code:

```
public class GuessingGame {
  public static void main(String[] args) {   
    int mystery1 = 8 + 6;
    int mystery2 = 8 - 6;
  }
}
```

2. In the file **GuessingGame.java**, we have defined two integers ```mystery1``` and ```mystery2```.

    Use ```System.out.println()``` to print the variable that holds a value of ```2```.

Example code can be found in the [GuessingGame.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/GuessingGame.java) file.

## Plus and Minus

Demonstrates the use of plus and minus operators

1. Start with this code:

```
public class PlusAndMinus {
  public static void main(String[] args) {   
    int zebrasInZoo = 8;
    int giraffesInZoo = 4;
  }
}
```

2. Create an ```int``` variable called ```animalsInZoo``` that holds the amount of zebras plus the amount of giraffes at the zoo.

    Then, print your ```animalsInZoo``` variable.

3. Two of the zebras have been traded to a neighboring rival zoo. Subtract 2 from the number of zebras and store the result in a variable called ```numZebrasAfterTrade```.

    Then, print the ```numZebrasAfterTrade``` variable!

Example code can be found in the [PlusAndMinus.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/GuessingGame.java) file.

## Mult and Divide

Demonstrates the use of multiplication and division operators

1. Start with this code: 

```
public class MultAndDivide {
  public static void main(String[] args) {   
    double subtotal = 30;
    double tax = 0.0875;
  }
}
```

2. In ```main()```, there is a variable called ```subtotal```, which represents the subtotal of an amount to pay on a bill, and a variable called ```tax```, which represents the amount of tax added to the subtotal.

    Create a ```double``` variable, ```total```, that holds ```subtotal``` plus the product of ```subtotal``` and ```tax```.

    Print the ```total``` variable!

3. There were 4 people who bought this meal together and want to split the cost.

    Create a ```double``` variable called ```perPerson``` that holds ```total``` divided by 4.

    Print the ```perPerson``` variable!

Example code can be found in the [MultAndDivide.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/MultAndDivide.java) file.

## Modulo 

Demonstrates use of modulo operator

1. Start with this code:

```
public class Modulo {
  public static void main(String[] args) {   
    int students = 26;
  }
}
```

2. You are trying to split up students into groups of 3. How many students will be left out once the groups are made?

    Create a variable called ```leftOut``` that holds the modulo of ```students``` and 3. Then, print the variable!

Example code can be found in the [Modulo.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Modulo.java) file.

## Greater Less Than

Demonstrates use of greater than and less than operators

1. Start with this code:

```
public class GreaterLessThan {
  public static void main(String[] args) {   
    double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
  }
}
```

2. Print the expression that checks if the amount of credits you have earned, ```creditsEarned```, is greater than the number of credits you need to graduate, ```creditsToGraduate```.

3. Create a variable called ```creditsAfterSeminar``` that holds the amount of credits earned after taking a seminar, which is worth ```creditsOfSeminar``` credits. ```creditsAfterSeminar``` should be the sum of ```creditsEarned``` and ```creditsOfSeminar```.

    Print out whether ```creditsToGraduate``` is less than ```creditsAfterSeminar```.

Example code can be found in the [GreaterLessThan.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/GreaterLessThan.java) file.

## Equal Not Equal

Demonstrates the use of the equals and not equals operators

1. Start with this code:

```
public class EqualNotEqual {
  public static void main(String[] args) {   
    int songsA = 9;
    int songsB = 9;
    int albumLengthA = 41;
    int albumLengthB = 53;
  }
}
```

2. You have unearthed two unlabeled albums, record A and record B.

    To see if these are the same album, you’re going to compare the number of songs on each one, and the total length of the albums.

    First, create a variable called ```sameNumberOfSongs``` that stores whether the two albums have the same number of songs.

3. Now, create a variable called ```differentLength``` that stores the result of checking whether the two album lengths are **not** the same.

Example code can be found in the [EqualNotEqual.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/EqualNotEqual.java) file.

## Greater Than Equal To

Demonstrates greater than or equal to operator

1. Start with this code:

```
public class GreaterThanEqualTo {
    public static void main(String[] args){
      double recommendedWaterIntake = 8;
      double daysInChallenge = 30;
      double yourWaterIntake = 235.5;
    }       
}
```

2. You have been trying to complete a 30 day challenge to drink enough water per day.

    Create a ```double``` variable called ```totalRecommendedAmount``` and set it to the product of the recommended water intake (```recommendedWaterIntake```) and the amount of days in the challenge (```daysInChallenge```).

3. Create a ```boolean``` variable called ```isChallengeComplete``` and set it to the result of checking if your intake, ```yourWaterIntake```, is at least as much as the ```totalRecommendedAmount```.

    Then, print the ```isChallengeComplete``` variable.

Example code can be found in the [GreaterThanEqualTo.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/GreaterThanEqualTo.java) file.

## Sing

Demonstrates the use of ```.equals()```

1. Start with this code:

```
public class Sing {
    public static void main(String[] args){
      String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
      String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
      String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
    }       
}
```

2. We have three lines from a song in **Sing.java**.

    First, print out whether ```line1``` and ```line2``` are the same.

3. Now, print whether ```line2``` and ```line3``` are equal.

Example code can be found in the [Sing.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Sing.java) file.

## Zoo

Demonstrates string concatenation

1. Start with this code:

```
public class Zoo {
    public static void main(String[] args){
      int animals = 12;
      String species = "zebra";
    }       
}
```

2. In our zoo, we have a certain number of animals, stored in ```animals```, of a certain species, stored in ```species```.

    Use ```+``` to make a new ```String``` variable called ```zooDescription```. It should hold a String that looks like:

    ```
    Our zoo has <animals> <species>s!
    ```

    For example, if we had ```5``` animals that were all of the species ```Masai Giraffe```, the String would say:

    ```
    Our zoo has 5 Masai Giraffes!
    ```

3. Print out the variable ```zooDescription```!

Example code can be found in the [Zoo.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Zoo.java) file.

## Bank Account

Demonstrates how to manipulate variables

1. Start with this code:

```
public class BankAccount {
    public static void main(String[] args){
      double balance = 1000.75;
      double amountToWithdraw = 250;
    }       
}
```

2. To review, let’s try building some of the bank account functionality we talked about throughout the lesson.

    First, create a new ```double``` variable called ```updatedBalance```, and store ```balance``` with ```amountToWithdraw``` subtracted from it.

3. Now, you’ve decided to split your balance evenly 3 ways and give it to your three best friends.

    Create a ```double``` variable called ```amountForEachFriend``` that holds your updated balance divided by ```3```.

4. How much money did you give your friends, anyway?

    Use ```+``` and ```System.out.println()``` to print out:
```
    I gave each friend <amountForEachFriend>...
```
    with the value of ```amountForEachFriend``` where ```<amountForEachFriend>``` is.

Example code can be found in the [BankAccount.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/BankAccount.java) file.

## Magic

A small program that performs a mathematical magic trick

1. Start with this code:

```
public class Magic {
  public static void main(String[] args) {

    

  }
}
```

2. Create an int variable called ```myNumber```.

    Set it equal to any integer other than 0.

3. We will refer to ```myNumber``` as the original number from now on - it might be helpful to document this.

    Write a comment in the program that documents this.

4. Create an ```int``` variable called ```stepOne```.

    Set it equal to the original number (```myNumber```) multiplied by itself.

5. Create an ```int``` variable called ```stepTwo```.

    Set it equal to the previous result (```stepOne```) plus the original number (```myNumber```).

6. Create an ```int``` variable called ```stepThree```.

    Set it equal to the previous result (```stepTwo```) divided by the original number.

7. Create an ```int``` variable called ```stepFour```.

    Set it equal to the previous result (```stepThree```) plus ```17```.

8. Create an ```int``` variable called ```stepFive```.

    Set it equal to the previous result (```stepFour```) minus the original number.

9. Create an ```int``` variable called ```stepSix```.

    Set it equal to the previous result (```stepFive```) divided by ```6```.

10. Print out the value of the last step.

    Then, save and run your code!

    What number is printed to the console?

11. Now, go back to your code and change ```myNumber``` to any other integer. Run your program again.

    Is the output the same?

    It’s math magic!

Example code can be found in the [Magic.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/2.%20Variables/Magic.java) file.