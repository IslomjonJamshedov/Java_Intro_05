package homeworks;

import java.util.Arrays;

public class Homework09 {
    public static void main(String[] args) {


        System.out.println("\n---------TASK-1----------\n");

        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        int count = 0;


        String dup = "";

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (dup.contains(numbers[i] + "")) break;

                if (numbers[i] == numbers[j]){
                    count++;
                }
            }
        }

        System.out.println(count);


        System.out.println("\n---------TASK-2----------\n");


        String[] word = {"Z", "abc", "Z", "123", "#", "#"};

        outterloop:
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if ((word[i].equals(word[j])) && i != j){
                    System.out.println(word[j]);
                    break outterloop;
                }else System.out.println("There is no duplicates");
            }
        }


        System.out.println("\n---------TASK-3----------\n");

        int[] num = {0, -4, -7, 0, 5, 10, 45, -7, 0};


        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if ((num[i] == (num[j])) && i != j){
                    System.out.println(num[j]);
                }else System.out.println("There is no duplicates");
            }
        }

        System.out.println("\n---------TASK-4----------\n");

        String[] word1 = {"Z", "abc", "Z", "123", "#", "#"};

        for (int i = 0; i < word1.length; i++) {
            for (int j = i + 1; j < word1.length; j++) {
                if ((word1[i].equals(word1[j])) && i != j){
                    System.out.println(word1[j]);
                }else System.out.println("There is no duplicates");
            }
        }

        System.out.println("\n---------TASK-5----------\n");


        String[] words1 = {"abc","foo", "bar"};
        String[] words2 = {};
        for (int i = words1.length - 1; i >= 0; i--) {
          words1[i] += words2;
        }
        System.out.println(Arrays.toString(words2));


        System.out.println("\n---------TASK-6----------\n");

        String str = "Java is fun and so is python";

        String[] words =  str.split(" ");

        String reverseString = "";

        for (String w : words){
            String reverseword = "";
            for (int i = w.length() -1; i >= 0 ; i--) {
                reverseword=reverseword+w.charAt(i);
            }
            reverseString=reverseString + reverseword + " ";

        }
        System.out.println(reverseString);

    }
}
