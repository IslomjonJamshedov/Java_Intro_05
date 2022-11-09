package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {
    Pattern patter = Pattern.compile("a-zA-Z0-9{5,10}");
    Matcher matcher = patter.matcher("hello");

        System.out.println(matcher.matches());
    }
}
