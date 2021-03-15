package Labs;

import java.util.Scanner;

// change name of class below
public class frequencies {
    // returns a number
    public static int getFrequencyOfWord(String[] wordsList, int listSize, String currWord) {
        int i;
        int count = 0;

        for (i = 0; i < listSize; i++) {
            if (wordsList[i].compareTo(currWord) == 0) {
                count += 1;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numWords = scnr.nextInt();
        String[] arrWords = new String[numWords];
        int i;

        for (i = 0; i < numWords; i++) {
            arrWords[i] = scnr.next();
        }
        
        for (i = 0; i < numWords; i++) {
            System.out.println(arrWords[i] + " " + getFrequencyOfWord(arrWords, numWords, arrWords[i]));
        }
    }
}
