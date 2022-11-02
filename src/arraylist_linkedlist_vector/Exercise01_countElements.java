package arraylist_linkedlist_vector;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

    public class Exercise01_countElements {
        public static void main(String[] args) {
        /*
        Create an ArrayList and store below colors
        Blue
        Brown
        Pink
        Yellow
        Red
        Purple
         */
            System.out.println("\n-----------TASK-1----------\n");

            ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink",
                    "Yellow", "Red", "Purple"));

            System.out.println(colors);
            colors.size();

            for (int i = 0; i <= 6; i++) {
                System.out.println(i);


            }


            System.out.println("\n---------TASK-2- Elements that has length of 6----------\n");
            int count6 = 0;

            for (String color : colors) {
                if (color.length() == 6) count6++;
            }
            System.out.println(count6);


            for (int i = 0; i < colors.size(); i++) {
                if (colors.get(i).length() == 6) ;
                count6++;
            }
            System.out.println(count6);

            count6 =0;

            System.out.println("\n------TASK-3 - Elements that has 'o'-------\n");

            int countO = 0;

            for (String color : colors) {
                if(color.toLowerCase().contains("o")) countO++;
            }

            System.out.println(countO);

            countO = 0;

            for (int i = 0; i < colors.size(); i++) {
                if(colors.get(i).toLowerCase().contains("o")) countO++;
            }

            System.out.println(countO);
        }
    }
