package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {

        double[] decimals = {1.5, 2.3, -1.3, -3.7};
        char[] chars = {'a', 'b', 'c', 'd'};

        System.out.println(Arrays.toString(decimals));
        System.out.println("The length of the array is " +decimals.length);

        Arrays.sort(decimals);
        System.out.println( "Arrays after sorting " + Arrays.toString( decimals));

        /*
        output:
        -3.7
        -1.3
        1.5
        2.3
         */

        System.out.println("\n----------for-i-method----------\n");
        // When you need indexes or an increment to use go with fori with arrays
        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i]);
        }

        // When we don't need indexes or an increment to use go with for each with arrays
        System.out.println("\n-----ForEach loop print below:");
        for(double d : decimals){
            System.out.println(d);
        }
        /*
        -3.7 - a -> at the index 0
        -1.3 - b -> at the index 1
        1.5 - c -> at the index 2
        2.3 - d - at the index 3
         */

        System.out.println("\n----------for-i-method----------\n");

        for (int i = 0; i < decimals.length; i++) {
            System.out.println(decimals[i] + " - " + chars[i]);
        }



    }
}
