package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise05_PrintOddNumbersUsingScanner {
    public static void main(String[] args) {


        int number = ScannerHelper.getAnNumber();

        for (int i = 0; i <= number; i++) {
            if(i % 2 == 1) System.out.println(i);
        }


    }
}
