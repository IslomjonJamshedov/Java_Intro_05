package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_UnderstandingArrayList {
    public static void main(String[] args) {

        //1. Declaring an array vs an ArrayList
        String[] names1 = new String[3];

        ArrayList<String> names2 = new ArrayList<>(); //capacity = 10 by default

        //2. Getting the size of the array vs ArrayList
        System.out.println("\n -----------Size of array vs ArrayList----------\n");
        System.out.println("The size of the array = " + names1.length);
        System.out.println("The size of the ArrayList = " + names2.size());

        //3. Printing an array vs ArrayList
        System.out.println("\n -----------Printing  array vs ArrayList----------\n");
        System.out.println("The array is =" + Arrays.toString(names1)); // null null null
        System.out.println("The ArrayList = " + names2); // []

        //4. Adding elements to specific indexes
        //Array Method
        names1[0] = "Alex";
        names1[1] = "Ali";
        names1[2] = "Andrii";
        //Array List Method
        names2.add("John"); //names2.add("John");
        names2.add("Joe");
        names2.add("Jane");
        names2.add("Abdullah");
        names2.add("Vlad");
        names2.add("Saeed");
        names2.add("Suzanne");
        names2.add("Hazal");
        names2.add("Yildiz");
        names2.add("Samir");

        System.out.println("\n -----------Printing  array vs ArrayList----------\n");
        System.out.println("The array is =" + Arrays.toString(names1)); // Alex null null
        System.out.println("The ArrayList = " + names2); // [John]

        //5. Updating an existing element in an array vs ArrayList
        names1[1] = "Mike";
        names2.set(1, "Olena");

        System.out.println("The array is =" + Arrays.toString(names1));
        System.out.println("The ArrayList = " + names2);




    }
}
