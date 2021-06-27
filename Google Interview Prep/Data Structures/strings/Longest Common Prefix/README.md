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
