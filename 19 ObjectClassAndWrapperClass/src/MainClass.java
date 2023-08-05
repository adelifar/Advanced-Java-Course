public class MainClass {
    public static void main(String[] args) {
        Employee employee = new Employee();
        //Object
        Object obj = new Employee();
        obj = new Student();
        Student student= (Student) obj;
        //int , long,double, char,short,boolean
        int[] a=new int[20];        //object
        a.toString();


        Employee employee1=new Employee();
        employee1.setName("Mehdi");
        employee1.setNumber(12);

        Employee employee2=new Employee();
        employee2.setName("Mehdi");
        employee2.setNumber(12);
        System.out.println(employee1==employee2);
        System.out.println(employee1.equals(employee2));

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        System.out.println(employee1);
        System.out.println(employee1.toString());

        //int , long,double, char,short,boolean

        Integer i=Integer.valueOf(25);
        Integer b=152;
        int c=b;
        //Number abstract class
        System.out.println(c);
        i=c;

        Number sdf=45;
        String s="213";
        int number=Integer.parseInt(s);
        i=c+number;

        System.out.println(Integer.parseInt(s,8));
        System.out.println(Integer.parseInt(s,16));
        int ss=Integer.valueOf("154",12);
        System.out.println(ss);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        double db = Double.NEGATIVE_INFINITY;

        System.out.println(Character.isLowerCase('o'));
        System.out.println(Character.isUpperCase('R'));

        Integer num1=40000;
        Integer num2=40000;
        System.out.println(num1==num2);
        System.out.println(num1.equals(num2));
        Integer nn=100;
        Integer nn2=100;
        System.out.println(nn==nn2);



    }
}
