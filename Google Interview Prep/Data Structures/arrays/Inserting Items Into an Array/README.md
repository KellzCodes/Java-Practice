# Inserting Items Into an Array

In the [Introduction folder](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/arrays/Introduction), we looked at what Arrays are, and the basic programming constructs of Arrays in Java. 

We're now going to use these basic constructs to implement three key operations for Arrays:
- Inserting items.
- Removing items.
- Searching for items.

These three operations are the fundamental operations for all data structures.

In this folder, we'll be starting with inserting items into an array. 

Inserting a new element into an Array can take many forms:

- Inserting a new element at the end of the Array.
- Inserting a new element at the beginning of the Array.
- Inserting a new element at any given index inside the Array.

### Inserting at the End of an Array

At any point in time, we know the index of the last element of the Array, as we've kept track of it in our ```length``` variable. All we need to do for inserting an element at the end is to assign the new element to one index past the current last element.
