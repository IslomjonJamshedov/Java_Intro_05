package arrays;

public class Exercise01_countChar {
    public static void main(String[] args) {

        /*
        Assume you are given as below
        String word = "Java";

        Count how many letters you have in the String

        Expected:
        2
         */

        String word = "Java";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == 'a'){
                count += 1;
            }
        }
        System.out.println(count);

    }
}
