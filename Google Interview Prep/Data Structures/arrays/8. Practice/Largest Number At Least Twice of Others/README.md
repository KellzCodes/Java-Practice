# Largest Number At Least Twice of Others

You are given an integer array ```nums``` where the largest integer is **unique**.

Determine whether the largest element in the array is **at least twice** as much as every other number in the array. If it is, return the **index** of the *largest element*, or return ```-1``` otherwise.

**Example 1:**
> **Input:** nums = [3,6,1,0]
> 
> **Output:** 1
> 
> **Explanation:** 6 is the largest integer.
> 
> For every other number in the array x, 6 is at least twice as big as x.
> 
> The index of value 6 is 1, so we return 1.

**Example 2:**
> **Input:** nums = [1,2,3,4]
> 
> **Output:** -1
> 
> **Explanation:** 4 is less than twice the value of 3, so we return -1.

**Example 3:**
> **Input:** nums = [1]
> 
> **Output:** 0
> 
> **Explanation:** 1 is trivially at least twice the value as any other number because there are no other numbers.

**Constraints:**
- ```1 <= nums.length <= 50```
- ```0 <= nums[i] <= 100```
- The largest element in nums is unique.

**Hint**

Scan through the array to find the unique largest element ```m```, keeping track of it's index ```maxIndex```. Scan through the array again. If we find some ```x != m``` with ```m < 2*x```, we should return ```-1```. Otherwise, we should return ```maxIndex```.

### Solution

```
public class LargestNumberAtLeastTwiceAsOthers {
    public static void main(String[] args){
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        // Return 1 if the array is empty
        if (nums.length == 0) {
            return -1;
        }

        // Return 0 if there is only one integer in the array
        else if (nums.length == 1) {
            return 0;
        }

        else {
            // The largest number in the array starts at index 0
            int largestNumber = nums[0];
            // This is a number that will be compared to the largest number, its current value is a placeholder
            
            int secondLargestNumber = Integer.MIN_VALUE;// This is a constant holding the minimum value an int can have, -2^31.
            
            // The dominant index contains the largest number in the array
            int dominantIndex = 0;

            // Traverse through the array starting at index 1,
            for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {
                // The current number is the value at the current index
                int currentNumber = nums[currentIndex];

                /* If the current number is greater than the largest number*/
                if (currentNumber > largestNumber) {
                    // The largest number becomes the second largest number
                    secondLargestNumber = largestNumber;
                    // The current number becomes the largest number
                    largestNumber = currentNumber;
                    // The current index becomes the dominant index
                    dominantIndex = currentIndex;
                }

                /* If the current number is greater than the second largest number */
                else if (currentNumber > secondLargestNumber) {
                    // The current number becomes the second largest number
                    secondLargestNumber = currentNumber;
                }
            }

            /* Return the dominant index if the largest number is greater than
            * or equal to twice the second largest number */
            if (largestNumber >= secondLargestNumber * 2) {
                return dominantIndex;
            }
        }

        
        return -1;
    }
}

/*
* Complexity Analysis
*
* Time Complexity: O(N) where N is the number of integers
* Space Complexity: O(1), the space used by the int variables*/
```
