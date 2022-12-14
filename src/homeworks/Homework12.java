package homeworks;

import java.util.Arrays;
import java.util.Objects;

public class Homework12 {
    public static void main(String[] args) {


        System.out.println("\n---------TASK-1---------\n");
        String str1 = "123Hello World149";
        System.out.println(noDigit(str1));

        System.out.println("\n---------TASK-2---------\n");
        String str2 = "TechGlobal";
        str2.replace("T", "");
        System.out.println(str2);
        System.out.println(noVowel(str2));

        System.out.println("\n---------TASK-3---------\n");
        String str3 = "John’s age is 29";
        System.out.println(sumOfDigits(str3));

        System.out.println("\n---------TASK-4---------\n");
        String str4 = "John’s age is 29";
        System.out.println(hasUpperCase(str4));

        System.out.println("\n---------TASK-5---------\n");
        int num = 1;
        int num1 = 2;
        int num2 = 3;
        System.out.println(middleInt(num, num1, num2));

        System.out.println("\n---------TASK-6---------\n");
        int[] arr = {13, 2, 3,13,13};
        System.out.println(Arrays.toString(no13(arr)));

        System.out.println("\n---------TASK-8---------\n");
        String st = "abc123$#%";
        System.out.println(Arrays.toString(categorizeCharacters(st)));


    }

    //TASK 1
    public static String noDigit(String str) {

        String exp = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                exp += str.charAt(i);
            }
        }
        return exp;
    }

    //TASK 2

    public static String noVowel(String str) {
        String exp = str.toLowerCase();
        String exp1 = "";

        for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == 'a' || exp.charAt(i) == 'e' || exp.charAt(i) == 'i' || exp.charAt(i) == 'o'
                    || exp.charAt(i) == 'u' || exp.charAt(i) == 'y') continue;
            {
                exp1 += exp.charAt(i);
            }
        }
        return exp1;
    }

    //TASK 3
    public static int sumOfDigits(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
            }
        }
        return num;

    }

    //TASK 4
    public static boolean hasUpperCase(String str) {
        boolean b = true;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) return b;
            else if (!Character.isUpperCase(str.charAt(i))) b = false;
        }
        return b;
    }

    //TASK 5
    public static int middleInt(int num1, int num2, int num3) {
        int min = Math.min(Math.min(num1, num2), num3);
        int max = Math.max(Math.max(num1, num2), num3);

        return max - min;
    }

    //TASK 6
    public static int[] no13 (int[] num){
        for (int i = 0; i < num.length; i++) {
            if(num[i] == 13) num[i] = 0;
        }return num;
    }

    //TASK 7
    public static int[] arrFactorial(int[] numbers) {
        int[] factorials = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int factorial = 1;
            for (int j = numbers[i]; j > 0; j--) {
                factorial *= j;
            }
            factorials[i] = factorial;
        }
        return factorials;
    }

    //TASK 8

    public static String[] categorizeCharacters(String str){
        String[] st = new String[3];

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))st[0] += str.charAt(i);
            else if (Character.isDigit(str.charAt(i))) st[1] += str.charAt(i);
            else  st[2] += str.charAt(i);
        }return st;
    }
}



