package casting;

public class Exercise5 {
    public static void main(String [] args){
       String s1 = "35", s2 = "10";

       int i1 = Integer.parseInt(s1);
       int i2 = Integer.parseInt(s2);

       /*

       Find below
       Sum of s1 and s2
       Difference of s1 and s2
       Absolute Difference of s1 and s2
       Product of s1 and s2
       Division of s1 and s2
       Remainder of s1 and s2
       Min Number of s1 and s2
       Max Number of s1 and s2
        */

        System.out.println("Sum of s1 and s2 = " + (i1 + i2));
        System.out.println("Difference of s1 and s2 = " + (i1 - i2));
        System.out.println("Absolute Difference of s1 and s2 = " + Math.abs(i1 - i2));
        System.out.println("Product  of s1 and s2 = " + (i1 * i2));
        System.out.println("Division  of s1 and s2 = " + (i1 / i2));
        System.out.println("Remainder  of s1 and s2 = " + (i1 % i2));
        System.out.println("Min number of s1 and s2 = " + Math.min(i1, i2));
        System.out.println("Mix number of s1 and s2 = " + Math.max(i1, i2));
    }
}
