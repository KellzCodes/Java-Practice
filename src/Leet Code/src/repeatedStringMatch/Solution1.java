package repeatedStringMatch;

public class Solution1 {
    public int repeatedStringMatch1(String A, String B) {
        int count = 0;
        StringBuilder stringbuilder = new StringBuilder();
        // while the string builder is smaller than string B
        while(stringbuilder.length() < B.length()){
            // add String A to the builder
            stringbuilder.append(A);
            // every time string A is added to builder, increment 1
            count++;
        }

        // If the builder has B string return count
        if (stringbuilder.toString().contains(B)){
            return count;
        }

        /* if the appended a strings contain b, only return the count of a strings to get the 1 b string */
        if(stringbuilder.append(A).toString().contains(B)){
            return ++count;
        }

        else{
            return -1;
        }
    }
}
