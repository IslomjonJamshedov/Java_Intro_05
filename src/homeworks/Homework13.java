package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework13 {
    public static void main(String[] args) {

        //TASK 1
        System.out.println(hasLowerCase("JaVa"));

        //TASK 2
        Integer[] arr = {4,0,2};
        System.out.println(noZero(arr));

        //TASK 3
        int[] array = {1, 2, 3};
        System.out.println(Arrays.deepToString(numberAndSquare(array)));

        //TASK 4
        String[] str = {"abc", "def", "123", "Java", "Hello"};
        System.out.println(containsValue(str, "123"));

        //TASK 5
        System.out.println(reverseSentence("Java is fun"));

        //TASK 6
        System.out.println(removeStringCharacters("123Java #$%is fun"));

        //TASK 8
        String[] ar1 = {"Java", "is", "fun"};
        String[] ar2 = {"abc", "xyz", "fun"};
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")),
        new ArrayList<>(Arrays.asList("Java", "is", "xc"))));

        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#", "fun")),
                new ArrayList<>(Arrays.asList("C#", "is","Java","C#"))));



    }

    //TASK 1
    public static boolean hasLowerCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))){
                return true;
            }
        }return false;
    }

    //TASK 2
    public static ArrayList<Integer> noZero(Integer[] num){
        ArrayList<Integer> nums = new ArrayList<>();

        for (Integer i : num) {
            if (i != 0){
                nums.add(i);
            }
        }return nums;
    }

    //TASK 3
    public static int[][] numberAndSquare(int[] array) {
        int[][] result = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            result[i][0] = array[i];
            result[i][1] = array[i] * array[i];
        }
        return result;
    }

    //TASK 4
    public static boolean containsValue(String[] variable, String value){
        for (String s : variable) {
            if (s.equals(value)){
                return true;
            }
        }return false;
    }

    //TASK 5
    public static String reverseSentence(String sentence) {
        String[] words = sentence.split(" ");
        if (words.length < 2) {
            return "There is not enough words!";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String word = words[i];
            if (i == words.length - 1) {
                word = word.toLowerCase();
            } else if (i == 0) {
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
            }
            sb.append(word);
            sb.append(" ");
        }

        return sb.toString().trim();
    }


    //TASK 6
    public static String removeStringCharacters(String str){
        String st = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)) || Character.isSpaceChar(str.charAt(i))){
                st += str.charAt(i);
            }
        }return st;
    }

    //TASK 7
    public static String[] removeArraySpecialsDigits(String[] array) {
        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            String element = array[i];
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < element.length(); j++) {
                char ch = element.charAt(j);
                if (Character.isLetter(ch) || Character.isSpaceChar(ch)) {
                    sb.append(ch);
                }
            }
            result[i] = sb.toString();
        }
        return result;
    }


        //TASK 8
        public static ArrayList<String> removeAndReturnCommons(List<String> list1, List<String> list2) {
           ArrayList<String> commons = new ArrayList<>();
            for (String element : list1) {
                if (list2.contains(element)) {
                    commons.add(element);
                    break;
                }
            }
            return commons;
        }

    //TASK 9
    public static List<String> noXInVariables(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String element : list) {
            if (!"x".equalsIgnoreCase(element)) {
                element = element.replaceAll("(?i)x", "");
                result.add(element);
            }
        }
        return result;
    }
}




