import java.util.Random;
import java.util.Scanner;

public class GameClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int number=random.nextInt(100);
        int userNumber=0;
        while (userNumber!=-1){
            System.out.println("Enter new Number");
            userNumber= scanner.nextInt();
            if (userNumber==number){
                System.out.println("You win!");
                break;
            }
            else
                System.out.println("You entered a wrong number");
        }
        System.out.println("The number was :"+number);
    }
}
