package arrays;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] students = {
                {"Ali", "Mehmet", "Alex"},
                {"Alex", "Regina"},
                {"Abdullah", "Newer"}
        };

        System.out.println(students[0][1]); //Mehmet
        System.out.println(students[1][1]); //Regina


        System.out.println(students.length); // 3

        System.out.println(Arrays.toString(students[2]));
        System.out.println("\n-----Printing fori--loops------");
        for( int i = 0; i < students.length; i++){
            System.out.println(Arrays.toString(students[i]));
        }

        // Printing inner arrays with for each loop
        for(String[] group : students){
            System.out.println(Arrays.toString(group));
        }
        //Printing the multi-dimensional array
        System.out.println(Arrays.deepToString((students))); // using Array.deepToString

        for(String[] group : students){
            for(String student : group){
                System.out.println(student);
            }
        }




    }
}
