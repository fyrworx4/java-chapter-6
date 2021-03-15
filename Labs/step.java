package Labs;
import java.util.Scanner;

// change name
public class step {
    public static double stepsToMiles(int userSteps) {
        double miles;

        miles = userSteps / 2000.00;
        return miles;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int steps = scnr.nextInt();

        System.out.printf("%.2f", stepsToMiles(steps));
    }
}
