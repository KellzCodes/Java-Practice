package Strings.reverseString;

/*
* Write a function that reverses a string. The input string is given as an array of characters char[].
* Do not allocate extra space for another array, you must do this by modifying the input array
* in-place with O(1) extra memory.
*
* You may assume all the characters consist of printable ascii characters.
* Example 1:
* Input: ["h","e","l","l","o"]
* Output: ["o","l","l","e","h"]
*
* Example 2:
* Input: ["H","a","n","n","a","h"]
* Output: ["h","a","n","n","a","H"]
* */

public class ReverseString {
    public static void main(String[] args){
        String hello = "hello";
        char[] charArray = hello.toCharArray();
        System.out.println(charArray);
        reverseString(charArray);
        System.out.println(charArray);
    }

    public static void reverseString(char[] charArray) {
        char swapChar;
        for (int currentIndex = 0; currentIndex < (charArray.length) / 2; currentIndex++) {
            swapChar = charArray[currentIndex];
            charArray[currentIndex] = charArray[charArray.length - 1 - currentIndex];
            charArray[charArray.length - 1 - currentIndex] = swapChar;
        }
    }
}
