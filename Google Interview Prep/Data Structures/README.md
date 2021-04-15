# Overview of Data Structures

A data structure is a particular way of organizing data in a computer so that it can be used effectively. The idea is to reduce the space and time complexities of different tasks. 

## Linear Data Structures

Below is an overview of some popular linear data structures.

1. [Array](#Array)
2. [Linked List](#Linked-List)
3. [Stack](#Stack)
4. [Queue](#Queue)

### Array

Array is a data structure used to store homogeneous (same type) elements at contiguous (adjacent) locations. Size of an array must be provided before storing data.

```
Let size of array be n.
Accessing Time: O(1) [This is possible because elements
                      are stored at contiguous locations]   
Search Time:   O(n) for Sequential Search: 
               O(log n) for Binary Search [If Array is sorted]
Insertion Time: O(n) [The worst case occurs when insertion 
                     happens at the Beginning of an array and 
                     requires shifting all of the elements]
Deletion Time: O(n) [The worst case occurs when deletion 
                     happens at the Beginning of an array and 
                     requires shifting all of the elements]
```

**Example** : For example, let us say, we want to store marks of all students in a class, we can use an array to store them. This helps in reducing the use of number of variables as we don’t need to create a separate variable for marks of every subject. All marks can be accessed by simply traversing the array.
