# Max Consecutive Ones

## Given a binary array nums, return the maximum number of consecutive 1's in the array.

**Example 1:**

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
```

**Example 2:**

```
Input: nums = [1,0,1,1,0,1]
Output: 2
```

**Constraints:**

- 1 <= nums.length <= 105

- nums[i] is either 0 or 1.

### Hint

You need to think about two things as far as any window is concerned. One is the starting point for the window. How do you detect that a new window of 1s has started? The next part is detecting the ending point for this window. How do you detect the ending point for an existing window? If you figure these two things out, you will be able to detect the windows of consecutive ones. All that remains afterward is to find the longest such window and return the size.

### Solution

The constraints for this problem make it easy to understand that it can be done in one iteration.

The length of input array is a positive integer and will not exceed 10,000

How else do you expect to find the number of 1's in an array without making at least one pass through the array. So let's look at the solution.

#### Approach: One pass

**Intuition**
The intuition is pretty simple. We keep a count of the number of 1's encountered. And reset the count whenever we encounter anything other than 1 (which is 0 for this problem). Thus, maintaining count of 1's between zeros or rather maintaining counts of contiguous 1's. It's the same as keeping a track of the number of hours of sleep you had, without waking up in between.

**Algorithm**

1. Maintain a counter for the number of 1's.

2. Increment the counter by 1, whenever you encounter a 1.

3. Whenever you encounter a 0

	- Use the current count of 1's to find the maximum contiguous 1's till now.

	- Afterwards, reset the counter for 1's to 0.

4. Return the maximum in the end.

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/485_Max_Consecutive_Ones_1.png" alt="Max_Consecutive_Ones_1" width="500"/>

In the above diagram we found out that the maximum number of consecutive 1's is 3. There were two breaks in the count we encountered while iterating the array. Every time the break i.e. 0 was encountered we had to reset the count of 1 to zero.

Note - The maximum count is only calculated when we encounter a break i.e. 0, since thats where a subarray of 1's ends.

```
class Solution {
  public int findMaxConsecutiveOnes(int[] nums) {
    int count = 0;
    int maxCount = 0;
    for(int i = 0; i < nums.length; i++) {
      if(nums[i] == 1) {
        // Increment the count of 1's by one.
        count += 1;
      } else {
        // Find the maximum till now.
        maxCount = Math.max(maxCount, count);
        // Reset count of 1.
        count = 0;
      }
    }
    return Math.max(maxCount, count);
  }
}
```

**Complexity Analysis**

Time Complexity: O(N), where N is the number of elements in the array.

Space Complexity: O(1). We do not use any extra space.

#### Follow up

One line solution:

```
def findMaxConsecutiveOnes(self, nums):
  return max(map(len, ''.join(map(str, nums)).split('0')))
```

Note, how he converts the list into a string, using map and join functions. Then, splits the resultant string on 0. The maximum of the lengths of these list of strings of 1's is the answer we are looking for.
