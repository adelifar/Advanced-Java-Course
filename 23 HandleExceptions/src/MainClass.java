import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        //syntax error
//        int a=85
//          if a==96){}
//        b=102;


        //logical error
        System.out.println(square(2));
        System.out.println(square(4));
        System.out.println(square(5));
        System.out.println(square(10));


        //exception
        System.out.println(square2(2000000000));
        try {
            System.out.println(div(10, 2));
        } catch (FileNotFoundException e) {

        }
//        System.out.println(div(15, 0));

        int[] array = new int[]{5, 12, 300};
        System.out.println(array[0]);
//        System.out.println(array[3]);         Index 3 out of bounds for length 3
        Scanner scanner = null;
//        scanner.nextInt();                Cannot invoke "java.util.Scanner.nextInt()" because "scanner" is null

        try {
            System.out.println(div(70,12));
            int[] array2 = new int[]{5, 12, 300};
            System.out.println(array2[0]);
            System.out.println(array2[67]);
        }catch (ArithmeticException e){
            System.out.println("There is Arithmetic exception");
            System.out.println(e.getMessage());
            StackTraceElement[] elements=e.getStackTrace();
            for (StackTraceElement element:
                 elements) {
                System.out.println(element.getFileName()+" "+element.getLineNumber());

            }
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getStackTrace()[0].getFileName());
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {

        } finally {
            System.out.println("try catch finished");
        }

        try {
            tenth(15);
        } catch (FileNotFoundException e) {

        }
    }

    public static int square(int a) {
        return a + a * 2;
    }

    public static int square2(int a) {
        return a * a;
    }

    public static int div(int a, int b) throws FileNotFoundException {
//        if (b == 0) {
//            System.out.println("b can not be zero");
//            return 0;
//        }
        if (b==10) throw new ArrayIndexOutOfBoundsException("this is my test exception");
        return a / b;
    }
    public static void tenth(int a) throws FileNotFoundException {
        System.out.println( div(a,10));
    }
    /*
    ۱. خطای ورودی کاربر
    ۲.خطای دستگاه
    ۳.کمبود منابع
    ۴.خطای کد
     */

    // I/O
    //Runtime
    //try{}catch(){}
}
