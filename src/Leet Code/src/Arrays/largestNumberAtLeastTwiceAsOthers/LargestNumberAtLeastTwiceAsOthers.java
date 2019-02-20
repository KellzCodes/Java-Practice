package Arrays.largestNumberAtLeastTwiceAsOthers;

/*
* In a given integer array nums, there is always exactly one largest element.
* Find whether the largest element in the array is at least twice as much as every
* other number in the array. If it is, return the index of the largest element,
* otherwise return -1.
* */

public class LargestNumberAtLeastTwiceAsOthers {
    public static void main(String[] args){
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        // Return 1 if the array is empty
        if (nums.length == 0) {
            return -1;
        }

        // Return 0 if there is only one integer in the array
        else if (nums.length == 1) {
            return 0;
        }


        else {
            // The largest number in the array starts at index 0
            int largestNumber = nums[0];
            // This is a number that will be compared to the largest number, its current value is a placeholder
            int secondNumber = Integer.MIN_VALUE; // This is a constant holding the minimum value an int can have, -2^31.
            // Compare the numbers in the array, starting with the first index
            int compareIndex = 0;

            // Traverse through the array starting at index 1,
            for (int currentIndex = 1; currentIndex < nums.length; currentIndex++) {
                // The current number is the value at the current index
                int currentNumber = nums[currentIndex];

                /* If the current number is greater than the largest number*/
                if (currentNumber > largestNumber) {
                    // The second number becomes the largest number
                    secondNumber = largestNumber;
                    // The largest number becomes the current number
                    largestNumber = currentNumber;
                    // The compare index becomes the current index
                    compareIndex = currentIndex;
                }

                /* If the current number is greater than the second number */
                else if (currentNumber > secondNumber) {
                    // The second number becomes the current number
                    secondNumber = currentNumber;
                }
            }

            /* Return the compare index if the largest number is greater than
            * or equal to twice the second number */
            if (largestNumber >= secondNumber * 2) {
                return compareIndex;
            }
        }

        // otherwise, return -1
        return -1;
    }
}
