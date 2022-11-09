package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        positiveAndNegative(numbers);
    }

    /*
    Create public static method which will take an ArrayList, and it will find the first positive and first negative number
    and print them.

     */

    public static void positiveAndNegative(ArrayList<Integer> numbers){


        int firstPos = 0;
        int firstNeg = 0;

        for (Integer n : numbers ){
            if (n > 0 && firstPos == 0){
                // n > 0 -> current number is positive or not
                // firstPos == 0 -> did we find the positive and changed the default value
                firstPos = n;
            }if (n < 0 && firstNeg == 0){
                firstNeg = n;
            }
        }
        System.out.println("First positive number is: " + firstPos);
        System.out.println("First negative number is: " + firstNeg);
    }
}

