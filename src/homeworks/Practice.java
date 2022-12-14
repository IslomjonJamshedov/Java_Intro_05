package homeworks;

public class Practice {
    public static void main(String[] args) {

//        String str = "SAmir YASIN";
//        String s = str.replace("a", "");
//
//        System.out.println(s.replace("A", ""));

        String str = "code123copexxx";
        String str1 = "";


        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e'){
                str1 += "Java";
                i += 3;
            }else str1 += str.charAt(i);
        }
        System.out.println(str1);
    }
}
