package practice.arrayListPractices;

public class FooBarPractice {
    public static void main(String[] args) {
        //printLucky();
        printLucky2();
    }


    /*

    Create a public static method which will take an ArrayList and it will print "Lucky" if it is dividable by "3"

    Expected:

     */

    public static void printLucky() {

        for (int i = 1; i < 10; i++) {
            if (i % 3 == 0) System.out.println("Lucky");
            else System.out.println((i));
        }
    }

    public static void printLucky2(){

        for (int i = 0; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
    }
}
