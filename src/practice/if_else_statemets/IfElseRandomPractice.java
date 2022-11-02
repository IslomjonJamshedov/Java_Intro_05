package practice.if_else_statemets;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class IfElseRandomPractice {
    public static void main(String[] args) {

        int randomNum = (int)(Math.random() * 50 - 0 + 1) + 0;


        System.out.println(randomNum);

        if(randomNum >= 10 && randomNum <=25){
            System.out.println("true");
        }
        else{
            System.out.println(false);
        }


        // (expression) ? "true" : "false";
        //Ternary Expression
        System.out.println((randomNum >= 10 && randomNum <=25) ? "true" : "false");

        System.out.println((randomNum >= 10 && randomNum <=25) );


        System.out.println("\n===========TASK2=========\n");


        if (randomNum <= 50){
            //1-50
            System.out.println("1st half");
            if (randomNum <= 25){
                System.out.println("1st quarter");
            }else{
                System.out.println("2nd quarter");
            }
        }else{
            System.out.println("2nd half");

            if (randomNum <= 75){
                System.out.println("3rd quarter");
            }else{
                System.out.println("4th quarter");
            }
        }

        /*
        // Scanner//
        Is it raining (true/false)
        Do you have umbrella? (true/false)
        Are you hungry? (true/false)

        // if elses //
        it is raining -> it is raining outside
            if you have umbrella -> you can go outside
            otherwise -> you stay home

        it is not raining -> it is not raining outside
            if you are hungry -> you go to chick-fil-a
            otherwise -> you are riding a bike
         */

        Scanner input = new Scanner(System.in);

        boolean itsRainingOutside, doYouHaveAnUmbrella, areYouHungary;

        System.out.println("It is raining outside");
        itsRainingOutside = input.nextBoolean();

        System.out.println("Do you have a Umbrella");
        doYouHaveAnUmbrella = input.nextBoolean();


        System.out.println("It is raining outside");
        areYouHungary = input.nextBoolean();

        if (itsRainingOutside) {
            System.out.println("it is raining outside!");

            if (doYouHaveAnUmbrella) {
                System.out.println("You can go outside");
            } else {
                System.out.println("You stay home");

            }

        }else{
            System.out.println("you stay home ");
        }
        if (areYouHungary){
            System.out.println("Go to chick Fill A ");
        }
        else{
            System.out.println("Ride your bike");
        }


    }
}
