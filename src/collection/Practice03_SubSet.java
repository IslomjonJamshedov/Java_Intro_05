package collection;

import java.util.Arrays;
import java.util.TreeSet;

public class Practice03_SubSet {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(3,2,7,10,15,20,7,5));
        System.out.println(numbers.tailSet(7,true));
        System.out.println(numbers.headSet(5, true));
        System.out.println(numbers.tailSet(5,true).tailSet(15,true));
    }
}
