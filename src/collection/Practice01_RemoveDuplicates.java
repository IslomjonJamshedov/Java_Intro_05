package collection;

import java.util.*;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {

    }



  /*  public static Integer[] removeDuplicates(Integer[] arr){
        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer i : arr) {
            if(!uniques.contains(i)) uniques.add(i);
        }

        return uniques.toArray(new Integer[0]);
    }*/

    public static Integer[] removeDuplicates(Integer[] arr){

        return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
    }


    public static Integer[] removeDuplicate(Integer[] arr){

        return new TreeSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
    }
}
