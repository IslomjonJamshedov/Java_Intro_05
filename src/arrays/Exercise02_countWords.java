package arrays;

import java.util.Arrays;

public class Exercise02_countWords {
    public static void main(String[] args) {

        /*
        Assume that you are given a below String

        String sentence = "I love arrays";

        Count how many words you have in this String

        Expected:
        3
         */

        System.out.println("\n------Option-1------\n");

        String sentence = "I love arrays";
        int countW = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' '){
                countW+= 1;
            }
        }
        System.out.println(countW + 1);

        System.out.println("\n------Option-2 With CharArray------\n");

        for(char c : sentence.toCharArray()){
            if(c == ' ') countW++;
        }

        System.out.println(countW + 1);

        System.out.println("\n------Option-3 With Split Method------\n");

       String[] arr =  sentence.split(" "); // [I, love, arrays]

        System.out.println(Arrays.toString(arr));
    }
}
