package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == 2) num.set(i, 7);
        }


    }
}
