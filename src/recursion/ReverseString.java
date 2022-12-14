package recursion;

public class ReverseString {

    /*

     */
    public static void main(String[] args) {
        String n = "Islom";
        System.out.println(reverseStringRecursively(n));
    }

    public static String reverseStringRecursively(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }
        return reverseStringRecursively(str.substring(1)) + str.charAt(0);
    }
}
