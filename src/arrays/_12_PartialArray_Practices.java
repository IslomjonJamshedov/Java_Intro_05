package arrays;

public class _12_PartialArray_Practices {
    public static void main(String[] args) {
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        int[] number2 = {10, -3, -7, 7, 22};

        System.out.println(findSumOfThree(numbers));
        System.out.println(findSumOfLast5(number2));
    }

    public static int findSumOfThree(int[] numbers) {
        /*
        1. Create an int container
        2. Create a loop (Start = 0, end 3)
         */

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += numbers[i];

        }
        return sum;
    }

    public static int findSumOfLast5(int[] num) {
        /*
        1. Create a container
        2. Loop (start = L -1, i > L - 6 i--)
        3. Return container
         */

        int sum = 0;

        for (int i = num.length - 1; i > num.length - 6; i--) {
            // l - 1,
            sum += num[i];

        }
        return sum;
    }

}