package largestNumberAtLeastTwiceAsOthers;

/*
* In a given integer array nums, there is always exactly one largest element.
* Find whether the largest element in the array is at least twice as much as every
* other number in the array. If it is, return the index of the largest element,
* otherwise return -1.
* */

public class Main {
    public static void main(String[] args){
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {

        // If the array is empty, return -1
        if(nums.length == 0){
            return -1;
        }

        // If the array has only one element, return 0 for the first index
        if(nums.length == 1){
            return 0;
        }

        // the number at the first index starts as the first largest number
        int largest = 0;
        // the number at the second index starts as the second largest number
        int secondLargest = 1;

        // Start at index 1 to compare the "largest" number to the rest of the numbers
        for(int i = 1; i < nums.length; i++) {
            /* if the number in the i index is greater than the "largest" number,
            * the largest becomes the second largest and i becomes the new largest */
            if(nums[i] > nums[largest]) {
                secondLargest = largest;
                largest = i;
            }
            /* if the number at the index is not the largest AND it is greater than the second
            * largest, then it becomes the new second largest */
            else if(nums[i] != nums[largest] && nums[i] > nums[secondLargest]){
                secondLargest = i;
            }
        }

        /* if the double of the second largest number is less than or equal the largest
        * number, return the largest number's index */
        if(nums[secondLargest] * 2 <= nums[largest])
            return largest;

        // if not, return -1
        return -1;
    }
}
