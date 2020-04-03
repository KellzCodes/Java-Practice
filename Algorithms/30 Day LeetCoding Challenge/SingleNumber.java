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
        int[] nums = {2,2,1};

        // Put the array in the singleNumber function and print the results
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        // Take the first number of the array
        int num = nums[0];

        /**
         * Traverse through the array from the beginning and do an
         * XOR comparison between num and every other number in the
         * array.
         *
         * XOR or Exclusive Or is a logical operation that outputs
         * true only when inputs differ (one is true, the other is
         * false)
         * */
        for (int i = 1; i < nums.length; i++) num ^= nums[i];

        // Return the number that does not have a double
        return num;
    }
}
