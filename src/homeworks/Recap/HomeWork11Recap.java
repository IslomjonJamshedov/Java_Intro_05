package homeworks.Recap;

public class HomeWork11Recap {
    public static void main(String[] args) {
        System.out.println("\n--------TASK-08--------\n");
        int[] arr = new int[]{41,53,19,47,67};

        System.out.println(countPrimes(arr));

    }


    //TASK 8
    public static int countPrimes(int[] arr){
        int nonPrimeNumbers = 0;

        for (int num : arr) {
            if (num < 2){
                nonPrimeNumbers++;
                continue;
            }
            for (int i = 2; i < num; i++) {
                if (num % i == 0)nonPrimeNumbers++;
            }
        }
        return arr.length - nonPrimeNumbers;
    }

    //TASK 7


}
