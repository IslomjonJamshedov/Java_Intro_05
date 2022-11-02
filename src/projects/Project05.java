package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Project05 {
    public static void main(String[] args) {

        String[] str = {"John", "John", "Mike", "Joe", "jill", "joe", "p", "p", "p"};

        findMostRepeatedElementInAnArray(str);



        System.out.println("\n-----------TASK-1-----------\n");

        int[] num1 = {10, 7, 7, 10, -3, 10, -3};

        Arrays.sort(num1);

        System.out.println(Arrays.toString(num1));
        System.out.println("Smallest = " + num1[num1.length - 1]);
        System.out.println("Greatest = " + num1[0]);


        System.out.println("\n-----------TASK-2-----------\n");

        int[] numbers = {10, 7, 7, 10 - 3, 10, -3};


        int max = Integer.MIN_VALUE;


        for (int n : numbers) {
            if (n > max) max = n;
        }

        System.out.println("Greatest = " + max);

        int min = Integer.MAX_VALUE;

        for (int n : numbers) {
            if (n < min) min = n;
        }

        System.out.println("Smallest = " + min);


        System.out.println("\n-----------TASK-3-----------\n");

        int[] num2 = {10, 5, 6, 7, 8, 5, 15, 15};
        findSecondGreatestAndSecondSmallest(num2);

        Arrays.sort(num2);

        System.out.println("Second Smallest " + num2[2]);
        System.out.println("Second Greatest " + num2[num2.length - 3]);

    }

        //    TASK-4 {10, 5, 6, 7, 8, 5, 15, 15};

    public static void findSecondGreatestAndSecondSmallest(int[] arrayName){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, secondMax = Integer.MIN_VALUE, secondMin = Integer.MAX_VALUE;

        for(int num : arrayName){
            if (num > max){
                max = num;
            }

        }for (int num : arrayName){
            if (num > secondMax && num != max){
                secondMax = num;
            }
        }
        for(int num : arrayName){
            if(num < min){
                min = num;
            }
        }for (int num : arrayName){
            if (num < secondMin && num != min){
                secondMin = num;
            }
        }
        System.out.println("Second Max number = " + secondMax + " Second Min number " + secondMin);

    }
    // TASK 5

    public static void findDuplicates (String[] arrayName){
        ArrayList<String> duplicates = new ArrayList<>();



        for (int i = 0; i < arrayName.length; i++) {
            for (int j = 1; j < arrayName.length; j++) {
                if (arrayName[i] == arrayName[j]&& i != j && !duplicates.contains(arrayName[i])){
                    duplicates.add(arrayName[i]);
                }
            }
        }for (String duplicate : duplicates){
            System.out.println(duplicate);

        }
    }
        // TASK 6
    public static void findMostRepeatedElementInAnArray(String[] arrayName){
        ArrayList<String> duplicates = new ArrayList<>();

        for (int i = 0; i < arrayName.length; i++) {
            int count = 0;
            for (int j = 0; j < arrayName.length; j++) {
                if (arrayName[i] == arrayName[j] && i != j){
                    count++;
                }
            }duplicates.add("" + count + arrayName[i]);
        }

        Collections.sort(duplicates);
        System.out.println(duplicates.get(duplicates.size() -1).substring(1));
    }
}
