import java.util.Scanner;

public class GasMeterTest {
    public static void main(String args[]) {   
        int answer = 1;
        boolean valueCorrect = true;
        GasMeter meter = new GasMeter();

        while (valueCorrect) {
            Scanner reader = new Scanner(System.in);
            
            System.out.print("What do you want: 1=95, 2=98, 3=Diesel " + 
                "(type any other number to quit): ");
            answer = reader.nextInt();
           
            if(answer >= 1 && answer <= 3) {
                System.out.print("How much do you want to refuel: ");
                double amount = reader.nextDouble();
                meter.refuel(answer, amount);
            } else {
                valueCorrect = false;
            }
        }
       
        GasMeter.totalUsed();
        GasMeter.totalUsed95();
        GasMeter.totalUsed98();
        GasMeter.totalUsedDi();
    }
}

class GasMeter {
    static double[] usedFuelArray = new double[4];

    public GasMeter(){
        for(int i=0;i<usedFuelArray.length;i++) {
            usedFuelArray[i]=0;
        }
    }

    public void refuel(int type, double amount) {
        usedFuelArray[type]+=amount;
        usedFuelArray[0]+=amount;
    }

    static void totalUsed() {
        System.out.println("Total used fuel: "+ usedFuelArray[0]);
    }

    static void totalUsed95() {
        System.out.println("Total used 95 octane fuel: " + usedFuelArray[1]);
    }

    static void totalUsed98() {
        System.out.println("Total used 98 octane fuel: "+ usedFuelArray[2]);
    }

    static void totalUsedDi() {
        System.out.println("Total used diesel fuel: "+ usedFuelArray[3]);
    }
}