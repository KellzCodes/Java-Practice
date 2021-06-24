# Introduction to String

A string is actually an array of ```unicode characters```. You can perform almost all the operations we used in an array.

However, there are some differences. In this article, we will go through some of them which you should be aware of when dealing with a string. These features might vary a lot from one language to another.

### Compare Function

String has its own ```compare function```

However, there is a problem:
> Can we use "==" to compare two strings?

It depends on the answer to the question:
> Does the language support operator overloading?

1. If the answer is ```yes``` (like C++), we ```may``` use "==" to compare two strings.
2. If the answer is ```no``` (like Java), we ```may not``` use "==" to compare two strings. When we use "==", it actually compares whether these two objects are the same object.

Let's run the following example and compare the results:

```
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        // initialize
        String s1 = "Hello World";
        System.out.println("s1 is \"" + s1 + "\"");
        String s2 = s1;
        System.out.println("s2 is another reference to s1.");
        String s3 = new String(s1);
        System.out.println("s3 is a copy of s1.");
        // compare using '=='
        System.out.println("Compared by '==':");
        // true since string is immutable and s1 is binded to "Hello World"
        System.out.println("s1 and \"Hello World\": " + (s1 == "Hello World"));
        // true since s1 and s2 is the reference of the same object
        System.out.println("s1 and s2: " + (s1 == s2));
        // false since s3 is refered to another new object
        System.out.println("s1 and s3: " + (s1 == s3));
        // compare using 'equals'
        System.out.println("Compared by 'equals':");
        System.out.println("s1 and \"Hello World\": " + s1.equals("Hello World"));
        System.out.println("s1 and s2: " + s1.equals(s2));
        System.out.println("s1 and s3: " + s1.equals(s3));
        // compare using 'compareTo'
        System.out.println("Compared by 'compareTo':");
        System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
        System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
        System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));
    }
}
```

### Immutable or Mutable

```Immutable``` means that you can't change the content of the string once it's initialized.

1. In some languages (like C++), the string is ```mutable```. That is to say, you can modify the string just like what you did in an array. 
2. In some other languages (like Java), the string is ```immutable```. 

You can determine whether the string in your favorite language is immutable or mutable by ```testing the modification operation```. Here is an example:

```
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World";
        s1[5] = ',';
        System.out.println(s1);
    }
}
```

### Extra Operations

Compare to an array, there are some extra operations we can perform on a string. Here are some examples:

```
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String s1 = "Hello World";
        // 1. concatenate
        s1 += "!";
        System.out.println(s1);
        // 2. find
        System.out.println("The position of first 'o' is: " + s1.indexOf('o'));
        System.out.println("The position of last 'o' is: " + s1.lastIndexOf('o'));
        // 3. get substring
        System.out.println(s1.substring(6, 11));
    }
}
```

You should be aware of the ```time complexity``` of these built-in operations.

For instance, if the length of the string is *N*, the time complexity of both finding operation and substring operation is *O(N)*.

Also, in languages which the string is immutable, you should be careful with the concatenation operation.

Never forget to take the time complexity of built-in operations into consideration when you compute the time complexity for your solution.

# Immutable String - Problems & Solutions

You should know whether the string in your favorite language is immutable or not in the previous paragraph. If the string is immutable, it will bring some problems. Hopefully, we will also provide the solution at the end.

### Modification Operation

Obviously, an immutable string cannot be modified. If you want to modify just one of the characters, you have to create a new string.

### Beware of String Concatenation in Java

You should be very careful with string concatenation. Let's look at an example when we do ```string concatenation``` repeatedly in a for loop:

```
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String s = "";
        int n = 10000;
        for (int i = 0; i < n; i++) {
            s += "hello";
        }
    }
}
```

Notice how slow string concatenation is for Java? On the other hand, there is no noticeable performance impact in C++.

In Java, since the string is ```immutable```, concatenation works by first allocating enough space for the new string, copy the contents from the old string and append to the new string.

Therefore, the time complexity in total will be:

![image](https://user-images.githubusercontent.com/19383145/123188836-bc8e5b00-d46a-11eb-8140-199c8bdfd4f2.png)

### Solutions

If you want your string to be mutable, there are some substitutions:

1. If you did want your string to be mutable, you can convert it to a char array.

```
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        char[] str = s.toCharArray();
        str[5] = ',';
        System.out.println(str);
    }
}
```

2. If you have to concatenate strings often, it will be better to use some other data structures like ```StringBuilder```. The below code runs in ```O(n)``` complexity.

```
// "static void main" must be defined in a public class.
public class Main {
    public static void main(String[] args) {
        int n = 10000;
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append("hello");
        }
        String s = str.toString();
    }
}
```
