# Data and Expressions

This chapter explores some of the basic types of data used in a Java program and the use of expressions to perform calculations. It discusses the conversion of data from one type to another and how to read input interactively from the user running a program. This chapter also begins the Graphics Track for the book, in which we
introduce the concepts of graphical programming, explore the relationship between Java and the Web, and delve into Java’s abilities to manipulate color and draw shapes.

### escape sequences

![image](https://user-images.githubusercontent.com/19383145/145279467-49aad3e2-b8eb-4455-9d5c-62580eff5bc3.png)

### The Java numeric primitive types

![image](https://user-images.githubusercontent.com/19383145/145281862-2d996274-960b-4841-bede-81ec829a21a3.png)

### Precedence among some of the Java operators

![image](https://user-images.githubusercontent.com/19383145/145282105-dcc71c0e-7986-4353-92e4-4084d16650c4.png)

### Java widening conversions

![image](https://user-images.githubusercontent.com/19383145/145308271-40fdad13-9fa8-451e-9462-83e95661daf4.png)

- Widening conversions are the safest because they usually do not lose information. They are called widening conversions because they go from one data type to another type that uses an equal or greater amount of space to store the value.
- All widening conversions that go from an integer type to another integer type, or from a floating point type to another floating point type, preserve the numeric value exactly
- Although widening conversions do not lose any information about the magnitude of a value, the widening conversions that result in a floating point value can lose precision.
-  When converting from an int or a long to a float , or from a long to a double , some of the least significant digits may be lost.

### Java narrowing conversions 

![image](https://user-images.githubusercontent.com/19383145/145308814-b64699b9-79bd-40a2-8c8e-cfeace9697bf.png)
- Narrowing conversions are more likely to lose information than widening conversions are.
- They often go from one type to a type that uses less space to store a value, and therefore some of the information may be compromised.
- Narrowing conversions can lose both numeric magnitude and precision. Therefore, in general, they should be avoided. 

### some methods for scanner class

![image](https://user-images.githubusercontent.com/19383145/145293239-70c70f56-4445-43c0-98b2-e42c17c97f16.png)

### Predefined colors in the Color class 

![image](https://user-images.githubusercontent.com/19383145/145308034-505865ba-5651-4222-ac15-a301fe0ae1a4.png)

### A traditional coordinate system and the Java coordinate system

![image](https://user-images.githubusercontent.com/19383145/145309391-3ac9b9ca-64e6-4a33-957b-3e6e2ea0f1a4.png)

### Increment and Decrement Operators
- The increment and decrement operators can be applied after the variable (such as ```count++``` or ```count--``` ), creating what is called the postfix form of the operator. 
- They can also be applied before the variable (such as ```++count``` or ```--count```), in what is called the prefix form. 
- When used alone in a statement, the prefix and postfix forms are functionally equivalent. That is, it doesn’t matter if you write ```count++``` or ```++count```.
- When the increment or decrement operator is used in a larger expression, it can yield different results depending on the form used.
  - For example, if the variable count currently contains the value 15, the following statement assigns the value 15 to total and the value 16 to count:  ```total = count++;```
  - the following statement assigns the value 16 to both total and count: ```total = ++count;```
