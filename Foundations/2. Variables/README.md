# Variables

- [Ints](#Ints)
- [Doubles](#Doubles)
- [Booleans](#Booleans)
- [Char](#Char)
- [String](#String)
- [Naming](#Naming)
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