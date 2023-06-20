public class MainClass {
    public static void main(String[] args) {
        char ch;
        String str;
        System.out.println("Welcome to project");
        str="Hello Itpro";
        System.out.println(str);
        String str2=str.substring(5,11);
        System.out.println(str2);
        String str3="Mehdi\t";
        String str4="Adeli\t";
        String str5="Itpro\t";
        String str6;
        int i=15;
        str6=str3+str4+str5+i;
        System.out.println(str6);

        String s1="Mehdi";
        String s2="Mehdi";
        boolean result=s1==s2;
        System.out.println(result);

        s2="Meh";
        String s3="di";
        s2=s2+s3;
        System.out.println(s2);
        result=s1==s2;
        System.out.println(result);
        boolean result2=s1.equals(s2);
        System.out.println(result2);
        String s4="mehdi";
        boolean result3=s1.equalsIgnoreCase(s4);
        System.out.println(result3);

        boolean ss="Mehdi".equalsIgnoreCase(s4);
        System.out.println(ss);

        int len=s1.length();
        System.out.println(len);
        boolean result4=s1.length()==0;
        System.out.println(result4);
        result4=s1.equals("");



        String st1="Itpro";
        ch=st1.charAt(3);
        System.out.println(ch);
        int ascii=st1.codePointAt(2);
        System.out.println(ascii);

        String st2="Mehdi";
        //A-Z  < a-z]
        int intResult=st1.compareTo(st2);
        System.out.println(intResult);
        intResult=st1.compareToIgnoreCase(st2);
        System.out.println(intResult);
        st2=String.join("/","Mehdi","Adeli","Hosein","Ahmadi");
        System.out.println(st2);
        st1="I"+"am"+" a"+" programmer";
        StringBuilder builder = new StringBuilder();
        builder.append("I");
        bui
    }
    enum Size{
        Small,
        Medium,
        Large,
        X_large
    }
}