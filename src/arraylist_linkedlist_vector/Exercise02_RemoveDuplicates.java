package arraylist_linkedlist_vector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        /*
        Assume you have an ArrayList of languages as below
        Java
        JavaScript
        Ruby
        Go
        Java
        Ruby
        Java


         */

        System.out.println("\n--------Longer way of Removing Duplicates-------\n");


        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Ruby", "Go", "Java", "Ruby","Java"));

        ArrayList<String> uniques = new ArrayList<>();

        for (String language : languages){
            if (!uniques.contains(language)) uniques.add(language);
        }
        System.out.println(uniques);




        System.out.println("\n--------Shorter way of Removing Duplicates-------\n");

        System.out.println(new HashSet<>(languages));
    }
}
