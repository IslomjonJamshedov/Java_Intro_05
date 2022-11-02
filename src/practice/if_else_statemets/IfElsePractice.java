package practice.if_else_statemets;

public class IfElsePractice {
    public static void main(String[] args) {

        int myInt = 45;

        if (myInt <= 24 && myInt >= 0) {
            System.out.println("first quarter");

        } else if (myInt >= 25 && myInt <= 49) {
            System.out.println("second quarter");

        } else if (myInt >= 50 && myInt <= 74) {
            System.out.println("third quarter");
        }






        int negNum = 20;

        if(negNum >= -50 && negNum <=-1){
            System.out.println("number is negative part");
        }
        else if(negNum==0){
            System.out.println("number is zero");
        }
        else if(negNum >= 1 && negNum >= 50){

        }
    }
}
