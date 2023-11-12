import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int number1, number2, number3, high, low;
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in the first integer: ");
        number1 = reader.nextInt();

        System.out.print("Type in the second integer: ");
        number2 = reader.nextInt();

        System.out.print("Type in the third integer: ");
        number3 = reader.nextInt();

        high = high(number1, number2, number3);
        low = low(number1, number2, number3);

        System.out.print("Highest number was " + high);
        System.out.print(" and the lowest was" + low + "\n");
        reader.close();
    }

    public static int high(int a, int b, int c) {
        int max = a;
        int[] ar = { a, b, c };
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }

    public static int low(int a, int b, int c) {
        int min = a;
        int[] ar = { a, b, c };
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        return min;
    }

}
