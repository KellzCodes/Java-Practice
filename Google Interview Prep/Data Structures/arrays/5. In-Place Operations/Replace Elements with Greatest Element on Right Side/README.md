# Replace Elements with Greatest Element on Right Side

## Given an array ```arr```, replace every element in that array with the greatest element among the elements to its right, and replace the last element with ```-1```.

After doing so, return the array.

#### Example 1:
> **Input**: arr = [17,18,5,4,6,1]
> **Output**: [18,6,6,6,1,-1]
> **Explanation**: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.

#### Example 2:
> **Input**: arr = [400]
> **Output**: [-1]
> **Explanation**: There are no elements to the right of index 0.
 
#### Constraints:

- ```1 <= arr.length <= 104```
- ```1 <= arr[i] <= 105```

#### Hints
- Loop through the array starting from the end.
- Keep the maximum value seen so far.

## Solution

#### Explanation
- Iterate from the back to the start,
- We initilize ```mx = -1```, where ```mx``` represent the max on the right.
- Each round, we set ```A[i] = mx```, where ```mx``` is its mas on the right.
- Also we update ```mx = max(mx, A[i])```, where ```A[i]``` is its original value.


#### Complexity
Time O(N)
Space O(1)

```
public int[] replaceElements(int[] A) {
        for (int i = A.length - 1, mx = -1; i >= 0; --i)
            mx = Math.max(A[i], A[i] = mx);
        return A;
    }
```

### Expanded Solution:

```
public int[] replaceElements2(int[] A) {
        int mx = -1, n = A.length, a;
        for (int i = n - 1; i >= 0; --i) {
            a = A[i];
            A[i] = mx;
            mx = Math.max(mx, a);
        }
        return A;
}
```
