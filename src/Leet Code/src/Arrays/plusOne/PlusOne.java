package Arrays.plusOne;

/* Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element
in the array contain a single digit. You may assume the integer does not contain any leading zero,
except the number 0 itself.

Example 1:
Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
*/

public class PlusOne {
    public static void main(String[] args){
        int[] digits = new int[]{9, 9, 9, 9};
        int[] newDigits = plusOne(digits);
        for (int i = 0; i < newDigits.length; i++){
            System.out.print(newDigits[i] + " ");
        }
    }
    public static int[] plusOne(int[] digits) {

        // find out how long the array is
        int n = digits.length;

        // Traverse through the array backward
        for(int i = n - 1; i >= 0; i--) {
            // if the last digit is less than 9, add 1 to it then return the array
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // Otherwise, change the digit at the index to zero
            digits[i] = 0;
        }

        /* If all the numbers are 9 or greater, create a new array with all the digits
        * plus space for one more digit */
        int[] newNumber = new int [n + 1];
        // Make the digit at the first index 1
        newNumber[0] = 1;

        // return the new array
        return newNumber;
    }
}
