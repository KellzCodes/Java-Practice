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
