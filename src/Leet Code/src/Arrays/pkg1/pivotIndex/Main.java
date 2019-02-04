package Arrays.pkg1.pivotIndex;

/*
* Given an array of integers "nums", write a method that returns the "pivot" index of this array.
* We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of
* the numbers to the right of the index. If no such index exists, we should return -1. If there are multiple pivot
* indexes, you should return the left-most pivot index.
* */

public class Main {
    public static void main (String[] args){
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(Solution1(nums));

        int[] nums2 = {1, 2, 3};
        System.out.println(Solution1(nums2));
    }

    public static int Solution1(int[] nums){
        /*
        * We need to quickly compute the sum of values to the left and
        * right of every index.
        * */

        // Sum of numbers
        int sum = 0;
        // Sum of numbers to the left of the index
        int leftSum = 0;

        // Add all the numbers in nums array
        for(int x: nums){
            sum += x;
        }

        for(int i = 0; i < nums.length; ++i){
            // find the right sum
            if(leftSum == sum - leftSum - nums[i]){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
