import java.util.Scanner;
public class SalaryCountingWithMethods {
    public static void main (String [] args) {
        double hours, salaryPerHour, taxPercent, taxlessSalary, taxPart;
 
        hours =  askHours();
        salaryPerHour = askSalaryPerHour();
        taxPercent = askTaxPercent();
        
        taxlessSalary = countTaxlessSalary(hours, salaryPerHour);
 
        taxPart = taxlessSalary * taxPercent /100;
 
        System.out.println("\nSalary before taxes: " + taxlessSalary);
        System.out.println("Tax part of the salary: " + taxPart);
        System.out.println("Salary after taxes: " + (taxlessSalary-taxPart));        
    }
    static Scanner scanner = new Scanner(System.in);
    public static float askHours() {        
        System.out.println("Type in the number of work hours: ");
        return scanner.nextFloat();
    }
    public static float askSalaryPerHour() {        
        System.out.println("Type in salary per hour: ");
        return scanner.nextFloat();
    }
    public static float askTaxPercent() {        
        System.out.println("Type in tax percent: ");
        return scanner.nextFloat();
    }
    public static double countTaxlessSalary(double h, double sph) {
        return h*sph;
    }
}