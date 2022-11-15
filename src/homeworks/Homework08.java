package homeworks;

public class Homework08 {
    public static void main(String[] args) {


        System.out.println(countConsonants("Adventure"));
    }

    //TASK 1
    public static int countConsonants(String str) {
        str = str.replaceAll("[^A-Za-z]", "");
        str = str.replaceAll("[AEIOUaeiou]", "");

        return str.length();
    }
}
