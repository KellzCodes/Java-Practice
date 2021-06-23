Given an array of integers ```nums```, calculate the **pivot index** of this array.

The **pivot index** is the index where the sum of all the numbers **strictly** to the left of the index is equal to the sum of all the numbers **strictly** to the index's right.

If the index is on the left edge of the array, then the left sum is ```0``` because there are no elements to the left. This also applies to the right edge of the array.

Return the **leftmost pivot index**. If no such index exists, return -1.

#### Example 1:
> **Input:** nums = [1,7,3,6,5,6]
> 
> **Output:** 3
> 
> **Explanation:**
> 
> The pivot index is 3.
> 
> Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
> 
> Right sum = nums[4] + nums[5] = 5 + 6 = 11

#### Example 2:
> **Input:** nums = [1,2,3]
> 
> **Output:** -1
> 
> **Explanation:**
> 
> There is no index that satisfies the conditions in the problem statement.

#### Example 3:
> **Input:** nums = [2,1,-1]
> 
> **Output:** 0
> 
> **Explanation:**
> 
> The pivot index is 0.
> 
> Left sum = 0 (no elements to the left of index 0)
> 
> Right sum = nums[1] + nums[2] = 1 + -1 = 0

**Constraints:**
- ```1 <= nums.length <= 104```
- ```-1000 <= nums[i] <= 1000```

#### Hint

We can precompute prefix sums P[i] = nums[0] + nums[1] + ... + nums[i-1]. Then for each index, the left sum is P[i], and the right sum is P[P.length - 1] - P[i] - nums[i].

## Solution

### Approach #1: Prefix Sum

**Intuition and Algorithm**

We need to quickly compute the sum of values to the left and the right of every index.

Let's say we knew ```S``` as the sum of the numbers, and we are at index ```i```. If we knew the sum of numbers ```leftsum``` that are to the left of index ```i```, then the other sum to the right of the index would just be ```S - nums[i] - leftsum```.

As such, we only need to know about ```leftsum``` to check whether an index is a pivot index in constant time. Let's do that: as we iterate through candidate indexes ```i```, we will maintain the correct value of ```leftsum```.

```
class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums) sum += x;
        for (int i = 0; i < nums.length; ++i) {
            if (leftsum == sum - leftsum - nums[i]) return i;
            leftsum += nums[i];
        }
        return -1;
    }
}
```

**Complexity Analysis**

Time Complexity: *O(N)*, where *N* is the length of ```nums```.

Space Complexity: *O(1)*, the space used by ```leftsum``` and ```S```.

### Approach 2: Remix of prefix / easier solution with edge cases

```
public class PivotIndex {
    public static void main (String[] args){
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));

        int[] nums2 = {1, 2, 3};
        System.out.println(pivotIndex(nums2));
    }

    public static int pivotIndex(int[] nums) {
        // Return -1 if the array is empty
        if (nums.length == 0) {
            return -1;
        }

        /* Go through the whole array starting at index 1.
        * Change each number.
        * The number at the current index equals the sum of the
        * current and previous values
        *
        * This way, we will always have access to the sum of the numbers
        * before the current index
        * */
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        /* The number at the last index is the sum of
        * all the numbers in the array
        * */
        int last = nums.length - 1;

        // if the numbers at the first and last index are equal, return 0
        // This also handles arrays that have only 1 character
        if (nums[last] - nums[0] == 0) {
            return 0;
        }

        // Go through the array, starting at index 1
        for (int i = 1; i < nums.length; i++) {
            /* If the number at the last index minus the number at the current index
            * is equal to the previous index, return  the current index
            * */
            if (nums[last] - nums[i] == nums[i - 1]) {
                return i;
            }
        }
        // Otherwise, return -1
        return -1;
    }

    /*
    * Time Complexity: This will take O(N) time. N is the number of integers.
    * Space Complexity: This will take O(1) space. */
}
```
