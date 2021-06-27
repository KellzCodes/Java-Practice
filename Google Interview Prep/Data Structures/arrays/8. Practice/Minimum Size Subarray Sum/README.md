# Minimum Size Subarray Sum

Given an array of positive integers ```nums``` and a positive integer ```target```, return the minimal length of a **contiguous subarray** [numsl, nums<sub>l+1</sub>, ..., nums<sub>r-1</sub>, nums<sub>r</sub>] of which the sum is greater than or equal to target. If there is no such subarray, return ```0``` instead.

**Example 1:**
> **Input:** target = 7, nums = [2,3,1,2,4,3]
> 
> **Output:** 2
> 
> **Explanation:** The subarray [4,3] has the minimal length under the problem constraint.

**Example 2:**
> **Input:** target = 4, nums = [1,4,4]
> 
> **Output:** 1

**Example 3:**
> **Input:** target = 11, nums = [1,1,1,1,1,1,1,1]
> 
> **Output:** 0

**Constraints:**
- 1 <= target <= 10<sup>9</sup>
- 1 <= nums.length <= 10<sup>5</sup>
- 1 <= nums[i] <= 10<sup>5</sup>

**Follow up:** If you have figured out the ```O(n)``` solution, try coding another solution of which the time complexity is ```O(n log(n))```.

## Solution

### Two Pointer Solution

```
public int minSubArrayLen(int s, int[] a) {
  if (a == null || a.length == 0)
    return 0;
  
  int i = 0, j = 0, sum = 0, min = Integer.MAX_VALUE;
  
  while (j < a.length) {
    sum += a[j++];
    
    while (sum >= s) {
      min = Math.min(min, j - i);
      sum -= a[i++];
    }
  }
  
  return min == Integer.MAX_VALUE ? 0 : min;
}
```
