package practice.methods;

public class StringMethodPractices {
    public static void main(String[] args) {
        System.out.println(StringMethodPractices.isCharExisting("John", 'o' , 1));
        System.out.println(StringMethodPractices.isCharExisting("John", 'o' , 2));
        System.out.println(StringMethodPractices.isCharExisting("Peter", 'e' , 1));
        System.out.println(StringMethodPractices.isCharExisting("Peter", 'e' , 4));
    }
    /*
    Create a public static method names as "isCharExisting" which will take a String, a char, and an index

    it will return true if that char is existing in that string at the given index

    Example:
    "John", "o", 1 --> true
    "John" "o", 2 --> false
    "Peter", "o", 1 --> false
    "peter", "r", 4 --true
     */
    public static boolean isCharExisting(String str, char c, int index){
        return str.charAt(index) == c;
    }

    public static boolean isCharContained(String str, char c){
    return str.contains(c + "");
    //return str.contains(String.valueOf(c));
    }

}
