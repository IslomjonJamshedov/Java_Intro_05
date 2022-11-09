package homeworks;


import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("\n============TASK1==============\n");

        int num1, num2;

        System.out.println("Enter a numbers ");
        num1 = input.nextInt();

        System.out.println("Enter a second numbers ");
        num2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(num1-num2));
        System.out.println("\n============TASK2==============\n");

        int number1, number2, number3, number4, number5;


        System.out.println("Enter 5 numbers ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        number4 = input.nextInt();
        number5 = input.nextInt();


        System.out.println("Max value = " + Math.max(Math.max(Math.max(number1,number2),Math.max(number3,number4)),number5));

        System.out.println("Min value = " + Math.min(Math.min(Math.min(number1,number2),Math.min(number3,number4)),number5));



        System.out.println("\n============TASK3==============\n");

        int randomNum1 = (int) (Math.random()*50)+50;
        int randomNum2 = (int) (Math.random()*50)+50;
        int randomNum3 = (int) (Math.random()*50)+50;

        System.out.println(randomNum1);
        System.out.println(randomNum2);
        System.out.println(randomNum3);


        System.out.println("Number 1 = " + randomNum1);
        System.out.println("Number 2 = " + randomNum2);
        System.out.println("Number 3 = " + randomNum3);

        System.out.println("The sum of the numbers is = " + (randomNum1 + randomNum2 + randomNum3));

        System.out.println("\n============TASK4==============\n");
//
        int Alex = 125;
        int Mike = 220;
//
//
        System.out.println("Alex's money: $" + (double)(Alex - 25.5));
        System.out.println("Alex's money: $" + (double)(Mike + 25.5));


        System.out.println("\n============TASK5==============\n");

        System.out.println();
        double priceOfBike = 390; double dailySave = 15.60;
        System.out.println((int)(priceOfBike/dailySave));

        System.out.println("\n============TASK6==============\n");

        String s1 = "5", s2 = "10";
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);


        System.out.println("-Sum of 5 and 10 is = " + (n1 + n2));
        System.out.println("-Product of 5 and 10 is = " + (n1 * n2));
        System.out.println("-Division of 5 and 10 is = " + (n1 / n2));
        System.out.println("-Subtraction of 5 and 10 is = " + (n1 - n2));
        System.out.println("-Remainder of 5 and 10 is = " + (n1 % n2));


          System.out.println("\n============TASK7==============\n");

          String s3 = "200", s4 = "-50";
          int n3 = Integer.parseInt(s3);
          int n4 = Integer.parseInt(s4);

          System.out.println("The greatest value is = " + Math.max(n3,n4));
          System.out.println("The smallest value is = " + Math.min(n3,n4));
          System.out.println("The average value is = " + (n3+n4)/2);
          System.out.println("The absolute difference is = " + Math.abs(n3-n4));


        System.out.println("\n============TASK8==============\n");

        double savingPerDay = 0.96;

        System.out.println((int)(24/savingPerDay));
        System.out.println((int)(168/savingPerDay));
        System.out.println(150*savingPerDay);



        System.out.println("\n============TASK9==============\n");

        double computer = 1250, saving = 62.50;

        System.out.println((int)(computer/saving));


        System.out.println("\n============TASK10==============\n");

        double carAmount = 14_265, option1 = 475.5, option2 = 951;

        System.out.println("Option 1 will take " + (int)(carAmount/option1) + " months");
        System.out.println("Option 2 will take " + (int)(carAmount/option2) + " months");


        System.out.println("\n============TASK11==============\n");

        int numbers1, numbers2;

        System.out.println("Enter 2 numbers ");
        numbers1 = input.nextInt();
        numbers2 = input.nextInt();

        double divide = (double)numbers1/(double)numbers2;


        System.out.println(divide);


        System.out.println("\n============TASK12==============\n");

        int random1 =  ((int)(Math.random()*101));
        int random2 =  ((int)(Math.random()*101));
        int random3 =  ((int)(Math.random()*101));

       boolean allNumbersOver25 = (random1 > 25) && (random2 > 25) && (random3 > 25);


        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

        System.out.println(allNumbersOver25);



        System.out.println("\n============TASK13==============\n");


        System.out.println("Enter a number between 1-7");
        int day = input.nextInt();

        if(day == 1){
            System.out.println("MONDAY");
        }
            else if(day == 2 ){
            System.out.println("TUESDAY");
        }
            else if(day == 3){
            System.out.println("WEDNESDAY");
        }
            else if(day == 4){
            System.out.println("THURSDAY");
        }
            else if(day == 5){
            System.out.println("FRIDAY");
        }
            else if(day == 6){
            System.out.println("SATURDAY");
        }
            else{
            System.out.println("SUNDAY");
        }


        System.out.println("\n============TASK14==============\n");

         int grade1, grade2,grade3;

        System.out.println("Enter exam 1 result = ");
        grade1 = input.nextInt();

        System.out.println("Enter exam 2 result = ");
        grade2 = input.nextInt();

        System.out.println("Enter exam 3 result = ");
        grade3 = input.nextInt();

        double average;

        average = (grade1 + grade2 + grade3) / 3;


        if(average>=70){
            System.out.println("YOU PASSED!");

        }
        else{
            System.out.println("YOU FAILED!");
        }



        System.out.println("\n============TASK15==============\n");


        int nu1, nu2, nu3;

        System.out.println("Enter 3 numbers = ");
        nu1 = input.nextInt();
        nu2 = input.nextInt();
        nu3 = input.nextInt();


        if(nu1==nu2 && nu1 == nu3){
            System.out.println("TRIPLE MATCH");
        }
            else if(nu1==nu2 || nu1==nu3 || nu2==nu3){
            System.out.println("DOUBLE MATCH");
        }
            else{
            System.out.println("NO MATCH");
        }

    }
}
