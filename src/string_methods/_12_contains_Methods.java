package string_methods;

public class _12_contains_Methods {
    public static void main(String[] args) {
        /*
        -return
        -returns boolean
        -non-static
        -takes one argument

         */

        String s = "TechGlobal School";

        System.out.println(s.contains("Tech")); //true
        System.out.println(s.contains("School")); //true
        System.out.println(s.contains("a")); //true
        System.out.println(s.contains("E")); //false

        //IMPORTANT

        System.out.println(s.contains(""));
    }
}
