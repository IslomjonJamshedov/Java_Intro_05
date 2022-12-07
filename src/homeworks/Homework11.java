package homeworks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Homework11 {

    public static void main(String[] args) {
          //TASK - 1
//        String str = " Java world ";
//        System.out.println(noSpace(str));

          //TASK - 2
//        String str = "Hello";
//        System.out.println(replaceFirstLast(str));

          //TASK - 3
//        String str = "Java";
//        System.out.println(hasVowels(str));


          //TASK-4

          //TASK - 5
//        int num = -2, num1 = -2, num2 = 10;
//        System.out.println(averageOfEdge(num, num1, num2));

          //TASK - 6
//        String[] str = {"appium", "123", "ABC", "java"};
//        System.out.println(Arrays.toString(noA(str)));

        //TASK - 7

        //TASK - 8

        int[] num = {7, 4, 11, 23, 17};
       // System.out.println(countPrimes(num));

    }




    //TASK 1
    public static String noSpace(String str){
        str = str.replaceAll(" ", "");
        return str;
    }

    //TASK 2
    public static String replaceFirstLast(String str){
        String str1 = "";
        if (str.length() < 2)return str1;
        else return str.substring(1) + str.charAt(0);
    }

    //TASK 3
    public static boolean hasVowels(String str){
        String str1 = str.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'a'
            || str1.charAt(i) == 'e'
            || str1.charAt(i) == 'o'
            || str1.charAt(i) == 'u'
            || str1.charAt(i) == 'i' )return true;
        }return false;
    }

    //TASK 4
        public static void checkAge(int yearOfBirth) {

        if (yearOfBirth > 2023 || 2022 - yearOfBirth > 100) System.out.println("AGE IS NOT VALID");
        else if (2022 - yearOfBirth < 16) System.out.println("AGE IS NOT ALLOWED");
        else System.out.println("AGE IS ALLOWED");
        }

    //TASK 5
    public static int averageOfEdge(int num1, int num2, int num3){
        return Math.min(Math.min(num1,num2),num3) +  Math.max(Math.max(num1,num2),num3)/2;
    }


    //TASK 6
    public static String[] noA(String[] str){

        for (int i = 0; i < str.length; i++) {
            if (str[i].toLowerCase().startsWith("a")) str[i] = "###";
        }return str;
    }

    //TASK 7
     public static int[] no3or5(int[] num){
         for (int i = 0; i < num.length; i++) {
             if (num[i] % 15 == 0) num[i] = 101;
             else if (num[i] % 5 == 0) num[i] = 100;
             else if (num[i] % 3 == 0) num[i] = 99;
         }return num;

    }


    //TASK 8
    public static Boolean isPrime(int num){
        for (int i = 2; i < num - 1; i++) {
            if(num % i == 0) return false;
        } return true;
    }
    public static int countPrimes(int[] nums){
        int count = 0;
        for (int num : nums) {
            if(num > 1 & isPrime(num)) count++;
        } return count;
    }
    }

