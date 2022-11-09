package regex;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z 0-9] {5,10}");

        System.out.println(pattern); //returns the pattern
        System.out.println(pattern.pattern()); // return the pattern as a String
        System.out.println(pattern.toString()); // return the pattern as a String

        System.out.println(Pattern.matches(pattern.pattern(), "Apple")); // false contains 'A'
        System.out.println(Pattern.matches(pattern.pattern(),"hello world")); // false contains space (_)

        String str = "I go to school in TechGlobal and I love it";

        String[] arr = str.split(" [a-z0-9]{5,20}");

        System.out.println(Arrays.toString(arr));


        System.out.println("\n---------TASK-1----------\n");

        String userName = ScannerHelper.getAName();

        pattern = Pattern.compile("[a-zA-Z0-9]{5,10}");

        if (Pattern.matches(pattern.toString(), userName)){
            System.out.println("Valid Username");
        }else System.out.println("Error!");

        //2nd Option
        if (userName.matches("[a-zA-Z0-9]{5,10}")) System.out.println("Valid Username");
        else System.out.println("Error!");
    }
}
