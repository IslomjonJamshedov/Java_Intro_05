package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {

        String s = "Can I can a can";

        String s1 = s.replace('c', 'x');

        System.out.println(s1);

        System.out.println(s.replace("can", "xxx"));



        String str1 = "John";
        str1 = str1.replace("o", "oooo");

        System.out.println(str1);

        String str2 = "apple";

        str2 = str2.replace("abc", "xyz");

        System.out.println(str2);
    }
}
