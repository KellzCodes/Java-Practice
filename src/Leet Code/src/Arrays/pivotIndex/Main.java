package Arrays.pivotIndex;

/*
* Given an array of integers "nums", write a method that returns the "pivot" index of this array.
* We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of
* the numbers to the right of the index. If no such index exists, we should return -1. If there are multiple pivot
* indexes, you should return the left-most pivot index.
* */

public class Main {
    public static void main (String[] args){
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));

        int[] nums2 = {1, 2, 3};
        System.out.println(pivotIndex(nums2));
    }

    public static int pivotIndex(int[] nums) {
        // The sum of all the numbers in the array
        int sum = 0;

        // Add all the numbers in nums
        for(int x : nums) {
            sum += x;
        }

        // The left side of the array
        int leftSum = 0;

        // go through the entire array and check if the left side equals the right side
        for (int i = 0; i < nums.length; i++) {
            // the right sum is the sum minus the left sum minus the index
            // if the left side of the current index is equal to the right side, return it
            if (leftSum == sum - leftSum - nums[i]) {
                return i;
            }
            // if not, add the number at the current index to the left sum
            else {
                leftSum += nums[i];
            }
        }
        return -1;
    }
}
