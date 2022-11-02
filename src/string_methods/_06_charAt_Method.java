package string_methods;

public class _06_charAt_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. returns a char ar given index
         */

        String sentence = "Java is fun";

        char c1 = sentence.charAt(3); // 'a'

       char c2 =  sentence.charAt(4); // ' ' space

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(sentence.charAt(9)); // u

        //NOTE: Runtime error
        //System.out.println(sentence.charAt(-5));
        //System.out.println(sentence.charAt(50));

        System.out.println(sentence.charAt(1));

        System.out.println("End of the program");


    }
}
