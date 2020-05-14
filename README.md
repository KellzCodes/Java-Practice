# Java Practice - 100 Days of Code

- [Java Program Structure](#Java-Program-Structure)
- [What is an IDE?](#What-is-an-IDE)

# Java Program Structure
Java programs have a specific structure in how the code is written. There are key elements that all Java programs share.

## The Program

We have the text of a program inside the file called **HelloWorld.java**.

```
// This program outputs the message "Hello World!" to the monitor

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

This program writes ```Hello World!``` to your terminal when run.

### Case-Sensitivity

Java is a case-sensitive language. Case sensitivity means that *syntax*, the words our computer understands, must match the case. For example, the Java command for outputting text to the screen is ```System.out.println()```. If you were to type ```system.out.println()``` or ```System.Out.println()```, the compiler would not know that your intention was to use System or out.

Let’s go over this **HelloWorld.java** program line by line:

### Comments

```
// This program outputs the message "Hello World!" to the monitor
```

This is a single-line comment that documents the code. The compiler will ignore everything after ```//``` to the end of the line. Comments provide information outside the syntax of the language.

### Classes

```
public class HelloWorld { 
  // class code
}
```

This is the class of the file. All Java programs are made of at least one class. The class name must match the file: our file is **HelloWorld.java** and our class is ```HelloWorld```. We capitalize every word, a style known as *pascal case*. Java variables and methods are named in a similar style called *camel case* where every word after the first is capitalized.

The curly braces, ```{``` and ```}```, mark the *scope* of the class. Everything inside the curly braces is part of the class.

### Methods

```
  public static void main(String[] args) {
   // Statements
  }
```

Every Java program must have a method called ```main()```. A method is a sequence of tasks for the computer to execute. This ```main()``` method holds all of the instructions for our program.

### Statements

```
System.out.println("Hello World!");
```

This code uses the method ```println()``` to send the text “Hello World!” to the terminal as output. ```println()``` comes from an *object* called ```out```, which is responsible for various types of output. Objects are packages of state and behavior, and they’re often modeled on real-world things.

```out``` is located within ```System```, which is another object responsible for representing our computer within the program! We can access parts of an object with a ```.```, which is known as *dot notation*.

This line of code is a *statement*, because it performs a **single** task. Statements always conclude with a semicolon.

### Whitespace

Java programs allow judicious use of whitespace (tabs, spaces, newlines) to create code that is easier to read. The compiler ignores whitespace, but humans need it! Use whitespace to indent and separate lines of code. Whitespace increases the readability of your code.

# What is an IDE

An IDE, or Integrated Development Environment, enables programmers to consolidate the different aspects of writing a computer program.

IDEs increase programmer productivity by combining common activities of writing software into a single application: editing source code, building executables, and debugging.

## Editing Source Code

Writing code is an important part of programming. We start with a blank file, write a few lines of code, and a program is born! IDEs facilitate this process with features like syntax highlighting and autocomplete.

## Syntax Highlighting

An IDE that knows the syntax of your language can provide visual cues. Keywords, words that have special meaning like ```class``` in Java, are highlighted with different colors.

Compare these two code samples:

![alt text](https://github.com/keldavis/Java-Practice/blob/master/ide.jpg)

Syntax highlighting makes code easier to read by visually clarifying different elements of language syntax.

## Autocomplete

When the IDE knows your programming language, it can anticipate what you’re going to type next!

We’ve seen statements with ```System.out.println()``` quite a bit so far. In an IDE, we might see ```System``` as an autocomplete option after only typing ```Sy```. This saves keystrokes so the programmer can focus on logic in their code.

![alt text](https://github.com/keldavis/Java-Practice/blob/master/autocomplete_v2.gif)

## Building Executables

Java is a compiled language. Before programs run, the source code of a **.java** file must be transformed into an executable **.class** by the compiler. Once compiled, the program can be run from the terminal.

This compilation process is necessary for every program, so why not have the IDE do it for us? IDEs provide automated build processes for languages, so the act of compiling and executing code is abstracted away, like in Codecademy lessons.

## Debugging

No programmer avoids writing bugs and programs with errors.

When a program does not run correctly, IDEs provide debugging tools that allow programmers to examine different variables and inspect their code in a deliberate way.

IDEs also provide hints while coding to prevent errors **before** compilation.

![alt text](https://github.com/keldavis/Java-Practice/blob/master/debugging_v2.png)

## Coding On Your Computer

The biggest benefit to using an IDE is that it allows you to code and run Java programs on your own computer. I recommend [IntelliJ IDEA](https://www.jetbrains.com/idea/), which you can download for [macOS](https://www.jetbrains.com/idea/download/#section=mac), [Windows](https://www.jetbrains.com/idea/download/#section=windows), or [Linux](https://www.jetbrains.com/idea/download/#section=linux).

You should [download and install Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) to your computer before using an IDE.

Here are two videos that walk through how to set up an IDE and run Java code.
- [Mac](https://youtu.be/TjYTpEOiNAI)
- [Windows](https://youtu.be/6FmUcUMkZVQ)
