package arraylist_linkedlist_vector;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {


        System.out.println("\n---------TASK-1---------\n");

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");


        System.out.println(cities.size());
        System.out.println(cities);


        System.out.println("\n---------TASK-2--------\n");
        //Remove Miami and Reassign it with Evanston
        cities.set(2, "Evanston");
        System.out.println(cities);



        System.out.println("\n---------TASK-3--------\n");
        //Remove Berlin
        //Print the Array
        cities.remove(1); //First Way Of Removing a Index
        cities.remove("Berlin"); //Second Way Of Removing a Index
        System.out.println(cities);
        System.out.println(cities.size()); // Checking the size of the ArrayList

        System.out.println(cities.remove(0)); //Chicago

        System.out.println(cities.remove("evanston")); //false

        System.out.println(cities); //[Evanston]
        System.out.println(cities.size()); // 1


        System.out.println("\n---------TASK-4--------\n");


        cities.add("New york");
        cities.add("Rome");
        cities.add("Ghent");
        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n---------TASK-5--------\n");

        //Removing all elements

        //cities.clear();
        cities.removeAll(cities);

        System.out.println(cities.size());
        System.out.println(cities);
    }
}
