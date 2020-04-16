# Introduction to Java

## A simple repository that teaches the basics of Java

This project is my coding journal. I am learning C++ from scratch and sharing my lessons with you. Hopefully, this will be a great tutorial.

## Table of Contents
- [Introduction to Java](#Introduction-to-Java)
- [Hello World](#Hello-World)
- [Basic Programs](#Basic-Programs)

### Introduction to Java

Programming languages enable humans to write instructions that a computer can perform. With precise instructions, computers coordinate applications and systems that run the modern world.

[Sun Microsystems](https://en.wikipedia.org/wiki/Sun_Microsystems) released the Java programming language in 1995. Java is known for being simple, portable, secure, and robust. Though it was released over twenty years ago, Java remains one of the most popular programming languages today.

One reason people love Java is the Java Virtual Machine, which ensures the same Java code can be run on different operating systems and platforms. Sun Microsystems’ slogan for Java was “write once, run everywhere”.

![alt text](https://github.com/keldavis/Java-Practice/blob/master/Foundations/Introduction/Java%2BModule%2B1-%2BLesson%2B1-JVM%2B-ART%2B408.png)

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

# Basic Programs

## Hello World

A basic program that prints the famous phrase, "Hello World."

1. Open the [HelloWorld.java](https://github.com/keldavis/Java-Practice/blob/master/Foundations/Introduction/HelloWorld.java) file.

2. Run the code in a text editor see what is printed to the screen.