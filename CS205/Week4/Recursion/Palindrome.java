import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) { new Palindrome().run(); }

    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string? ");
        String s = in.next();
        if (isPalindromic(s)) {
            System.out.println(s + " is a palindrome.");
        } else {
            System.out.println(s + " is not a palindrome.");
        }
    }

    public boolean isPalindromic(String pString) {
        // The base case is when the length of pString is less than or equal to 1.
        // In this case, pString is a palindrome, so we return true. This implements
        // Rule 1.
        if (pString.length() <= 1) {
            return true;

        } else {
            // Check Rule 2. If the first and last characters are not the same then
            // pString is not a palindrome so we return false.
            if (pString.charAt(0) != pString.charAt(pString.length() - 1)) {
                return false;

            } else {
                // Check Rule 3, the recursive rule. We got here because the first and
                // last characters are the same. We now create a new string t which
                // contains the substring of pString starting at index 1 up to and
                // including pString.length() - 2. The String.substring() method can
                // be used to extract a substring from a string. However, the method is
                // a bit peculiar: s.substring(i, j) would return a substring of s
                // starting at index i up to and including the character at j-1, i.e.,
                // it does not return the character at index j.
                String t = pString.substring(1, pString.length()-1);

                // By Rule 3, if t is a palindrome then so is pString, so if
                // isPalindromic(t) returns true, we return true. Otherwise, if
                // isPalindromic(t) returns false, we return false. To be more concise,
                // we can say that at this point we simply need to return what
                // isPalindromic(t) returns.
                return isPalindromic(t);
            }
        }
    }
}