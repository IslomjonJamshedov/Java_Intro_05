package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {


        System.out.println("------------TASK1-------------");

        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1: ");
        num1 = input.nextInt();

        System.out.println("Please enter number 2: ");
        num2 = input.nextInt();

        System.out.println(num1 + num2 );


        System.out.println("------------TASK2-------------");

        int num3, num4;

        System.out.println("Please enter number 1: ");
        num3 = input.nextInt();

        System.out.println("Please enter number 1: ");
        num4 = input.nextInt();

        System.out.println(num3 * num4);



        System.out.println("------------TASK3-------------");

        double num5;
        double num6;

        System.out.println("Please enter number 1: ");
        num5 = input.nextInt();

        System.out.println("Please enter number 2: ");
        num6 = input.nextInt();

        System.out.println("The sum of the given numbers is = " + (num5 + num6)); //34.0
        System.out.println("The product of the given numbers is = " + (num5 * num6)); //240.0
        System.out.println("The subtraction of the given numbers is = " + (num5 - num6)); //14.0
        System.out.println("The division of the given numbers is = " + (num5 / num6)); //2.4
        System.out.println("The remainder of the given numbers is = " + (num5 % num6)); //4.0


        System.out.println("------------TASK4-------------");

        System.out.println(-10 + 7 * 5);
        System.out.println((72+24) % 24);
        System.out.println(10 + -3*9 / 9);
        System.out.println(5 + 18 / 3 * 3 - (6 % 3));


        System.out.println("------------TASK5-------------");

        int num7, num8;

        System.out.println("Please enter  number 1: ");
        num7 = input.nextInt();

        System.out.println("Please enter number 2: ");
        num8 = input.nextInt();

        System.out.println("The average of the given numbers is: "+ (num7 + num8) /2 );


        System.out.println("------------TASK6-------------");

        int num9, num10, num11, num12, num13;

        System.out.println("Please enter number 1: ");
        num9 = input.nextInt();

        System.out.println("Please enter number 2: ");
        num10 = input.nextInt();

        System.out.println("Please enter number 3: ");
        num11 = input.nextInt();

        System.out.println("Please enter number 4: ");
        num12 = input.nextInt();

        System.out.println("Please enter number 5: ");
        num13 = input.nextInt();

        System.out.println("The average of the given numbers is: " + (num9 + num10 + num11 + num12 + num13) /5);


        System.out.println("------------TASK7-------------");



        int number;
        int number2;
        int number3;

        System.out.println("Please enter number 1: ");
        number = input.nextInt();

        int square = number*number;
        System.out.println(square);

        System.out.println("Please enter number 2: ");
        number2 = input.nextInt();

        int square2 = number2*number2;
        System.out.println(square2);

        System.out.println("Please enter number 3: ");
        number3 = input.nextInt();

        int square3 = number3*number3;
        System.out.println(square3);



        System.out.println("------------TASK8-------------");

        int shortSide , longSide;

        System.out.println("Please enter the long side of a square: ");
        shortSide = input.nextInt();

        System.out.println("Please enter the short side of a square: ");
        longSide = input.nextInt();

        System.out.println("The perimeter of a square is : " + shortSide * longSide);

        System.out.println("The area of a square is : " + longSide * longSide);



        System.out.println("------------TASK9-------------");

        double yearlySalary = 90_000;

        System.out.println("A Software Engineer in Test can earn $ " + yearlySalary * 3 + "in 3 years.");



        System.out.println("------------TASK10-------------");

        String favBook;
        String favColor;
        int favNumber;

        input.nextLine();

        System.out.println("What is your favorite book? ");
        favBook = input.nextLine();

        System.out.println("What is your favorite color? ");
        favColor = input.next();


        System.out.println("What is your favorite number? ");
        favNumber = input.nextInt();

        System.out.println("User's favorite book is: " + favBook + "\nUser's favorite color is:" + favColor +
                "\nUser's favorite number is: " + favNumber);


        System.out.println("------------TASK11-------------");

        String firstName;
        String lastName;
        int age;
        String emailAddress;
        String phoneNumber;
        String address;

        System.out.println("Enter your first name: ");
        firstName = input.next();

        System.out.println("Enter your last name: ");
        lastName=input.next();

        System.out.println("Enter your age: ");
        age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your email address: ");
        emailAddress = input.next();

        input.nextLine();


        System.out.println("Enter your phone number: ");
        phoneNumber = input.nextLine();

        input.nextLine();

        System.out.println("Enter your address: ");
        address = input.nextLine();

        System.out.println("\tUser who joined this program is " + firstName + " " +lastName + ". " + firstName + "'s " + "age is "
                + "\n" + age + ". " + firstName + "'s email address is " + emailAddress + ", phone number \nis " +
                phoneNumber + ", and address is " + address + "." );

    }
}
