# Block swap algorithm for array rotation

## Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements. 

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/Array1.gif" alt="array_gif" width="300"/>

2 rotations of the array above will make the array below

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/ArrayRotation1.gif" alt="array_rotation" width="300"/>

[Recommended: Please try your approach on {IDE} first, before moving on to the solution.](https://ide.geeksforgeeks.org/)

```
Initialize A = arr[0..d-1] and B = arr[d..n-1]
1) Do following until size of A is equal to size of B

  a)  If A is shorter, divide B into Bl and Br such that Br is of same 
       length as A. Swap A and Br to change ABlBr into BrBlA. Now A
       is at its final place, so recur on pieces of B.  

   b)  If A is longer, divide A into Al and Ar such that Al is of same 
       length as B Swap Al and B to change AlArB into BArAl. Now B
       is at its final place, so recur on pieces of A.

2)  Finally when A and B are of equal size, block swap them.
```

Code implentation of this method can be found in [RecursiveBlockSwap.java](https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/Data%20Structures/arrays/array%20rotations/3.%20Block%20swap%20algorithm%20for%20array%20rotation/RecursiveBlockSwap.java).

**Output**:

```
3 5 4 6 7 1 2
```

**Iterative Implementation**:

[Here](https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/Data%20Structures/arrays/array%20rotations/3.%20Block%20swap%20algorithm%20for%20array%20rotation/IterativeBlockSwap.java) is iterative implementation of the same algorithm. Same utility function swap() is used here.

**Time Complexity: O(n)**