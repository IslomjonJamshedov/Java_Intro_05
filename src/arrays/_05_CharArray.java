package arrays;

import java.util.Arrays;

public class _05_CharArray {
    public static void main(String[] args) {

        System.out.println("\n------TASK-1------\n");

        char [] characters = {'#', '$', '5', 'A', 'b', 'H'};

        System.out.println(Arrays.toString(characters));

        System.out.println("\n------TASK-2------\n");

        System.out.println("The size of the array is = " + characters.length);

        System.out.println("\n------TASK-3------\n");

        for (int i = 0; i < characters.length; i++) {
            System.out.println(characters[i]);
        }

        System.out.println("\n------TASK-4------\n");

        for(char c : characters){
            System.out.println(c);
        }

        System.out.println("\n------TASK-5 - fori loop------\n");

        for (int i = 0; i < characters.length; i++) {
            if(Character.isLetter(characters[i])){
                System.out.println(characters[i]);
            }
        }
        System.out.println("\n----------TASK-5 - for each loop-----------\n");

        for(char element : characters){
            if(Character.isLetter(element)) System.out.println(element);
        }

        System.out.println("\n----------TASK-5-----------\n");

        for(char element : characters){
            if(Character.isUpperCase(element)) System.out.println(element);
        }

        for (int i = 0; i < characters.length; i++) {
            if(Character.isUpperCase(characters[i])){
                System.out.println(characters[i]);
            }
        }

    }
}
