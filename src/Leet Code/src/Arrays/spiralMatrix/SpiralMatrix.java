package Arrays.spiralMatrix;

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

        // Traverse through the entire matrix
        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            // Traverse through the current row
            for (int currentIndex = columnStart; currentIndex <= columnEnd; currentIndex++) {
                arrayList.add(matrix[rowStart][currentIndex]);
            }
            // Move the beginning of the the row to the next index
            rowStart++;

            // Traverse Down the current column
            for (int currentIndex = rowStart; currentIndex <= rowEnd; currentIndex++) {
                arrayList.add(matrix[currentIndex][columnEnd]);
            }
            // Move the end of the column to the previous index
            columnEnd--;

            // Start at the beginning of the row
            if (rowStart <= rowEnd) {
                // Traverse Left
                for (int currentIndex = columnEnd; currentIndex >= columnStart; currentIndex --) {
                    arrayList.add(matrix[rowEnd][currentIndex]);
                }
            }
            // End at the previous row
            rowEnd--;

            // Start at the beginning of the column
            if (columnStart <= columnEnd) {
                // Traverse Up
                for (int currentIndex = rowEnd; currentIndex >= rowStart; currentIndex --) {
                    arrayList.add(matrix[currentIndex][columnStart]);
                }
            }
            columnStart++;
        }

        return arrayList;
    }
}
