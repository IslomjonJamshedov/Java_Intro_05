package collection;

import java.util.*;

public class Practice06_CalculateCharacters {
    public static void main(String[] args) {


        System.out.println("\n----------TASK 1----------\n");
        String str = "banana";

        HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : str.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }

        System.out.println(map);

    }


    public static Set<Character> getMostCounted(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        Set<Character> result = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            int maxCount = new TreeSet<>(map.values()).last();

            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxCount) result.add(entry.getKey());
            }
        }
        return result;
    }
}
