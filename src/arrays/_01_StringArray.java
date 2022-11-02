package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        // 1. Declare a String array called as countries and assign size of 3
        String [] countries = new String[3];

        // 2. assigning values to specific indexes
        countries[1] = "Spain";
        countries[2] = "Belgium";

        // 3. Print a specific index from an array
        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);

        // 4. Printing an array
        System.out.println(Arrays.toString(countries));

        // 6. Getting the length of an array - how many elements
        int length = countries.length;
        System.out.println(countries.length);

        // 7. Printing each element separately
        System.out.println(countries[0]);
        System.out.println(countries[1]);
        System.out.println(countries[2]);

        for (int i = 0; i <= 2; i++) {
            System.out.println("Country at index of " + i + " is = " + countries[i]);
        }



    }
}
