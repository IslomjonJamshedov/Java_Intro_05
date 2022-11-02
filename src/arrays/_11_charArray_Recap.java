package arrays;

import java.util.Arrays;

public class _11_charArray_Recap {
    public static void main(String[] args) {


        char[] intials = new char[5];
        intials[0] = 'S';
        intials[1] = 'a';
        intials[2] = 'l';
        intials[3] = 'i';
        intials[4] = 'h';

        char[] intials2 = {'S', 'a', 'l', 'i', 'h'};

        intials[0] = 's';
        intials[0] = intials[4];
        intials[2] = intials[4];

        System.out.println(Arrays.toString(intials));

        //Islomjon

        char[] name = {'I', 's', 'l', 'o', 'm', 'j', 'o', 'n'};

        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i]);
        }
    }
}
