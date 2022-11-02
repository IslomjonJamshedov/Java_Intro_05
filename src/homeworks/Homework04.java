package homeworks;

import utilities.ScannerHelper;


public class Homework04 {
    public static void main(String[] args) {



        System.out.println("\n============TASK1============\n");


        String name = ScannerHelper.getAName();

        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " +  (name.charAt(0)));
        System.out.println("The last character in the name is = " + (name.charAt(name.length()-1)));
        System.out.println("The last 3 characters in the name are = " + name.substring(0,3));
        System.out.println("The last 3 characters in the name are = " + (name.substring(name.length()-3)));

        if(name.startsWith("A") || (name.startsWith("a"))){
            System.out.println("You are in the club!");
        }
        else{
            System.out.println("Sorry, you are not in the club");
        }


        System.out.println("\n============TASK2============\n");


        String address = ScannerHelper.getAnAddress(), lowerCaseAddress = address.toLowerCase();

        if(lowerCaseAddress.contains("chicago")){
            System.out.println("You are in the club");
        }
            else if(lowerCaseAddress.contains("des plaines")){
            System.out.println("You are welcome to join the club");
        }
            else{
            System.out.println("Sorry, you will never be in the club");
        }


        System.out.println("\n============TASK3============\n");

        String favColor = ScannerHelper.getAColor(), lowerCasefavColor = favColor.toLowerCase();

        if(lowerCasefavColor.contains("green") && lowerCasefavColor.contains("red")){
            System.out.println("Green and red are in the list");
        }
        if(lowerCasefavColor.contains("green")){
            System.out.println("Green is in the list");
        }
        else if(lowerCasefavColor.contains("red")){
            System.out.println("Red is in the list");
        }
        else{
            System.out.println("Green and red are not in the list");
        }


        System.out.println("\n============TASK4============\n");

        String str = "  Java is FUN  ";

        String str1 = str.trim();
        String str2 = str1.toLowerCase();


        System.out.println("The first word in the str is = " + str2.substring(0,4));
        System.out.println("The second word in the str is = " + str2.substring(5,7));
        System.out.println("The third word in the str is = " + str2.substring(8,11));

    }
}
