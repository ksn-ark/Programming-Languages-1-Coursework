import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        int rows, columns;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type in the number of rows: ");
        rows = reader.nextInt();
        System.out.print("Type in the number of columns: ");
        columns = reader.nextInt();

        int matrix [][];

        matrix = askInfo(rows, columns);
        printMatrix(matrix);
        countSum(matrix);
        reader.close();
    }
    static Scanner scanner = new Scanner(System.in);
    static int[][] askInfo(int rowcount, int columncount) {
        int matrix[][] = new int[rowcount][columncount];
        for(int i=1;i<=rowcount;i++) {
            for(int j=1;j<=columncount;j++) {                
                System.out.print("Type in the element " + j + " of the row "+ i +": ");
                matrix[i-1][j-1] = scanner.nextInt();
            }
        }
        return matrix;
    }
    static void printMatrix(int matrix[][]) {
        System.out.println("Matrix:");
        for(int i = 0;i<matrix.length;i++) {
            for(int j= 0;j<matrix[i].length;j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
    static void countSum(int matrix[][]) {
        int sum = 0;
        for(int i = 0;i<matrix.length;i++) {
            for(int j= 0;j<matrix[i].length;j++) {
                sum+=matrix[i][j];
            }
        }
        System.out.println("Sum of the elements of the matrix: " + sum);
    }
//  Write the missing methods here
//  Methods are written in the text box below.
}