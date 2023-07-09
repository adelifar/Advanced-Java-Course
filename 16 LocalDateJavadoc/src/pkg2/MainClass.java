package pkg2;

import java.time.LocalDate;

/**
 * This is my main class that I use it.
 * @author Mehdi Adeli
 * @author Tosinso.com
 */
public class MainClass {
    /**
     * my main method
     * @param args input args
     */
    public static void main(String[] args) {
        //LocalDate
        LocalDate date;
        date= LocalDate.now();
        System.out.println(date.toString());
        date=LocalDate.of(2017,1,12);
        System.out.println(date.toString());
        date=date.plusDays(147);
        System.out.println(date);
        date=date.plusWeeks(45);
        System.out.println(date);
        System.out.println(date.getDayOfWeek().toString());
        LocalDate date1=LocalDate.now();
        System.out.println(date1.getDayOfWeek().toString());
        System.out.println(date1.getMonth().toString());
        System.out.println(date1.getDayOfYear());

        //classpath
        //.jar java archive
        //.zip
        System.out.println(TestJar.add(13,15));
        System.out.println(TestJar.sub(74,28));

        //java doc
    }

    /**
     * method that multiply int number
     * @param a first parameter
     * @param b second parameter
     * @return  result of multiply
     */
    public static int mul(int a,int b){return a*b;}
}
