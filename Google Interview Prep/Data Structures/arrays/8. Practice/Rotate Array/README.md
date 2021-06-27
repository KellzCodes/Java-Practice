# Rotate Array

Given an array, rotate the array to the right by ```k``` steps, where ```k``` is non-negative.

**Example 1:**

![image](https://user-images.githubusercontent.com/19383145/123534159-12703680-d6e9-11eb-8ac5-b4c35d4239fa.png)

**Example 2:**

![image](https://user-images.githubusercontent.com/19383145/123534170-20be5280-d6e9-11eb-8ddf-ca263da8b2c0.png)

![image](https://user-images.githubusercontent.com/19383145/123534178-2caa1480-d6e9-11eb-8664-c2372ef548d4.png)

**Hints**
- The easiest solution would use additional memory and that is perfectly fine.
- The actual trick comes when trying to solve this problem without using any additional memory. This means you need to use the original array somehow to move the elements around. Now, we can place each element in its original location and shift all the elements around it to adjust as that would be too costly and most likely will time out on larger input arrays.
- One line of thought is based on reversing the array (or parts of it) to obtain the desired result. Think about how reversal might potentially help us out by using an example.
- The other line of thought is a tad bit complicated but essentially it builds on the idea of placing each element in its original position while keeping track of the element originally in that position. Basically, at every step, we place an element in its rightful position and keep track of the element already there or the one being overwritten in an additional variable. We can't do this in one linear pass and the idea here is based on cyclic-dependencies between elements.

## Solution

### Approach 1: Brute Force

The simplest approach is to rotate all the elements of the array in *k* steps by rotating the elements by 1 unit in each step.

```
class Solution {
  public void rotate(int[] nums, int k) {
    // speed up the rotation
    k %= nums.length;
    int temp, previous;
    for (int i = 0; i < k; i++) {
      previous = nums[nums.length - 1];
      for (int j = 0; j < nums.length; j++) {
        temp = nums[j];
        nums[j] = previous;
        previous = temp;
      }
    }
  }
}
```

![image](https://user-images.githubusercontent.com/19383145/123534215-86124380-d6e9-11eb-8419-2d75af7da3b1.png)

### Approach 2: Using Extra Array

**Algorithm**

![image](https://user-images.githubusercontent.com/19383145/123534227-9f1af480-d6e9-11eb-8c9e-21992948ef3b.png)

```
class Solution {
  public void rotate(int[] nums, int k) {
    int[] a = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      a[(i + k) % nums.length] = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = a[i];
    }
  }
}
```

**Complexity Analysis**

![image](https://user-images.githubusercontent.com/19383145/123534239-b659e200-d6e9-11eb-9454-1601c52ee9ce.png)

### Approach 3: Using Cyclic Replacements

**Algorithm**

We can directly place every number of the array at its required correct position. But if we do that, we will destroy the original element. Thus, we need to store the number being replaced in a *temp* variable. Then, we can place the replaced number (*temp*) at its correct position and so on, nn times, where *n* is the length of array. We have chosen nn to be the number of replacements since we have to shift all the elements of the array(which is *n*). But, there could be a problem with this method, if *n % k = 0* where *k=k%n* (since a value of *k* larger than *n* eventually leads to a *k* equivalent to *k%n*). In this case, while picking up numbers to be placed at the correct position, we will eventually reach the number from which we originally started. Thus, in such a case, when we hit the original number's index again, we start the same process with the number following it.

![image](https://user-images.githubusercontent.com/19383145/123534310-50218f00-d6ea-11eb-91b0-d8bbbe621b54.png)
> nums: [1, 2, 3, 4, 5, 6]
> 
> k: 2

![image](https://user-images.githubusercontent.com/19383145/123534327-6d565d80-d6ea-11eb-9d16-b11432ac00d9.png)

```
class Solution {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int count = 0;
    for (int start = 0; count < nums.length; start++) {
      int current = start;
      int prev = nums[start];
      do {
        int next = (current + k) % nums.length;
        int temp = nums[next];
        nums[next] = prev;
        prev = temp;
        current = next;
        count++;
      } while (start != current);
    }
  }
}
```

**Complexity Analysis**

![image](https://user-images.githubusercontent.com/19383145/123534341-84954b00-d6ea-11eb-82d9-30508f544622.png)

### Approach 4: Using Reverse

**Algorithm**

![image](https://user-images.githubusercontent.com/19383145/123534372-befee800-d6ea-11eb-9acf-224b99747751.png)

```
class Solution {
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }
  public void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }
}
```

**Complexity Analysis**

![image](https://user-images.githubusercontent.com/19383145/123534383-d50ca880-d6ea-11eb-9313-591130bcdd76.png)

