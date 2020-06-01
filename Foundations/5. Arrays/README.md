# Arrays

- [Creating Arrays](#Creating-Arrays)
- [Importing Arrays](#Importing-Arrays)
- [Get Element By Index](#Get-Element-By-Index)
- [Creating an Empty Array](#Creating-an-Empty-Array)
- [Length](#Length)
- [String[] args](#String-array-args)
- [Review Arrays](#Review-Arrays)

We have seen how to store single pieces of data in variables. What happens when we need to store a group of data? What if we have a list of students in a classroom? Or a ranking of the top 10 horses finishing a horse race?

If we were storing 5 lottery ticket numbers, for example, we could create a different variable for each value:

```
int firstNumber = 4;
int secondNumber = 8;
int thirdNumber = 15;
int fourthNumber = 16;
int fifthNumber = 23;
```

That is a lot of ungainly repeated code. What if we had a hundred lottery numbers? It is more clean and convenient to use a Java *array* to store the data as a list.

An array holds a fixed number of values of one type. Arrays hold ```double```s, ```int```s, ```boolean```s, or any other primitives. Arrays can also contain ```String```s, or any other objects!

Each index of an array corresponds with a different value. Here is a diagram of an array filled with integer values:

<img src="https://github.com/keldavis/Java-Practice/blob/master/Foundations/5.%20Arrays/array-introduction.png" alt="function" width="500"/>

Notice that the indexes start at 0! The element at index 0 is ```4```, while the element at index 1 is ```8```. This array has a length of 5, since it holds five elements, but the highest index of the array is 4.

Example code can be found in the [Intro to Arrays](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays/Intro%20to%20Arrays) folder

### Creating Arrays

Imagine that we’re using a program to keep track of the prices of different clothing items we want to buy. We would want a list of the prices and a list of the items they correspond to. To create an array, we first declare the type of data it holds:

```
double[] prices;
```

Then, we can explicitly initialize the array to contain the data we want to store:

```
 prices = {13.15, 15.87, 14.22, 16.66};
```

Just like with simple variables, we can declare and initialize in the same line:

```
double[] prices = {13.15, 15.87, 14.22, 16.66};
```

We can use arrays to hold ```String```s and other objects as well as primitives:

```
String[] clothingItems = {"Tank Top", "Beanie", "Funny Socks", "Corduroys"};
```

Example code can be found in the [Creating Arrays](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays/Creating%20Arrays) folder.

### Importing Arrays

When we printed out the array we created in the last exercise, we saw a memory address that did not help us understand what was contained in the array.

If we want to have a more descriptive printout of the array itself, we need a ```toString()``` method that is provided by the ```Arrays``` *package* in Java.

```
import java.util.Arrays;
```

We put this at the top of the file, before we even define the class!

When we import a package in Java, we are making all of the methods of that package available in our code.

The ```Arrays``` package has many useful methods, including ```Arrays.toString()```. When we pass an array into ```Arrays.toString()```, we can see the contents of the array printed out:

```
import java.util.Arrays;

public class Lottery(){

  public static void main(String[] args){
    int[] lotteryNumbers = {4, 8, 15, 16, 23, 42};
    String betterPrintout = Arrays.toString(lotteryNumbers);
    System.out.println(betterPrintout);
  }

}
```

This code will print:
	>[4, 8, 15, 16, 23, 42]

Example code can be found in the [Importing Arrays](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays/Importing%20Arrays) folder.

### Get Element By Index

Now that we have an array declared and initialized, we want to be able to get values out of it.

We use square brackets, ```[``` and ```]```, to access data at a certain index:

```
double[] prices = {13.1, 15.87, 14.22, 16.66};

System.out.println(prices[1]);
```

This command would print:
	> 15.87

Because ```15.87``` is the item at the ```1``` index of the array. Remember that arrays start at index ```0```!

Example code can be found in the [Get Element By Index](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays/Get%20Element%20By%20Index) folder.

### Creating an Empty Array

We can also create empty arrays and then fill the items one by one. Empty arrays have to be initialized with a fixed size:

```
String[] menuItems = new String[5];
```

Once you declare this size, it cannot be changed! This array will always be of size ```5```.

After declaring and initializing, we can set each index of the array to be a different item:

```
menuItems[0] = "Veggie hot dog";
menuItems[1] = "Potato salad";
menuItems[2] = "Cornbread";
menuItems[3] = "Roasted broccoli";
menuItems[4] = "Coffee ice cream";
```

This group of commands has the same effect as assigning the entire array at once:

```
String[] menuItems = {"Veggie hot dog", "Potato salad", "Cornbread", "Roasted broccoli", "Coffee ice cream"};
```

We can also change an item after it has been assigned! Let’s say this restaurant is changing its broccoli dish to a cauliflower one:

```
menuItems[3] = "Baked cauliflower";
```

Now, the array looks like:
	> ["Veggie hot dog", "Potato salad", "Cornbread", "Baked cauliflower", "Coffee ice cream"]

Example code can be found in the [Creating an Empty Array](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays/Creating%20an%20Empty%20Array) folder

### Array Length

What if we have an array storing all the usernames for our program, and we want to quickly see how many users we have? To get the length of an array, we can access the ```length``` field of the array object:

```
String[] menuItems = new String[5];
System.out.println(menuItems.length);
```

This command would print ```5```, since the ```menuItems``` array has 5 slots, even though they are all empty.

If we print out the length of the ```prices``` array:

```
double[] prices = {13.1, 15.87, 14.22, 16.66};

System.out.println(prices.length);
```

We would see ```4```, since there are four items in the ```prices``` array!

Example code can be found in the [Array Length](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays/Array%20Length) folder.

### String array args
### String[] args

When we write ```main()``` methods for our programs, we use the parameter ```String[] args```. Now that we know about array syntax, we can start to parse what this means.

A ```String[]``` is an array made up of ```String```s. Examples of ```String``` arrays:

```
String[] humans = {"Talesha", "Gareth", "Cassie", "Alex"};
String[] robots = {"R2D2", "Marvin", "Bender", "Ava"};
```

The ```args``` parameter is another example of a ```String``` array. In this case, the array ```args``` contains the arguments that we pass in from the terminal when we run the class file. (So far, ```args``` has been empty.)

So how can you pass arguments to ```main()```? Let’s say we have this class ```HelloYou```:

```
public class HelloYou {
  public static void main(String[] args) {
    System.out.println("Hello " + args[0]);  
  }
}
```

When we run the file ```HelloYou``` in the terminal with an argument of ```"Laura"```:
	> java HelloYou Laura

We get the output:
	> Hello Laura

The ```String[] args``` would be interpreted as an array with one element, ```"Laura"```.

When we use ```args[0]``` in the main method, we can access that element like we did in ```HelloYou```.

Example code can be found in the [String Array Args](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays/String%20Array%20Args) folder.

### Review Arrays

We have now seen how to store a list of values in arrays. We can use this knowledge to make organized programs with more complex variables.

Throughout the lesson, we have learned about:

- Creating arrays explicitly, using ```{``` and ```}```.
- Accessing an index of an array using ```[``` and ```]```.
- Creating empty arrays of a certain size, and filling the indices one by one.
- Getting the length of an array using ```length```.
- Using the argument array ```args``` that is passed into the ```main()``` method of a class.

Example code can be found in the [Review Arrays](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays/Review%20Arrays) folder