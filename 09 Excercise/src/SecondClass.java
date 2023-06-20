import java.util.Scanner;

public class SecondClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter number of numbers");
        count = scanner.nextInt();
        int max=0,min=1000;
        int number;
        for (int i = 1; i <= count; i++) {
            System.out.println("Enter number"+i);
            number=scanner.nextInt();
            if (max<number){
                max=number;
            }
            if (min>number)
                min=number;
        }
        System.out.println("max is: "+max);
        System.out.println("min is: "+min);
    }
}
