# Inheritance and Polymorphism

- [Intro to Inheritance](#Intro-to-Inheritance)
- [Inheriting the Constructor](#Inheriting-the-Constructor)
- [Parent Class Aspect Modifiers](#Parent-Class-Aspect-Modifiers)
- [Introducing Polymorphism](#Introducing-Polymorphism)
- [Method Overriding](#Method-Overriding)
- [Using a Child Class as its Parent Class](#Using-a-Child-Class-as-its-Parent-Class)
- [Child Classes in Arrays and ArrayLists](#Child-Classes-in-Arrays-and-ArrayLists)
- [Review of Inheritance and Polymorphism](#Review-of-Inheritance-and-Polymorphism)
- [Language Families Project](Language-Families-Project)

When you hear the word “inheritance”, code may not be the first thing that springs to mind; you’re probably more likely to think of inheriting genetic traits, like eye color from your mother or a smile from your grandfather. But inheritance is also an important feature of object-oriented programming in Java.

Suppose we are building a ```Shape``` class in Java. We might give it some points in 2D, a method for calculating the area, and another method for displaying the shape. But what happens if we want a class for a triangle that has some triangle-specific methods? Do we need to redefine all of the same methods that we created for ```Shape```?

No! (Phew.) Lucky for us, a Java class can also *inherit* traits from another class. Because a ```Triangle``` is a ```Shape```, we can define ```Triangle``` so that it inherits fields and methods directly from ```Shape```. The object-oriented principle of inheritance saves us the headache of redefining the same class members all over again.

There are several terms you’ll encounter frequently:

- *Parent class*, *superclass*, and *base class* refer to the class that another class inherits from (like ```Shape```).
- *Child class*, *subclass*, and *derived class* refer to a class that inherits from another class (like ```Triangle```).

<img src="https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/inheritance.gif" alt="function" width="500"/>

## Intro to Inheritance

So how do we define a child class so that it inherits from a parent class? We use the keyword ```extends``` like this:

```
class Shape {

  // Shape class members

}

class Triangle extends Shape {

  // additional Triangle class members

}
```

Now ```Triangle``` has inherited traits from ```Shape```, meaning it copied over class members from ```Shape```.

Until now, we’ve only been working with one class and one file. However, most Java programs utilize multiple classes, each of which requires its own file. Only one file needs a ```main()``` method — this is the file we will run.

Note: the various classes in our Java package — even though they are in different files — will have access to each other, so we can instantiate one class inside of another.

Example code can be found in the [Intro to Inheritance](https://github.com/keldavis/Java-Practice/tree/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Intro%20to%20Inheritance) folder

## Inheriting the Constructor

Hang on, you might be thinking, if the child class inherits its parent’s fields and methods, does it also inherit the constructor? It does indeed, and sometimes this isn’t quite what we want.

Let’s say ```Shape``` has a ```numSides``` field that is set by passing an integer into the constructor. If we’re instantiating a ```Triangle```, we would want that number to always be ```3```, so we’d want to modify the constructor to automatically assign ```numSides``` with a value of ```3```.

Can we do that?

As it happens, Java has a trick up its sleeve for just this occasion: using the ```super()``` method which acts like the parent constructor inside the child class constructor:

```
class Triangle extends Shape {

  Triangle() {
    super(3);
  }

  // additional Triangle class members

}
```

By passing ```3``` to ```super()```, we are making it possible to instantiate a ```Triangle``` without passing in a value for ```numSides```.

Meanwhile, ```super()``` (behaving as ```Shape()```) will shoulder the responsibility of setting ```numSides``` to ```3``` for our ```Triangle``` object.

It is also possible to just completely override a parent class constructor by writing a new constructor for the child class:

```
class Triangle extends Shape {

  Triangle() {
    this.numSides = 3;
  }

  // additional Triangle class members

}
```

In the above example, ```numSides``` is just set to ```3``` without leveraging the parent class constructor.

Example code can be found in the [Inheriting the Constructor](https://github.com/keldavis/Java-Practice/tree/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Inheriting%20the%20Constructor) folder

## Parent Class Aspect Modifiers

You may recall that Java class members use ```private``` and ```public``` access modifiers to determine whether they can be accessed from outside the class. So does a child class inherit its parent’s ```private``` members?

Well, no. But there is another access modifier we can use to keep a parent class member accessible to its child classes and to files in the package it’s contained in — and otherwise private: ```protected```.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/access-modifiers-chart.png" alt="function" width="500"/>

Here’s what ```protected``` looks like in use:

```
class Shape {

  protected double perimeter;

}

// any child class of Shape can access perimeter
```

In addition to access modifiers, there’s another way to establish how child classes can interact with inherited parent class members: using the ```final``` keyword. If we add ```final``` before a parent class method’s access modifier, we disallow any child classes from changing that method. This is helpful in limiting bugs that might occur from modifying a particular method.

Example code can be found in the [Parent Class Aspect Modifiers](https://github.com/keldavis/Java-Practice/tree/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Parent%20Class%20Aspect%20Modifiers) folder

## Introducing Polymorphism

In Java, if ```Orange``` is a ```Fruit``` through inheritance, you can then use ```Orange``` in the same contexts as ```Fruit``` like this:

```
String makeJuice(Fruit fruit) {

  return "Apple juice and " + fruit.squeeze();

}

// inside main()
Orange orange = new Orange();
System.out.println(juicer.makeJuice(orange));
```

Wait, how does that work?

This is because Java incorporates the object-oriented programming principle of *polymorphism*. Polymorphism, which derives from Greek meaning “many forms”, allows a child class to share the information and behavior of its parent class while also incorporating its own functionality.

The main advantages of polymorphic programming:

- Simplifying syntax
- Reducing cognitive overload for developers

These benefits are particularly helpful when we want to develop our own Java packages for other developers to import and use.

For example, the built-in operator ```+``` can be used for both ```double```s and ```int```s. To the computer, the ```+``` means something like ```addDouble()``` for one and ```addInt()``` for the other, but the creators of Java (and of other languages) didn’t want to burden us as developers with recalling each individual method.

Note that the reverse situation is not true; you cannot use a generic parent class instance where a child class instance is required. So an ```Orange``` can be used as a ```Fruit```, but a ```Fruit``` cannot be used as an ```Orange```.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Foundations/9.%20Inheritance%20and%20Polymorphism/polymorphism.gif" alt="function" width="500"/>

## Method Overriding

One common use of polymorphism with Java classes is something we mentioned earlier — *overriding* parent class methods in a child class. Like the ```+``` operator, we can give a single method slightly different meanings for different classes. This is useful when we want our child class method to have the same name as a parent class method but behave a bit differently in some way.

Let’s say we have a ```BankAccount``` class that allows us to print the current balance. We want to build a ```CheckingAccount``` class that inherits the functionality of a ```BankAccount``` but with a modified ```printBalance()``` method. We can do the following:

```
class BankAccount {

  protected double balance;

  public void printBalance() {
    System.out.println("Your account balance is $" + balance);
  }

}

class CheckingAccount extends BankAccount {

  @Override
  public void printBalance() {
    System.out.println("Your checking account balance is $" + balance);
  }

}
```

Notice that in order to properly override ```printBalance()```, in ```CheckingAccount``` the method has the following in common with the corresponding method in ```BankAccount```:

- Method name
- Return type
- Number and type of parameters

You may have also noticed the ```@Override``` keyword above ```printBalance()``` in ```CheckingAccount```. This annotation informs the compiler that we want to override a method in the parent class. If the method doesn’t exist in the parent class, we’ll get a helpful error when we compile the program.

Example code can be found in the [Method Overriding](https://github.com/keldavis/Java-Practice/tree/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Method%20Overriding) folder

## Using a Child Class as its Parent Class

An important facet of polymorphism is the ability to use a child class object where an object of its parent class is expected.

One way to do this explicitly is to instantiate a child class object as a member of the parent class. We can instantiate a ```CheckingAcount``` object as a ```BankAccount``` like this:

```
BankAccount kaylasAccount = new CheckingAcount(600.00);
```

We can use ```kaylasAccount``` as if it were an instance of ```BankAccount```, in any situation where a ```BankAccount``` object would be expected. (This would be true even if ```kaylasAccount``` were instantiated as a ```CheckingAccount```, but using the explicit child as parent syntax is most helpful when we want to declare objects in bulk.)

It is important to note here that the compiler just considers ```kaylasAccount``` to be any old ```BankAccount```. But because method overriding is handled at runtime, if we call ```printBalance()```, we’ll see something ```CheckingAccount``` specific: ```Your checking account balance is $600.00```

This is because at runtime, ```kaylasAccount``` is recognized as the ```CheckingAccount``` it is. So, what if ```CheckingAccount``` has a method ```transferToSavings()``` that BankAccount does not have? Can ```kaylasAccount``` still use that method?

Well, no. The compiler believes that ```kaylasAccount``` is just a ```BankAccount``` that doesn’t have some fancy child class ```transferToSavings()``` method, so it would throw an error.

Example code can be found in the [Using a Child Class as its Parent Class](https://github.com/keldavis/Java-Practice/tree/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Using%20a%20Child%20Class%20as%20its%20Parent%20Class) folder

## Child Classes in Arrays and ArrayLists

Usually, when we create an array or an ```ArrayList```, the list items all need to be the same type. But polymorphism puts a new spin on what is considered the same type…

In fact, we can put instances of different classes that share a parent class together in an array or ```ArrayList```! For example, let’s say we have a ```Monster``` parent class with a few child classes: ```Vampire```, ```Werewolf```, and ```Zombie```. We can set up an array with instances of each:

```
Monster dracula, wolfman, zombie1;

dracula = new Vampire();
wolfman = new Werewolf();
zombie1 = new Zombie();

Monster[] monsters = {dracula, wolfman, zombie1};
```

We can even iterate through the list of items — regardless of subclass — and perform the same action with each item:

```
for (Monster monster : monsters) {

  monster.attack();

}
```

In the code above, we were able to call ```attack()``` on each monster in ```monsters``` despite the fact that, in the for-each loop, ```monster``` is declared as the parent class type ```Monster```.

Example code can be found in the [Child Classes in Arrays and ArrayLists](https://github.com/keldavis/Java-Practice/tree/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Child%20Classes%20in%20Arrays%20and%20ArrayLists) folder

## Review of Inheritance and Polymorphism

Excellent work! You’ve learned quite a bundle about inheritance and polymorphism in Java:

- A Java class can inherit fields and methods from another class.
- Each Java class requires its own file, but only one class in a Java package needs a ```main()``` method.
- Child classes inherit the parent constructor by default, but it’s possible to modify the constructor using ```super()``` or override it completely.
- You can use ```protected``` and ```final``` to control child class access to parent class members.
- Java’s OOP principle of polymorphism means you can use a child class object like a member of its parent class, but also give it its own traits.
- You can override parent class methods in the child class, ideally using the ```@Override``` keyword.
- It’s possible to use objects of different classes that share a parent class together in an array or ```ArrayList```.

## Language Families Project

Languages, just like people, often have families. You can even map language lineage a bit like a family tree.

Java can help us build a model to track inherited traits across families. In this case, we’ll focus on something that often varies between language families: word order — where the subject, verb, and object would go in a sentence.

For example, in English, you would use subject-verb-object order:

| subject | verb | noodles |
|---------|------|---------|
| She     | eats | noodles |

But in Japanese, you would use subject-object-verb order:

| subject | object    | verb   |
|---------|-----------|--------|
| 彼女は   | 麺を       | 食べる  |
| (she)   | (noodles) | (eats) |

Your **Language Inheritance** package has three Java files:

- **Language.java**: for the ```Language``` parent class, which serves as the template for all languages.
- **Mayan.java**: for ```Mayan```, a child class of ```Language``` modeled after the [Mayan language family](https://en.wikipedia.org/wiki/Mayan_languages).
- **SinoTibetan.java**: for ```SinoTibetan```, a child class of Language modeled after the [Sino-Tibetan language family](https://en.wikipedia.org/wiki/Sino-Tibetan_languages).

Build out a Java package with these classes to model real-world language families.

Project details can be found in the [Language Families Project](https://github.com/keldavis/Java-Practice/tree/master/Foundations/9.%20Inheritance%20and%20Polymorphism/Language%20Families%20Project) folder