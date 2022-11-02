package loops;


import java.util.Scanner;

public class Exercise01_SumOfNumbersByUser {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("\n------fori solution------\n");
        System.out.println("Please enter how many numbers you want to enter");
        int count = scanner.nextInt();
        int sum1 = 0;

        for (int i = 1; i <+ 3; i++) {
            System.out.println("Please enter number" + i);
            sum1 += scanner.nextInt();
        }
        System.out.println(sum1);

        System.out.println("\n---------While Solution---------\n");

        System.out.println("Please enter how many numbers you want to enter");
        int count1 = scanner.nextInt();

        int sum2 = 0;

        int start = 1;
        while(start <= count1){
            System.out.println("Please enter number" + start);
            sum2 += scanner.nextInt();
            start++;
        }
        System.out.println(sum2);
    }
}
