# Spiral Matrix

Given an ```m x n``` ```matrix```, return *all elements* of the ```matrix``` in *spiral order*.

**Example 1:**

![image](https://user-images.githubusercontent.com/19383145/123171754-306c3b80-d44a-11eb-8dc6-5f584a76011e.png)
> **Input:** matrix = [[1,2,3],[4,5,6],[7,8,9]]
> 
> **Output:** [1,2,3,6,9,8,7,4,5]

**Example 2:**

![image](https://user-images.githubusercontent.com/19383145/123171895-5a256280-d44a-11eb-9b7b-701a1ba189f3.png)
> **Input:** matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
> 
> **Output:** [1,2,3,4,8,12,11,10,9,5,6,7]

**Constraints:**
- ```m == matrix.length```
- ```n == matrix[i].length```
- ```1 <= m, n <= 10```
- ```-100 <= matrix[i][j] <= 100```

**Hints**
- Well for some problems, the best way really is to come up with some algorithms for simulation. Basically, you need to simulate what the problem asks us to do.
- We go boundary by boundary and move inwards. That is the essential operation. First row, last column, last row, first column and then we move inwards by 1 and then repeat. That's all, that is all the simulation that we need.
- Think about when you want to switch the progress on one of the indexes. If you progress on ```i``` out of ```[i, j]```, you'd be shifting in the same column. Similarly, by changing values for ```j```, you'd be shifting in the same row. Also, keep track of the end of a boundary so that you can move inwards and then keep repeating. It's always best to run the simulation on edge cases like a single column or a single row to see if anything breaks or not.

## Solution

### Approach 1: Simulation

**Intuition**

Draw the path that the spiral makes. We know that the path should turn clockwise whenever it would go out of bounds or into a cell that was previously visited.

Algorithm

Let the array have *R* rows and *C* columns. *seen[r][c]* denotes that the cell on the *r-th row* and *c-th column* was previously visited. Our current position is *(r, c)*, facing direction *di*, and we want to visit *R x C* total cells.

As we move through the matrix, our candidate next position is *(cr, cc)*. If the candidate is in the bounds of the matrix and unseen, then it becomes our next position; otherwise, our next position is the one after performing a clockwise turn.

```
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0) return ans;
        int R = matrix.length, C = matrix[0].length;
        boolean[][] seen = new boolean[R][C];
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int r = 0, c = 0, di = 0;
        for (int i = 0; i < R * C; i++) {
            ans.add(matrix[r][c]);
            seen[r][c] = true;
            int cr = r + dr[di];
            int cc = c + dc[di];
            if (0 <= cr && cr < R && 0 <= cc && cc < C && !seen[cr][cc]){
                r = cr;
                c = cc;
            } else {
                di = (di + 1) % 4;
                r += dr[di];
                c += dc[di];
            }
        }
        return ans;
    }
}
```

**Complexity Analysis**
- Time Complexity: *O(N)*, where *N* is the total number of elements in the input matrix. We add every element in the matrix to our final answer.
- Space Complexity: *O(N)*, the information stored in ```seen``` and in ```ans```.

### Approach 2: Layer-by-Layer

**Intuition**

The answer will be all the elements in clockwise order from the first-outer layer, followed by the elements from the second-outer layer, and so on.

**Algorithm**

We define the *k-th* outer layer of a matrix as all elements that have minimum distance to some border equal to *k*. For example, the following matrix has all elements in the first-outer layer equal to 1, all elements in the second-outer layer equal to 2, and all elements in the third-outer layer equal to 3.

```
[[1, 1, 1, 1, 1, 1, 1],
 [1, 2, 2, 2, 2, 2, 1],
 [1, 2, 3, 3, 3, 2, 1],
 [1, 2, 2, 2, 2, 2, 1],
 [1, 1, 1, 1, 1, 1, 1]]
```

For each outer layer, we want to iterate through its elements in clockwise order starting from the top left corner. Suppose the current outer layer has top-left coordinates *(r1, c1)* and bottom-right coordinates *(r2, c2)*.

Then, the top row is the set of elements *(r1, c)* for *c = c1,...,c2*, in that order. The rest of the right side is the set of elements *(r, c2)* for *r = r1+1,...,r2*, in that order. Then, if there are four sides to this layer (ie., *r1 < r2* and *c1 < c2)*, we iterate through the bottom side and left side as shown in the solutions below.

![image](https://user-images.githubusercontent.com/19383145/123181562-84335080-d45b-11eb-834b-4026e7fb13ed.png)

```
class Solution {
    public List < Integer > spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0)
            return ans;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) ans.add(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) ans.add(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) ans.add(matrix[r2][c]);
                for (int r = r2; r > r1; r--) ans.add(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
}
```

**Complexity Analysis**
- Time Complexity: *O(N)*, where *N* is the total number of elements in the input matrix. We add every element in the matrix to our final answer.
- Space Complexity: 
  - *O(1)* without considering the output array, since we don't use any additional data structures for our computations.
  - *O(N)* if the output array is taken into account.

### Easy solution / iterative

```
public class SpiralMatrix {
    public static void main (String[] args){
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        List<Integer> arrayList = spiralOrder(matrix);
        for (int item: arrayList) {
            System.out.print(" " + item);
        }
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        // Initialize a new array list
        List<Integer> arrayList = new ArrayList<>();

        // If the matrix is empty, return it
        if (matrix.length == 0) {
            return arrayList;
        }

        // Sets the beginning of a row, default is index 0
        int rowStart = 0;
        // Sets the ending of a row, default is the final index of the row
        int rowEnd = matrix.length-1;
        // Sets the beginning of a column, default is index 0
        int columnStart = 0;
        // Sets the end of a column, default is the last index in the column
        int columnEnd = matrix[0].length - 1;

        /*
        * While the row Start index is less than or equal to the row end index
        * AND the column start index is less than or equal to the column end index
        *
        * First we go around the outer edges of the matrix
        * */
        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            /* Set the current index to the column start index and traverse right to the
            * column end index*/
            for (int currentIndex = columnStart; currentIndex <= columnEnd; currentIndex++) {
                // Add each integer from the current row to the array list
                arrayList.add(matrix[rowStart][currentIndex]);
            }
            // Move the beginning of the the row to the next index
            rowStart++;

            /*
            * Set the current index to the row start index and traverse down to the row end
            * index */
            for (int currentIndex = rowStart; currentIndex <= rowEnd; currentIndex++) {
                // Add each integer from the current column to the array list
                arrayList.add(matrix[currentIndex][columnEnd]);
            }
            // Move the end of the column to the previous column index
            columnEnd--;

            /*
            * Now we go around the inner parts of the matrix
            * */

            // If the row start index is less than or equal to the row end index
            if (rowStart <= rowEnd) {
                /*
                * Set the current index to the column end index and traverse left to the column
                * start index */
                for (int currentIndex = columnEnd; currentIndex >= columnStart; currentIndex --) {
                    // Add each integer in the current row to the array list
                    arrayList.add(matrix[rowEnd][currentIndex]);
                }
            }
            // Set the row end index to the previous row
            rowEnd--;

            // If the column start index is less than or equal to the column end index
            if (columnStart <= columnEnd) {
                /*
                * Set the current index to the row end index and traverse up to the row start
                * index */
                for (int currentIndex = rowEnd; currentIndex >= rowStart; currentIndex --) {
                    // Add each integer from the current column to the array list
                    arrayList.add(matrix[currentIndex][columnStart]);
                }
            }
            // Set the column start index to the next column
            columnStart++;
        }

        // Return the array list
        return arrayList;
    }
}

/*
* Complexity Analysis:
* Time Complexity: O(N) where N is the number of integers
* Space Complexity: O(N) space where N is the arrayList */
```
