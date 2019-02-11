package Arrays.diagonalTraverse;

/*
* Given a matrix of M x N elements (M rows, N columns), return all
* elements of the matrix in diagonal order as shown in the below
*
* Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

Output:  [1,2,4,7,5,3,6,8,9]
*/

public class DiagonalTraverse {
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

        int[] array = findDiagonalOrder(matrix);
        for (int item: array) {
            System.out.print(" " + item);
        }
    }
    public static int[] findDiagonalOrder(int[][] matrix) {
        // return the matrix if it is empty
        if (matrix.length == 0){
            return new int[0];
        }

        // Initialize
        int row = 0, column = 0, mRow = matrix.length, nColumn = matrix[0].length, array[] = new int[mRow * nColumn];

        // Go through the whole array starting at the beginning
        for (int i = 0; i < array.length; i++) {

            // The current array index is equal to the current matrix index
            array[i] = matrix[row][column];

            // if the sum of current row and column is an even number
            if ((row + column) % 2 == 0) { // moving up
                // If the current column is the last column in the matrix, move to the next row
                if (column == nColumn - 1) {
                    row++;
                }
                // If the the current row is the first row, go to the next column
                else if (row == 0){
                    column++;
                }
                // Otherwise, go back a row then move to the next column
                else{
                    row--;
                    column++;
                }
            }
            else {   // moving down
                // If the current row is the last row in the matrix, go to the next column
                if(row == mRow - 1) {
                    column++;
                }
                // If the current column is the first column in the matrix, go to the next row
                else if (column == 0){
                    row++;
                }
                // Otherwise, go to the next row then go to the previous column
                else{
                    row++;
                    column--;
                }
            }
        }
        return array;
    }
}
