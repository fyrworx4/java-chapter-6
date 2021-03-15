package Labs;
import java.util.Scanner;

// change class name below
public class sort {
    
    public static void sortArray(int[] myArr, int arrSize) {
        int i;
        int temp;

        while (true) {
            boolean isSwap = false;

            for (i = 0; i < arrSize - 1; i++) {
                
                if (myArr[i] > myArr[i + 1]) {
                    temp = myArr[i];
                    myArr[i] = myArr[i + 1];
                    myArr[i + 1] = temp;
                    isSwap = true;
                } 
            }

            if (isSwap == false) {
                for (i = 0; i < arrSize; i++) {
                    System.out.print(myArr[i] + " ");
                }
                System.out.println();
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int numNumbers = scnr.nextInt();
        int[] myArr = new int[numNumbers];
        int i;
        
        for (i = 0; i < numNumbers; i++) {
            myArr[i] = scnr.nextInt();
        }

        /*
        for (i = 0; i < numNumbers; i++) {
            System.out.print(myArr[i] + " ");
        }
        */

        sortArray(myArr, numNumbers);
    }
}
