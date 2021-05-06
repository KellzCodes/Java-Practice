# Find Numbers with Even Number of Digits

**Example 1**:

```
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
```

**Example 2**:

```
Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
```
 

**Constraints**:

- 1 <= nums.length <= 500
- 1 <= nums[i] <= 10^5

```
    public int findNumbers(int[] nums) {
        
        // store number of even digits
        int numEvenDigits = 0;
        
        // iterate nums
        for (int i = 0; i < nums.length; i += 1) {
            
            // convert current element into String
            String digit = String.valueOf(nums[i]);
            
            // increase numEvenDigits if length of String is even number
            if (digit.length() % 2 == 0) {
                numEvenDigits += 1;
            }
        }
        
        return numEvenDigits;
    }
```