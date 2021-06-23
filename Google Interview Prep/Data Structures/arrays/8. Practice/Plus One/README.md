# Plus One

Given a **non-empty** array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

**Example 1:**
> **Input:** digits = [1,2,3]
> 
> **Output:** [1,2,4]
> 
> **Explanation:** The array represents the integer 123.

**Example 2:**
> **Input:** digits = [4,3,2,1]
> 
> **Output:** [4,3,2,2]
> 
> **Explanation:** The array represents the integer 4321.

**Example 3:**
> **Input:** digits = [0]
> 
> **Output:** [1]

**Constraints**
- ```1 <= digits.length <= 100```
- ```0 <= digits[i] <= 9```

## Solution

### Approach 1: Schoolbook Addition with Carry

**Intuition**

Let us identify the rightmost digit which is not equal to nine and increase that digit by one. All the following consecutive digits of nine should be set to zero.

Here is the simplest use case which works fine.

![image](https://user-images.githubusercontent.com/19383145/123021179-981a7c00-d3a1-11eb-9745-ff7739427d24.png)

Here is a slightly complicated case which still passes.

![image](https://user-images.githubusercontent.com/19383145/123021224-af596980-d3a1-11eb-8754-fed1a356ef5c.png)

And here is the case which breaks everything, because all the digits are nines.

![image](https://user-images.githubusercontent.com/19383145/123021247-bbddc200-d3a1-11eb-9445-a4ea39e75fc9.png)

In this case, we need to set all nines to zero and append 1 to the left side of the array.

![image](https://user-images.githubusercontent.com/19383145/123021296-d31caf80-d3a1-11eb-9cf9-9b73e75d1427.png)

**Algorithm**
- Move along the input array starting from the end of array.
- Set all the nines at the end of array to zero.
- If we meet a not-nine digit, we would increase it by one. The job is done - return digits.
- We're here because **all** the digits were equal to nine. Now they have all been set to zero. We then append the digit 1 in front of the other digits and return the result.

```
public class PlusOne {
    public static void main(String[] args){
        int[] digits = new int[]{9, 9};
        int[] newDigits = plusOne(digits);
        for (int i = 0; i < newDigits.length; i++){
            System.out.print(newDigits[i] + " ");
        }
    }
    public static int[] plusOne(int[] digits) {
        // find out how long the array is
        int arrayLength = digits.length;

        // Traverse through the array backward
        for(int currentIndex = arrayLength - 1; currentIndex >= 0; currentIndex--) {
            // if the digit at the current index is less than 9, add 1 to it then return the array
            if(digits[currentIndex] < 9) {
                digits[currentIndex]++;
                return digits;
            }

            // Otherwise, change the digit at the current index to zero
            digits[currentIndex] = 0;
        }

        /* If all the numbers are 9 or greater, create a new array with all the digits
        * plus space for one more digit
        * array.length will return all zeros by default */
        int[] newDigits = new int [arrayLength + 1];

        // Make the digit at the first index 1
        newDigits[0] = 1;

        // return the new array
        return newDigits;
    }
}
```

**Complexity Analysis**

Let *N* be the number of elements in the input list.
- Time complexity: *O(N)* since it's not more than one pass along the input list.
- Space complexity: *O(N)*
  - Although we perform the operation **in-place** (i.e. on the input list itself), in the worst scenario, we would need to allocate an intermediate space to hold the result, which contains the *N+1* elements. Hence the overall space complexity of the algorithm is *O(N)*.
