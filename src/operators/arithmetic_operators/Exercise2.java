package operators.arithmetic_operators;

public class Exercise2 {
    public static void main(String[] args) {



    /*
    An annual average salary for an SDET in the Unites States is 90k.
    Write a Java program that calculates and prints the monthly and bi-weekly and
    weekly average amount that an SDETs makes in the United States.
     */

        double yearlySalary = 90_000;
        int monthly = 7500;
        int Bi = 3462;
        int w = 3461;

        System.out.println("Monthly:" + yearlySalary / 12);
        System.out.println("Bi-weekly: " + yearlySalary / 26);
        System.out.println("Weekly: " + yearlySalary / 52);


    }
}
