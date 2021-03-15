package Labs;
import java.util.Scanner;

// change name
public class drivingcost {
    public static double drivingCost(double drivenMiles, double milesPerGallon, double dollarsPerGallon) {
        return (drivenMiles / milesPerGallon) * dollarsPerGallon;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double mpg = scnr.nextDouble();
        double dpg = scnr.nextDouble();

        // 10 miles
        System.out.printf("%.2f", drivingCost(10, mpg, dpg));
        System.out.print(" ");
        // 50 miles
        System.out.printf("%.2f", drivingCost(50, mpg, dpg));
        System.out.print(" ");
        // 400 miles
        System.out.printf("%.2f", drivingCost(400, mpg, dpg));
        System.out.println();

    }
}
