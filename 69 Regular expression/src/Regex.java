import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        //search pattern
        Pattern pattern=Pattern.compile("mehdi");
        Matcher matcher=pattern.matcher("mehdi");
        boolean b=matcher.matches();
        System.out.println("b = " + b);


        boolean b1=Pattern.compile("ali").matcher("ali").matches();
        System.out.println("b1 = " + b1);

        boolean b2=Pattern.matches("ali","ali");
        System.out.println("b2 = " + b2);

        boolean b3=Pattern.matches(".s","as");
        System.out.println("b3 = " + b3);

        boolean b4=Pattern.matches(".s","is");
        System.out.println("b4 = " + b4);

        System.out.println("Pattern.matches(\".s\",\" s\") = " + Pattern.matches("..s", "mas"));

        System.out.println("pattern = " + Pattern.matches("[abc]","ab"));
        System.out.println("pattern = " + Pattern.matches("[a-z]","A"));
        System.out.println("pattern = " + Pattern.matches("[A-Z]","A"));
        System.out.println("pattern = " + Pattern.matches("[0-9]","A"));
        System.out.println("pattern = " + Pattern.matches("[0-z]","A"));
        System.out.println("pattern = " + Pattern.matches("[a-zA-Z]","A"));

        System.out.println("Pattern.matches(\"[^a-z]\",\"Z\") = " + Pattern.matches("[^a-z]", "Z"));

        System.out.println("Pattern.matches(\"[a-d[m-p]]\",\"a\") = " + Pattern.matches("[a-d[m-p]]", "e"));

        System.out.println("Pattern.matches(\"[a-p&&[m-z]\",\"a\") = " + Pattern.matches("[a-p&&[m-z]]", "o"));
        System.out.println("Pattern.matches(\"[a-p&&[m-z]\",\"a\") = " + Pattern.matches("[a-p&&[^m-z]]", "b"));

        System.out.println("Pattern.matches(\"[a-z]?\",\"\") = " + Pattern.matches("[a-z]?", ""));
        System.out.println("Pattern.matches(\"[a-z]?\",\"\") = " + Pattern.matches("[a-z]?", "a"));

        System.out.println("Pattern.matches(\"[a-c]+\") = " + Pattern.matches("[a-c]+","abcacbabc"));
        System.out.println("Pattern.matches(\"[a-c]+\") = " + Pattern.matches("[a-c]+","abcacdbabc"));

        System.out.println("Pattern.matches(\"[a-c]*\",\"\") = " + Pattern.matches("[a-c]*",""));
        System.out.println("Pattern.matches(\"[a-c]*\",\"\") = " + Pattern.matches("[a-c]*","acac"));
        System.out.println("Pattern.matches(\"[a-c]*\",\"\") = " + Pattern.matches("[a-c]*","aceac"));

        System.out.println("Pattern.matches(\"[a-c]{3}\",\"abc\") = " + Pattern.matches("[a-c]{3}", "abc"));
        System.out.println("Pattern.matches(\"[a-c]{3}\",\"abc\") = " + Pattern.matches("[a-c]{3}", "ab"));
        System.out.println("Pattern.matches(\"[a-c]{3}\",\"abc\") = " + Pattern.matches("[a-c]{3}", "abz"));

        System.out.println("Pattern.matches(\"[a-c]{3,}\",\"abc\") = " + Pattern.matches("[a-c]{3,}","abc"));
        System.out.println("Pattern.matches(\"[a-c]{3,}\",\"abc\") = " + Pattern.matches("[a-c]{3,}","abccba"));
        System.out.println("Pattern.matches(\"[a-c]{3,}\",\"abc\") = " + Pattern.matches("[a-c]{3,}","cc"));
        System.out.println("Pattern.matches(\"[a-c]{3,}\",\"abc\") = " + Pattern.matches("[a-c]{3,}","abcde"));

        System.out.println("Pattern.matches(\"[a-c]{3,5}\",\"abc\") = " + Pattern.matches("[a-c]{3,5}","abc"));
        System.out.println("Pattern.matches(\"[a-c]{3,5}\",\"abc\") = " + Pattern.matches("[a-c]{3,5}","abcab"));
        System.out.println("Pattern.matches(\"[a-c]{3,5}\",\"abc\") = " + Pattern.matches("[a-c]{3,5}","abca"));
    }
}
