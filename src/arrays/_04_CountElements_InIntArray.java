package arrays;

public class _04_CountElements_InIntArray {
    public static void main(String[] args) {

        int [] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};

        /*
        Negatives:
        Positives:
        neutral or zero: 3

        even: 6
        odd: 4


        max: 10
        min: -7

        sum of the numbers: 28
        average of the numbers: 2
        how many unique numbers you have: 7
        how many of these numbers are represented in fibonacci numbers: 6
        prime numbers: 2
        how many numbers can be divided by 5: 6
        absolute difference between the max and min of these numbers: 17
        closet number to 9: 8
         */

        int negatives = 0;
        int positives = 0;

        for(int number : numbers){
            if(number < 0) negatives++;
        }
        System.out.println("Negative count is = "  + negatives);



        for(int number : numbers){
            if(number > 0) positives++;

        }
        System.out.println("Positive count is = "  + positives);


        System.out.println("\n------Even Numbers-------\n");

        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
            counter += 1;
            }
        }
        System.out.println(counter);

    }
}
