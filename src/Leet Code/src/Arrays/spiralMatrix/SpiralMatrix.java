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
        List arrayList = new ArrayList();
        if (matrix.length == 0) return arrayList;
        int row = matrix.length, column = matrix[0].length;
        boolean[][] seen = new boolean[row][column];
        int[] rowDirection = {0, 1, 0, -1};
        int[] columnDirection = {1, 0, -1, 0};
        int seenRow = 0, seenColumn = 0, direction = 0;
        for (int i = 0; i < row * column; i++) {
            arrayList.add(matrix[seenRow][seenColumn]);
            seen[seenRow][seenColumn] = true;
            int currentRow = seenRow + rowDirection[direction];
            int currentColumn = seenColumn + columnDirection[direction];
            if (0 <= currentRow && currentRow < row && 0 <= currentColumn && currentColumn < column && !seen[currentRow][currentColumn]){
                seenRow = currentRow;
                seenColumn = currentColumn;
            } else {
                direction = (direction + 1) % 4;
                seenRow += rowDirection[direction];
                seenColumn += columnDirection[direction];
            }
        }
        return arrayList;
    }
}
