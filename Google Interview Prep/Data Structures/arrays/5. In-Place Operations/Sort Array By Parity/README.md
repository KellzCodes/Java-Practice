# Sort Array By Parity

## Given an array ```nums``` of non-negative integers, return an array consisting of all the even elements of ```nums```, followed by all the odd elements of ```nums```.

You may return any answer array that satisfies this condition.

#### Example 1:
> **Input**: nums = [3,1,2,4]
> 
> **Output**: [2,4,3,1]
> 
> The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

#### Note:

- ```1 <= nums.length <= 5000```
- ```0 <= nums[i] <= 5000```

## Solution

### Approach 1: Sort

**Intuition and Algorithm**

Use a custom comparator when sorting, to sort by parity.

```
class Solution {
    public int[] sortArrayByParity(int[] A) {
        Integer[] B = new Integer[A.length];
        for (int t = 0; t < A.length; ++t)
            B[t] = A[t];

        Arrays.sort(B, (a, b) -> Integer.compare(a%2, b%2));

        for (int t = 0; t < A.length; ++t)
            A[t] = B[t];
        return A;

        /* Alternative:
        return Arrays.stream(A)
                     .boxed()
                     .sorted((a, b) -> Integer.compare(a%2, b%2))
                     .mapToInt(i -> i)
                     .toArray();
        */
    }
}
```

#### Complexity Analysis

- Time Complexity: *O(NlogN)*, where *N* is the length of ```A```.

- Space Complexity: *O(N)* for the sort, depending on the built-in implementation of sort.

### Approach 2: Two Pass

**Intuition and Algorithm**

Write all the even elements first, then write all the odd elements.

```
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];
        int t = 0;

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];

        return ans;
    }
}
```

#### Complexity Analysis

- Time Complexity: *O(N)*, where *N* is the length of ```A```.

- Space Complexity: *O(N)*, the space used by the answer.

#### Approach 3: In-Place

**Intuition**

If we want to do the sort in-place, we can use quicksort, a standard textbook algorithm.

**Algorithm**

We'll maintain two pointers ```i``` and ```j```. The loop invariant is everything below ```i``` has parity ```0``` (ie. ```A[k] % 2 == 0``` when ```k < i```), and everything above ```j``` has parity ```1```.

Then, there are 4 cases for ```(A[i] % 2, A[j] % 2)```:

If it is ```(0, 1)```, then everything is correct: ```i++``` and ```j--```.

If it is ```(1, 0)```, we swap them so they are correct, then continue.

If it is ```(0, 0)```, only the ```i``` place is correct, so we ```i++``` and continue.

If it is ```(1, 1)```, only the ```j``` place is correct, so we ```j--``` and continue.

Throughout all 4 cases, the loop invariant is maintained, and ```j-i``` is getting smaller. So eventually we will be done with the array sorted as desired.

```
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;
            if (A[j] % 2 == 1) j--;
        }

        return A;
    }
}
```

#### Complexity Analysis

- Time Complexity: *O(N)*, where *N* is the length of ```A```. Each step of the while loop makes ```j-i``` decrease by at least one. (Note that while quicksort is ```O(NlogN)``` normally, this is ```O(N)``` because we only need one pass to sort the elements.)

- Space Complexity: ```O(1)``` in additional space complexity.
