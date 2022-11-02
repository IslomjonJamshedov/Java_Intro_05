package projects;

import java.util.Scanner;

public class Project02 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int  num1, num2, num3;


        System.out.println("Enter 1st number ");
        num1 = input.nextInt();

        System.out.println("Enter 2nd number ");
        num2 = input.nextInt();

        System.out.println("Enter 3rd number ");
        num3 = input.nextInt();



        System.out.println("The product of the numbers entered is = " + num1 * num2 * num3);




        System.out.println("\n===============TASK2================\n");


        String  firstName, lastName;
        int yearOfBirth, currentYear = 2022;

        input.nextLine();

        System.out.println("Enter first name ");
        firstName = input.nextLine();

        System.out.println("Enter last name");
        lastName = input.nextLine();

        System.out.println("Enter year of birth");
        yearOfBirth = input.nextInt();

        input.nextLine();

        System.out.println(firstName+ " " + lastName + "'s age is = " + (currentYear - yearOfBirth));

        System.out.println("\n===============TASK3================\n");

        String fName, lName;
        int weight;

        System.out.println("Enter first name " );
        fName = input.nextLine();

        System.out.println("Enter last name " );
        lName = input.nextLine();

        System.out.println("Enter weight as kg " );
        weight = input.nextInt();

        input.nextLine();

        System.out.println(fName +" " + lName+ "s " + "weight is = " + weight * 2.205 + " lbs.");


        System.out.println("\n===============TASK4================\n");


        String student1, student2, student3;

        int studentAge1, studentAge2, studentAge3;


        System.out.println("What is your full name? ");
        student1 = input.nextLine();

        System.out.println("Student 1: " + student1);



        System.out.println("What is your age? ");
        studentAge1 = input.nextInt();

        System.out.println("Student 1: " + studentAge1);


        input.nextLine();


        System.out.println("What is your full name? ");
        student2 =  input.nextLine();

        System.out.println("Student 2: " + student2);


        System.out.println("What is your age? ");
        studentAge2 =  input.nextInt();

        System.out.println("Student 2: " + studentAge2);


        input.nextLine();

        System.out.println("What is your full name? ");
        student3 = input.nextLine();


        System.out.println("Student 3: " + student3);


        System.out.println("What is your age? ");
        studentAge3 = input.nextInt();

        System.out.println("Student 3: " + studentAge3);


        input.nextLine();

        System.out.println(student1 + "'s age is " + studentAge1 + "." + "\n" + student2 + "'s age is  " + studentAge2 + "."+ "\n" + student3 + "'s age is " +
                studentAge3 + ".");


        System.out.println("\nThe average age is " + (studentAge1 + studentAge2 + studentAge3) /3 + "." + "\nThe eldest age is " + Math.max(Math.max(studentAge1,
                studentAge2), studentAge3) + "." + "\nThe youngest age is " + Math.min(Math.min(studentAge1, studentAge2),studentAge3));

    }
}

