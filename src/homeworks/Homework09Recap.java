package homeworks;

import java.util.ArrayList;

public class Homework09Recap {
    public static void main(String[] args) {

        System.out.println("\n------------TASK06------------\n");
        String str = "Java is fun";
        String strReversed = "";

        String[] strArr = str.split("[ ]+"  );
        for (String s : strArr) {
            StringBuilder sb = new StringBuilder(s);

            strReversed += sb.reverse() + " ";
        }
        System.out.println(strReversed.substring(0,strReversed.length()-1));

        System.out.println("\n------------TASK05------------\n");

        String[] arr = {"a", "b", "c"};

        ArrayList<String> list = new ArrayList<>();

        for (int i = arr.length -1; i >= 0; i--) {
            list.add(arr[i]);
        }
        System.out.println(list);


        System.out.println("\n------------TASK04------------\n");

        String[] stringArr = {"a", "xyz", "b", "B", "b", "a"};
        ArrayList<String> container = new ArrayList<>();

        for (String s : stringArr){
            if (!container.contains(s.toLowerCase()) || !container.contains(s.toUpperCase()));
            container.add(s);
        }


    }
}
