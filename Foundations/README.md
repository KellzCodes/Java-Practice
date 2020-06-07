# Foundations

## Basics of Java

Here is a quick run down of the lessons found in the foundations folder.

## Table of Contents

- [Introduction](#Introduction)
- [Variables](#Variables)
- [Object-Oriented Java](#Object-Oriented-Java)
- [Arrays and ArrayLists](#Arrays-and-ArrayLists)
- [Loops](#Loops)
- [String Methods](#String-Methods)
- [Inheritance and Polymorphism](#Inheritance-and-Polymorphism)
- [Key Concepts of Computer Science](#Key-Concepts-of-Computer-Science)
- [identifiers and reserved words](#identifiers-and-reserved-words)
- [Basic Computer Science Questions](#Basic-Comp-Sci-Questions)

## Introduction

### Hello World

#### Print Line

```System.out.println()``` can print to the console:
- ```System``` is a class from the core library provided by Java
- ```out``` is an object that controls the output
- ```println()``` is a method associated with that object that receives a single argument

```
System.out.println("Hello, world!");
// Output: Hello, world!
```

#### Comments

Comments are bits of text that are ignored by the compiler. They are used to increase the readability of a program.
- Single line comments are created by using ```//```.
- Multi-line comments are created by starting with ```/*``` and ending with ```*/```.

```
// I am a single line comment!

/*
And I am a 
multi-line comment!
*/
```

#### main() Method

In Java, every application must contain a ```main()``` method, which is the entry point for the application. All other methods are invoked from the ```main()``` method.

The signature of the method is ```public static void main(String[] args) { }```. It accepts a single argument: an array of elements of type ```String```.

```
public class Person {
  
  public static void main(String[] args) {
    
    System.out.println("Hello, world!");

  }
  
}
```

#### Classes

A *class* represents a single concept.

A Java program must have one class whose name is the same as the program filename.

In the example, the ```Person``` class must be declared in a program file named **Person.java**.

```
public class Person {
  
  public static void main(String[] args) {
    
    System.out.println("I am a person, not a computer.");
    
  }
  
}
```

#### Compiling Java

In Java, when we compile a program, each individual class is converted into a **.class file**, which is known as byte code.

The JVM (Java virtual machine) is used to run the byte code.

```
# Compile the class file:
javac hello.java

# Execute the compiled file:
java hello
```

#### Whitespace

Whitespace, including spaces and newlines, between statements is ignored.

```
System.out.println("Example of a statement");

System.out.println("Another statement");

// Output:
// Example of a statement
// Another statement
```

#### Statements

In Java, a statement is a line of code that executes a task and is terminated with a ```;```.

```
System.out.println("Java Programming ☕️");
```

## Variables

### ```boolean``` Data Type

In Java, the ```boolean``` primitive data type is used to store a value, which can be either ```true``` or ```false```.

```
boolean result = true;
boolean isMarried = false;
```

### Strings

A String in Java is a Object that holds multiple characters. It is not a primitive datatype.

A String can be created by placing characters between a pair of double quotes (```"```).

To compare Strings, the ```equals()``` method must be used instead of the primitive equality comparator ```==```.

```
// Creating a String variable
String name = "Bob";

// The following will print "false" because strings are case-sensitive
System.out.println(name.equals("bob"));
```

### ```int``` Data Type

In Java, the ```int``` datatype is used to store integer values. This means that it can store all positive and negative whole numbers and zero.

```
int num1 = 10;   // positive value
int num2 = -5;   // negative value
int num3 = 0;    // zero value
int num4 = 12.5; // not allowed
```

### ```char``` Data Type

In Java, ```char``` is used to store a single character. The character must be enclosed in single quotes.

```
char answer = 'y';
```

### Primitive Data Types

Java’s most basic data types are known as primitive data types and are in the system by default.

The available types are as follows:

- ```int```
- ```char```
- ```boolean```
- ```byte```
- ```long```
- ```short```
- ```double```
- ```float```

```null``` is another, but it can only ever store the value ```null```.

```
int age = 28; 

char grade = 'A';

boolean late = true;

byte b = 20;

long num1 = 1234567;

short no = 10;

float k = (float)12.5;

double pi = 3.14;
```

### Static Typing

In Java, the type of a variable is checked at compile time. This is known as *static typing*. It has the advantage of catching the errors at compile time rather than at execution time.

Variables must be declared with the appropriate data type or the program will not compile.

```
int i = 10;         // type is int
char ch = 'a';      // type is char

j = 20;             // won't compile, no type is given
char name = "Lil";  // won't compile, wrong data type
```

### Math Operations

Basic math operations can be applied to ```int```, ```double``` and ```float``` data types:
- ```+``` addition
- ```-``` subtraction
- ```*``` multiplication
- ```/``` division
- ```%``` modulo (yields the remainder)

These operations are not supported for other data types.

```
int a = 20;
int b = 10;

int result;

result = a + b;  // 30

result = a - b;  // 10

result = a * b;  // 200

result = a / b;  // 2

result = a % b;  // 0
```

### Comparison Operators

Comparison operators can be used to compare two values:

- ```>``` greater than
- ```<``` less than
- ```>=``` greater than or equal to
- ```<=``` less than or equal to
- ```==``` equal to
- ```!=``` not equal to

They are supported for primitive data types and the result of a comparison is a boolean value ```true``` or ```false```.

```
int a = 5;
int b = 3;

boolean result = a > b;
// result now holds the boolean value true
```

## Object Oriented Java

### Java objects’ state and behavior

In Java, instances of a class are known as objects. Every object has state and behavior in the form of instance fields and methods respectively.

```
public class Person {
  // state of an object
  int age;
  String name;
  
  // behavior of an object
  public void set_value() {
    age = 20;
    name = "Robin";
  }
  public void get_value() {
    System.out.println("Age is " + age);
    System.out.println("Name is " + name);
  }
  
  // main method
  public static void main(String [] args) {
    // creates a new Person object
    Person p = new Person(); 
    
    // changes state through behavior
    p.set_value();
  }
}
```

### Java instance

Java instances are objects that are based on classes. For example, ```Bob``` may be an instance of the class ```Person```.

Every instance has access to its own set of variables which are known as *instance fields*, which are variables declared within the scope of the instance. Values for instance fields are assigned within the constructor method.

```
public class Person {
  int age;
  String name;
  
  // Constructor method
  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }
  
  public static void main(String[] args) {
    Person Bob = new Person(31, "Bob");
    Person Alice = new Person(27, "Alice");
  }
}
```

### Java dot notation

In Java programming language, we use ```.``` to access the variables and methods of an object or a Class.

This is known as *dot notation* and the structure looks like this-

```instanceOrClassName.fieldOrMethodName```

```
public class Person {
  int age;
  
  public static void main(String [] args) {
    Person p = new Person();
    
    // here we use dot notation to set age
    p.age = 20; 
    
    // here we use dot notation to access age and print
    System.out.println("Age is " + p.age);
    // Output: Age is 20
  }
}
```

### Constructor Method in Java.

Java classes contain a *constructor* method which is used to create instances of the class.

The constructor is named after the class. If no constructor is defined, a default empty constructor is used.

```
public class Maths {
  public Maths() {
    System.out.println("I am constructor");
  }
  public static void main(String [] args) {
    System.out.println("I am main");
    Maths obj1 = new Maths();
  }
}
```

### Creating a new Class instance in Java

In Java, we use the ```new``` keyword followed by a call to the class constructor in order to create a new *instance* of a class.

The constructor can be used to provide initial values to instance fields.

```
public class Person {
  int age;
  
  public Person(int a) {
    age = a;
  }
  
  public static void main(String [] args) {
    // Here, we create a new instance of the Person class
    Person p = new Person(20);
    
    System.out.println("Age is " + p.age);
    // Output: Age is 20
  }
}
```

### The body of a Java method

In Java, we use curly brackets ```{}``` to enclose the body of a method.

The statements written inside the ```{}``` are executed when a method is called.

```
public class Maths {
  public static void sum(int a, int b) { // Start of sum
    int result = a + b;
    System.out.println("Sum is " + result);
  } // End of sum
  
  
  public static void main(String [] args) {
    // Here, we call the sum method
    sum(10, 20);
    // Output: Sum is 30
  }
}
```

### Method parameters in Java

In java, parameters are declared in a method definition. The parameters act as variables inside the method and hold the value that was passed in. They can be used inside a method for printing or calculation purposes.

In the example, a and b are two parameters which, when the method is called, hold the value 10 and 20 respectively.

```

public class Maths {
  public int sum(int a, int b) {
    int k = a + b;
    return k;
  }
  
  public static void main(String [] args) {
    Maths m = new Maths();
    int result = m.sum(10, 20);
    System.out.println("sum is " + result);
    // prints - sum is 30
  }
}
```

### Java Variables Inside a Method

Java variables defined inside a method cannot be used outside the scope of that method.

```
//For example, `i` and `j` variables are available in the `main` method only:

public class Maths {
  public static void main(String [] args) {
    int i, j;
    System.out.println("These two variables are available in main method only");
  }
}
```

### Returning info from a Java method

A Java method can return any value that can be saved in a variable. The value returned must match with the return type specified in the method signature.

The value is returned using the ```return``` keyword.

```
public class Maths { 
  
  // return type is int
  public int sum(int a, int b) {
    int k;
    k = a + b;
    
    // sum is returned using the return keyword
    return k;
  }
  
  public static void main(String [] args) {
    Maths m = new Maths();
    int result;
    result = m.sum(10, 20);
    System.out.println("Sum is " + result);
    // Output: Sum is 30
  }
}
```

### Java method signature

In Java, methods are defined with a *method signature*, which specifies the scope (private or public), return type, name of the method, and any parameters it receives.

```
// Here is a public method named sum whose return type is int and has two parameters a and b
public int sum(int a, int b) {
  return(a + b);
}
```

## Arrays and ArrayLists

### Arrays

In Java, an array is used to store a list of elements of the same datatype.

Arrays are fixed in size and their elements are ordered.

```
Arrays
In Java, an array is used to store a list of elements of the same datatype.

Arrays are fixed in size and their elements are ordered.
```

### Array creation in Java

In Java, an array can be created in the following ways:

- Using the ```{}``` notation, by adding each element all at once.
- Using the ```new``` keyword, and assigning each position of the array individually.

```
int[] age = {20, 21, 30};

int[] marks = new int[3];
marks[0] = 50; 
marks[1] = 70;
marks[2] = 93;
```

### Index

An index refers to an element’s position within an array.

The index of an array starts from 0 and goes up to one less than the total length of the array.

```
int[] marks = {50, 55, 60, 70, 80};

System.out.println(marks[0]);
// Output: 50

System.out.println(marks[4]);
// Output: 80
```

### Java ArrayList

In Java, an ```ArrayList``` is used to represent a dynamic list.

While Java arrays are fixed in size (the size cannot be modified), an ```ArrayList``` allows flexibility by being able to both add and remove elements.

```
// import the ArrayList package
import java.util.ArrayList;

// create an ArrayList called students
ArrayList<String> students = new ArrayList<String>();
```

### Modifying ArrayLists in Java

An ```ArrayList``` can easily be modified using built in methods.

To add elements to an ```ArrayList```, you use the ```add()``` method. The element that you want to add goes inside of the ```()```.

To remove elements from an ```ArrayList```, you use the ```remove()``` method. Inside the ```()``` you can specify the index of the element that you want to remove. Alternatively, you can specify directly the element that you want to remove.

```
import java.util.ArrayList;

public class Students {
  public static void main(String[] args) {
    
     // create an ArrayList called studentList, which initially holds []
    ArrayList<String> studentList = new ArrayList<String>();
    
    // add students to the ArrayList
    studentList.add("John");
    studentList.add("Lily");
    studentList.add("Samantha");
    studentList.add("Tony");
    
    // remove John from the ArrayList, then Lily
    studentList.remove(0);
    studentList.remove("Lily");
    
    // studentList now holds [Samantha, Tony]
    
    System.out.println(studentList);
  }
}
```

## Loops

### For-each statement in Java
In Java, the for-each statement allows you to directly loop through each item in an array or ```ArrayList``` and perform some action with each item.

When creating a for-each statement, you must include the ```for``` keyword and two expressions inside of parentheses, separated by a colon. These include:

1. The handle for an element we’re currently iterating over.

2. The source array or ArrayList we’re iterating over.

```
// array of numbers
int[] numbers = {1, 2, 3, 4, 5};

// for-each loop that prints each number in numbers
// int num is the handle while numbers is the source array
for (int num : numbers) {  
  System.out.println(num);
}
```

## String Methods

### length() String Method in Java

In Java, the ```length()``` string method returns the total number of characters – the length – of a ```String```.

```
String str = "Codecademy";  

System.out.println(str.length());
// prints 10
```

#### concat() String Method in Java

In Java, the ```concat()``` string method is used to append one ```String``` to the end of another ```String```. This method returns a ```String``` representing the text of the combined strings.

```
String s1 = "Hello";
String s2 = " World!";

String s3 = s1.concat(s2);
// concatenates strings s1 and s2

System.out.println(s3);
// prints "Hello World!"
```

### String Method equals() in Java

In Java, the ```equals()``` string method tests for equality between two ```String```s.

```equals()``` compares the contents of each ```String```. If all of the characters between the two match, the method returns ```true```. If any of the characters do not match, it returns ```false```.

Additionally, if you want to compare two strings without considering upper/lower cases, you can use ```.equalsIgnoreCase()```.

```
String s1 = "Hello";
String s2 = "World";

System.out.println(s1.equals("Hello"));
// prints true

System.out.println(s2.equals("Hello"));
// prints false 

System.out.println(s2.equalsIgnoreCase("world"));
// prints true 
```

### indexOf() String Method in Java

In Java, the ```indexOf()``` string method returns the first occurence of a character or a substring in a ```String```. The character/substring that you want to find the index of goes inside of the ```()```.

If ```indexOf()``` cannot find the character or substring, it will return -1.

```
String str = "Hello World!";

System.out.println(str.indexOf("l"));
// prints 2

System.out.println(str.indexOf("Wor"));
// prints 6

System.out.println(str.indexOf("z"));
// prints -1
```

### charAt() String Method in Java

In Java, the ```charAt()``` string method returns the character of a ```String``` at a specified index. The index value is passed inside of the ```()```, and should lie between 0 and ```length()-1```.

```
String str = "This is a string";

System.out.println(str.charAt(0));
// prints 'T'

System.out.println(str.charAt(15));
// prints 'g'
```

### toUpperCase() and toLowerCase() String Methods

In Java, we can easily convert a ```String``` to upper and lower case with the help of a few string methods:

- ```toUpperCase()``` returns the string value converted to uppercase.

- ```toLowerCase()``` returns the string value converted to lowercase.

```
String str = "Hello World!";

String uppercase = str.toUpperCase();
// uppercase = "HELLO WORLD!"

String lowercase = str.toLowerCase();
// lowercase = "hello world!"
```

## Inheritance and Polymorphism

### Inheritance in Java

*Inheritance* is an important feature of object-oriented programming in Java. It allows for one class (child class) to inherit the fields and methods of another class (parent class). For instance, we might want a child class ```Dog``` to inherent traits from a more general parent class ```Animal```.

When defining a child class in Java, we use the keyword ```extends``` to inherit from a parent class.

```
// Parent Class
class Animal {
  
  // Animal class members

}

// Child Class
class Dog extends Animal {
  
  // Dog inherits traits from Animal 
  
  // additional Dog class members

}
```

### Main() method in Java

In simple Java programs, you may work with just one class and one file. However, as your programs become more complex you will work with multiple classes, each of which requires its own file. Only one of these files in the Java package requires a ```main()``` method, and this is the file that will be run in the package.

For example, say we have two files in our Java package for two different classes:

- ```Shape```, the parent class.
- ```Square```, the child class.

If the Java file containing our ```Shape``` class is the only one with a ```main()``` method, this is the file that will be run for our Java package.

```
// Shape.java file 
class Shape {
  public static void main(String[] args) {
    Square sq = new Square();
  }
}

// Square.java file 
class Square extends Shape {
  
}
```

### super() in Java

In Java, a child class inherits its parent’s fields and methods, meaning it also inherits the parent’s constructor. Sometimes we may want to modify the constructor, in which case we can use the ```super()``` method, which acts like the parent constructor inside the child class constructor.

Alternatively, we can also completely override a parent class constructor by writing a new constructor for the child class.

```
// Parent class
class Animal {
  String sound;
  
  Animal(String snd) {
    this.sound = snd;
  }
}

// Child class
class Dog extends Animal {
  
  // super() method can act like the parent constructor inside the child class constructor.
  Dog() {
    super("woof");
  }
  
  // alternatively, we can override the constructor completely by defining a new constructor.
  Dog() {
    this.sound = "woof";
  }
}
```

### Protected and Final keywords in Java

When creating classes in Java, sometimes we may want to control child class access to parent class members. We can use the ```protected``` and ```final``` keywords to do just that.

```protected``` keeps a parent class member accessible to its child classes, to files within its own package, and by subclasses of this class in another package.

Adding ```final``` before a parent class method’s access modifier makes it so that any child classes cannot modify that method - it is immutable.

```
class Student {

  protected double gpa;
  // any child class of Student can access gpa 
  
  
  final protected boolean isStudent() {
    
    return true;
    
  }
  // any child class of Student cannot modify isStudent()
}
```

### Polymorphism in Java

Java incorporates the object-oriented programming principle of *polymorphism*.

Polymorphism allows a child class to share the information and behavior of its parent class while also incorporating its own functionality. This allows for the benefits of simplified syntax and reduced cognitive overload for developers.

```
// Parent class
class Animal {
  public void greeting() {
    System.out.println("The animal greets you.");
  }
}

// Child class
class Cat extends Animal {
  public void greeting() {
    System.out.println("The cat meows.");
  }
}

class MainClass {
  public static void main(String[] args) {
    Animal animal1 = new Animal();  // Animal object
    Animal cat1 = new Cat();  // Cat object
    animal1.greeting(); // prints "The animal greets you."
    cat1.greeting(); // prints "The cat meows."
  }
}
```

## Method Overriding in Java

In Java, we can easily *override* parent class methods in a child class. Overriding a method is useful when we want our child class method to have the same name as a parent class method but behave a bit differently.

In order to override a parent class method in a child class, we need to make sure that the child class method has the following in common with its parent class method:

- Method name
- Return type
- Number and type of parameters

Additionally, we should include the ```@Override``` keyword above our child class method to indicate to the compiler that we want to override a method in the parent class.

```
// Parent class 
class Animal {
  public void eating() {
    System.out.println("The animal is eating.");
  }
}

// Child class 
class Dog extends Animal {
  // Dog's eating method overrides Animal's eating method
  @Override
  public void eating() {
    System.out.println("The dog is eating.");
  }
}
```

### Child Classes in Arrays and ArrayLists

In Java, polymorphism allows us to put instances of different classes that share a parent class together in an array or ```ArrayList```.

For example, if we have an ```Animal``` parent class with child classes ```Cat```, ```Dog```, and ```Pig``` we can set up an array with instances of each animal and then iterate through the list of animals to perform the same action on each.

```
// Animal parent class with child classes Cat, Dog, and Pig. 
Animal cat1, dog1, pig1;

cat1 = new Cat();
dog1 = new Dog();
pig1 = new Pig();

// Set up an array with instances of each animal
Animal[] animals = {cat1, dog1, pig1};

// Iterate through the list of animals and perform the same action with each
for (Animal animal : animals) {
  
  animal.sound();
  
}
```

## Key Concepts of Computer Science
- A computer system consists of hardware and software that work in concert to help us solve problems.
- The CPU reads the program instructions from main memory, executing them one at a time until the program ends.
- The operating system provides a user interface and manages computer resources.
- As far as the user is concerned, the interface is the program.
- Digital computers store information by breaking it into pieces and representing each piece as a number.
- Binary is used to store and move information in a computer because the devices that store and manipulate binary data are inexpensive and reliable.
- There are exactly 2N permutations of N bits. Therefore, N bits can represent up to 2N unique items.
- The core of a computer is made up of main memory, which stores programs and data, and the CPU, which executes program instructions one at a time.
- An address is a unique number associated with a memory location.
- Main memory is volatile, meaning the stored information is maintained only as long as electric power is supplied.
- The surface of a CD has both smooth areas and small pits. A pit represents a binary 1 and a smooth area represents a binary 0.
- A rewritable CD simulates the pits and smooth areas of a regular CD by using a coating that can be made amorphous or crystalline as needed.
- The fetch-decode-execute cycle forms the foundation of computer processing.
- A network consists of two or more computers connected together so that they can exchange information.
- Sharing a communication line creates delays, but it is cost effective and simplifies adding new computers to the network.
- A local-area network (LAN) is an effective way to share information and resources throughout an organization.
- The Internet is a wide-area network (WAN) that spans the globe.
- Every computer connected to the Internet has an IP address that uniquely identifies it.
- The World Wide Web is software that makes sharing information across a network easy for humans.
- A URL uniquely specifies documents and other information found on the Web for a browser to obtain and display.
- Comments do not affect a program’s processing; instead, they serve to facilitate human comprehension.
- Inline documentation should provide insight into your code. It should not be ambiguous or belabor the obvious.
- Java is case sensitive. The uppercase and lowercase versions of a letter are distinct
- Identifier names should be descriptive and readable.
- Appropriate use of white space makes a program easier to read and understand.
- You should adhere to a set of guidelines that establish the way you format and document your programs.
- All programs must be translated to a particular CPU’s machine language in order to be executed.
- High-level languages allow a programmer to ignore the underlying details of machine language.
- A Java compiler translates Java source code into Java bytecode, a lowlevel, architecture-neutral representation of the program.
- Many different development environments exist to help you create and modify Java programs.
- Syntax rules dictate the form of a program. Semantics dictate the meaning of the program statements.
- The programmer is responsible for the accuracy and reliability of a program.
- A Java program must be syntactically correct or the compiler will not produce bytecode.
- Object-oriented programming helps us solve problems, which is the purpose of writing a program.
- Program design involves breaking a solution down into manageable pieces.
- Each object has a state, defined by its attributes, and a set of behaviors, defined by its methods.
- A class is a blueprint of an object. Multiple objects can be created from one class definition.

### identifiers and reserved words 
 
 There are a variety of words used when writing programs that are called identifiers. The identifiers in the King program are class , King , public , static , void , main , String , args , System , out , and println . These fall into three categories:
 - words we create when writing a program (King and args)
 - words that another programmer chose (System, println, out, main, and String)
 - special words used for specific purposes in the language (static, void, class, public)

 We chose to name the program King, but could have used one of many other possibilities. For example, we could have called it TheQuote, Martin, or RightThing.

 The identifier args (short for arguments) is often used the way we used it in King, but we can use almost any other identifier instead.

 The identifiers System, String, out, and print ln were chosen by other programmers. These words aren't apart of the java language. They are apart of the Java standard library of predefined code, a set of classes and methods that someone has already written for us. 

Reserved words are identifiers that have a special meaning in a programmingn language and can only be used in predefined ways. A reserved word cannot be
used for any other purpose, such as naming a class or method. In the King program, the reserved words used are class, public, static, and void. 

Below is a list of all the Java reserved words in alphabetical order. The words marked with an asterisk have been reserved, but currently have no meaning in Java.

abstract
assert
boolean
break
byte
case
catch
char
class
const*
continue
default
do
double
else
enum
extends
false
final
finally
float
for
goto*
if
implements
import
instanceof
int
interface
long
native
new
null
package
private
protected
public
return
short
static
strictfp
super
switch
synchronized
this
throw
throws
transient
true
try
void
volatile
while

## Basic Comp Sci Questions

#### Computer Processing

1. What is hardware? What is software?
- The hardware of a computer system consists of its physical components such as a circuit board, monitor, or keyboard. Computer software consists of the programs that are executed by the hardware and the data that those programs use. Hardware is tangible, whereas software is intangible. In order to be useful, hardware requires software and software requires hardware.

2. What are the two primary functions of an operating system?
- The operating system provides a user interface and efficiently coordinates the use of resources such as main memory and the CPU.

3. The music on a CD is created using a sampling rate of 44,000 measurements per second. Each measurement is stored as a number that represents a specific voltage level. How many such numbers are used to store a three-minute long song? How many such numbers does it take to represent one hour of music?
- It takes 7,200,000 numbers for a three-minute song (40,000 3 60 3 3) and 144,000,000 numbers for one hour of music (40,000 3 60 3 60).

4. What happens to information when it is stored digitally?
- The information is broken into pieces, and those pieces are represented as numbers.

5. How many unique items can be represented with the following?
a. 2 bits
b. 4 bits
c. 5 bits
d. 7 bits
- In general, N bits can represent 2N unique items. Therefore:
a. 2 bits can represent 4 items because 22 5 4.
b. 4 bits can represent 16 items because 24 5 16.
c. 5 bits can represent 32 items because 25 5 32.
d. 7 bits can represent 128 items because 27 5 128

6. Suppose you want to represent each of the 50 states of the United States using a unique permutation of bits. How many bits would be needed to store each state representation? Why?
- It would take 6 bits to represent each of the 50 states. Five bits is not enough because 2^5 = 32 but six bits would be enough because 2^6 = 64.

#### Hardware Components

7. How many bytes are in each of the following?
a. 3 KB
b. 2 MB
c. 4 GB
- A kilobyte (KB) is 2^10 = 1,024 bytes, a megabyte (MB) is 2^20 = 1,048,576 bytes, and a gigabyte (GB) is 2^30 = 1,073,741,824 bytes. Therefore: 
a. 3 KB 5 3 * 1,024 bytes 5 3,072 bytes = approximately 3 thousand bytes
b. 2 MB 5 2 * 1,048,576 bytes 5 2,097,152 bytes = approximately 2.1 million bytes
c. 4 GB 5 4 * 1,073,741,824 bytes 5 4,294,967,296 bytes = approximately 4.3 billion bytes

8. How many bits are there in each of the following?
a. 8 bytes
b. 2 KB
c. 4 MB
- There are eight bits in a byte. Therefore:
a. 8 bytes = 8 * 8 bits = 64 bits
b. 2 KB = 2 * 1,024 bytes = 2,048 bytes = 2,048 * 8 bits = 16,384
bits
c. 4 MB = 4 * 1,048,576 bytes = 4,194,304 bytes = 4,194,304 * 8
bits = 33,554,432 bits

9. The music on a CD is created using a sampling rate of 44,000 measurements per second. Each measurement is stored as a number that represents a specific voltage level. Suppose each of these numbers requires two bytes of storage space. How many MB does it take to represent one hour of music?
- Under the stated conditions, one hour of music would require 288,000,000 bytes (40,000 3 60 3 60 3 2). Dividing this number by the number of bytes in a megabyte (1,048,576 bytes) gives approximately 275 MB. Note that a typical audio CD has a capacity of about 650 MB and can store about 70 minutes of music. This coincides with an actual sampling rate of 41,000 measurements per second, two bytes of storage space per measurement, and the need to store two streams of music to produce a stereo effect.

10. What are the two primary hardware components in a computer? How do they interact?
- The two primary hardware components are main memory and the CPU. Main memory holds the currently active programs and data. The CPU retrieves individual program instructions from main memory, one at a time, and executes them.

11. What is a memory address?
- A memory address is a number that uniquely identifies a particular memory location in which a value is stored.

12. What does volatile mean? Which memory devices are volatile and which are nonvolatile?
- Main memory is volatile, which means the information that is stored in it will be lost if the power supply to the computer is turned off. Secondary memory devices are nonvolatile; therefore, the information that is stored on them is retained even if the power goes off.

13. Select the word from the following list that best matches each of the following phrases: 
controller, CPU, main, network card, peripheral, RAM, register, ROM, secondary 
a. Almost all devices in a computer system, other than the CPU and the main memory, are categorized as this.
b. A device that coordinates the activities of a peripheral device.
c. Allows information to be sent and received.
d. This type of memory is usually volatile.
e. This type of memory is usually nonvolatile.
f. This term basically is interchangeable with the term “main memory.”
g. Where the fundamental processing of a computer takes place.
- The word that best matches is
a. peripheral b. controller c. modem d. main or RAM e. secondary or ROM f. RAM g. CPU

#### networks

14. What is a file server?
- A file server is a network computer that is dedicated to storing and providing programs and data that are needed by many network users.

15. What is the total number of communication lines needed for a fully connected point-to-point network of five computers? Six computers?
- Counting the number of unique connections in Figure 1.16, there are 10 communication lines needed to fully connect a point-to-point network of five computers. Adding a sixth computer to the network will require that it be connected to the original five, bringing the total to 15 communication lines.

16. Describe a benefit of having computers on a network share a communication line. Describe a cost/drawback of sharing a communication line.
- Having computers on a network share a communication line is cost effective because it cuts down on the number of connections needed and it also makes it easier to add a new computer to the network. Sharing lines, however, can mean delays in communication if the network is busy.

17. What is the etymology of the word Internet?
- The word Internet comes from the word internetworking, a concept related to wide-area networks (WANs). An internetwork connects one network to another. The Internet is a WAN.

18. The TCP/IP set of protocols describes communication rules for software that uses the Internet. What does TCP stand for? What does IP stand for?
- TCP stands for Transmission Control Protocol. IP stands for Internet Protocol. A protocol is a set of rules that govern how two things communicate.

19. Explain the parts of the following URLs:
a. duke.csc.villanova.edu/jss/examples.html
b. java.sun.com/products/index.htm
- Breaking down the parts of each URL:
a. duke is the name of a computer within the csc subdomain (the Department of Computing Sciences) of the villanova.edu domain, which represents Villanova University. The edu top-level domain indicates that it is an educational organization. This URL is requesting a file called examples.html from within a subdirectory called jss.
b. java is the name of a computer (Web server) at the sun.com domain, which represents Sun Microsystems, Inc. The com top level domain indicates that it is a commercial business. This URL is requesting a file called index.html from within a subdirectory called products.

The Java Programming Language

20. When was the Java programming language developed? By whom? When was it introduced to the public?
- The Java programming language was developed in the early 1990s by James Gosling at Sun Microsystems. It was introduced to the public in 1995.

21. Where does processing begin in a Java application?
- The processing of a Java application begins with the main method.

22. What do you predict would be the result of the following line in a Java program? 
System.out.println("Hello"); // prints hello
- The characters “Hello” will be printed on the computer screen.

23. What do you predict would be the result of the following line in a Java program? 
// prints hello System.out.println("Hello");
- The entire line of code is a comment, so there is no result.

24. Which of the following are not valid Java identifiers? Why? 
a. RESULT
b. result
c. 12345
d. x12345y
e. black&white
f. answer_7
- All of the identifiers shown are valid except 12345 (since an identifier cannot begin with a digit) and black&white (since an identifier cannot contain the character &). The identifiers RESULT and result are both valid, but should not be used together in a program because they differ only by case. The underscore character (as in answer_7) is a valid part of an identifier.

25. Suppose a program requires an identifier to represent the sum of the test scores of a class of students. For each of the following names, state whether or not each is a good name to use for the identifier. 
Explain your answers.
a. x
b. scoreSum
c. sumOfTheTestScoresOfTheStudents
d. smTstScr
- Although any of the listed names could be used as the required identifier, the only “good” choice is scoreSum. The identifier x is not descriptive and is meaningless, the identifier sumOfTheTestScoresOfTheStudents is unnecessarily long, and the identifier smTstScr is unclear.

26. What is white space? How does it affect program execution? How does it affect program readability?
- White space is a term that refers to the spaces, tabs, and newline characters that separate words and symbols in a program. The compiler ignores extra white space; therefore, it doesn’t affect execution. However, it is crucial to use white space appropriately to make a program readable to humans.

Program development

27. We all know that computers are used to perform complex jobs. However, a computer’s instructions can do only simple tasks. Explain this apparent contradiction.
- At the lowest level, a computer’s instructions perform only simple tasks, such as copying a value or comparing two numbers. However, by putting together millions of these simple instructions every second, a computer can perform complex tasks.

28. What is the relationship between a high-level language and a machine language? 
- High-level languages allow a programmer to express a series of program instructions in English-like terms that are relatively easy to read and use. However, in order to execute, a program must be expressed in a particular computer’s machine language, which consists of a series of bits that are basically unreadable by humans. A high-level language program must be translated into machine language before it can be run.

29. What is Java bytecode? 
- Java bytecode is a low-level representation of a Java source code program. The Java compiler translates the source code into bytecode, which can then be executed using the Java interpreter. The bytecode might be transported across the Web before being executed by a Java interpreter that is part of a Web browser.

30. Select the word from the following list that best matches each of the
following phrases:
 assembly, compiler, high-level, IDE, interpreter, Java, low-level, machine
a. A program written in this type of language can run directly on a
computer. 
b. Generally, each language instruction in this type of language
corresponds to an equivalent machine language instruction.
c. Most programmers write their programs using this type of
language.
d. Java is an example of this type of language.
e. This type of program translates code in one language to code in
another language.
f. This type of program interweaves the translation of code and the
execution of the code.
- The word that best matches is
a. machine b. assembly c. high-level d. high-level
e. compiler f. interpreter

31. What do we mean by the syntax and semantics of a programming language?
- Syntax rules define how the symbols and words of a programming language can be put together. The semantics of a programming language instruction determine what will happen when that instruction is executed.

32. Categorize each of the following situations as a compile-time error,
run-time error, or logical error. 
a. Misspelling a Java reserved word.
b. Calculating the average of an empty list of numbers by dividing
the sum of the numbers on the list (which is zero) by the size of
the list (which is also zero).
c. Printing a student’s high test grade when the student’s average test
grade should have been output
- a. Compile-time error b. Run-time error (you cannot divide by
zero) c. Logical error

Object-Oriented Programming

33. List the five general steps required to solve a problem.
- 1. Understand the problem.
 2. Design a solution.
 3. Consider alternatives and refinements to the solution.
 4. Implement the solution.
 5. Test the solution.

 34. Why is it important to consider more than one approach to solving a problem? Why is it important to consider alternatives early in the process of solving a problem?
 - The first solution to a problem that we think of may not be a good one. By considering alternative solutions before expending too much energy implementing our first idea, we can often save overall time and effort.

 35. What are the primary concepts that support object-oriented programming?
 - The primary elements that support object-oriented programming are objects, classes, encapsulation, and inheritance. An object is defined by a class, which contains methods that define the operations on those objects (the services that they perform). Objects are encapsulated such that they store and manage their own data. Inheritance is a reuse technique in which one class can be derived from another.