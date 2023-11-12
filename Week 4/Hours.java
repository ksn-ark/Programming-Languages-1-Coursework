import java.util.Locale;
import java.util.Scanner;

public class Hours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount of days: ");
        int d = scanner.nextInt();
        Float[] ar = new Float[d];
        Float total = 0.0f;
        for(int i = 0;i<d;i++) {
            int d1 = i+1;
            System.out.print("Type in work hours of day " + d1 + ": ");
            ar[i] = scanner.nextFloat();
            total+=ar[i];
        }
        System.out.print("Total of work hours: " + total);
        
        System.out.printf(Locale.US,"average work day length: %.1f \n", total/d);
        System.out.print("Inputted work hours: ");
        for(int i = 0;i<ar.length-1;i++) {
            System.out.print(ar[i]+" ");
        }
        System.out.print(ar[ar.length-1]);
        scanner.close(); 
    }
    
}
