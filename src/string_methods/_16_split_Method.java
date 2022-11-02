package string_methods;

import java.util.Arrays;

public class _16_split_Method {
    public static void main(String[] args) {
        String s = "Today is a Sunday and the weather is nice";

       String[] ar1 =  s.split(" ");

        System.out.println(Arrays.toString(ar1));

        System.out.println(Arrays.toString(s.split("is")));
    }
}
