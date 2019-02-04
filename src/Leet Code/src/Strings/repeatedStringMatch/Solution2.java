package repeatedStringMatch;

public class Solution2 {
    public int repeatedStringMatch2(String A, String B){
        // least possible index
        int index = 1;

        // Start string builder with string A
        StringBuilder stringBuilder = new StringBuilder(A);

        // Traverse string B as long as builder length is smaller
        for (; stringBuilder.length() < B.length(); index++){
            // Add string A to the builder
            stringBuilder.append(A);
        }

        // if the index of string b is greater than or equal to 0 return index
        if (stringBuilder.indexOf(B) >= 0){
            return index;
        }

        // If the index of the B string is greater than or equal to 0 return index + 1
        if (stringBuilder.append(A).indexOf(B) >= 0){
            return index + 1;
        }

        else{
            return -1;
        }
    }
}
