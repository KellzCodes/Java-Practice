# Introduction to Java

## A simple repository that teaches the basics of Java

This project is my coding journal. I am learning Java from scratch and sharing my lessons with you. Hopefully, this will be a great tutorial.

## Table of Contents
- [Introduction to Java](#Introduction-to-Java)
- [Hello World](#Hello-World)
- [Comments](#Comments)
- [Semicolons and Whitespace](#Semicolons-and-Whitespace)
- [Compiling and Catching Errors](#Compiling-and-Catching-Errors)
- [Compiling and Creating Executables](#Compiling-and-Creating-Executables)
- [Basic Programs](#Basic-Programs)

### Introduction to Java

Programming languages enable humans to write instructions that a computer can perform. With precise instructions, computers coordinate applications and systems that run the modern world.

[Sun Microsystems](https://en.wikipedia.org/wiki/Sun_Microsystems) released the Java programming language in 1995. Java is known for being simple, portable, secure, and robust. Though it was released over twenty years ago, Java remains one of the most popular programming languages today.

One reason people love Java is the Java Virtual Machine, which ensures the same Java code can be run on different operating systems and platforms. Sun Microsystems’ slogan for Java was “write once, run everywhere”.

![alt text](https://github.com/keldavis/Java-Practice/blob/master/Foundations/1.%20Introduction/Java%2BModule%2B1-%2BLesson%2B1-JVM%2B-ART%2B408.png)

Programming languages are composed of *syntax*, the specific instructions which Java understands. We write syntax in files to create *programs*, which are executed by the computer to perform the desired task.

### Hello World

Java runs on different platforms, but programmers write it the same way. Let’s explore some rules for writing Java.

Java files have a **.java** extension. Some programs are one file, others are hundreds of files!

Inside **HelloWorld.java**, we have a class:

```
public class HelloWorld {

}
```

The ```HelloWorld``` concept is: Hello World Printer. Other class concepts could be: Bicycle, or: Savings Account.

We mark the domain of this concept using curly braces: ```{}```. Syntax inside the curly braces is part of the class.

Each file has one primary class named after the file. Our class name: ```HelloWorld``` and our file name: **HelloWorld**. Every word is capitalized.

Inside the class we have a ```main()``` method which lists our program tasks:

```
public static void main(String[] args) {

}
```

Like classes, we use curly braces to mark the beginning and end of a method.

```public```, ```static```, and ```void``` are syntax. ```String[] args``` is a placeholder for information we want to pass into our program. This syntax is necessary for the program to run.

Our program prints “Hello World” with the line:

```
System.out.println("Hello World");
```

```println``` is short for “print line”. We’ll use ```System.out.println()``` whenever we want a program to write a message to the screen.

### Comments

Writing code is an exciting process of instructing the computer to complete fantastic tasks.

Code is also read by people, and we want our intentions to be clear to humans just like we want our instructions to be clear to the computer.

Fortunately, we’re not limited to writing syntax that performs a task. We can also write *comments*, notes to human readers of our code. These comments are not executed, so there’s no need for valid syntax within a comment.

When comments are short we use the single-line syntax: ```//```.

```
// calculate customer satisfaction rating
```

When comments are long we use the multi-line syntax: ```/*``` and ```*/```.

```
/*
We chose to store information across multiple databases to
minimize the possibility of data loss. We'll need to be careful
to make sure it does not go out of sync!
*/
```

Here’s how a comment would look in a complete program:

```
public class CommentExample {
  // I'm a comment inside the class
  public static void main(String[] args) {
    // I'm a comment inside a method
    System.out.println("This program has comments!");
  }
}
```

Comments are different from printing to the screen, when we use ```System.out.println()```. These comments **won’t** show up in our terminal, they’re only for people who read our code in the text editor.

### Semicolons and Whitespace

As we saw with comments, reading code is just as important as writing code.

We should write code that is easy for other people to read. Those people can be co-workers, friends, or even yourself!

Java does not interpret *whitespace*, the areas of the code without syntax, but humans use whitespace to read code without difficulty.

Functionally, these two code samples are identical:

```
System.out.println("Java");System.out.println("Lava");System.out.println("Guava");
```

```
System.out.println("Java");

System.out.println("Lava");

System.out.println("Guava");
```

They will print the same text to the screen, but which would you prefer to read? Imagine if it was hundreds of instructions! Whitespace would be essential.

Java **does** interpret semicolons. Semicolons are used to mark the end of a *statement*, one line of code that performs a single task.

The only statements we’ve seen so far are ```System.out.println("My message!");```.

Let’s contrast statements with the curly brace, ```{}```. Curly braces mark the scope of our classes and methods. There are no semicolons at the end of a curly brace.

### Compiling and Catching Errors

Java is a *compiled* programming language, meaning the code we write in a **.java** file is transformed into *byte code* by a compiler before it is executed by the Java Virtual Machine on your computer.

A compiler is a program that translates human-friendly programming languages into other programming languages that computers can execute.

![Steps of Java Compilation](https://github.com/keldavis/Java-Practice/blob/master/Foundations/1.%20Introduction/Java%2BM1L1-%2BCompilation%2BProcess%2BART%2B409.png)

Some applications can automatically compile and run the files for you. It’s important to understand this aspect of Java development so we’ll do it ourselves.

The compiling process catches mistakes **before** the computer runs our code.

The Java compiler runs a series of checks while it transforms the code. Code that does not pass these checks will not be compiled.

For example, with a file called **Plankton.java**, we could compile it with the terminal command:

```
javac Plankton.java
```

A successful compilation produces a **.class** file: **Plankton.class**, that we execute with the terminal command:

```
java Plankton
```

An unsuccessful compilation produces a list of errors. No **.class** file is made until the errors are corrected and the compile command is run again.

### Compiling and Creating Executables

As a reminder, we can compile a **.java** file from the terminal with the command:

```
javac Whales.java
```

If the file compiles successfully, this command produces an *executable* class: **FileName.class**. Executable means we can run this program from the terminal.

We run the executable with the command:

```
java Whales
```

Note that we leave off the **.class** part of the filename.

Here’s a full compilation cycle as an example:

```
// within the file: Welcome.java
public class Welcome {
  public static void main(String[] args) {
    System.out.println("Welcome to my github repo!");
  }
}
```

We have one file: Welcome.java. We compile with the command:

```
javac Welcome.java
```

The terminal shows no errors, which indicates a successful compilation.

We now have two files:

1. **Welcome.java**, our original file with Java syntax.
2. **Welcome.class**, our compiled file with Java bytecode, ready to be executed by the Java Virtual Machine.

We can execute the compiled class with the command:

```
java Welcome
```

The following is printed to the screen:

```
Welcome to my github repo!
```

# Basic Programs

- [Hello World](#Hello-World)
- [Hello You](#Hello-You)
- [Timeline](#Timeline)
- [Language Facts](#Language-Facts)
- [Compiling](#Compiling)
- [Review](#Review)
- [Tree](#Tree)

## Hello World

A basic program that prints the famous phrase, "Hello World."

1. Open the [HelloWorld.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/1.%20Introduction/HelloWorld.java) file.

2. Run the code in a text editor see what is printed to the screen.

## Hello You

A basic program that prints your name

1. Start with this code:
```
public class HelloYou {
  public static void main(String[] args) {
    
  }
}
```

2. Inside ```main()```, add a statement which prints ```Hello someName!```, with **your** name replacing ```someName```. Make sure to end the statement with a semicolon.

	For example, if your name were “Maria,” the program would print ```Hello Maria!```.

Example code can be found in the [HelloYou.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/1.%20Introduction/HelloYou.java) file.

## Timeline

Demonstrates use of comments

1. Start with this code:

```
public class Timeline {
  public static void main(String[] args) {
    System.out.println("Hello Java!");
    
    System.out.println("You were born in 1995");

   // Sun Microsystems announced the release of Java in 1995
    
    System.out.println("You were created by James Gosling");
    
		James Gosling is a Canadian engineer who 
		created Java while working at Sun Microsystems. 
		His favorite number is the square root of 2!
    
    System.out.println("You are a fun language!");
  }
} 
```

2. The file **Timeline.java** has plain text information about Java.

	Plain text facts aren’t valid syntax. We’ll use comments to avoid breaking the program.

	Use the single-line comment syntax for the first fact.

	Change this line into a comment:

	```Sun Microsystems announced the release of Java in 1995```

3. Our program is still broken!

	Use the multi-line syntax to make these lines into a single comment:

```
    James Gosling is a Canadian engineer who created Java while
    working at Sun Microsystems. His favorite number is the
    square root of 2!
```

	You should still see ```You are a fun language!``` printed!

Example code for this program is found in the [Timeline.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/1.%20Introduction/Timeline.java) file.

## Language Facts

Demonstrates use of white space

1. Start with this code:

```
public class LanguageFacts {
  public static void main(String[] args) {
    // Press enter or return on your keyboard after each semicolon!
    
    System.out.println("Java is a class-based language.");System.out.println("Java classes have a 'main' method.");System.out.println("Java statements end with a semicolon.");
  }
}

```

2. The **LanguageFacts.java** file prints information about Java to the screen.

	Unfortunately, the writer of the file has avoided using whitespace.

	Make the file easier to read by adding a newline after each statement!

3. Inside ```main()```, add a new statement printing how you feel about coding.

	Start the message with: “Programming is… “.

	**Remember to place a semicolon at the end of the statement!**

Example code can be found in the [LanguageFacts.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/1.%20Introduction/LanguageFacts.java) file.

## Compiling

Demonstrates the use of the compiler

1. Start with this code:

```
public class Compiling {
  public static void main(String[] args) {
    
    System.out.println("Java is a class-based language.");
    System.out.println("Java classes have a 'main' method.");
    System.out.println("Java statements end with a semicolon.")

    System.out.println("Programming is... fun!");
    
  }
}

```

2. Let’s practice compiling and executing a file by entering commands in the terminal!

	Our code contains a broken program so we can see how compilers help us catch mistakes. **Don’t make any corrections!**

	In the terminal, type this command: ```javac Compiling.java``` and press ```enter``` or ```return```.

3. Do you see the error?

	The compiler is telling us one of the print statements is missing a semicolon.

	In the terminal, type ```ls``` and press ```return``` or ```enter```.

	```ls``` is short for "list" and this command lists all the available files.

	There is only one file: **Compiling.java**, we did not successfully compile the file because of the error.

4. Add the missing semicolon

5. Let’s compile and execute our program!

	Run the ```ls``` command in the terminal to see the uncompiled **.java** file.

6. Compile the file from the terminal!

7. Enter ls again to see the new **.class** file.

	Run the executable file from the terminal!

## Review

Demonstrates knowledge of Hello World lesson

1. Create a file named Review.java

2. Define a ```public``` class named ```Review```.

	Use opening and closing curly braces for the scope of the class.

	Remember, no semicolons for classes or methods!

3. This code produces an error because Java programs need a ```main()``` method.

	Define the ```main()``` method **within the curly braces** of the ```Review``` class.

4. Inside of the curly braces for the ```main()``` method, write ```The main method executes the tasks of the class``` as a single-line comment.

5. Below the comment, write a statement that prints the following: ```My first Java program from scratch!```.

Example code can be found in the [Review.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/1.%20Introduction/Review.java) file.

## Tree

Introduce yourself to users and plant a tree for them!

1. start with a blank Java file named **Tree.java**.

2. This code produces an error because our program needs a ```main()``` method.

    Define this method inside the curly braces of the ```Tree``` class.

3. Write a comment in ```main()``` that describes the task it will perform.

    We’re going to introduce ourselves and print a tree to the screen.

    You can use the single-line or multi-line syntax for your comment.

4. Below your comment, print a message introducing yourself to the user.

    Try something like “Hey there, I’m Ariel and I’m learning to code in Java!”

    When you run the code, you should see this message printed to the screen.

5. After introducing yourself, use another print statement to output the project goal!

    Something like “I’m going to plant a tree today!” or “Ready to get my hands dirty!”

6. See how the second statement begins on a new line? We’ll use multiple print statements to plant our tree.

    For example:

```
    System.out.println("  *  ");
    System.out.println(" *** ");
    System.out.println(" *** ");
    System.out.println("  *  ");
    System.out.println("  *  ");  
```

    will print a tree like this:

```
  *  
 *** 
 *** 
  *  
  *  
```

    Try it out!

7. Have fun and experiment with different trees.

    Here are a couple more examples:

```

   * ** * 
   ****** 
    ****  
     **   
     **   
  ~~~~~~~~~~
```

```
   ***** 
   ***** 
   ***** 
     *   
     *   
  #######
```


You can explore other printing methods in the [Java documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#out).

Example code can be found in the [Tree.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/1.%20Introduction/Tree.java) file.
