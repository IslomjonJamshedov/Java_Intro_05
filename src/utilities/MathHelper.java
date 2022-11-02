package utilities;

public class MathHelper {
    /*
    Math.max(Math.max(num1, num2), num3)
     */

    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }


    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    /*
    Please crete a method that takes an int as an argument and returns true if it is even returns false if it is odd

    return type
    returns boolean
    static
    public
    takes and int as arg
    method name = isEven
     */
    public static boolean isEven(int num) {
        return num % 2 == 1;

    }


    public static boolean isOdd(int num) {
        return num % 2 != 0;
    }

    /*
    Create a method that takes 2 int arguments and returns their sum
    Method name = sum

    public static
    return type
    return int
    it takes 2 ints
     */

    public static int sum(int num1, int num2){
        return num1 + num2;
    }

    //OVERLOADING A METHOD


    public static int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public static double sum(double num1, double num2){
        return (num1 + num2);
    }
}
