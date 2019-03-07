package Strings.implementStrStr;

/*
* Implement strStr().
* Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*
* Example 1:
* Input: haystack = "hello", needle = "ll"
* Output: 2
*
* Example 2:
* Input: haystack = "aaaaa", needle = "bba"
* Output: -1
*
* Clarification:
* What should we return when needle is an empty string? This is a great question to ask during an interview.
*
* For the purpose of this problem, we will return 0 when needle is an empty string.
* This is consistent to C's strstr() and Java's indexOf().
* */

public class ImplementStrStr {

    public static void main (String[] args){
        String haystack = "Hello";
        String needle = "lo";
        int strStr = strStr(haystack, needle);
        System.out.println(strStr);
    }

    public static int strStr(String haystack, String needle) {
        /*
        * If haystack is null
        * or
        * if needle is null
        * or
        * if the haystack string is shorter than the needle string
        * Return -1 */
        if(haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }

        /*
        * If the needle string is empty, return 0
        * */
        if(needle.equals("")){
            return 0;
        }

        /*
        * Traverse through the haystack string */
        for(int currentIndex = 0; currentIndex < haystack.length() - needle.length() + 1; currentIndex++){
            // If the character at the current index equals the character at the first needle index
            if(haystack.charAt(currentIndex) == needle.charAt(0))
                /*
                * check to see if the substring at the current index in the haystack */
                if(haystack.substring(currentIndex, needle.length() + currentIndex).equals(needle))
                    // return the current index
                    return currentIndex;
        }

        // Otherwise return -1
        return -1;
    }

    /*
    * Complexity analysis
    * Time Complexity: O(N + M) where N and M are the haystack and needle strings
    * Space Complexity: O(1)
    * */
}
