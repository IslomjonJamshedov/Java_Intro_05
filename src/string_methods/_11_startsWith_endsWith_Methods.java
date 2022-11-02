package string_methods;

public class _11_startsWith_endsWith_Methods {
    public static void main(String[] args) {
        /*
        -return
        -returns a boolean
        -non-static
        -There is overloaded methods but we will use always the one with one arguments
         */
        String s = "TechGlobal";

        System.out.println(s.startsWith("T"));
        System.out.println(s.startsWith("t"));
        System.out.println(s.startsWith("Tech"));

        System.out.println(s.endsWith("Global"));


        //IMPORTANT
        String city = "Chicago";

        System.out.println(city.startsWith(city));
        System.out.println(city.endsWith(city));
        System.out.println(city.startsWith(""));


    }
}
