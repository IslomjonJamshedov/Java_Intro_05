package casting;

public class ImplicitCasting {
    public static void main(String[]args){


        // implicit casting also known as widening - upcasting
        byte b = 25; // -128, 127
        int i = b;

        System.out.println(i); //25


        float f = 10.5f;
        double d = f;

        System.out.println(d);



    }
}
