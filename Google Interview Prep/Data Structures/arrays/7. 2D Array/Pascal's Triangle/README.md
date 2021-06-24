# Pascal's Triangle

Given an integer ```numRows```, return the first numRows of **Pascal's triangle**.

In **Pascal's triangle**, each number is the sum of the two numbers directly above it as shown:

<img src="https://github.com/keldavis/Java-Practice/blob/master/Google%20Interview%20Prep/pics/PascalTriangleAnimated2.gif" alt="pascals_Triangle" width="300"/>

**Example 1:**
> **Input:** numRows = 5
> 
> **Output:** [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

**Example 2:**
> **Input:** numRows = 1
> 
> **Output:** [[1]]
 
**Constraints:**
- ```1 <= numRows <= 30```

## Solution

### Approach 1: Dynamic Programming

**Intuition**

If we have the a row of Pascal's triangle, we can easily compute the next row by each pair of adjacent values.

**Algorithm**

Although the algorithm is very simple, the iterative approach to constructing Pascal's triangle can be classified as dynamic programming because we construct each row based on the previous row.

First, we generate the overall triangle list, which will store each row as a sublist. Then, we check for the special case of *0*, as we would otherwise return *[1]*. Since *numRows* is always greater than *0*, we can initialize triangle with *[1]* as its first row, and proceed to fill the rows.

```
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        // Base case; first row is always [1].
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);

            // The first row element is always 1.
            row.add(1);

            // Each triangle element (other than the first and last of each row)
            // is equal to the sum of the elements above-and-to-the-left and
            // above-and-to-the-right.
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }

            // The last row element is always 1.
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}
```

![image](https://user-images.githubusercontent.com/19383145/123184046-db87ef80-d460-11eb-8319-2473a65ba4eb.png)

### Approach 2: Easy solution / iterative

```
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
```
