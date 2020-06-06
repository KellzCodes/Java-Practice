# Loops
- [While Loop](#While-Loop)
- [Incrementing](#Incrementing)
- [For Loop](#For-Loop)
- [Iterating Over Arrays and ArrayLists](#Iterating-Over-Arrays-and-ArrayLists)
- [For-Each Loop](#For-Each-Loop)
- [Review](#Review)
- [Fizz Buzz Project](#Fizz-Buzz-Project)
- [The Prime Directive Project](#The-Prime-Directive-Project)

In the programming world, we hate repeating ourselves. There are two reasons for this:

- Writing the same code over and over is time-consuming.
- Having less code means having less to debug.

But we often need to do the same task more than once. Fortunately, computers are really good (and fast) at doing repetitive tasks. And in Java, we can use loops.

A *loop* is a programming tool that allows developers to repeat the same block of code until some condition is met. We employ loops to easily scale programs, saving time and minimizing mistakes.

We’ll go over three types of loops that you’ll see everywhere:

- ```while``` loops
- ```for``` loops
- for-each loops

<img src="https://github.com/keldavis/Java-Practice/blob/master/Foundations/7.%20Loops/roundabout.gif" alt="function" width="500"/>

## While Loop

A ```while``` loop looks a bit like an ```if``` statement:

```
while (silliness > 10) {

  // code to run

}
```

Like an ```if``` statement, the code inside a ```while``` loop will only run if the condition is ```true```. However, a ```while``` loop will continue running the code over and over until the condition evaluates to ```false```. So the code block will repeat until ```silliness``` is less than or equal to 10.

```
// set attempts to 0
int attempts = 0;

// enter loop if condition is true
while (passcode != 0524 && attempts < 4) {

  System.out.println("Try again.");
  passcode = getNewPasscode();
  attempts += 1;

  // is condition still true?
  // if so, repeat code block
}
// exit when condition is not true
```

```while``` loops are extremely useful when you want to run some code until a specific change happens. However, if you aren’t certain that change will occur, beware the infinite loop!

*Infinite loops* occur when the condition will never evaluate to ```false```. This can cause your entire program to crash.

```
int hedgehogs = 5;

// This will cause an infinite loop:
while (hedgehogs < 6) {

  System.out.println("Not enough hedgehogs!");

}
```

In the example above, ```hedgehogs``` remains equal to ```5```, which is less than ```6```. So we would get an infinite loop.

Example code can be found in the [While Loop](https://github.com/keldavis/Java-Practice/tree/master/Foundations/7.%20Loops/While%20Loop) folder

## Incrementing

When looping through code, it’s common to use a counter variable. A *counter* (also known as an *iterator*) is a variable used in the conditional logic of the loop and (usually) incremented in value during each iteration through the code. For example:

```
// counter is initialized
int wishes = 0;

// conditional logic uses counter
while (wishes < 3) {

  System.out.println("Wish granted.");
  // counter is incremented
  wishes++;

}
```

In the above example, the counter ```wishes``` gets initialized before the loop with a value of ```0```, then the program will keep printing ```"Wish granted."``` and adding ```1``` to ```wishes``` as long as ```wishes``` has a value of less than ```3```. Once wishes reaches a value of ```3``` or more, the program will exit the loop.

So the output would look like:
	> Wish granted.
	> Wish granted.
	> Wish granted.


We can also decrement counters like this:

```
int pushupsToDo = 10;

while (pushupsToDo > 0) {

  doPushup();
  pushupsToDo--;

}
```

In the code above, the counter, ```pushupsToDo```, starts at 10, and increments down one at a time. When it hits 0, the loop exits.

Example code can be found in the [Incrementing](https://github.com/keldavis/Java-Practice/tree/master/Foundations/7.%20Loops/Incrementing) folder

## For Loop

Incrementing with loops is actually so common in programming that Java (like many other programming languages) includes syntax specifically to address this pattern: ```for``` loops. A ```for``` *loop* brings together the following steps in a single line, separated by semicolons:

1. Initializing a counter variable.
2. Defining the looping condition.
3. Incrementing the counter.

The opening line might look like this:

```
for (int i = 0; i < 5; i++) {

  // code that will run

}
```

1. ```i = 0```: ```i``` is initialized to ```0```.
2. ```i < 5```: the loop is given a condition that relies on the value of ```i```.
3. ```i++```: ```i``` will increment at the end of each loop.

So the code will run through the loop a total of five times.

You’ll also hear the term “iteration” in reference to loops. When you *iterate*, it just means that you are repeating the same block of code.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Foundations/7.%20Loops/For%20Loop/Java-loop-final.gif" alt="function" width="500"/>

```for``` loops aren’t just a nicer syntax; they also help us remember to increment our counter — something that is easy to forget when we increment with a ```while``` loop. Leaving out that line of code would cause an infinite loop — yikes!

Fortunately, equipped with your new understanding of ```for``` loops, you can help prevent infinite loops in your own code.

Example code can be found in the [For Loop](https://github.com/keldavis/Java-Practice/tree/master/Foundations/7.%20Loops/For%20Loop) folder

## Iterating Over Arrays and ArrayLists

One common pattern you’ll encounter as a programmer is looping through a list of data and doing something with each item. In Java, that list would be an array or ```ArrayList``` and the loop could be a ```for``` loop. But wait, how does this work?

```for``` loops begin with a counter variable. We can use that counter to track the index of the current element as we iterate over the list of data.

Because the first index in an array or ```ArrayList``` is 0, the counter would begin with a value of ```0``` and increment until the the end of the list. So we can increment through the array or ```ArrayList``` using its indices.

For example, if we wanted to add ```1``` to every ```int``` item in an array ```secretCode```, we could do this:

```
for (int i = 0; i < secretCode.length; i++) {

  secretCode[i] += 1;

}
```

Notice that our condition in this example is ```i < secretCode.length```. Because array indices start at 0, the length of ```secretCode``` is 1 larger than its final index. Therefore, the loop should stop when it is less than BUT NOT equal to the length value.

In the case of an ```ArrayList```, this code would look like:

```
for (int i = 0; i < secretCode.size(); i++) {

  int num = secretCode.get(i);
  secretCode.set(i, num + 1);

}
```

Example code can be found in the [Iterating Over Arrays and ArrayLists](https://github.com/keldavis/Java-Practice/tree/master/Foundations/7.%20Loops/Iterating%20Over%20Arrays%20and%20ArrayLists) folder

## For Each Loop

Sometimes we need access to the elements’ indices or we only want to iterate through a portion of a list. If that’s the case, a regular ```for``` loop is a great choice. But sometimes we couldn’t care less about the indices; we only care about the element itself. At times like these, for-each loops come in handy.

*For-each loops* allow you to directly loop through each item in a list of items (like an array or ```ArrayList```) and perform some action with each item. The syntax looks like this:

```
for (String inventoryItem : inventoryItems) {

  System.out.println(inventoryItem);

}
```

We can read the ```:``` as “in” like this: for each ```inventoryItem``` (which should be a ```String```) in ```inventoryItems```, print ```inventoryItem```.

Note that we can name the individual item whatever we want; using the singular of a plural is just a convention. You may also encounter conventions like ```String word : sentence```.

Example code can be found in the [For Each Loop](https://github.com/keldavis/Java-Practice/tree/master/Foundations/7.%20Loops/For%20Each%20Loop) folder

## Review

Nice work! Let’s iterate over what you’ve just learned about loops:

- ```while``` loops: These are useful to repeat a code block an unknown number of times until some condition is met. For example:

```
int wishes = 0;

while (wishes < 3) {

  // code that will run
  wishes++;

}
```

- ```for``` loops: These are ideal for when you are incrementing or decrementing with a counter variable. For example:

```
for (int i = 0; i < 5; i++) {

  // code that will run

}
```

For-each loops: These make it simple to do something with each item in a list. For example:

```
for (String inventoryItem : inventoryItems) {

  // do something with each inventoryItem

}
```

## Fizz Buzz Project

[Fizz Buzz](https://en.wikipedia.org/wiki/Fizz_buzz) is a common developer interview question; so common it’s almost cliché!

The challenge is designed to weed out 99.5% programming job candidates who cannot creatively use their coding knowledge to solve coding problems.

Want to give it a shot?

<img src="https://github.com/keldavis/Java-Practice/blob/master/Foundations/7.%20Loops/fizzbuzz.gif" alt="function" width="500"/>

Write a **FizzBuzz.java** program that outputs numbers from 1 to 100… with a catch:

- For multiples of 3, print ```Fizz``` instead of the number.
- For the multiples of ```5```, print ```Buzz```.
- For numbers which are multiples of both 3 and 5, print ```FizzBuzz```.

```
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
16
17
Fizz
19
Buzz
    ...
97
98
Fizz
Buzz
```

Project details can be found in the [Fizz Buzz Project](https://github.com/keldavis/Java-Practice/tree/master/Foundations/7.%20Loops/Fizz%20Buzz%20Project) folder

## The Prime Directive Project

Finding prime numbers is a common technical challenge in programming interviews.

As it happens, Java loops are a great tool to help you do this!

A prime number is an integer greater than 1 that is only divisible by 1 and itself.

For example, 2, 3, 5, and 7 are all prime numbers, but 4, 6, 8, and 9 are not.

Your prime directive: Build a **PrimeDirective.java** program that creates an ```ArrayList``` of all prime numbers in an array.

Project details can be found in the [The Prime Directive Project](https://github.com/keldavis/Java-Practice/tree/master/Foundations/7.%20Loops/The%20Prime%20Directive%20Project) folder