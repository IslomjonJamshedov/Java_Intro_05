package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Homework10 {
    public static void main(String[] args) {

        /*
        TASK 1 Test
        String str1 = "Selenium is the most common UI automation tool.   ";
        System.out.println("String str = " + countWords(str1));

        TASK 2 Test
        String str = "TechGlobal is a QA bootcamp";
        System.out.println(countA(str));

        TASK 3 Test
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        System.out.println(countPos(num));

        TASK 4 Test
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        System.out.println(removeDuplicateNumbers(num));


        TASK 5 Test
        ArrayList<String> str = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
        System.out.println(findDuplicates(Arrays.toString(str));

        TASK 6 Test
        String str = "    I  am    learning     Java     ";
        System.out.println(removeExtraSpaces(str));

        TASK 7 Test
        int[] arr1 =  {10, 3, 6, 3, 2};
        int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};

        System.out.println(Arrays.toString(add(arr1, arr2)));

        TASK 8 Test
        int[] numbers = {10, -13, 5, 70, 15, 57};

        System.out.println(findClosestTo10(numbers));


         */

    }


    //Task - 1
    /*
        public static int countWords(String str){
        int countWords = 1;
        //str.trim();
        //String[] word = str.split(" ");

            for (int i = 0; i < str.length()-1; i++) {
                if (str.charAt(i) == ' ' && !(str.charAt(i+1) == ' ')) countWords++;
            }
        return countWords;
    }



    TASK 2
    public static int countA(String num){

        int countA = 0;

        for (int i = 0; i < num.length() -1; i++) {
            if (num.charAt(i) == 'A' || num.charAt(i) == 'a')countA++;
        }return countA;
    }



    TASK 3
    public static int countPos(ArrayList<Integer> num){
        int count0 = 0;

        for (Integer num1 : num){
            if (num1 > 0)count0++;
        }return count0;
    }


    TASK 4
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> num){
        ArrayList<Integer> num1 = new ArrayList();

        for(Integer num2 : num){
            if (!num1.contains(num2))num1.add(num2);
        }return num1;

    }

    TASK 5
     public static void findDuplicates (String[] arrayName) {
        ArrayList<String> duplicates = new ArrayList<>();


        for (int i = 0; i < arrayName.length; i++) {
            for (int j = i+1; j < arrayName.length; j++) {
                if (arrayName[i] == arrayName[j] && i != j && !duplicates.contains(arrayName[i])) {
                    duplicates.add(arrayName[i]);
                }
            }
        }
        for (String duplicate : duplicates) {
            System.out.println(duplicate);


        }


    TASK 6
    public static String removeExtraSpaces(String str) {

    String str1 = str.replaceAll("\\s","");
        return str1;

    }


    public static int[] add(int[] a, int[] b) {
        int[] c = new int[Math.max(a.length, b.length)];
        for (int i = 0; i < c.length; i++) {
            if (a.length > i) {
                c[i] += a[i];}
            if (b.length > i) {
                c[i] += b[i];}
        }return c;
    }
    public static int findClosestTo10(int[] arr){
        int close10 = Integer.MAX_VALUE;

        for (int a : arr) {
            if (Math.abs(10 - a) <= Math.abs(close10 - 10) && a != 10)
                if (Math.abs(10 - a) == Math.abs(close10 - 10)) close10 = Math.min(a, close10);
                else close10 = a;}
        return close10;

     */




}
