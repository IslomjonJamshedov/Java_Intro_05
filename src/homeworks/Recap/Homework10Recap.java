package homeworks.Recap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework10Recap {
    public static void main(String[] args) {

        int[] numbers = {10, -13, 5, 70, 15, 57};
        int[] number1 = {10, 10, 10, 10, 10, 10};

        System.out.println(findClosestTo10(numbers));
    }


    //TASK 8
    public static int findClosestTo10(int[] arr){
        Arrays.sort(arr);

        int numberBefore10 = 0;
        int numberAfter10 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 10) numberBefore10 = arr[i];
            else break;
        }

        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] > 10)numberAfter10 = arr[i];
            else break;
        }

        if (arr[0] >= 10) return numberAfter10;
        else if (arr[arr.length-1] <= 10) return numberBefore10;
        else{
            if (Math.abs(10 - numberBefore10) <= Math.abs(10 - numberAfter10)) return numberBefore10;
            else return numberAfter10;
        }


    }


    //TASk 7

    public static int[] sum(int[] arr1, int[] arr2){
        // 1,2,3
        // 1,2,3,4,5,6
        int smallerLength = Math.max(arr1.length, arr2.length);
        int largerLength = Math.min(arr1.length, arr2.length);
        int[] newArr = new int[largerLength];

        for (int i = 0; i < smallerLength; i++) {
            newArr[i] = arr1[i] + arr2[i];
        }
        for (int i = smallerLength; i < largerLength; i++) {
            if (arr1.length < arr2.length) newArr[i] = arr2[i];
            else newArr[i] = arr1[i];
        }
        return newArr;
    }

    public static String removingExtraSpaces(String str){
        String newStr = "";
        char[] charArr = str.toCharArray();
        int i = 1;
        for (char c : charArr){
            if (c != ' ')newStr += c;
            else if (charArr[i] != ' ')newStr += c;
        }
        return newStr;
    }

}
