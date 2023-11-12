import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names to enter: ");
        int a = scanner.nextInt();
        String[] n = new String[a+1];
        System.out.println("Enter names:");
        for (int i=0;i<=a;i++) {
            n[i]=scanner.nextLine();
        }
        int max = 0;
        int index = 0;
        for (int i =0;i<=a;i++) {
            if (n[i].length()>max) {
                max=n[i].length();
                index = i;
            }
        }
        System.out.println("Longest name entered was " + n[index]);
        scanner.close();
    }
}
