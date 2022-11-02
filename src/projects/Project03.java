package projects;

public class Project03 {
    public static void main(String[] args) {


        System.out.println("===========TASK1===========");

        String s1 = "24", s2 = "5";

        int num1 = Integer.parseInt(s1), num2 = Integer.parseInt(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (num1 + num2));
        System.out.println("The subtraction of " + s1 + " and " + s2 + " = " + (num1 - num2));
        System.out.println("The division of " + s1 + " and " + s2 + " = " + (double) (num1 / num2));
        System.out.println("The multiplication of " + s1 + " and " + s2 + " = " + (num1 * num2));
        System.out.println("The remainder of " + s1 + " and " + s2 + " = " + (num1 % num2));


        System.out.println("\n===========TASK2===========\n");


        int randomNum1 = (int) (Math.random() * (35 - 1 * 1) + 1);

        System.out.println("Random number = " + randomNum1);

        if (randomNum1 == 2 || randomNum1 == 3 || randomNum1 == 5 || randomNum1 == 7 || randomNum1 == 11 || randomNum1 == 13
                || randomNum1 == 17 || randomNum1 == 19 || randomNum1 == 23 || randomNum1 == 29 || randomNum1 == 31) {
            System.out.println(randomNum1 + " IS A PRIME NUMBER");
        } else {
            System.out.println(randomNum1 + " IS NOT A PRIME NUMBER");
        }


        System.out.println("\n===========TASK3===========\n");

        int number1 = (int) (Math.random() * (50 - 1 * 1) + 1);
        int number2 = (int) (Math.random() * (50 - 1 * 1) + 1);
        int number3 = (int) (Math.random() * (50 - 1 * 1) + 1);

        System.out.println("Random number 1 = " + number1);
        System.out.println("Random number 2 = " + number2);
        System.out.println("Random number 3 = " + number3);

        int maxNum = Math.max(Math.max(number1, number2), number3);
        int minNum = Math.min(Math.min(number1, number2), number3);

        if (number1 != maxNum && number1 != minNum) {
            System.out.println("Lowest number is = " + minNum);
            System.out.println("Middle number is = " + number1);
            System.out.println("Greatest number is = " + maxNum);
        } else if (number2 != maxNum && number2 != minNum) {
            System.out.println("Lowest number is = " + minNum);
            System.out.println("Middle number is = " + number2);
            System.out.println("Greatest number is = " + maxNum);

        }else if (number3 != maxNum && number3 != minNum){
            System.out.println("Lowest number is = " + minNum);
            System.out.println("Middle number is = " + number3);
            System.out.println("Greatest number is = " + maxNum);
        }
        else {

        }


        System.out.println("\n===========TASK4===========\n");

        char c = '7';

        if((c >= 65 && c <= 90) || (c >= 'a' && c <= 'z' )){
            if(c >= 65 && c <= 90){
                System.out.println("The letter is uppercase");
            }else{
                System.out.println("The letter is lowercase");
            }
        }else {
            System.out.println("Invalid character detected");
        }


        System.out.println("\n===========TASK5===========\n");

        char a1 = 'b';

        if((a1 >= 'A' && a1 <= 'Z') || (a1 >= 'a' && a1 <= 'z')){
            if(a1 == 'a' || a1 == 'e' || a1 == 'i' || a1 == 'o' || a1 == 'u' || a1 == 'A' || a1 == 'E' || a1 == 'I' ||
            a1 == 'O' || a1 == 'U' ){
                System.out.println("The letter is vowel");
            }else{
                System.out.println("The letter is a consonant");
            }

        }else{
            System.out.println("Invalid character detected !!!");
        }


        System.out.println("\n===========TASK6===========\n");

        char character1 = 'g';

        if((character1 >= 'A' && character1 <= 'Z') || (character1 >= 'a' && character1 <= 'z')){
            System.out.println("Character is a letter");

        }else if (character1 >= 47 && character1 <= 57){
            System.out.println("Character is a digit");
        }
        else{
            System.out.println("Character is a special character");
        }

    }
}