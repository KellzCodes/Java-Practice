package Arrays.pkg1;

public class TwoDimensionalArray {
    public static void main (String[] args){
        System.out.println("Example I:");
        int[][] a = new int [3][3];
        printArray(a);

        System.out.println("Example II:");
        int[][] b = new int[2][];
        printArray(b);

        System.out.println("Example III:");
        b[0] = new int[3];
        b[1] = new int[5];
        printArray(b);
    }
    private static void printArray(int[][] a){
        for(int i = 0; i < a.length; ++i){
            System.out.println(a[i]);
        }
        for (int i = 0; i < a.length; ++i){
            for (int j = 0; a[i] != null && j < a[i].length; ++j){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
