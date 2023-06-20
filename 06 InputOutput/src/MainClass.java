import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter text");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        System.out.println("Hello "+name);

        name=scanner.next();
        System.out.println(name);
        name=scanner.next();
        System.out.println(name);

        System.out.println("Please enter number");
        int number=scanner.nextInt();
        System.out.println(number);
        number*=10;
        System.out.println(number);

        System.out.println("Please enter double number");
        double doubleNumber=scanner.nextDouble();
        System.out.println(doubleNumber);
        boolean b=scanner.hasNext();
        System.out.println(b);


        number=5;
        String str="mehdi";
        System.out.println("my name is "+str+" and i am "+number+" years old");
        System.out.printf("my name is %s and I am %d years old",str,number);
        System.out.printf("\nmy name is %s and I am %d years %h old",str,number,15);
        System.out.printf("\nmy name is %s and I am %d years %x old",str,number,15);
        System.out.printf("\n%d %x %o %%",15,15,15);
        System.out.printf("\n%+d %x %o %%",15,15,15);
        System.out.printf("\n%(+,d %#x %#o %%",15254,15,15);
        number=15254;
        System.out.printf("\n%(+,d %1$d %1$x %1$o %%",number);
        System.out.printf("\n%d %<x %1$d %1$x %1$o %%",number);

        String str2=String.format("my name is %s and I am %d years old",str,number);
        System.out.println(str2);

        PrintWriter out=new PrintWriter("a.txt","UTF-8");
        out.println("Hello Itpro");
        out.println("Hello Itpro");
        out.println("Hello Itpro");
        out.println("Hello Itpro");
        out.println("Hello Itpro");
        out.println("Hello Itpro");
        out.close();
        Scanner scanner1=new Scanner(Paths.get("a.txt"),"UTF-8");
        System.out.println(scanner1.nextLine());
        System.out.println(scanner1.nextLine());
        System.out.println(scanner1.nextLine());
        System.out.println(scanner1.nextLine());
        System.out.println(scanner1.nextLine());
        System.out.println("finished");

    }
}
