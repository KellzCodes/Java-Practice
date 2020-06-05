# ArrayLists

- [Creating ArrayLists](#Creating-ArrayLists)
- [Adding an Item](#Adding-an-Item)
- [ArrayList Size](#ArrayList-Size)
- [Accessing an Index](#Accessing-an-Index)
- [Changing a Value](#Changing-a-Value)
- [Removing an Item](#Removing-an-Item)
- [Getting an Item's Index](#Getting-an-Item's-Index)
- [Review](#Review)
- [Desert Island Playlist Project](#Desert-Island-Playlist-Project)

When we work with arrays in Java, we’ve been limited by the fact that once an array is created, it has a fixed size. We can’t add or remove elements.

But what if we needed to add to the book lists, newsfeeds, and other structures we were using arrays to represent?

To represent dynamic lists, we can use Java’s ```ArrayList```s. ```ArrayList```s allow us to:

- Store elements of the same type (just like arrays)
- Access elements by index (just like arrays)
- Add elements
- Remove elements

Remember how we had to import ```java.util.Arrays``` in order to use additional array methods? To use an ```ArrayList``` at all, we need to import them from Java’s ```util``` package as well:

```
import java.util.ArrayList;
```

Example code can be found in the [Intro to ArrayLists](https://github.com/keldavis/Java-Practice/tree/master/Foundations/6.%20ArrayLists/Intro%20to%20ArrayLists) folder

## Creating ArrayLists

To create an ```ArrayList```, we need to declare the type of objects it will hold, just as we do with arrays:

```
ArrayList<String> babyNames;
```

We use angle brackets ```<``` and ```>``` to declare the type of the ```ArrayList```. These symbols are used for *generics*. Generics are a Java construct that allows us to define classes and objects as parameters of an ```ArrayList```. For this reason, we can’t use primitive types in an ```ArrayList```:

```
// This code won't compile:
ArrayList<int> ages;

// This code will compile:
ArrayList<Integer> ages;
```

The ```<Integer>``` generic has to be used in an ```ArrayList``` instead. You can also use ```<Double>``` and ```<Char>``` for types you would normally declare as ```double```s or ```char```s.

We can initialize to an empty ```ArrayList``` using the ```new``` keyword:

```
// Declaring:
ArrayList<Integer> ages;
// Initializing:
ages = new ArrayList<Integer>();

// Declaring and initializing in one line:
ArrayList<String> babyNames = new ArrayList<String>();
```

Example code can be found in the [Creating ArrayLists](https://github.com/keldavis/Java-Practice/tree/master/Foundations/5.%20Arrays%20and%20ArrayLists/Creating%20ArrayLists) folder.

## Adding an Item

Now we have an empty ```ArrayList```, but how do we get it to store values?

```ArrayList``` comes with an ```add()``` method that takes an argument to add to the end of the ```ArrayList```:

```
ArrayList<Integer> sudokuRow1 = new ArrayList<Integer>();

sudokuRow1.add(4);
// sudokuRow1 now holds [4]
sudokuRow1.add(8);
// sudokuRow1 now holds [4, 8]
sudokuRow1.add(3);
// sudokuRow1 now holds [4, 8, 3]
```

Example code can be found in the [Adding an Item](https://github.com/keldavis/Java-Practice/tree/master/Foundations/6.%20ArrayLists/Adding%20an%20Item) folder.

## ArrayList Size

Let’s say we have an ```ArrayList``` that stores items in a user’s online shopping cart. As the user navigates through the site and adds items, their cart grows bigger and bigger.

If we wanted to display the number of items in the cart, we could find the size of it using the ```size()``` method:

```
ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
System.out.println(shoppingCart.size());
// 1 is printed
shoppingCart.add("Tweed Houndstooth Hat");
System.out.println(shoppingCart.size());
// 2 is printed
shoppingCart.add("Magnifying Glass");
System.out.println(shoppingCart.size());
// 3 is printed
```

In dynamic objects like ```ArrayList```s, it’s important to know how to access the amount of objects we have stored.

Example code can be found in the [ArrayList Size](https://github.com/keldavis/Java-Practice/tree/master/Foundations/6.%20ArrayLists/ArrayList%20Size) folder

## Accessing an Index

With arrays, we can use bracket notation to access a value at a particular index:

```
double[] ratings = {3.2, 2.5, 1.7};

System.out.println(ratings[1]);
```

This code prints ```2.5```, the value at index ```1``` of the array.

For ```ArrayList```s, bracket notation won’t work. Instead, we use the method ```get()``` to access an index:

```
ArrayList<String> shoppingCart = new ArrayList<shoppingCart>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

System.out.println(shoppingCart.get(2));
```

This code prints ```"Magnifying Glass"```, which is the value at index 2 of the ```ArrayList```.

Example code can be found in the [Accessing an Index](https://github.com/keldavis/Java-Practice/tree/master/Foundations/6.%20ArrayLists/Accessing%20an%20Index) folder.

## Changing a Value

When we were using arrays, we could rewrite entries by using bracket notation to reassign values:

```
String[] shoppingCart = {"Trench Coat", "Tweed Houndstooth Hat", "Magnifying Glass"};

shoppingCart[0] = "Tweed Cape";

// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
```

```ArrayList``` has a slightly different way of doing this, using the ```set()``` method:

```
ArrayList<String> shoppingCart = new ArrayList<shoppingCart>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.set(0, "Tweed Cape");

// shoppingCart now holds ["Tweed Cape", "Tweed Houndstooth Hat", "Magnifying Glass"]
```

Example code can be found in the [Changing a Value](https://github.com/keldavis/Java-Practice/tree/master/Foundations/6.%20ArrayLists/Changing%20a%20Value) folder.

## Removing an Item

What if we wanted to get rid of an entry altogether? For arrays, we would have to make a completely new array without the value.

Luckily, ```ArrayLists``` allow us to remove an item by specifying the index to remove:

```
ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.remove(1);
// shoppingCart now holds ["Trench Coat", "Magnifying Glass"]
We can also remove an item by specifying the value to remove:

ArrayList<String> shoppingCart = new ArrayList<String>();

shoppingCart.add("Trench Coat");
shoppingCart.add("Tweed Houndstooth Hat");
shoppingCart.add("Magnifying Glass");

shoppingCart.remove("Trench Coat");
// shoppingCart now holds ["Tweed Houndstooth Hat", "Magnifying Glass"]
```
Note: This command removes the FIRST instance of the value ```"Trench Coat"```.

Example code can be found in the [Removing an Item](https://github.com/keldavis/Java-Practice/tree/master/Foundations/6.%20ArrayLists/Removing%20an%20Item) folder

## Getting an Item's Index

What if we had a really large list and wanted to know the position of a certain element in it? For instance, what if we had an ```ArrayList``` ```detectives``` with the names of fictional detectives in chronological order, and we wanted to know what position ```"Fletcher"``` was.

```
// detectives holds ["Holmes", "Poirot", "Marple", "Spade", "Fletcher", "Conan", "Ramotswe"];
System.out.println(detectives.indexOf("Fletcher"));
```

This code would print ```4```, since ```"Fletcher"``` is at index ```4``` of the ```detectives``` ```ArrayList```.

Example code can be found in the [Getting an Item's Index](https://github.com/keldavis/Java-Practice/tree/master/Foundations/6.%20ArrayLists/Getting%20an%20Item's%20Index) folder

## Review

Nice work! You now know the basics of ```ArrayList```s including:

- Creating an ```ArrayList```.
- Adding a new ```ArrayList``` item using ```add()```.
- Accessing the size of an ```ArrayList``` using ```size()```.
- Finding an item by index using ```get()```.
- Changing the value of an ```ArrayList``` item using ```set()```.
- Removing an item with a specific value using ```remove()```.
- Retrieving the index of an item with a specific value using ```indexOf()```.

## Desert Island Playlist Project

You’re heading to a desert island, cut off from the world, for the next six months. Luckily, you can bring a playlist of your favorite music ♪♪

Also, this is a chance to put your hard-earned Java skills to the test. Your mission, should you choose to accept it:

Build **Playlist.java** with the best possible playlist of music using a Java ```ArrayList```. Choose wisely.

Project details can be found in the [Desert Island Playlist Project](https://github.com/keldavis/Java-Practice/tree/master/Foundations/6.%20ArrayLists/Desert%20Island%20Playlist%20Project) folder