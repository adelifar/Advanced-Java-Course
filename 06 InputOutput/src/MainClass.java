import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
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

        
    }
}
