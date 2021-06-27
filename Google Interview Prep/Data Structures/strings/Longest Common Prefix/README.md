# Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string ```""```.

**Example 1:**
Input: strs = ["flower","flow","flight"]
Output: "fl"

**Example 2:**
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

**Constraints:**
- ```1 <= strs.length <= 200```
- ```0 <= strs[i].length <= 200```
- ```strs[i]``` consists of only lower-case English letters.

## Solution

### Approach 1: Horizontal scanning

![image](https://user-images.githubusercontent.com/19383145/123530995-c2847600-d6ce-11eb-8769-16849d418de0.png)

![image](https://user-images.githubusercontent.com/19383145/123530997-cadcb100-d6ce-11eb-9036-97514635cb5c.png)

```
 public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}
```

![image](https://user-images.githubusercontent.com/19383145/123531007-ddef8100-d6ce-11eb-8c19-d711de6ce467.png)

### Approach 1A: Horizontal scanning using While loops

```
public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] array = new String[]{"flower","flow","flight"};
        String prefix = longestCommonPrefix(array);
        System.out.print(prefix);
    }
    public static String longestCommonPrefix(String[] strings) {
        // If the strings array is null or empty, return ""
        if (strings == null || strings.length == 0) return "";
        // Set the prefix to the first string in the array
        String prefix = strings[0];
        // Traverse through the strings array starting at index 0
        int currentIndex = 0;
        while (currentIndex < strings.length) {
            // While the string at the current index is not starting with the prefix
            while (!strings[currentIndex].startsWith(prefix)) {
                // Shorten the prefix at the end by one character
                prefix = prefix.substring(0, prefix.length() - 1);
                // If there is no prefix left, return ""
                if (prefix.isEmpty()) return "";
            }
            // go to the next index
            currentIndex++;
        }
        // return prefix
        return prefix;
    }
    /*
    * Complexity Analysis
    * Time Complexity: O(S), where S is the sum of all characters in all strings. 
    * The algorithm compares the string S1S1 with the other strings [S2...Sn]. 
    * There are S character comparisons, where S is the sum of all characters in the input array
    * Space Complexity: O(1)
    * */
}
```

### Approach 2: Vertical scanning

**Algorithm**

Imagine a very short string is the common prefix at the end of the array. The above approach will still do *S* comparisons. One way to optimize this case is to do vertical scanning. We compare characters from top to bottom on the same column (same character index of the strings) before moving on to the next column.

```
public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";
    for (int i = 0; i < strs[0].length() ; i++){
        char c = strs[0].charAt(i);
        for (int j = 1; j < strs.length; j ++) {
            if (i == strs[j].length() || strs[j].charAt(i) != c)
                return strs[0].substring(0, i);             
        }
    }
    return strs[0];
}
```

**Complexity Analysis**

- Time complexity : *O(S)* , where *S* is the sum of all characters in all strings. In the worst case there will be *n* equal strings with length *m* and the algorithm performs *S=m⋅n* character comparisons. Even though the worst case is still the same as Approach 1, in the best case there are at most *n⋅minLen* comparisons where *minLen* is the length of the shortest string in the array.
- Space complexity : *O(1)*. We only used constant extra space.

![image](https://user-images.githubusercontent.com/19383145/123531166-3e32f280-d6d0-11eb-8451-67465b1a7eb8.png)

![image](https://user-images.githubusercontent.com/19383145/123531171-45f29700-d6d0-11eb-8be1-fa5517a95b20.png)

```
public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) return "";    
        return longestCommonPrefix(strs, 0 , strs.length - 1);
}

private String longestCommonPrefix(String[] strs, int l, int r) {
    if (l == r) {
        return strs[l];
    }
    else {
        int mid = (l + r)/2;
        String lcpLeft =   longestCommonPrefix(strs, l , mid);
        String lcpRight =  longestCommonPrefix(strs, mid + 1,r);
        return commonPrefix(lcpLeft, lcpRight);
   }
}

String commonPrefix(String left,String right) {
    int min = Math.min(left.length(), right.length());       
    for (int i = 0; i < min; i++) {
        if ( left.charAt(i) != right.charAt(i) )
            return left.substring(0, i);
    }
    return left.substring(0, min);
}
```

![image](https://user-images.githubusercontent.com/19383145/123531187-5b67c100-d6d0-11eb-9b0c-57754019cad9.png)

![image](https://user-images.githubusercontent.com/19383145/123531189-69b5dd00-d6d0-11eb-98c6-aa60e45a4644.png)

![image](https://user-images.githubusercontent.com/19383145/123531191-6f132780-d6d0-11eb-949e-6a542cff7d65.png)

```
public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0)
        return "";
    int minLen = Integer.MAX_VALUE;
    for (String str : strs)
        minLen = Math.min(minLen, str.length());
    int low = 1;
    int high = minLen;
    while (low <= high) {
        int middle = (low + high) / 2;
        if (isCommonPrefix(strs, middle))
            low = middle + 1;
        else
            high = middle - 1;
    }
    return strs[0].substring(0, (low + high) / 2);
}

private boolean isCommonPrefix(String[] strs, int len){
    String str1 = strs[0].substring(0,len);
    for (int i = 1; i < strs.length; i++)
        if (!strs[i].startsWith(str1))
            return false;
    return true;
}
```

![image](https://user-images.githubusercontent.com/19383145/123531198-8225f780-d6d0-11eb-9989-c0bcfc326fd0.png)

### Further Thoughts / Follow up

Let's take a look at a slightly different problem:

![image](https://user-images.githubusercontent.com/19383145/123531208-b0a3d280-d6d0-11eb-9906-fe248e21ca9a.png)

We could optimize LCP queries by storing the set of keys *S* in a Trie. For more information about Trie, please see this article [Implement a trie (Prefix trie)](https://leetcode.com/articles/implement-trie-prefix-tree/). In a Trie, each node descending from the root represents a common prefix of some keys. But we need to find the longest common prefix of a string q and all key strings. This means that we have to find the deepest path from the root, which satisfies the following conditions:
- it is prefix of query string ```q```
- each node along the path must contain only one child element. Otherwise the found path will not be a common prefix among all strings.
- the path doesn't comprise of nodes which are marked as end of key. Otherwise the path couldn't be a prefix a of key which is shorter than itself.

![image](https://user-images.githubusercontent.com/19383145/123531280-48092580-d6d1-11eb-8c1a-e8a4a67a4289.png)

![image](https://user-images.githubusercontent.com/19383145/123531283-4dff0680-d6d1-11eb-87a8-af30a9cd6197.png)

```
public String longestCommonPrefix(String q, String[] strs) {
    if (strs == null || strs.length == 0)
         return "";  
    if (strs.length == 1)
         return strs[0];
    Trie trie = new Trie();      
    for (int i = 1; i < strs.length ; i++) {
        trie.insert(strs[i]);
    }
    return trie.searchLongestPrefix(q);
}

class TrieNode {

    // R links to node children
    private TrieNode[] links;

    private final int R = 26;

    private boolean isEnd;

    // number of children non null links
    private int size;    
    public void put(char ch, TrieNode node) {
        links[ch -'a'] = node;
        size++;
    }

    public int getLinks() {
        return size;
    }
    //assume methods containsKey, isEnd, get, put are implemented as it is described
   //in  https://leetcode.com/articles/implement-trie-prefix-tree/)
}

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

//assume methods insert, search, searchPrefix are implemented as it is described
//in  https://leetcode.com/articles/implement-trie-prefix-tree/)
    private String searchLongestPrefix(String word) {
        TrieNode node = root;
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char curLetter = word.charAt(i);
            if (node.containsKey(curLetter) && (node.getLinks() == 1) && (!node.isEnd())) {
                prefix.append(curLetter);
                node = node.get(curLetter);
            }
            else
                return prefix.toString();

         }
         return prefix.toString();
    }
}
```

![image](https://user-images.githubusercontent.com/19383145/123531304-7129b600-d6d1-11eb-953b-f6868d2e689e.png)
