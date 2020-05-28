package Strings.repeatedStringMatch;

/*
* Given two strings A and B, find the minimum number of times A
* has to be repeated such that B is a substring of it.
* If no such solution, return -1.
*
* For example, with A = "abcd" and B = "cdabcdab".
* Return 3, because by repeating A three times (“abcdabcdabcd”),
* B is a substring of it; and B is not a substring of A
* repeated two times ("abcdabcd").
*
* Note:
* The length of A and B will be between 1 and 10000.
* */

public class RepeatedStringMatch {
    public static void main(String[] args){
        String A = "abcd";
        String B = "cdabcdab";
        System.out.println(repeatedStringMatch(A, B));
    }

    public static int repeatedStringMatch(String A, String B) {
        // If String A or String B is null, return -1
        if(A == null || B == null){
            return -1;
        }

        /*
         * if A is longer than B,
         * we only need to repeat A once if B is already a substring of A
         * */

        // If String A is at least twice the size of String B
        if(A.length() >= B.length() * 2){

            /*
             * Check to see if String B is already in String A.
             * If it is, return 1.
             * NOTE: If B isn't in A, it will return -1 by default*/
            if(A.indexOf(B)!= -1){
                return 1;
            }

            // Make a string with two String A's
            //String C = new String(A + A);

            /*
             * Check to see if String B is in String A + A.
             * If it is, return 2.
             * NOTE: If B isn't in A, it will return -1 by default
             * */
            if((A + A).indexOf(B) != -1){
                return 2;
            }

        }

        /*
         * If B is not a substring of A, check to see if A and B share a character set.
         * If they don't share a character set and B is not a substring of A + A,
         * B will never be a substring of A no matter how many times it is repeated.
         * */
        int upperA;
        int upperB;
        int lowerA;
        int lowerB;
        char upperCase;
        char lowerCase;
        /*
        * Loop 26 times. There are 26 letters in the alphabet
        * */
        for (int currentIndex = 0; currentIndex < 26; currentIndex++){
            // Convert the current index to its corresponding uppercase letter in the alphabet
            upperCase = (char) ('A' + currentIndex);
            // Convert the current index to its corresponding lowercase letter in the alphabet
            lowerCase = (char) ('a' + currentIndex);

            /* check to see if the current uppercase letter is a substring of A
            * If it's not, the index will be equal to -1*/
            upperA = A.indexOf(upperCase);
            /* check to see if the current uppercase letter is a substring of B
            * If it's not, the index will be equal to -1*/
            upperB = B.indexOf(upperCase);
            /* check to see if the current lowercase letter is a substring of A
            * If it's not, the index will be equal to -1*/
            lowerA = A.indexOf(lowerCase);
            /* check to see if the current lowercase letter is a substring of B
            * If it's not, the index will be equal to -1*/
            lowerB = B.indexOf(lowerCase);

            /*
            * If the current uppercase letter isn't in String A or String B
            * AND
            * If the upperA does not equal upperB
            * return -1
            * */
            if(upperA == -1 || upperB == -1) if(upperA != upperB) return -1;

            /*
             * If the current lowercase letter isn't in String A or String B
             * AND
             * If the lowerA does not equal lowerB
             * return -1
             * */
            if(lowerA == -1||lowerB == -1) if(lowerA != lowerB) return -1;
        }

        // Initialize a new string builder
        StringBuilder stringBuilder = new StringBuilder();

        // Add String A to string builder
        stringBuilder.append(A);

        // Start counting the A strings
        int stringCount = 1;

        // While the string builder is less than twice the size of String B
        while(stringBuilder.length() < B.length() * 2){
            /*
             * If the string builder is greater than or equal to the size of String B
             * AND
             * If String B is a substring of the string builder string
             * */
            if(stringBuilder.length() >= B.length() && stringBuilder.toString().indexOf(B)!= -1){
                // return stringCount
                return stringCount;
            }

            else{
                // Append A String to string builder
                stringBuilder.append(A);

                // Increment String count by 1
                stringCount++;
            }

        }

        /*
         * Check to see if String B is in stringBuilder.
         * If it is, return the string count.
         * NOTE: If B isn't in stringBuilder, it will return -1 by default
         * */
        if(stringBuilder.toString().indexOf(B)!= -1){
            return stringCount;
        }

        // Otherwise, return -1
        return -1;

    }

    /*
    * Complexity Analysis
    * Time Complexity: O(N) Where N is the number of strings in the string builder
    * Space Complexity: O(N) Where N is the space in the string builder
    * */
}
