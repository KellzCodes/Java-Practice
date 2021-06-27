# Remove Element

Given an integer array ```nums``` and an integer ```val```, remove all occurrences of ```val``` in ```nums``` [in-place](https://en.wikipedia.org/wiki/In-place_algorithm). The relative order of the elements may be changed.

Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the **first part** of the array ```nums```. More formally, if there are ```k``` elements after removing the duplicates, then the first ```k``` elements of ```nums``` should hold the final result. It does not matter what you leave beyond the first ```k``` elements.

Return ```k``` *after placing the final result in the first* ```k``` slots of ```nums```.

Do **not** allocate extra space for another array. You must do this by **modifying the input array** [in-place](https://en.wikipedia.org/wiki/In-place_algorithm) with *O(1)* extra memory.

**Custom Judge:**

The judge will test your solution with the following code:

```
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```

If all assertions pass, then your solution will be **accepted**.

**Example 1:**
> **Input:** nums = [3,2,2,3], val = 3
> 
> **Output:** 2, nums = [2,2,_,_]
> 
> Explanation: Your function should return k = 2, with the first two elements of nums being 2.
> 
> It does not matter what you leave beyond the returned k (hence they are underscores).

**Example 2:**
> **Input:** nums = [0,1,2,2,3,0,4,2], val = 2
> 
> **Output:** 5, nums = [0,1,4,0,3,_,_,_]
> 
> **Explanation:** Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
> 
> Note that the five elements can be returned in any order.
> 
> It does not matter what you leave beyond the returned k (hence they are underscores).

**Constraints:**
- ```0 <= nums.length <= 100```
- ```0 <= nums[i] <= 50```
- ```0 <= val <= 100```

**Hints**
- The problem statement clearly asks us to modify the array in-place and it also says that the element beyond the new length of the array can be anything. Given an element, we need to remove all the occurrences of it from the array. We don't technically need to **remove** that element per-say, right?
- We can move all the occurrences of this element to the end of the array. Use two pointers!

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/hint_remove_element.png" alt="hint_remove_element" width="500"/>
- Yet another direction of thought is to consider the elements to be removed as non-existent. In a single pass, if we keep copying the visible elements in-place, that should also solve this problem for us.
- Try two pointers.
- Did you use the fact that the order of elements can be changed?
- What happens when the elements to remove are rare?

## Solution

### Approach 1: Two Pointers

**Intuition**

Since this question is asking us to remove all elements of the given value in-place, we have to handle it with *O(1)* extra space. How to solve it? We can keep two pointers *i* and *j*, where *i* is the slow-runner while *j* is the fast-runner.

**Algorithm**

When *nums[j]* equals to the given value, skip this element by incrementing *j*. As long as *nums[j] != val*, we copy *nums[j]* to *nums[i]* and increment both indexes at the same time. Repeat the process until *j* reaches the end of the array and the new length is *i*.

This solution is very similar to the solution to [Remove Duplicates from Sorted Array](https://leetcode.com/articles/remove-duplicates-from-sorted-array/).

```
public int removeElement(int[] nums, int val) {
    int i = 0;
    for (int j = 0; j < nums.length; j++) {
        if (nums[j] != val) {
            nums[i] = nums[j];
            i++;
        }
    }
    return i;
}
```

**Complexity analysis**
- Time complexity : *O(n)*. Assume the array has a total of nn elements, both *i* and *j* traverse at most *2n* steps.
- Space complexity : *O(1)*.

### Approach 2: Two Pointers - when elements to remove are rare

**Intuition**

Now consider cases where the array contains few elements to remove. For example, *nums=[1,2,3,5,4],val=4*. The previous algorithm will do unnecessary copy operation of the first four elements. Another example is *nums=[4,1,2,3,5],val=4*. It seems unnecessary to move elements [1,2,3,5] one step left as the problem description mentions that the order of elements could be changed.

**Algorithm**

When we encounter *nums[i]=val*, we can swap the current element out with the last element and dispose the last one. This essentially reduces the array's size by 1.

Note that the last element that was swapped in could be the value you want to remove itself. But don't worry, in the next iteration we will still check this element.

```
public int removeElement(int[] nums, int val) {
    int i = 0;
    int n = nums.length;
    while (i < n) {
        if (nums[i] == val) {
            nums[i] = nums[n - 1];
            // reduce array size by one
            n--;
        } else {
            i++;
        }
    }
    return n;
}
```

**Complexity analysis**
- Time complexity : *O(n)*. Both *i* and *n* traverse at most *n* steps. In this approach, the number of assignment operations is equal to the number of elements to remove. So it is more efficient if elements to remove are rare.
- Space complexity : *O(1)*.
