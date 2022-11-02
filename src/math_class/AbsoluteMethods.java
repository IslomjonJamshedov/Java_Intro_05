package math_class;

import java.util.Scanner;

public class AbsoluteMethods {
    public static void main(String[] args) {

        System.out.println("Difference between your numbers is = " + Math.abs(10 - 14));
        System.out.println("Subtraction between your numbers is = " +(10 - 14));
        System.out.println("Subtraction between your numbers is = " +(10 - 14));


        /*

        Write a program asks user two ages and gets different between ages and prints them


        Output:
        "Please enter an age"
        input -> 24
        "Please enter an age"
        inout -> 32

        "Difference between your ages is = 8"
         */

        Scanner numberTaken = new Scanner(System.in);


        System.out.println("Please enter an age " );
        int age1 = numberTaken.nextInt();

        System.out.println("Please enter an second age " );
        int age2 = numberTaken.nextInt();

        System.out.println("Differences between your ages is = " + Math.abs(age1 - age2));
        System.out.println("Biggest age is " + Math.max(age1, age2 ));
        System.out.println("Smallest age is " + Math.min(age1, age2 ));



    }
}
