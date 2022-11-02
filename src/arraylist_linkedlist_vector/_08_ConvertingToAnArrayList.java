package arraylist_linkedlist_vector;

import java.util.*;

public class _08_ConvertingToAnArrayList {
    public static void main(String[] args) {

        System.out.println("\n------WAY-1 with Array.asList() method-----\n");

        String[] arr1 = {"Tokyo", "Berlin", "Moscow", "Denver"};
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(cities);


        System.out.println("\n-------WAY-2 with loops - MANUEL WAY-------\n");
        char[] arr2 = {'A', '#', '5', '+'};
        LinkedList<Character> characters = new LinkedList<>();

        for (char c : arr2){
            characters.add(c);
        }
        System.out.println(characters);

        System.out.println("\n------WAY-3 with Collections.addAll() method-----\n");
        Integer[] arr3 = {1, 2, 2, 7, 10};
        Vector<Integer> numbers = new Vector<>();
        Collections.addAll(numbers, arr3);

        System.out.println(numbers); // [1, 2, 2, 7, 10]


    }
}
