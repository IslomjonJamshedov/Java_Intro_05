package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice07_ProductPrices {
    public static void main(String[] args) {


        HashMap<String, Double> products = new HashMap<>();
        products.put("iPhone", 1000.00);
        products.put("Macbook Pro", 1300.00);
        products.put("iMac", 1500.00);
        products.put("Airpods", 200.00);
        products.put("iPad", 700.00);

        double maxPrice = new TreeSet<>(products.values()).last();

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            if(entry.getValue() == maxPrice)
                System.out.println(entry.getKey() + " is the most expensive with the price of $" + entry.getValue());
            break;
        }

    }
}