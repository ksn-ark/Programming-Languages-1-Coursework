import java.util.Scanner;


public class TwoDimArray {
    static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("How many rows?");
        int rowcount = reader.nextInt();

        System.out.println("How many columns?");
        int columncount = reader.nextInt();

        System.out.println("Enter the numbers:");

        int[][] TDArray = new int[rowcount][columncount];

        int maxValue = 0;

        for(int i=0;i<rowcount;i++) {
            for(int j=0;j<columncount;j++) {
                TDArray[i][j] = reader.nextInt();
                if(TDArray[i][j]>maxValue) {
                    maxValue=TDArray[i][j];
                }
            }
        }

        System.out.println("Numbers:");

        for(int i=0;i<rowcount;i++) {
            String outputRow = "";
            for(int j=0;j<columncount;j++) {
                outputRow+=TDArray[i][j];
            }
            System.out.println(outputRow);
        }

        System.out.println("Largest: "+maxValue);
    }
}