package practice.arrays_practice;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] numbersSquare = new int [3][2];
        int[][] numberSquare0 = {{1,1}, {2,4}, {3,9}};

        System.out.println(Arrays.deepToString(numbersSquare));
        System.out.println(Arrays.deepToString(numberSquare0));

        System.out.println(numbersSquare[0][0]);
        System.out.println(numbersSquare[1][1]);
        System.out.println(numbersSquare[0][0]);
    }
}
