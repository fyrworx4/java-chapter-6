package Labs;

import java.util.Scanner;

// change name
public class miles {
    public static double milesToLaps(double userMiles) {
        double laps;

        laps = userMiles * 4;

        return laps;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double miles = scnr.nextDouble();

        System.out.printf("%.2f", milesToLaps(miles));
        //System.out.println();
    }
}
