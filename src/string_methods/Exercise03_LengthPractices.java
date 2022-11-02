package string_methods;

import java.util.Scanner;

public class Exercise03_LengthPractices {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 2 words");
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        System.out.println("The length of the first string = " + s1.length());
        System.out.println("The length of the second string = " + s2.length());
    }
}
