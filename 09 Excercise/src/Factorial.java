import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        long fact=1l;
        System.out.println("Enter number");
        count=scanner.nextInt();
        for (int i = count; i >0; i--) {
            fact=fact*i;
        }
        System.out.println("Factorial is: "+fact);
    }
}
