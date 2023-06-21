import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String str;
        Scanner ssss;
        ssss=new Scanner(System.in);
        ssss.nextInt();
        System.out.println(Math.E);

        Student mehdiObject,student1;
        mehdiObject=new Student();
        student1=new Student();
        mehdiObject.name="Mehdi Adeli";
        mehdiObject.age=12;
        mehdiObject.average=16.2f;
        System.out.printf("name: %s and age:%d and avg: %f\n",mehdiObject.name,mehdiObject.age,mehdiObject.average);
        student1.name="itpro";
        System.out.println(student1.name);
        Student[] students=new Student[4];
        for (int i = 0; i < students.length; i++) {
            students[i]=new Student();
            students[i].name="Std"+i;
        }
        for (Student std :
                students) {
            System.out.println(std.name);
        }
    }
    static class Student{
        //encapsulation
        //property
        int number;
        String name;
        byte age;
        float average;
        int grade;

        //method
    }
}
