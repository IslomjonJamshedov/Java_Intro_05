package conditional_statements.tarnary_operators;

public class UnderstandingTernary {
    public static void main(String[] args) {

        /*
        F -> for female   -> Jane
        M -> for male     -> John
         */



        char gender = ' ';

        String name = gender == 'F' || gender == 'f'? "Jane" : "John";
        System.out.println(name);
    }
}
