package arrays;

import java.util.Arrays;

public class _02_inArray {
    public static void main(String[] args) {

        // 1. Create an int array and store 0, -5, 2, 10, 5, 2, -1, 0
        int[] numbers = {0, -5, 2, 10, 5, 2, -1, 0};

        // 2. print the array
        System.out.println(Arrays.toString(numbers));

        // 3. Iterate the array - print each element
        for (int i = 0; i <= numbers.length-1 ; i++) {
            System.out.println(numbers[i]);
        }
        for (int number : numbers){
            System.out.println(number);
        }

    }
}
