package Labs;

import java.util.Scanner;
import java.util.Random;

public class coinflip {
    public static String headsOrTails(Random rand) {
        String coinFlipVal;

        if (rand.nextInt(2) == 0) {
            coinFlipVal = "heads";
        }
        else {
            coinFlipVal = "tails";
        }

        return coinFlipVal;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Random rand = new Random(2);
        int numDecisions;
        int i;

        numDecisions = scnr.nextInt();

        for (i = 0; i < numDecisions; i++) {
            System.out.println(headsOrTails(rand));
        }
    }
}
