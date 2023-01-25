package homeworks;

import java.lang.reflect.Array;
import java.util.*;

public class Homework15 {
    public static void main(String[] args) {
        //TASK 1
        System.out.println(Arrays.toString(fibonacciSeries1(7)));

        //TASK 2
        System.out.println(fibonacciSeries2(9));

        //TASK 3
        System.out.println(Arrays.toString(findUniques(new int[] {1, 2, 3, 4}, new int[]{3, 4, 5, 5})));

        //TASK 4
        System.out.println(isPowerOf3(6));

        //TASK 5



    }

    public static int[] fibonacciSeries1(int n) {
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                num[i] = 0;
            } else if (i == 1) {
                num[i] = 1;
            } else num[i] = (num[i - 1] + num[i - 2]);
        }
        return num;
    }

    public static int fibonacciSeries2(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int prev = 0, next = 1, res = 0;
        for (int i = 2; i <= n; i++) {
            res = prev + next; // 3 = 2 + 3     res = 5
            prev = next; // prev = 2
            next = res; // next = 3
        }
        return res;
    }

    public static int[] findUniques(int[] a, int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int element : a) {
            listA.add(element);
        }
        for (int element : b) {
            listB.add(element);
        }
        for (int i = 0; i < listA.size(); i++) {
            if (!list.contains(listA.get(i)) && !listB.contains(listA.get(i))) list.add(listA.get(i));
        }
        for (int i = 0; i < listB.size(); i++) {
            if (!list.contains(listB.get(i)) && !listA.contains(listB.get(i))) list.add(listB.get(i));
        }
        int[] uniques = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniques[i] = list.get(i);
        }
        return uniques;
    }




    public static boolean isPowerOf3(int num){
        boolean flag = false;
        for (int i = 0; i <= num; i++) {
            if (Math.pow(3, i) == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static int firstDuplicate(int[] numbers){
        if (numbers.length <= 1) return -1;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]) map.put(j, numbers[j]);
            }
        }
        return map.firstKey();
    }
    }


