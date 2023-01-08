package homeworks;

public class HomeWork14 {

    public static void main(String[] args) {
        System.out.println("\n--------TASK-1-----------\n");
        findBuzz1(18);

        System.out.println("\n--------TASK-2-----------\n");
        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));

        System.out.println("\n--------TASK-3-----------\n");
        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045d"));

        System.out.println("\n--------TASK-4-----------\n");
        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c 6#"));
        System.out.println(findBiggestNumber("ab110c045d"));

        System.out.println("\n--------TASK-5-----------\n");
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbcca"));

    }

    //TASK 1
    public static void findBuzz1(int num) {
        for (int i = 0; i <= num; i++) {
            if (i % 15 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
    }

    //TASK 2
    public static String fizzBuzz2(int num){

            if (num % 15 == 0) return ("FizzBuzz");
            else if (num% 3 == 0)return ("Fizz");
            else if (num % 5 == 0) return("Buzz");
            else return String.valueOf(num);
    }
    //TASK 3
    public static int findSumNumbers(String str){
        int num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) num += Integer.parseInt("" + str.charAt(i));
        }return num;
    }

    public static int findBiggestNumber(String str){
        int max = 0;
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                num = (num * 10) + Integer.parseInt("" + str.charAt(i));
                max = Math.max(num, max);
            }
         else{
                num = 0;
            }
        }
        return max;
    }

    public static String countSequenceOfCharacters(String s) {
        if (s.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        char currentChar = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(count).append(currentChar);
                currentChar = s.charAt(i);
                count = 1;
            }
        }
        result.append(count).append(currentChar);
        return result.toString();
    }
}
