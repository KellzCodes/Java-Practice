# Reverse String

Write a function that reverses a string. The input string is given as an array of characters ```s```.

**Example 1:**
> Input: s = ["h","e","l","l","o"]
> 
> Output: ["o","l","l","e","h"]

**Example 2:**
> Input: s = ["H","a","n","n","a","h"]
> 
> Output: ["h","a","n","n","a","H"]
 
**Constraints:**
- ```1 <= s.length <= 10^5```
- ```s[i]``` is a [printable ascii character](https://en.wikipedia.org/wiki/ASCII#Printable_characters).
 
**Follow up:** Do not allocate extra space for another array. You must do this by modifying the input array [in-place](https://en.wikipedia.org/wiki/In-place_algorithm) with ```O(1)``` extra memory.

**Hint**

The entire logic for reversing a string is based on using the opposite directional two-pointer approach!

## Solution

### Approach 1: Recursion, In-Place, *O(N)* Space

**Does in-place mean constant space complexity?**

No. By definition, an [in-place](https://en.wikipedia.org/wiki/In-place_algorithm) algorithm is an algorithm which transforms input using no auxiliary data structure.

The tricky part is that space is used by many actors, not only by data structures. The classical example is to use recursive function without any auxiliary data structures.

Is it in-place? Yes.

Is it constant space? No, because of recursion stack.

![image](https://user-images.githubusercontent.com/19383145/123531684-b13e6800-d6d4-11eb-90b9-d7d67905fc96.png)

**Algorithm**

Here is an example. Let's implement recursive function ```helper``` which receives two pointers, left and right, as arguments.

- Base case: if ```left >= right```, do nothing.

- Otherwise, swap ```s[left]``` and ```s[right]``` and call ```helper(left + 1, right - 1)```.

To solve the problem, call helper function passing the head and tail indexes as arguments: ```return helper(0, len(s) - 1)```.

**Implementation**

```
class Solution {
  public void helper(char[] s, int left, int right) {
    if (left >= right) return;
    char tmp = s[left];
    s[left++] = s[right];
    s[right--] = tmp;
    helper(s, left, right);
  }

  public void reverseString(char[] s) {
    helper(s, 0, s.length - 1);
  }
}
```

**Complexity Analysis**

- Time complexity : *O(N)* time to perform *N/2* swaps.

- Space complexity : *O(N)* to keep the recursion stack.

### Approach 2: Two Pointers, Iteration, *O(1)* Space

**Two Pointers Approach**

In this approach, two pointers are used to process two array elements at the same time. Usual implementation is to set one pointer in the beginning and one at the end and then to move them until they both meet.

Sometimes one needs to generalize this approach in order to use three pointers, like for classical [Sort Colors problem](https://leetcode.com/articles/sort-colors/).

**Algorithm**
- Set pointer left at index 0, and pointer right at index ```n - 1```, where n is a number of elements in the array.
- While left < right:
  - Swap ```s[left]``` and ```s[right]```.
  - Move left pointer one step right, and right pointer one step left.

![image](https://user-images.githubusercontent.com/19383145/123531870-2d857b00-d6d6-11eb-87b2-fad55c25b71b.png)

**Implementation**

```
class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
    }
}
```

**Complexity Analysis**
- Time complexity : *O(N)* to swap *N/2* element.
- Space complexity : *O(1)*, it's a constant space solution.

### Approach 3: easy swap char solution

```
public class ReverseString {
    public static void main(String[] args){
        String hello = "hello";
        char[] charArray = hello.toCharArray();
        System.out.println(charArray);
        reverseString(charArray);
        System.out.println(charArray);
    }

    public static void reverseString(char[] charArray) {
        char swapChar;
        for (int currentIndex = 0; currentIndex < (charArray.length) / 2; currentIndex++) {
            swapChar = charArray[currentIndex];
            charArray[currentIndex] = charArray[charArray.length - 1 - currentIndex];
            charArray[charArray.length - 1 - currentIndex] = swapChar;
        }
    }
}
```
