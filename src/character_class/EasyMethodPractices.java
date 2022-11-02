package character_class;

public class EasyMethodPractices {
    public static void main(String[] args) {
        String s1 = "606 Barberry Trail Fox River Grove IL 60021";
        String s2 = "2860 south river road des plaines il";
        System.out.println("String: " + s1 + " has " + countLetters(s1) + " character");
        System.out.println("String: " + s2 + " has " + countLetters(s2) + " character");
    }


    /*
    Create a public static method which will take a String and returns the numbers of LETTERS.
     */
    //2860 south river road des plaines il -> 26
    //12345 @!#$@ "TechGlobal" -> 10

    public static int countLetters(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) { // i = 0, 1, 2, 3, ...... L - 1
            if (Character.isLetter(s.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }


    /*
    Create a public static method which will take a String and counts the upper case letters and returns it.
     */

    //12345 @!#$@ "TechGlobal"

    public static int countUpperCase(String s) {
        int counter2 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                counter2++;
            }
        }
        return counter2;
    }
}

    /*
        Create public static method named as printStringAttributes() takes a String as parameter
        and prints the message dynamically for the string

        Print output -> "Given "(string)" has:
                x amount of upper cases
                x amount of lower cases
                x amount of letters
                x amount of digits
                x amount of spaces
                x amount of specials"


        Example Output:
        Given "12345 @!#$!@ TechGlobal" has:
         2 amount of upper cases
         8 amount of lower cases
         10 amount of letters
         5 amount of digits
         2 amount of spaces
         6 amount of specials
 */


    //public static int countLowerCase(String s) {
      //  int upperC = 0, lowerC = 0, letterC = 0, digitC = 0, specialC = 0;





