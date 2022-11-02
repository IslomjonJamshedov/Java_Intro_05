package arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {


        String name = "James";

        String[] names = {"Beyza", "Andrii", "Vlad", "Samir", "Olena"};


        //Retrieving a element from an array - using index

        System.out.println(names[2]);
        System.out.println(names[4]);

        //ArraysIndexOfBoundException
        System.out.println(names[5]);
        System.out.println(names[-3]);

        int age = 25;

        int[] ages = {21, 23, 25};
        System.out.println(ages[2]); //25
    }
}
