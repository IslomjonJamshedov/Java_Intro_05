package homeworks;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {


        System.out.println("\n---------TASK1---------\n");


        for (int i = 1; i <= 100; i++) {
            if(i % 7 == 0) System.out.print(" - " + i);
        }


        System.out.println("\n---------TASK2---------\n");

        for (int i = 1; i <= 100; i++) {
            if(i % 6 == 0) System.out.print(" - " + i);
        }


        System.out.println("\n---------TASK3---------\n");


        for (int i = 100; i >= 50; i--) {
            if(i % 5 == 0) System.out.print(" - " + i);
        }


        System.out.println("\n---------TASK4---------\n");

        for (int i = 0; i <= 7; i++) {
            System.out.println("The square of " + i + " is = " +  (i * i));
        }

        System.out.println("\n---------TASK5---------\n");

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            System.out.println(i + sum);
        }

        System.out.println("\n---------TASK6---------\n");

        Scanner sc = new Scanner(System.in);
        //Declare and Initialize the variable
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int n = 1, fact = 1;
        while(n <= num)
        {
            fact = fact * n;
            n++;
        }
        System.out.println("Factorial of the number: " + fact);


        System.out.println("\n---------TASK7---------\n");

        String name = ScannerHelper.getAName().toLowerCase();
        int counter = 0;

        for (int i = 0; i <= name.length(); i++) {
            if(name.charAt(i) == 'a'|| name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o'
            || name.charAt(i) == 'u')
                counter ++;
        }

        System.out.println("There are " + counter + " vowels in this full name");


        System.out.println("\n---------TASK8---------\n");

        int sum1 = 0;
        int i = 0;

        do{
            sum1 += ScannerHelper.getAnNumber();
            i++;
        }while(sum1 < 100);

        if(i == 1) System.out.println("This number is already more than 100");
        else System.out.println("Sum of the entered numbers is at least 100");


        System.out.println("\n---------TASK9---------\n");

        int x = ScannerHelper.getAnNumber();
        String result = "";
        int m = 0;
        int n1 = 1;
        if (x<2) result = result + m;
        else result = result + m + " - " + n;

        for (int j = 2; j < x ; j++) {

            int sum2 = m + n1;
            result += " - " + sum2;
            m = n1;
            n1 = sum2;
        }


        System.out.println(result);


        System.out.println("\n---------TASK10---------\n");

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Please enter a name");
        String name1 = scanner1.nextLine();
        String name2 = name1.toLowerCase();
        while(name2.startsWith("j")) {
            System.out.println("End of the program");
            System.out.println("Please enter a name");
            name2 = scanner1.nextLine();
        }
    }
}
