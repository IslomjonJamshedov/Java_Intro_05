package collection;

import java.util.ArrayList;

public class _01_Lists {
    public static void main(String[] args) {

        /*
        -They preserve insertion order
        -They allow duplicates
        -They allow null elements


         */

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("");
        fruits.add("");
        fruits.add(null);
        fruits.add(null);

        System.out.println(fruits); //[Apple, Apple, orange, , , null, null]
    }
}
