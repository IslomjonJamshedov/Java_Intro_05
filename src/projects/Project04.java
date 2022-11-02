package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Random;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("\n---------------TASK1---------------\n");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Word");
        String word = input.nextLine();

        if(word.length() >= 8){
            System.out.println(word.substring(word.length()-4) + word.substring(0,4));
        }else System.out.println("This String does not have 8 characters");


        System.out.println("\n---------------TASK2---------------\n");

        System.out.println("Enter a sentence please");
        String Sentence01 = input.nextLine();

        if(Sentence01.contains(" ")){
            System.out.println(Sentence01.lastIndexOf( " ") +
                    Sentence01.substring(0,Sentence01.indexOf(" ")));
        }


        System.out.println("\n---------------TASK3---------------\n");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirt in the past and also some idiot look shoes";
        String str4 = str3.replace("stupid", "nice");

        System.out.println(str1.replace("stupid", "nice"));
        System.out.println(str2.replace("idiot", "nice"));
        System.out.println(str4.replace("idiot", "nice"));


        System.out.println("\n---------------TASK4---------------\n");

        String name01 = ScannerHelper.getAName();

        if (name01.length() <= 2){
            System.out.println("Invalid Input!!!");
        } else if (name01.length() % 2 == 0) {
            System.out.println(name01.substring(name01.length()/2-1, name01.length()/2+1));
        }else System.out.println((name01.charAt(name01.length()/2)));


        System.out.println("\n---------------TASK5---------------\n");

        Scanner country = new Scanner(System.in);
        String country01;

        System.out.println("Enter a country");
        country01 = country.nextLine();

        if(country01.length() < 5){
            System.out.println("Invalid Input!!!");
        } else System.out.println(country01.substring(0,2)+ country01.substring(country01.length()-2)); {

        }


        System.out.println("\n---------------TASK6---------------\n");

        Scanner input1 = new Scanner(System.in);

        String address;

        System.out.println("Enter an Address");
        address = input1.nextLine();

        System.out.println(address.replace("a", "*").replace("A", "*").replace("e", "#")
                .replace("E", "#").replace("i", "+").replace("u", "$")
                .replace("U", "$").replace("o", "@").replace("O", "@"));


        System.out.println("\n---------------TASK7---------------\n");

        int num1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int num2 = RandomNumberGenerator.getARandomNumber(0, 25);

        String s = " ";

        for (int i = Math.min(num1, num2); i < Math.max(num1, num2); i++) {
            if (i % 5 != 0) {
                s += i + "-";
            }
        }
        System.out.println(s.substring(0, s.length() - 1));

        System.out.println("\n---------------TASK8---------------\n");

        Scanner s1 = new Scanner(System.in);
        int count = 0;

        String sentence;

        System.out.println("Enter a sentence");
        sentence = s1.nextLine();
        if (!sentence.contains(" ")) {
            System.out.println("This sentence does not have multiple words.");
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                count += 1;
            }
        }
        System.out.println("This sentence has " + (count + 1) + " words");


        System.out.println("\n---------------TASK9---------------\n");

        int num;
        System.out.println("Please enter a positive number");
        num = input.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 6 == 0) {
                System.out.println("FooBar");
            } else if (i % 2 == 0) {
                System.out.println("Foo");
            } else if (i % 3 == 0) {
                System.out.println("Bar");
            } else System.out.println(i);
        }

        System.out.println("\n---------------TASK10---------------\n");

        String name = ScannerHelper.getAName();
        String pali = "";

        if (name.length() < 1) {
            System.out.println("This word does not have 1 or more characters");
        }
        for (int i = name.length() - 1; i >= 0; i--) {
            pali += name.charAt(i);

        }
        if (pali.toLowerCase().equals(name.toLowerCase())) {
            System.out.println("This word is palindrome");
        } else System.out.println("This word is not palindrome");


        System.out.println("\n---------------TASK11---------------\n");

        int countW = 0;

        System.out.println("Please enter a string");
        String sttr = input.nextLine();

        if (sttr.length()< 1){
            System.out.println("This sentence does not have any characters.");
        }

        for (int i = 0; i < sttr.length(); i++) {
            if (sttr.toLowerCase().charAt(i) == 'a') {
                countW ++;
            }
        }
        System.out.println("This sentence has " + (countW) + " a or A letters");
    }
}
