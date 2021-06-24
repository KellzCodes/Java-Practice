# Add Binary

Given two binary strings ```a``` and ```b```, return their sum as a binary string.

**Example 1:**
> **Input:** a = "11", b = "1"
> 
> **Output:** "100"

**Example 2:**
> **Input:** a = "1010", b = "1011"
> 
> **Output:** "10101"

**Constraints:**
- ```1 <= a.length, b.length <= 104```
- ```a``` and ```b``` consist only of ```'0'``` or ```'1'``` characters.
- Each string does not contain leading zeros except for the zero itself.

## Solution

**Overview**

There is a simple way using built-in functions:
- Convert ```a``` and ```b``` into integers.
- Compute the sum.
- Convert the sum back into binary form.

```
class Solution {
  public String addBinary(String a, String b) {
    return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
  }
}
```

![image](https://user-images.githubusercontent.com/19383145/123189682-44289980-d46c-11eb-9419-f9c17e9b93cc.png)

![image](https://user-images.githubusercontent.com/19383145/123189892-9e295f00-d46c-11eb-9a06-8b83a7485fbe.png)

```
class Solution {
  public String addBinary(String a, String b) {
    int n = a.length(), m = b.length();
    if (n < m) return addBinary(b, a);
    int L = Math.max(n, m);

    StringBuilder sb = new StringBuilder();
    int carry = 0, j = m - 1;
    for(int i = L - 1; i > -1; --i) {
      if (a.charAt(i) == '1') ++carry;
      if (j > -1 && b.charAt(j--) == '1') ++carry;

      if (carry % 2 == 1) sb.append('1');
      else sb.append('0');

      carry /= 2;
    }
    if (carry == 1) sb.append('1');
    sb.reverse();

    return sb.toString();
  }
}
```

![image](https://user-images.githubusercontent.com/19383145/123189946-b26d5c00-d46c-11eb-87e8-d3f48d844a34.png)

### Approach 2: Bit Manipulation

**Intuition**

Here the input is more adapted to push towards Approach 1, but there is popular Facebook variation of this problem when interviewer provides you two numbers and asks to sum them up without using addition operation.
> No addition? OK, bit manipulation then.

How to start? There is an interview tip for bit manipulation problems: if you don't know how to start, start from computing XOR for your input data. Strangely, that helps to go out for quite a lot of problems, [Single Number II](https://leetcode.com/articles/single-number-ii/), [Single Number III](https://leetcode.com/articles/single-number-iii/), [Maximum XOR of Two Numbers in an Array](https://leetcode.com/articles/maximum-xor-of-two-numbers-in-an-array/), [Repeated DNA Sequences](https://leetcode.com/articles/repeated-dna-sequences/), [Maximum Product of Word Lengths](https://leetcode.com/articles/maximum-product-of-word-lengths/), etc.

Here XOR is a key as well, because it's a sum of two binaries without taking carry into account.

![image](https://user-images.githubusercontent.com/19383145/123190383-71c21280-d46d-11eb-9139-8fff288c7e37.png)

To find current carry is quite easy as well, it's AND of two input numbers, shifted one bit to the left.

![image](https://user-images.githubusercontent.com/19383145/123190411-7e466b00-d46d-11eb-9808-e892a99e1881.png)

Now the problem is reduced: one has to find the sum of answer without carry and carry. It's the same problem - to sum two numbers, and hence one could solve it in a loop with the condition statement "while carry is not equal to zero".

**Algorithm**

- Convert a and b into integers x and y, x will be used to keep an answer, and y for the carry.

- While carry is nonzero: ```y != 0```:

  - Current answer without carry is XOR of x and y: ```answer = x^y```.

  - Current carry is left-shifted AND of x and y: ```carry = (x & y) << 1```.

  - Job is done, prepare the next loop: ```x = answer```, ```y = carry```.

- Return x in the binary form.

**Implementation**

```
import java.math.BigInteger;
class Solution {
  public String addBinary(String a, String b) {
    BigInteger x = new BigInteger(a, 2);
    BigInteger y = new BigInteger(b, 2);
    BigInteger zero = new BigInteger("0", 2);
    BigInteger carry, answer;
    while (y.compareTo(zero) != 0) {
      answer = x.xor(y);
      carry = x.and(y).shiftLeft(1);
      x = answer;
      y = carry;
    }
    return x.toString(2);
  }
}
```

![image](https://user-images.githubusercontent.com/19383145/123190759-2825f780-d46e-11eb-8d0a-e2954dafd3c4.png)

### Approach 3: Easy solution / char conversion

```
public class AddBinary {
    /*
    * Given two binary strings, return their sum (also a binary string).
    *
    * The input strings are both non-empty and contains only characters 1 or 0.
    *
    * Example 1:
    * Input: a = "11", b = "1"
    * Output: "100"
    *
    * Example 2:
    * Input: a = "1010", b = "1011"
    * Output: "10101"
    *
    * */

    public static void main(String[] args){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        // Initialize result
        String result = "";

        /* We only want binary numbers which is only the digits
        * 1 and 0. We will use the sum to carry over any digits
        * that are greater 1
        * */
        int sum = 0;

        /*
        * We are going to traverse through both strings
        * starting at the last character
        * */
        int aCurrentIndex = a.length() - 1, bCurrentIndex = b.length() - 1;
        /*
        * While the current a string index is greater than zero
        * or
        * the current b string index is greater than zero
        * or
        * The sum is equal to 1*/
        while (aCurrentIndex >= 0 || bCurrentIndex >= 0 || sum == 1)
        {

            /*
            * Add the character at the current index by converting it to its
            * corresponding integer. If there is no number at the current index,
            * Add zero
            * */
            sum += ((aCurrentIndex >= 0)? a.charAt(aCurrentIndex) - '0': 0);
            sum += ((bCurrentIndex >= 0)? b.charAt(bCurrentIndex) - '0': 0);

            /*
            * Divide the sum by two and convert its remainder to its corresponding integer
            * then add it to the result string
            *
            * NOTE: dividing by 2 will leave a remainder of 1 or 0
            *
            * If the digit sum is 1 or 3, this code will
            * add 1 to the result
            * */
            result = (char)(sum % 2 + '0') + result;

            /*
            * Compute the carry by dividing by 2. Dividing by 2 will leave a result of 1 or 0
            * */
            sum /= 2;

            // Move to next string indices
            aCurrentIndex--; bCurrentIndex--;
        }

        return result;
    }

    /*
    * Complexity Analysis
    * Time Complexity: O(a + b) where a is the length of the first string
    *                  and b is the length of the second string
    * Space Complexity: O(N) where N is the strings in the string builder
    * */
}
```
