package Arrays.kEmptySlots;

/*
* There is a garden with N slots. In each slot, there is a flower.
* The N flowers will bloom one by one in N days. In each day, there
* will be exactly one flower blooming and it will be in the status
* of blooming since then.
*
* Given an array flowers consists of number from 1 to N. Each number
* in the array represents the place where the flower will open in that day.
*
* For example, flowers[i] = x means that the unique flower that blooms at
* day i will be at position x, where i and x will be in the range from 1 to N.
*
* Also given an integer k, you need to output in which day there exists two
* flowers in the status of blooming, and also the number of flowers between
* them is k and these flowers are not blooming.
*
* If there isn't such day, output -1.
*
* Example 1:
* Input: flowers: [1,3,2]
* k: 1
* Output: 2
* Explanation: In the second day, the first and the third flower have become blooming.
*
* Example 2:
* Input: flowers: [1,2,3]
* k: 1
* Output: -1
*
* Note: The given array will be in the range [1, 20000].
* */

public class KemptySlots {
    public static void main(String[] args){
        int[] flowers = new int[]{3, 1, 7, 6, 9, 8, 5, 2, 4};
        System.out.println(kEmptySlots(flowers, 3));
    }
    public static int kEmptySlots(int[] flowers, int k) {
        // Count the number of flowers
        int numberOfFlowers = flowers.length;
        // keep track of bloomed flowers
        boolean[] bloomed = new boolean[numberOfFlowers];
        // ignore flowers that were already checked
        boolean[] ignored = new boolean[numberOfFlowers];

        // Traverse through flowers array
        for (int currentIndex = 0; currentIndex < numberOfFlowers; currentIndex++) {
            int currentDay = currentIndex + 1;
            int currentFlower = flowers[currentIndex] - 1;
            // If current flower slot is ignored, start from the beginning of the loop
            if (ignored[currentFlower]) continue;
            // The current flower is now blooming
            bloomed[currentFlower] = true;

            // Integers used to find two flowers in the state of blooming and k slots between them
            int lowerFlower = currentFlower - k - 1;
            int upperFlower = currentFlower + k + 1;

            // If the lower flower slot is less than the lowest index
            if (lowerFlower < 0) {
                // Traverse from zero to the current flower slot
                for (int kFlower = 0; kFlower < currentFlower; kFlower++) ignored[kFlower] = true;
            }
            else {
                // If the lower flower slot is bloomed
                if (bloomed[lowerFlower]) {
                    // boolean used to check for bloomed flowers
                    boolean nobloom = true;
                    /*
                    * Since the lower flower slot is bloomed, traverse from the next slot to
                    * the current flower slot
                    * */
                    for (int kFlower = lowerFlower + 1; kFlower < currentFlower; kFlower ++) {
                        /*
                        * Check to see if the kFlower is bloomed.
                        * If it is, break the for loop and mark nobloom as false
                        * */
                        if (bloomed[kFlower]) {
                            nobloom = false;
                            break;
                        }
                    }
                    /*
                    * If none of the flowers between lower flower slot and upper flower slot
                    * have bloomed, return the current day
                    * */
                    if (nobloom)
                        return currentDay;

                    /*
                     * If we were not able to find k non bloomed flowers between
                     * lower flower slot and current flower slot, mark each flower between
                     * them as ignored in the ignored array
                     * */
                    else {
                        for (int kFlower = lowerFlower + 1; kFlower < currentFlower; kFlower ++) {
                            ignored[kFlower] = true;
                        }
                    }
                }
            }

            // If the upper flower slot is greater than the highest index
            if (upperFlower > numberOfFlowers - 1) {
                // Mark every flower between the current flower slot and the upper flower slot as ignored
                for (int kFlower = currentFlower + 1; kFlower < numberOfFlowers; kFlower++) {
                    ignored[kFlower] = true;
                }
            }

            else {
                // If the upper flower slot is bloomed
                if (bloomed[upperFlower]) {
                    // boolean used to check for bloomed flowers
                    boolean nobloom = true;
                    /*
                    * Since the upper flower slot is bloomed, traverse between the
                    * current flower slot and the upper flower slot
                    * */
                    for (int kFlower = currentFlower + 1; kFlower < upperFlower; kFlower++) {
                        /*
                        * If the kFlower is bloomed, nobloom is false.
                        * break the loop
                        * */
                        if (bloomed[kFlower]) {
                            nobloom = false;
                            break;
                        }
                    }

                    /*
                    * If none of the flowers between the current flower slot and the upper
                    * flower slot have bloomed, return the current day*/
                    if (nobloom)
                        return currentDay;

                    /*
                     * If we were not able to find k non bloomed flowers between
                     * current flower slot and upper flower slot, mark each flower between
                     * them as ignored in the ignored array
                     * */
                    else {
                        for (int kFlower = currentFlower + 1; kFlower < upperFlower; kFlower++) {
                            ignored[kFlower] = true;
                        }
                    }
                }
            }

        }

        return -1;



    }
}
