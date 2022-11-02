package conditional_statements.if_elseif_else_ladder_statements;

import java.util.Scanner;

public class Exercise1_Positive_Negative {
    public static void main(String[] args) {

        /*
        Write a program that asks user to enter a number
        if number is more than zero, print "POSITIVE"
        if number is less than zero, print "NEGATIVE"
        Otherwise, print "ZERO"
         */

        Scanner input = new Scanner(System.in);


        System.out.println("Enter a number");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("POSITIVE");
        }
           else if(num == 0){
                System.out.println("ZERO");
        }
           else {
                System.out.println("NEGATIVE");

        }

    }
}
