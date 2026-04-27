package day07;

public class Day07_Arrays2D_Practice {
    static void printMatrix(int[][] matrix) {
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void rowSum(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        System.out.println("Row Sums:");

        for (int i = 0; i < rows; i++) {
            int rowsum = 0;
            for (int j = 0; j < cols; j++) {
                rowsum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowsum);
        }
    }
    static void colsum(int[][] matrix) {
        int cols=matrix[0].length;
        int rows = matrix.length;
        for (int j=0;j<cols;j++){
            int colsum = 0;
            for (int i = 0; i < rows; i++) {
                colsum += matrix[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + ": " + colsum);
        }
    }
    static void maxElementAndPosition(int[][] matrix) {

        int maxRow = 0;
        int maxCol = 0;
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.println("Max Element : " + max);
        System.out.println("Position : (" + maxRow + ", " + maxCol + ")");
    }
    static void countOccurrencesAllPosition(int[][] arr, int target) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Found at Index: " + i + " " + j );
                    found = true;
                }
            }
        }
        if (!found){
            System.out.println("Target" + target + " not found");
        }
    }

    public static void main(String[] args) {
//        int [][]a = {{10,20,30},{40,10,20},{40,50,10}};
        int [][]a = {
                {1,2,3},
                {4,5,5},
                {7,8,5}
        };
        printMatrix(a);
        rowSum(a);
        colsum(a);
        maxElementAndPosition(a);
        countOccurrencesAllPosition(a,5);
        int[][] b = {
                {-10, -20},
                {-3, -40}
        };
        maxElementAndPosition(b);
    }
}
