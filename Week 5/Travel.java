import java.util.Scanner;

public class Travel {
    public static void main(String args[]) {
        double speed, distance, time;
 
        distance = askDistance();
        speed = askSpeed();
        time = countTime(distance, speed);
 
        System.out.println("Time needed to complete the trip is " + time + " hours.");
    }
    
    static Scanner scnr = new Scanner(System.in);
    public static double askDistance(){
        System.out.println("Type in the length of the trip (km): ");
        return scnr.nextDouble();
    }
    public static double askSpeed(){
        System.out.println("Type in your average speed (km/h): ");
        return scnr.nextDouble();
    }
    public static double countTime(double d, double s){
        return (double)d/s;
    }
 
}