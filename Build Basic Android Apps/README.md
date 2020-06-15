# Build Basic Android Apps with Java

## Why Android Development?

### Android Hardware

Hardware is the physical “hard” components of the phone, like the screen, battery, processor and motherboard, or even more obscure hardware devices like accelerometers, gyroscopes, proximity sensors, etc. The software is the intelligence that makes the phone run, manages all of the input/output, and runs the apps (in this case Android).

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Hardware.png" alt="android_hardware" width="300"/>

### Android Software

Software is the intelligence that operates the hardware, manages all of the input/output, and runs the apps. It’s the brain of the device.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Software.png" alt="android_software" width="300"/>

### Android Source Code Modification

Because the Android source code is modifiable by companies selling the phones, the actual user interface from device to device will vary as well. Depending on the brand of phone and when it was purchased the default UI may differ.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Source_Code_Modification.png" alt="Android_Source_Code_Modification" width="300"/>

### Android Software Development Kit

The Android Software Development Kit contains the libraries and tools you need to develop Android Apps.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Software_Development_kit.png" alt="Android_Software_Development_kit" width="300"/>

### Android Studio

Android Studio is an Integrated Development Environment (IDE) created by Google which is used to develop Android apps. Android Studio is a program specifically designed to make developing Android Apps easier, it helps to streamline development, and contains useful tools like a visual layout editor, a debugging suite, and a collection of device emulators to test your apps on. It also has the ability to load your app up on a real android device, and package your app for deployment to the Google Play Store.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Studio.png" alt="Android_Studio" width="300"/>

### How to Write Android Apps

Android apps are developed in one of two programming languages, either Java or Kotlin. Apps also utilize Extensible Markup Language (XML) which is used to describe data resources, build configuration files, and describe the UI of apps.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/How_to_Write_Android_Apps.png" alt="How_to_Write_Android_Apps" width="300"/>

### Android Virtual Devices

The Android emulator allows you to run your app on an Android Virtual Device (AVD), which behaves just like a physical Android device. You can set up numerous AVDs, each emulating a different type of device.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Virtual_Devices.png" alt="Android_Virtual_Devices" width="300"/>

### Integrated Development Environment

Android Studio is the official integrated development environment for Google’s Android operating system, built on JetBrains IntelliJ IDEA software and designed specifically for Android development. It is available for download on Windows, macOS and Linux based operating systems. It is a replacement for the Eclipse Android Development Tools as the primary IDE for native Android application development.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Integrated_Development_Environment.png" alt="Integrated_Development_Environment" width="300"/>

## Hello World

### Classes

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

### ```main()``` Method

In Java, every application must contain a ```main()``` method, which is the entry point for the application. All other methods are invoked from the ```main()``` method.

The signature of the method is ```public static void main(String[] args) { }```. It accepts a single argument: an array of elements of type ```String```.

```
public class Person {
  
  public static void main(String[] args) {
    
    System.out.println("Hello, world!");

  }
  
}
```

## Print Line

```System.out.println()``` can print to the console:

- ```System``` is a class from the core library provided by Java
- ```out``` is an object that controls the output
- ```println()``` is a method associated with that object that receives a single argument
```
System.out.println("Hello, world!");
// Output: Hello, world!
```

## Comments

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

### Whitespace

Whitespace, including spaces and newlines, between statements is ignored.

```
System.out.println("Example of a statement");

System.out.println("Another statement");

// Output:
// Example of a statement
// Another statement
```

### Compiling Java

In Java, when we compile a program, each individual class is converted into a **.class** file, which is known as byte code.

The JVM (Java virtual machine) is used to run the byte code.

```
# Compile the class file:
javac hello.java

# Execute the compiled file:
java hello
```

### Statements

In Java, a statement is a line of code that executes a task and is terminated with a ```;```.

```
System.out.println("Java Programming ☕️");
```

## Android Foundations

### Gradle Build Tool

Android applications can consist of hundreds or thousands of files worth of code, video, audio and images. These need to be packed in a way that can be understood by the Android device, which is where Gradle comes in. The Gradle tool in Android studio will package everything together in a compressed file called and APK, which can then be distributed and run on Android devices.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Gradle_Build_Tool.png" alt="Gradle_Build_Tool" width="300"/>

### Android Emulator

Android Studio also includes a suite of emulators which developers can use to test their apps. It comes pre-packaged with emulators for many of the most popular Android devices in the world.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Emulators.png" alt="Android_Emulators" width="300"/>

### Extensible Markup Langauge

XML stands for Extensible Markup Language and is a markup language (not a programming language). Essentially it’s a format for encoding data in a hierarchical (tree like) manner, and is intended to be readable by both humans and computers.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Extensible_Markup_Language.png" alt="Extensible_Markup_Language" width="300"/>

### XML Hierarchal Structure

An XML document is composed of a series of Elements that are organized in a hierarchical fashion through the use of Tags. A tag is a special syntax that indicates where an element should be placed in a document.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/XML_Hierarchal_Structure.png" alt="XML_Hierarchal_Structure" width="300"/>

### Container Tags

Container tags actually consist of two separate tags, a start tag, and an end tag. Each individual tag starts and ends with less than and greater than signs and has the name of the Element in the middle. End tags are differentiated with a forward slash at the beginning of the element name.

Container tags can have other tags nested inside of them, which results in a tree-like structure of elements nested inside one another.

```
<element1>
  <element2>
    
  </element2>
</element1>
```

### Single Tags

Single tags, unlike container tags are self closing, meaning we only have one tag. These look similar to start tags but have a forward slash after the Element name.

```
<element />
```

### Android Apps

Apps are the main way a user interacts with their android device, they are essentially programs that run on Android and are composed of one or more interactive screens.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Apps.png" alt="Android_Apps" width="300"/>

### Android System Apps

System apps are apps the system has recognized as the default apps to perform common tasks like email, texting, camera stuff, etc.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_System_Apps.png" alt="Android_System_Apps" width="300"/>

### Java API Framework

The Java API Framework is a set of software libraries and utilities essential for Android Development. This is the layer of the stack that developers will be interacting with and includes things like:

- UI components
- Resource management
- Lifecycle management

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Java_API_Framework.png" alt="Java_API_Framework" width="300"/>

### Android Runtime

Each application runs on its own instance of the Android runtime (ART). ART is a managed runtime that runs application code.

Think of an Android Runtime as an isolated container where each app lives and carries out its processes. It’s kind of like the house where each app lives.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Android_Runtime.png" alt="Android_Runtime" width="300"/>

### Hardware Abstraction Layer HAL

The hardware abstraction layer (HAL) consists of a number of library modules that manage access to the hardware of an Android device. This hardware includes the camera, audio, Bluetooth connectivity, and various internal sensors. Applications interact with HAL via the Java API framework.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Hardware_Abstraction_Level.png" alt="Hardware_Abstraction_Level" width="300"/>

### Linux Kernal

The Linux kernel sits at the base of the Android stack. It handles threading, low-level memory management, security, and drivers. Essentially it’s the core brain of the operation. Linux is an operating system that can be run on desktop computers as well as phones. It’s the most complicated and most highly developed part of the Android stack and is the main reason something like Android is able to exist.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Build%20Basic%20Android%20Apps/pics/Linux_Kernal.png" alt="Linux_Kernal" width="300"/>