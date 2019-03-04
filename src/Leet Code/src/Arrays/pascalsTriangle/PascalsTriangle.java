package Arrays.pascalsTriangle;

/*
* Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: 5
Output:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
*/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main (String[] args){
        List<List<Integer>> numRows = generate(5);
        for (List<Integer> item: numRows){
            System.out.println(item);
        }

    }

    public static List<List<Integer>> generate(int numRows) {
        // This is an arrayList list that holds the same amount of array list as input numRows
        List<List<Integer>> listArrayList = new ArrayList<>();

        /*
        * Each row of the listArrayList will be an array list.*/
        ArrayList<Integer> currentArrayList = new ArrayList<>();

        /*
        * Loop the for the number of rows input*/
        for(int currentRow = 0; currentRow < numRows; currentRow++){
            /* Add 1 to the first index of the array list*/
            currentArrayList.add(0, 1);
            /*
            * Here, we set the current list index to 1 and traverse to the end.
            * The for loop is activated if the current list index is less than
            * the current array list size - 1
            * */
            for(int currentListIndex = 1; currentListIndex < currentArrayList.size()-1; currentListIndex++){
                /*
                * This variable is not needed but added for better readability
                * */
                int nextListIndex = currentListIndex + 1;
                /*
                * Set the current array list index. The value will be an integer equal
                * to the sum of the values at current list index and the next index
                * */
                currentArrayList.set(currentListIndex, currentArrayList.get(currentListIndex) +
                        currentArrayList.get(nextListIndex));
            }
            /*
            * Add the current array list to the list array list
            *
            * It's important to note, we will continue to build on this
            * array list and return its current form when the for loops
            * end
            * */
            listArrayList.add(new ArrayList<>(currentArrayList));
        }

        // return the list array list
        return listArrayList;

    }

    /*
    * Complexity Analysis
    * Time complexity: O(N^2) where N is numRows.
    *                  The outer loop runs numRows times. For each iteration
    *                  of the outer loop, the inner loop runs rowNums times.
    *                  The overall number of listArrayList updates that occur
    *                  is 1 + 2 + 3 + ... + numRows
    *
    * Space Complexity: O(N^2) because we need to store each number that we update
    *                   in listArrayList*/
}
