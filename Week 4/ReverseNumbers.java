import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many floating point numbers do you want to type: ");
        int a = scanner.nextInt();
        Float[] ar = new Float[a];
        for (int i = 1; i <= a; i++) {
            System.out.println("Type in " + i + ". number: ");
            ar[i - 1] = scanner.nextFloat();
        }
        System.out.println("Given numbers in reverse order: ");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(ar[i]);
        }
        scanner.close();
    }
}