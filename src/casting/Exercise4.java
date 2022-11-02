package casting;

public class Exercise4 {
    public static void main(String[] args) {
        // true false    ->  "true" "false"  "hello"

        System.out.println(true & false);  //false
        // System.out.println("true" && "false"); compiler error

        System.out.println(String.valueOf(true) + String.valueOf(false));
        System.out.println("" + true + false);

        System.out.println(String.valueOf('A') + 'a');


    }

}
