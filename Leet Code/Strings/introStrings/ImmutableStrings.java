package Strings.introStrings;

public class ImmutableStrings {
    /*
    * an immutable string cannot be modified. If you want to modify just
    * one of the characters, you have to create a new string.
    *
    * string concatenation is slow for Java but there is no noticeable
    * performance impact in C++.
    *
    * Take the following code:
    *
    *
    * String s = "";
      int n = 10000;
      for (int i = 0; i < n; i++) {
        s += "hello";
      }
    *
    * In Java, since the string is immutable, concatenation works by first allocating
    * enough space for the new string, copy the contents from the old string and append
    * to the new string. Therefore, the time complexity in total will be:
    * 5 + 5 × 2 + 5 × 3 + … + 5 × n
    * = 5 × (1 + 2 + 3 + … + n)
    * = 5 × n × (n + 1) / 2,
    * which is O(n2).
    *
    * If you want your string to be mutable, you can convert it to a char array
    * */

    public static void main(String[] args) {
        String string = "Hello World";
        char[] charArray = string.toCharArray();
        charArray[5] = ',';
        System.out.println(charArray);

        /*
         * If you have to concatenate strings often, it will be better to use some
         * other data structures like StringBuilder. The below code runs in O(n)
         * complexity.
         * */

        int number = 10000;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < number; i++){
            str.append("hello");
        }
        String toString = str.toString();
        System.out.println(toString);
    }
}
