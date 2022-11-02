package arrays;

import java.util.Arrays;

public class _07_StringArray_Recap {
    public static void main(String[] args) {
        //Create a String array with the length of 4 (new way not with curly brackets)
        String[] fruits = new String[4];

        System.out.println(Arrays.toString(fruits));

        fruits [0] = "Apple";
        fruits [3] = "Kiwi";

        System.out.println(Arrays.toString(fruits));

        fruits [2] = "Orange";
        fruits [1] = "Grapes";

        System.out.println(Arrays.toString(fruits));

        System.out.println("\nReassigning values:");

        //[Apple, Grapes, Orange, Kiwi]
        //[Apple, Grapes, Apple, Apple]

        fruits[3] = fruits[0];
        fruits[2] = fruits[0];

        System.out.println(Arrays.toString(fruits));

        /*
        for(DataType name: arrayName){
        code to be executed
        }
         */

        System.out.println("\nPrinting Values with for each loop:");
        for (String singleFruit : fruits){
            System.out.println(singleFruit);
        }

    }
}
