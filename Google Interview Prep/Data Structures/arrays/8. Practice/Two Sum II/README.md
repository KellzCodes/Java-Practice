# Two Sum II - Input array is sorted

Given an array of integers ```numbers``` that is already **sorted in non-decreasing order**, find two numbers such that they add up to a specific ```target``` number.

Return the *indices of the two numbers* (**1-indexed**) as an integer array ```answer``` of size ```2```, where ```1 <= answer[0] < answer[1] <= numbers.length```.

The tests are generated such that there is **exactly one solution**. You may not use the same element twice.

**Example 1:**
> **Input:** numbers = [2,7,11,15], target = 9
> 
> **Output:** [1,2]
> 
> **Explanation:** The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

**Example 2:**
> **Input:** numbers = [2,3,4], target = 6
> 
> **Output:** [1,3]

**Example 3:**
> **Input:** numbers = [-1,0], target = -1
> 
> **Output:** [1,2]

![image](https://user-images.githubusercontent.com/19383145/123532618-ddf67d80-d6dc-11eb-8dc1-6b18f52fc125.png)

## Solution

```
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0, j= numbers.length-1;
        while(i<j) {
            if(numbers[i]+numbers[j]==target)
                break;
            else if(numbers[i]+numbers[j] < target)
                i++;
            else 
                j--;
        }
        if(i>=j) return new int[]{-1,-1};
        return new int[]{i+1,j+1} ;
    }
}
```

**Complexity analysis**
- Time complexity : *O(n)*. Each of the nn elements is visited at most once, thus the time complexity is *O(n)*.
- Space complexity : *O(1)*. We only use two indexes, the space complexity is *O(1)*.
