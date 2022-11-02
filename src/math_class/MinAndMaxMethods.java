package math_class;

public class MinAndMaxMethods {
    public static void main(String[] args) {

        int maxNumber = Math.max(80, 27);

        int maxNumber2 = Math.max(maxNumber, 125);

        int maxNumber3 = Math.max(maxNumber2, 625);

        System.out.println("maxNumber = " + maxNumber);
        System.out.println("maxNumber2 = " + maxNumber2);
        System.out.println("maxNumber3 = " + maxNumber3);

        int minNumber = Math.min(80, 27);
        int minNumber2 = Math.min(minNumber, 2);

        int minOfTwoNeg = Math.min(-40, -60);


        System.out.println("\nminNumber " + minNumber);
        System.out.println("\nminNumber2 " + minNumber2);
        System.out.println("\nminOfTwoNeg " + minOfTwoNeg);

        double maxOfTwoDecimals = Math.max(1.7, 6.5);
        double maxOfTwoDecimalNeg = Math.max(-5.4, -27.2);


        System.out.println("\nmaxOfTheDecimal = " + maxOfTwoDecimals);
        System.out.println("\nmaxOfTheDecimalNeg = " + maxOfTwoDecimalNeg);


        /*
        Find the max value of the given numbers and print them

        * 6, 9
        * 17, 49
        * 34.2, 12.5
        * 17, 49, 125


        */

        int maxNum1 = Math.max(6, 9);
        int maxNum2 = Math.max(17, 49);
        double maxNum3 = Math.max(34.2, 12.5);
        int maxNum4 = Math.max(-14, -32);
        int maxNum5 = Math.max(maxNum4, 125);


        System.out.println(" Max is  = " + Math.max(6,9));
        System.out.println(" Max is  = " + Math.max(17,49));
        System.out.println(" Max is  = " + Math.max(34.2,12.5));
        System.out.println(" Max is  = " + Math.max(-14,-32));
       //System.out.println(" Max is  = " + (Math.max(Math.max(17,49), 125));


        /*
        Find the min value of the given numbers and print them
        * 6, 9
        * 17, 49
        * 34.2, 12.5
        * -14, -32
        * 17, 49, 125
        * 45, 32, 56, 89

         */

        System.out.println("Min is = " + Math.min(6, 9));
        System.out.println("Min is = " + Math.min(17, 49));
        System.out.println("Min is = " + Math.min(34.2, 12.5));
        System.out.println("Min is = " + Math.min(-14, -32));
        System.out.println("Min is = " + Math.min(Math.min(17, 49), 125));
        System.out.println("Min is = " + Math.min(Math.min(Math.min(45, 32), 56), 89));






    }
}
