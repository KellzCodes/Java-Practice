package Arrays.pivotIndex;

/*
* Given an array of integers "nums", write a method that returns the "pivot" index of this array.
* We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of
* the numbers to the right of the index. If no such index exists, we should return -1. If there are multiple pivot
* indexes, you should return the left-most pivot index.
* */

public class PivotIndex {
    public static void main (String[] args){
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));

        int[] nums2 = {1, 2, 3};
        System.out.println(pivotIndex(nums2));
    }

    public static int pivotIndex(int[] nums) {
        // Return -1 if the array is empty
        if (nums.length == 0) {
            return -1;
        }

        /* Go through the whole array starting at index 1.
        * Change each number.
        * The number at the current index equals the sum of the
        * current and previous values
        *
        * This way, we will always have access to the sum of the numbers
        * before the current index
        * */
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }

        /* The number at the last index is the sum of
        * all the numbers in the array
        * */
        int last = nums.length - 1;

        // if the numbers at the first and last index are equal, return 0
        // This also handles arrays that have only 1 character
        if (nums[last] - nums[0] == 0) {
            return 0;
        }

        // Go through the array, starting at index 1
        for (int i = 1; i < nums.length; i++) {
            /* If the number at the last index minus the number at the current index
            * is equal to the previous index, return  the current index
            * */
            if (nums[last] - nums[i] == nums[i - 1]) {
                return i;
            }
        }
        // Otherwise, return -1
        return -1;
    }

    /*
    * Time Complexity: This will take O(N) time. N is the number of integers.
    * Space Complexity: This will take O(1) space. */
}
