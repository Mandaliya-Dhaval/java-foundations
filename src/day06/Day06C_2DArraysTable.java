import java.util.Arrays;
import java.util.Scanner;

public class Day06C_2DArraysTable {
    public static void print(String [][] matrix) {
        for (int i =0;i<matrix.length;i++){
            for (int j = 0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void printOnlyUsername(String[][]matrix){
        for(int i =0;i<matrix.length;i++){
            System.out.println(matrix[i][0]);
        }
    }
    public static void printUatUserRow(String[][] users) {
        for (int i = 0; i < users.length; i++) { // rows
            if (users[i][2] != null && users[i][2].equals("UAT")) {
                System.out.println("UAT user: " + users[i][0] + " " + users[i][1] + " " + users[i][2]);
                return; // stop after first match
            }
        }
        System.out.println("UAT role not found");
    }
    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Columns");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        sc.nextLine();
        System.out.println("You have Selected " + rows + " * " + cols + " matrix");
        System.out.println("Enter values for: Username Password Env");

        String [] [] matrix = new String[rows][cols];
        for(int i =0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print("Enter " + i + " " + j + " for matrix: ");
                matrix[i][j]=sc.nextLine();
            }
        }
        System.out.println("Task 2 Print");
        print(matrix);

        System.out.println("Task 3 Print");
        printOnlyUsername(matrix);

        System.out.println("Task 4 Print");
        printUatUserRow(matrix);

        System.out.println("Task 5 Print");
        System.out.println(Arrays.deepToString(matrix));



    }
}
