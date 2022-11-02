package conditional_statements.if_else_statements;

import java.util.Scanner;

public class Exercise1_MathGrade {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Hey David! Please enter your math grade?");
        int examResult = input.nextInt();

        if(examResult >= 60){
            System.out.println("Awesome! You have passed the math class!");
        }
        else{
            System.out.println("Sorry you failed!");
        }

        System.out.println("End of program!");




    }
}
