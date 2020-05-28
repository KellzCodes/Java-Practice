# Arrays

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