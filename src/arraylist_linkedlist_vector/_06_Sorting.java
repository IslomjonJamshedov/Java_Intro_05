package arraylist_linkedlist_vector;

import java.util.*;

public class _06_Sorting {
    public static void main(String[] args) {
        /*
        Create below LinkedList to store data

        1 -> 10, -3, 5, 15
        2 -> Remote, Phone, Laptop

        Print the LinkedList
        Sort the LinkedLists and print them again


         */


        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(10, -3, 5, 15));
        List<String> objects = new LinkedList<>(Arrays.asList("Remote", "Phone", "Laptop"));

        System.out.println("\n-----Before Sort-----\n");

        System.out.println(numbers);
        System.out.println(objects);

        System.out.println("\n-----After Sort-----\n");

        Collections.sort(numbers);
        Collections.sort(objects);

        System.out.println(numbers);
        System.out.println(objects);

    }
}
