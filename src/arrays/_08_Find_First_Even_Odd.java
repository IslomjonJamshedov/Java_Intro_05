package arrays;

public class _08_Find_First_Even_Odd {
    public static void main(String[] args) {

    }

    /*
    Create a public static method which will take an int array then it will
    print out the first even and first odd number.

    Example:
    - array =  {0, 5, 3, 2, 4, 7, 10};

    Output:
        First even = 0
        First odd = 5

    Example:
    - array =  {0, 2, 2, 5, 3, 2, 4, 7, 10};

    Output:
        First even = 0
        First odd = 5
     */

    public static void printFirstEvenOdd(int[] numbers){
        int fEven = 0, foOdd = 0;
        boolean isEvenFound = false, isOddFound = false;

        for (int n : numbers){
            if (n % 2 == 0){
                fEven = n;
            } else if (!isOddFound && n % 2 == 1) {
                foOdd = n;
                isOddFound = true;
            }
            System.out.println(n);
        }

    }

}
