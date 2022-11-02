package string_methods;

import java.sql.SQLOutput;

public class Exercise04_Substring {
    public static void main(String[] args) {
        /*

         */

        String s1 = "The best is Java";

        String s2 = s1.substring(12);

        System.out.println(s2);

        //Alternatives
        System.out.println(s1.substring(s1.indexOf("Java")));

        System.out.println(s1.substring(s1.length()-4));


        /*
        TASK-2
         */


        String str1 = "Java is an object-oriented programming language";

        String java = "Java";
        String oo = "object-oriented";

        System.out.println(str1.substring(str1.indexOf(java), java.length())); // Java
        System.out.println(str1.substring(str1.indexOf(oo), str1.indexOf(oo)+oo.length()));
    }
}
