import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=0;
        int sum=0;
        while (number!=-1){
            System.out.println("Enter number");
            number= scanner.nextInt();
            sum+=number;
            System.out.println("sum is: "+sum);
        }
    }
}
