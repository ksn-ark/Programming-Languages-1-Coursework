import java.util.*;

public class RevisionExercise {
    public static void main(String[] args) {
      
        int[] tempArray = new int[100];
        System.out.println("Type in numbers. Type zero to quit.");
        int amountOfNumbers = askInfo(tempArray);
       
        int[] realArray = new int[amountOfNumbers];
        copyInfo(realArray, tempArray);
      
        setArray(realArray);
        
        printArray(realArray);
    }

    static Scanner scanner = new Scanner(System.in);
    public static int askInfo(int[] tempArray) {
        int amountOfNumbers=0;
        while(true) {
            System.out.print((amountOfNumbers+1)+". number: ");
            int input = scanner.nextInt();
            if(input==0) {
                break;
            } else {
                tempArray[amountOfNumbers]=input;
                amountOfNumbers+=1;
            }
        }
        return amountOfNumbers;
    }

    public static void copyInfo(int[] realArray, int[] tempArray) {
        for(int i=0;i<realArray.length;i++) {
            realArray[i]=tempArray[i];
        }
    }

    public static void setArray(int[] realArray) {
        java.util.Arrays.sort(realArray);
    }

    public static void printArray(int[] realArray ) {
        int[] realArrayCopy = new int[realArray.length];
        for(int i=0;i<realArray.length;i++) {
            realArrayCopy[i]=realArray[realArray.length-(i+1)];
        }
        realArray = realArrayCopy.clone();
        System.out.println("\nOrdered array: ");
        for(int i = 0; i < realArray.length; i++) {
            System.out.println(realArray [i]);
        }
    }
}