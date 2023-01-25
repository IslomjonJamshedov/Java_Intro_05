package homeworks;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicLong;

public class Homework16 {

    public static void main(String[] args) {
        System.out.println(parseData("{104}LA{101}Paris{102}Berlin{103}Chicago{100}London"));
        HashMap<String,Integer> str = new HashMap<>();

        str.put("Apple", 4);

        System.out.println(calculateTotalPrice1(str));

        HashMap<String,Integer> map = new HashMap<>();

        map.put("Apple", 4);
        map.put("Mango", 8);
        map.put("Orange", 3);

        System.out.println(calculateTotalPrice2(map));

    }

    public static TreeMap parseData(String s) {
        TreeMap<String, String> map = new TreeMap<>();
        String[] arr1 = s.split("\\{|}");
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].isEmpty()) {
                map.put(arr1[i], arr1[i + 1]);
                i++;
            }
        }
        return map;
    }

    public static double calculateTotalPrice1(Map<String, Integer> str) {
        double Apple = 2.00;
        double Orange = 3.29;
        double Mango = 4.99;
        double Pineapple = 5.25;
        double total = 0;

        if (str.containsKey("Apple")){
              total += str.get("Apple") * Apple;


            if (str.containsKey("Orange")) {
                total += str.get("Orange") * Orange;
            }


            if (str.containsKey("Mango")){
                total += str.get("Mango") * Mango;
            }

            if (str.containsKey("Pineapple")){
                total += str.get("Pineapple") * Pineapple;
            }


        }return total;
    }

    public static double calculateTotalPrice2(Map<String, Integer> map){
        double Apple = 2.00;
        double Orange = 3.29;
        double Mango = 4.99;
        double total = 0;

        if (map.get("Apple") % 2 == 0){
            total += map.get("Apple") * (Apple * .75);
        }else{
            total += map.get("Apple") * (Apple * .75) + Apple;
        }
        if (map.containsKey("Orange")) {
            total += map.get("Orange") * Orange;
        }

        for (int i = 1; i <= map.get("Mango"); i++) {
            if (i % 4 != 0) {
                total += Mango;
            }
            }return total;
        }

    }

