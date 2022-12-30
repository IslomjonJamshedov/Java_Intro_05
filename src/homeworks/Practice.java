package homeworks;

import java.util.*;

public class Practice {
    public static void main(String[] args) {

        /*


        System.out.println(secondMin(new int[]{-5, 4, 1, 0, 10, 2})); // 0

        System.out.println(secondMax(new int[]{-5, 4, 1, 0, 10, 2})); // 4

        String str = "Tech global 4 and 43";
        System.out.println(addNumbers(str));

        System.out.println(Arrays.toString(removeDups(new Integer[]{-5, 4, 4, 0, 10, 2})));

    }

    public static int secondMin(int[] numbers) {
        TreeSet<Integer> nums = new TreeSet<>();

        for (Integer i : numbers) {
            nums.add(i);
        }

        return nums.higher(nums.first());

    }

    public static int max(int[] numbers) {
        TreeSet<Integer> nums = new TreeSet<>();

        for (Integer i : numbers) {
            nums.add(i);
        }

        return nums.last();

    }


    public SortedSet<Integer> getNumbersBetween10And15(TreeSet<Integer> set) {
        return set.subSet(10, true, 15, false);
    }

    public static int addNumbers(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
        }
        return num;
    }

    public static Integer[] removeDups(Integer[] nums){
        HashSet<Integer> numbers = new HashSet<>(Arrays.asList(nums));

        Integer[] newArray =  numbers.toArray(new Integer[0]);
        return newArray;
    }

    public static int closest(TreeSet<Integer> nums, int n){
        int lower = nums.lower(n);
        int higher = nums.higher(n);

        return (n - lower <= higher - n) ? lower : higher;
    }

    public static TreeSet<Integer> more(Integer[] n, int num){
        TreeSet<Integer> nums = new TreeSet<>(Arrays.asList(n));

        //return nums.tailSet(n,true).toArray(new Integer[0]);
        return new TreeSet<>();

         */
    }
}
