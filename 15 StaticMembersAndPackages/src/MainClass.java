import pack1.PackClass;
import pack1.pack2.Class2InPack2;

import java.time.LocalDate;

import static java.lang.Math.abs;

import  java.lang.Math;

public class MainClass {
    public static void main(String[] args) {
        StudentClass obj1,obj2;
        System.out.println(StudentClass.MY_CONSTANT);
        obj1=new StudentClass();
        obj2=new StudentClass();
        obj1.setNumber(52);
//        obj1.setStaticNumber(156);
        System.out.println(obj1.getNumber());
        System.out.println(obj1.getStaticNumber());
        obj2.setNumber(789);
//        obj2.setStaticNumber(obj2.getStaticNumber()+1);
        System.out.println(obj2.getNumber());
        System.out.println(obj2.getStaticNumber());
        System.out.println(obj1.getStaticNumber());

        int result=StudentClass.addNumbers(52,656);
        System.out.println(result);

        StudentClass obj0 = StudentClass.getNewClass();
        System.out.println(obj0.getNumber());

        PackClass packClass=new PackClass();
        Class2InPack2 sdfw=new Class2InPack2();
        LocalDate localDate=LocalDate.now();

        System.out.println(abs(-8));
        System.out.println(Math.pow(2,2));
    }
}
