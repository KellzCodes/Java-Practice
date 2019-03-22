package Strings.introStrings;

public class IntroStrings {
    public static void main (String[] args){
        // Initialize
        String string1 = "Hello World";
        System.out.println("string1 is \"" + string1 + "\"");

        String string2 = string1;
        System.out.println("string2 is another reference to string1");

        String string3 = new String(string1);
        System.out.println("string3 is a copy of string1.");

        // compare using '=='
        System.out.println("Compared by '==':");
        // true since string is immutable and s1 is binded to "Hello World"
        System.out.println("string1 and \"Hello World\": " + (string1 == "Hello World"));

        // true since s1 and s2 is the reference of the same object
        System.out.println("string1 and string2: " + (string1 == string2));

        // false since s3 is referred to another new object
        System.out.println("string1 and string3: " + (string1 == string3));

        // compare using 'equals'
        System.out.println("Compared by 'equals':");
        System.out.println("string1 and \"Hello World\": " + string1.equals("Hello World"));
        System.out.println("string1 and string2: " + string1.equals(string2));
        System.out.println("string1 and string3: " + string1.equals(string3));

        // compare using 'compareTo'
        System.out.println("Compared by 'compareTo':");
        System.out.println("string1 and \"Hello World\": " +
                (string1.compareTo("Hello World") == 0));
        System.out.println("string1 and string2: " + (string1.compareTo(string2) == 0));
        System.out.println("string1 and string3: " + (string1.compareTo(string3) == 0));

        /*
        * Immutable means that you can't change the content of the string once it's
        * initialized.
        *
        * The following code would not print in Java but it would in C++
        *
        * string1[5] = ',';
        * */

        // 1. concatenate
        string1 += "!";
        System.out.println(string1);
        // 2. find
        System.out.println("The position of first 'o' is: " + string1.indexOf('o'));
        System.out.println("The position of last 'o' is: " + string1.lastIndexOf('o'));
        // 3. get substring
        System.out.println(string1.substring(6, 11));

        /*
        * You should be aware of the time complexity of these built-in operations.
        * For instance, if the length of the string is N, the time complexity of
        * both finding operation and substring operation is O(N). Also, in languages
        * which the string is immutable, you should be careful with the concatenation
        * operation (we will explain this in next article as well). Never forget to
        * take the time complexity of built-in operations into consideration when you
        * compute the time complexity for your solution.
        * */
    }
}
