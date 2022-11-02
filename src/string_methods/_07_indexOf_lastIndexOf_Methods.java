package string_methods;

public class _07_indexOf_lastIndexOf_Methods {
    public static void main(String[] args) {
        /*
        -return
        -return int which matching index
        -non-static
        -It takes a char or String
         */



        String company = "TechGlobal School";

        int firstIndexOf0 = company.indexOf('o'); //6
        int lastIndexOfO = company.lastIndexOf('o'); //15



        System.out.println(firstIndexOf0);
        System.out.println(lastIndexOfO);


        System.out.println(company.indexOf('l'));
        System.out.println(company.lastIndexOf('l'));

        System.out.println(company.indexOf('X')); //-1

        System.out.println(company.indexOf("School")); //1
    }
}
