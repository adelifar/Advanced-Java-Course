import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter number of numbers");
        count = scanner.nextInt();
        int sum = 0;
        int sum2 = 0;
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number" + i);
            sum = scanner.nextInt();
            sum2 = sum2 + sum;
        }
        System.out.println("sum2 is: " + sum2);
        //sum/count
        int avg = sum2 / count;
        System.out.println("average is: " + avg);
    }
}
