# Reverse Words in a String III

Given a string ```s```, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

**Example 1:**
> **Input:** s = "Let's take LeetCode contest"
> 
> **Output:** "s'teL ekat edoCteeL tsetnoc"

**Example 2:**
> **Input:** s = "God Ding"
> 
> **Output:** "doG gniD"

**Constraints:**

![image](https://user-images.githubusercontent.com/19383145/123565330-81ea3280-d78a-11eb-94e5-b8b91215c736.png)

## Solution

### Approach #1 Simple Solution[Accepted]

The first method is really simple. We simply split up the given string based on whitespaces and put the individual words in an array of strings. Then, we reverse each individual string and concatenate the result. We return the result after removing the additional whitespaces at the end.

```
public class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(new StringBuffer(word).reverse().toString() + " ");
        return res.toString().trim();
    }
}
```

**Complexity Analysis**
- Time complexity : *O(n)*. where *n* is the length of the string.
- Space complexity : *O(n)*. *res* of size *n* is used.

### Approach #2 Without using pre-defined split and reverse function [Accepted]

**Algorithm**

We can create our own split and reverse function. Split function splits the string based on the delimiter " "(space) and returns the array of words. Reverse function returns the string after reversing the characters.

```
public class Solution {
    public String reverseWords(String s) {
        String words[] = split(s);
        StringBuilder res=new StringBuilder();
        for (String word: words)
            res.append(reverse(word) + " ");
        return res.toString().trim();
    }
    public String[] split(String s) {
        ArrayList < String > words = new ArrayList < > ();
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                words.add(word.toString());
                word = new StringBuilder();
            } else
                word.append( s.charAt(i));
        }
        words.add(word.toString());
        return words.toArray(new String[words.size()]);
    }
    public String reverse(String s) {
      StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++)
            res.insert(0,s.charAt(i));
        return res.toString();
    }
}
```

**Complexity Analysis**
- Time complexity : *O(n)*. where *n* is the length of the string.
- Space complexity : *O(n)*. *res* of size *n* is used.

### Approach #3 Using StringBuilder and reverse method [Accepted]

**Algorithm**

Instead of using split method, we can use temporary string *word* to store the word. We simply append the characters to the *word* until ```' '``` character is not found. On getting ```' '``` we append the reverse of the *word* to the resultant string *result*. Also after completion of loop , we still have to append the *reverse* of the *word*(last word) to the *result* string.

```
public class Solution {
    public String reverseWords(String input) {
        final StringBuilder result = new StringBuilder();
        final StringBuilder word = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word.append(input.charAt(i));
            } else {
                result.append(word.reverse());
                result.append(" ");
                word.setLength(0);
            }
        }
        result.append(word.reverse());
        return result.toString();
    }
}
```

**Complexity Analysis**
- Time complexity : *O(n)*. Single loop upto *n* is there, where *n* is the length of the string.
- Space complexity : *O(n)*. *result* and *word* size will grow upto *n*.

