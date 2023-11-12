import java.util.Scanner;

public class MultiplicationChart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = reader.nextInt();
        count(number);
        reader.close();
    }
    public static void count(int a) {
        System.out.println("Multiplication chart of the number " + a);
        for(int i=1;i<=10;i++) {
            System.out.println(a*i);
        }
    }
}