package exeption_handling.try_catch;

import utilities.ScannerHelper;

public class TryCatch_Practice02 {
    public static void main(String[] args) {

        int num1 = ScannerHelper.getAnNumber();
        int num2 = ScannerHelper.getAnNumber();

        try{
            System.out.println(num1 / num2);
        }
        catch (ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println("End of program");
    }
}
