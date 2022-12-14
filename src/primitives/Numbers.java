package primitives;

public class Numbers {
    public static void main(String[] args) {
        /*
        There are 6 primitives used to store numbers as data
        byte, short, int, long -> used to store absolute numbers like 3
        float, double -> used for floating numbers like 10.5


        byte -> 1 byte
        short -> 2 bytes
        int -> 4 bytes
        long -> 8 bytes

        NOTES: MOST OF THE CASE WE USE int AND IT IS ENOUGH
        USE _ TO DIVIDE BIG NUMBERS

        John
        his age -> 45
        his favorite number = 70
        his balance -> 400.45
         */

        // dataType variableName = value;

        System.out.println("\n--------Floating Numbers - float - double-------\n");

        byte age = 45;
        long favNumber = 2147483648L;

        long myNumber =1;

        System.out.println(age); //45
        System.out.println(favNumber); //70

        /*
        Floating numbers
        float -> 4 bytes
        double -> 8 bytes


        Note : MOst of the case we use double


         */

        float balance1 = 23.28762385762384F;
        double balance2 = 23.28762385762384;

        double price = 23.5;

        System.out.println(balance1); //23.28762385762384
        System.out.println(balance2); //23.28762385762384
        System.out.println(price); //23.5

        double transaction = 20;

        System.out.println(transaction); // 20.0


    }
}
