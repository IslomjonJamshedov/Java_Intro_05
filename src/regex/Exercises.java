package regex;

import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {

        System.out.println("\n------------TASK-1------------\n");

        //Getting SSN #
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "000-00-0000"));


        System.out.println("\n------------TASK-2------------\n");


        //Getting Phone #
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}","(000)-000-0000"));


        System.out.println("\n------------TASK-3------------\n");


    }
}
