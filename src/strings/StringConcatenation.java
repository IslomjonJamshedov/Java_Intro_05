package strings;

public class StringConcatenation {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s2 = "World";

        String s3 = s1 + "" +  s2; //"Hello" + "World"

        System.out.println(s3); // Hello World

        /*
        Task
        Create 2 strings to store your firstName and lastName
        Then concatenate them with a third String called as fullName
        Then print the full name
         */


        String firstName = "Islomjon";
        String lastName = "Jamshedov";

        String fullName = firstName + " " + lastName; // Islomjon Jamshedov

        System.out.println(fullName);

        System.out.println("\n--------------------Concatenation with concat() method ----------\n");

        String fullName2 = firstName.concat(lastName);

        System.out.println(fullName2);


    }
}
