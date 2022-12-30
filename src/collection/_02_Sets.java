package collection;

import java.util.*;

public class _02_Sets {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();


        System.out.println("\n---------Hash-Set----------\n");

        hashSet.add(5);
        hashSet.add(5);
        hashSet.add(10);
        hashSet.add(0);
        hashSet.add(null);
        hashSet.add(null);

        System.out.println(hashSet);


        System.out.println("\n---------Linked-Hash-Set----------\n");

        linkedHashSet.add(5);
        linkedHashSet.add(5);
        linkedHashSet.add(10);
        linkedHashSet.add(0);
        linkedHashSet.add(null);
        linkedHashSet.add(null);



        System.out.println(linkedHashSet);

        System.out.println("\n----------Tree-Set----------\n");

        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(null);
        treeSet.add(null);

        System.out.println(treeSet);
    }
}
