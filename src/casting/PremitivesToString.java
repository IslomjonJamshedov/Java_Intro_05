package casting;

public class PremitivesToString {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        System.out.println(num1 + num2);
        System.out.println(" " + num1 + num2);
        System.out.println("" + (num1 + num2));

        System.out.println(String.valueOf(num1) + String.valueOf(num2));

        // "5" + "10" -> 510


    }
}
