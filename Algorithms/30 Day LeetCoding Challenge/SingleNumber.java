/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 * */

public class SingleNumber {
    public static void main (String args[]){
        // Create an array
        int[] nums = {4,1,2,1,2};

        // Put the array in the singleNumber function and print the results
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        // Count the number of integers in the array
        int size = nums.length;
        // Isolate the first number in the array
        int result = nums[0];
        
        // Traverse through the entire array starting from the second number
        for (int i = 1; i < size; i++)
            /**
             * Use an XOR gate to find the number without a match.
             *
             * XOR or Exclusive Or is a  logical operation that outputs
             * true only when inputs differ (one is true, the other is
             * false).
             *
             * In this case, the program will traverse through the array
             * adding each number to the result until it comes to a number
             * it has already added. Instead of adding a number again, the
             * program will subtract the number from result. When the
             * for-loop has completed, the result will be the number
             * that was added but not subtracted.
             * */
            result = result ^ nums[i];
            
        // Return the "true" integer that does not appear twice
        return result;
    }
}
