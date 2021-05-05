# Reversal algorithm for array rotation

## Write a function rotate(arr[], d, n) that rotates arr[] of size n by d elements.

** Example : **

```
Input :  arr[] = [1, 2, 3, 4, 5, 6, 7]
         d = 2
Output : arr[] = [3, 4, 5, 6, 7, 1, 2]
```

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/Array1.gif" alt="array1_gif" width="300"/>

2 rotations of the above array will make the array below

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/ArrayRotation1.gif" alt="array_rotation_gif" width="300"/>

[Recommended: Please solve it on “PRACTICE ” first, before moving on to the solution.](https://practice.geeksforgeeks.org/problems/reversal-algorithm/0)

The first 3 methods to rotate an array by d elements has been discussed [here](https://github.com/keldavis/Java-Practice/tree/master/Google%20Interview%20Prep/Data%20Structures/arrays/array%20rotations/Program%20for%20array%20rotation).

### Method 4 (The Reversal Algorithm)

```
rotate(arr[], d, n)
  reverse(arr[], 1, d) ;
  reverse(arr[], d + 1, n);
  reverse(arr[], 1, n);
```

Let AB be the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is : 
- Reverse A to get ArB, where Ar is reverse of A.
- Reverse B to get ArBr, where Br is reverse of B.
- Reverse all to get (ArBr) r = BA.

**Example :**

Let the array be arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2 and n = 7 

A = [1, 2] and B = [3, 4, 5, 6, 7] 
- Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
- Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
- Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]

Below is the implementation of the above approach : 

```
// Java program for reversal algorithm of array rotation
import java.io.*;
 
class LeftRotate {
    /* Function to left rotate arr[] of size n by d */
    static void leftRotate(int arr[], int d)
    {
 
        if (d == 0)
            return;
 
        int n = arr.length;
        // in case the rotating factor is
        // greater than array length
        d = d % n;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }
 
    /*Function to reverse arr[] from index start to end*/
    static void reverseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
 
    /*UTILITY FUNCTIONS*/
    /* function to print an array */
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
 
    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int d = 2;
 
        leftRotate(arr, d); // Rotate array by d
        printArray(arr);
    }
}
```

**Output :** 

```
3 4 5 6 7 1 2
```

**Time Complexity : O(n)**