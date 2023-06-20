import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String myString = "";
        int counter = 0;
        int position = 0;
        myString = scanner.nextLine();
        for (int i = 0; i < myString.length(); i++) {  //itpro i am mehdi adeli
            if (myString.charAt(i) == 'a') {
                counter++;
                if (position > 0)
                    continue;
                position = i;
            }

        }
        System.out.println("Number of character a is: " + counter);
        System.out.println("position: "+position);
    }
}
