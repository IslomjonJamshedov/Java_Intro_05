package recursion;

public class Practice01_SumOfNumbers {

    public static int productRecursively(int n) {
        if (n == 1) {
            return 1;
        }
        return n * productRecursively(n - 1);
    }

}
