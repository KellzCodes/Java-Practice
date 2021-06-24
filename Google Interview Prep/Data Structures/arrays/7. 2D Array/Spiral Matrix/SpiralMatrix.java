import java.util.ArrayList;
import java.util.List;

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
