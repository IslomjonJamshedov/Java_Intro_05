package homeworks;

import java.util.Arrays;
import java.util.Locale;

public class Homework06 {
    public static void main(String[] args) {

        System.out.println("\n----------TASK-1----------\n");

        int num1[] = {89, 0, 23, 0, 12, 0, 15, 34, 0, 7};

        System.out.println(num1[3]);
        System.out.println(num1[0]);
        System.out.println(num1[9]);
        System.out.println(Arrays.toString(num1));

        System.out.println("\n----------TASK-2----------\n");

        String[] str1 = new String[5];
        str1[4] = "xyz";
        str1[1] = "abc";

        System.out.println(str1[3]);
        System.out.println(str1[0]);
        System.out.println(str1[4]);
        System.out.println(Arrays.toString(str1));

        System.out.println("\n----------TASK-3----------\n");

        int num2[] = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(num2));

        Arrays.sort(num2);
        System.out.println(Arrays.toString(num2));

        System.out.println("\n----------TASK-4----------\n");

        String str2[] = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(str2));
        Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));

        System.out.println("\n----------TASK-5----------\n");

        String cartoon[] = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(cartoon));

        for (String cartoons : cartoon) {
            if (cartoons.equals("Pluto")) {
                System.out.println("True");
                break;
            }
        }

        System.out.println("\n----------TASK-6----------\n");

        String cats[] = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));

        for (String cat : cats) {
            if (cat.contains("Garfield") && cat.contains("Felix")) {
                System.out.println("True");
            } else System.out.println("False");
            break;
        }

        System.out.println("\n----------TASK-7----------\n");

        double dum[] = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(dum));
        System.out.println(dum[0]);
        System.out.println(dum[1]);
        System.out.println(dum[2]);
        System.out.println(dum[3]);
        System.out.println(dum[4]);

        System.out.println("\n----------TASK-8----------\n");

        char[] chars = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(chars));

        int countl = 0;
        int countU = 0;
        int countD = 0;
        int countS = 0;

        for (char char01 : chars) {
             if(Character.isLowerCase(char01))  countl++;
             else if (Character.isUpperCase(char01)) countU++;
             else if (Character.isDigit(char01)) countD++;
             else countS++;

        }



        System.out.println("Letters = " + (countl + countU));
        System.out.println("Uppercase letters = " + countU);
        System.out.println("Lowercase letters = " + countl);
        System.out.println("Digits = " + countD);
        System.out.println("Special characters = " + countS);

        System.out.println("-----------TASK 9--------------");


        String[] strings = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        System.out.println(Arrays.toString(strings));

        int countUpper = 0, countLower = 0, countBp = 0, countBookPen = 0;
        for (int i = 0; i < strings.length; i++) {
            if (Character.isUpperCase(strings[i].charAt(0))) {
                countUpper += 1;
            } else if (Character.isLowerCase(strings[i].charAt(0))) {
                countLower += 1;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].toLowerCase(Locale.ROOT).charAt(0) == ('b') | strings[i].toLowerCase(Locale.ROOT).charAt(0) == 'p') {
                countBp += 1;
            }
        }
        for (String word : strings) {
                 if(word.toLowerCase(Locale.ROOT).contains("book") | word.toLowerCase(Locale.ROOT).contains("pen")){
                     countBookPen += 1;
                 }
             }
        System.out.println("Elements starts with uppercase = " + countUpper);
        System.out.println("Elements starts with lowercase = " + countLower);
        System.out.println("Elements starts with B or p = " + countBp);
        System.out.println("Elements having \"book\" or \"pen\" = " + countBookPen);

        System.out.println("-----------TASK 10--------------");

        int[] ints = {3,5,7,10,0,20,17,10,23,56,78};
        int countMore = 0, countLess = 0, count10 = 0;
        System.out.println(Arrays.toString(ints));
        for (int i: ints) {
            if(i > 10){
                countMore++;
            } else if(i < 10){
                countLess++;
            } else{
                count10++;
            }
        }
        System.out.println("Elements that are more than 10 = " + countMore);
        System.out.println("Elements that are less than 10 = " + countLess);
        System.out.println("Elements that are 10 = " + count10);

        System.out.println("-----------TASK 11--------------");


        int[] ints1 = {5, 8, 13, 1, 2};
        int[] ints2 = {9, 3, 67, 1, 0};
        int[] ints3 = new int[ints2.length];
        for (int i = 0; i < ints1.length ; i++) {
            ints3[i] = (Math.max(ints1[i], ints2[i]));
        }
        System.out.println(Arrays.toString(ints1));
        System.out.println(Arrays.toString(ints2));
        System.out.println(Arrays.toString(ints3));


    }
}

