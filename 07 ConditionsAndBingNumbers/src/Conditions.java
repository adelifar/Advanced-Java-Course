import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        //conditions
        //loop
//        int i = 255;
//        {
//            int j = i * 2;
//            System.out.println(j);
//            {
//                int k = j + 2;
//                {
//                    {
//                        int l=k-9;
//                    }
////                    l=8;      /error
//                }
//            }
//        }

        //یک خطی
        //variable=condition?statementTrue,statementFalse
        boolean b = 5 > 7;
        int i = b ? 78 : 85;
        System.out.println(i);
        int j = 78 != 77 ? 14 : 52;
        System.out.println(j);

        //if
        //if(condition)statement
        if (12 > 11) System.out.println("12 is greater");
        int a = 12;
        int c = 11;
        if (a < c) System.out.println("11 is greater");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("you are adult");
            System.out.println("hello adult");
        }
        if (age < 18) {
            System.out.println("You are still young");
            System.out.println("Hello kiddy");
        }

        if (age >= 18) {
            System.out.println("you are adult");
            System.out.println("hello adult");
        } else {
            System.out.println("You are still young");
            System.out.println("Hello kiddy");
        }

        if (age < 10) {
            System.out.println("salam koochooloo");
        } else if (age >= 10 && age < 20) {
            System.out.println("Salam no javan");
        } else if (age >= 20 && age < 30) {
            System.out.println("Salam javan");
        } else if (age >= 30 && age < 50) {
            System.out.println("Salam miansal");
        } else {
            System.out.println("Salam salkhorde");
        }

        if (age > 15)
            if (age > 22)
                System.out.println("sdfsdf");
            else System.out.println("sdfwef");

        //switch
        switch (age){
            case 15:
                //statement
                System.out.println("Hello 15 years old");
                break;
            case 22:
                System.out.println("Hello 22 years old");
                break;
            default:
                System.out.println("No case found");

        }

    }
}
