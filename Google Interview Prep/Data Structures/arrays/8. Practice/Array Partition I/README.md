# Array Partition I

Given an integer array ```nums``` of ```2n``` integers, group these integers into ```n``` pairs ```(a1, b1), (a2, b2), ..., (an, bn)``` such that the sum of ```min(ai, bi)``` for all ```i``` is **maximized**. Return the *maximized sum*.

![image](https://user-images.githubusercontent.com/19383145/123532181-0f6d4a00-d6d9-11eb-8a35-0b19abe1e591.png)

**Hints**
- Obviously, brute force won't help here. Think of something else, take some example like 1,2,3,4.
- How will you make pairs to get the result? There must be some pattern.
- Did you observe that- Minimum element gets add into the result in sacrifice of maximum element.
- Still won't able to find pairs? Sort the array and try to find the pattern.

```
public class ArrayPartition1 {
    public static void main (String args[]){
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
    public static int arrayPairSum(int[] nums) {
        int[] exist = new int[20001];
        for (int i = 0; i < nums.length; i++) {
            exist[nums[i] + 10000]++;
        }
        int sum = 0;
        boolean odd = true;
        for (int i = 0; i < exist.length; i++) {
            while (exist[i] > 0) {
                if (odd) {
                    sum += i - 10000;
                }
                odd = !odd;
                exist[i]--;
            }
        }
        return sum;
    }
}
```
