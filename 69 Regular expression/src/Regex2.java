import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        System.out.println("Pattern.matches(\"(\\\\d){3}\",\"123\") = " + Pattern.matches("(\\d){3}", "123")); //[0-9]
        System.out.println("Pattern.matches(\"(\\\\D){2}\",\"12\") = " + Pattern.matches("(\\D){2}", "a2"));
        System.out.println("Pattern.matches(\"(\\\\D){2}\",\"12\") = " + Pattern.matches("(\\D){2}", "%%"));
        System.out.println("Pattern.matches(\"(\\\\D){2}\",\"12\") = " + Pattern.matches("(\\D){2}", "hg"));

        System.out.println("Pattern.matches(\"(\\\\s){3}\") = " + Pattern.matches("(\\s){3}","\t\t\t"));
        System.out.println("Pattern.matches(\"(\\\\S){3}\") = " + Pattern.matches("(\\S){3}","a b"));
        System.out.println("Pattern.matches(\"(\\\\S){3}\") = " + Pattern.matches("(\\S){3}","atb"));

        System.out.println("Pattern.matches(\"(\\\\w){2}\",\"a1\") = " + Pattern.matches("(\\w){2}", "a1"));
        System.out.println("Pattern.matches(\"(\\\\w){2}\",\"a1\") = " + Pattern.matches("(\\w){2}", "13"));
        System.out.println("Pattern.matches(\"(\\\\w){2}\",\"\") = " + Pattern.matches("(\\W){2}", "%%"));

        System.out.println(Pattern.matches("(\\d)(\\w)*","4aaa"));
        System.out.println(Pattern.matches("(\\d)(\\w)*","a4a5d"));

        System.out.println("Pattern.matches(\"(\\\\d){5}|(\\\\d)(\\\\w){4}\",\"12345\") = " + Pattern.matches("(\\d){5}|(\\d)[a-zA-Z]{4}", "12345"));
        System.out.println("Pattern.matches(\"(\\\\d){5}|(\\\\d)(\\\\w){4}\",\"12345\") = " + Pattern.matches("(\\d){5}|(\\d)[a-zA-Z]{4}", "1r345"));
        System.out.println("Pattern.matches(\"(\\\\d){5}|(\\\\d)(\\\\w){4}\",\"12345\") = " + Pattern.matches("(\\d){5}|((\\d)[a-zA-Z]){4}", "1rdas"));

        Pattern pattern=Pattern.compile(".*[Jj]ava.*");
        Matcher matcher=pattern.matcher("my java course");
        System.out.println(matcher.matches());

        Pattern pattern1=Pattern.compile("[j-k]ava");
        Matcher matcher1=pattern1.matcher("my java course");
        System.out.println(matcher1.find());
        System.out.println("matcher1.start() = " + matcher1.start());
        System.out.println("matcher1 = " + matcher1.end());

        String p="(\\w)(\\s+)([\\.,])";  //m .  e     ,
        String text="this  , java  . is my course\t. ";
        System.out.println(text.replaceAll(p,"$1$3"));

        text="this is good my java course. this java course is advanced";
        String[] splited=text.split("(\\s)([a-z]){2}(\\s)");
        System.out.println("Arrays.toString(splited) = " + Arrays.toString(splited));
        String emailPatter="(\\w){2,}+(@)(\\w){2,}(\\.)([a-zA-Z]){2,}";
        System.out.println(Pattern.matches(emailPatter,"myEmail@tosinso.info"));

    }
}
