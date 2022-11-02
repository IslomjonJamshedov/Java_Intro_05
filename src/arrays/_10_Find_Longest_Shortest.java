package arrays;

public class _10_Find_Longest_Shortest {
    public static void main(String[] args) {

    }


    public static void String (String[] strings){

        String shortStr = strings[0], longStr = strings[0];

        for (int i = 1; i < strings.length; i++) {
          if(longStr.length() < strings[i].length()){
              //my current longStr is smaller than current str reassign it.
                longStr = strings[i];
          }

        }
        System.out.println("Longest = " + longStr);
    }
}
