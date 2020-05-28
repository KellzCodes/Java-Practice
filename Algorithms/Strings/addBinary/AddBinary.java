package Strings.addBinary;

public class AddBinary {
    /*
    * Given two binary strings, return their sum (also a binary string).
    *
    * The input strings are both non-empty and contains only characters 1 or 0.
    *
    * Example 1:
    * Input: a = "11", b = "1"
    * Output: "100"
    *
    * Example 2:
    * Input: a = "1010", b = "1011"
    * Output: "10101"
    *
    * */

    public static void main(String[] args){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        // Initialize result
        String result = "";

        /* We only want binary numbers which is only the digits
        * 1 and 0. We will use the sum to carry over any digits
        * that are greater 1
        * */
        int sum = 0;

        /*
        * We are going to traverse through both strings
        * starting at the last character
        * */
        int aCurrentIndex = a.length() - 1, bCurrentIndex = b.length() - 1;
        /*
        * While the current a string index is greater than zero
        * or
        * the current b string index is greater than zero
        * or
        * The sum is equal to 1*/
        while (aCurrentIndex >= 0 || bCurrentIndex >= 0 || sum == 1)
        {

            /*
            * Add the character at the current index by converting it to its
            * corresponding integer. If there is no number at the current index,
            * Add zero
            * */
            sum += ((aCurrentIndex >= 0)? a.charAt(aCurrentIndex) - '0': 0);
            sum += ((bCurrentIndex >= 0)? b.charAt(bCurrentIndex) - '0': 0);

            /*
            * Divide the sum by two and convert its remainder to its corresponding integer
            * then add it to the result string
            *
            * NOTE: dividing by 2 will leave a remainder of 1 or 0
            *
            * If the digit sum is 1 or 3, this code will
            * add 1 to the result
            * */
            result = (char)(sum % 2 + '0') + result;

            /*
            * Compute the carry by dividing by 2. Dividing by 2 will leave a result of 1 or 0
            * */
            sum /= 2;

            // Move to next string indices
            aCurrentIndex--; bCurrentIndex--;
        }

        return result;
    }

    /*
    * Complexity Analysis
    * Time Complexity: O(a + b) where a is the length of the first string
    *                  and b is the length of the second string
    * Space Complexity: O(N) where N is the strings in the string builder
    * */
}
