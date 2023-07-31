import java.util.Arrays;

public class MainClass2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("mehdi", 120.2, 1388, new int[]{1, 2, 3, 5, 8});
        emp1.setHireYear(1392);
        System.out.println(emp1.getHireYear());
        emp1.setHireYear(1900);
        System.out.println(emp1.getHireYear());
        emp1.setHireYear(-1);
        System.out.println(emp1.getHireYear());
        //encapsulation
        Employee emp2 = new Employee("Itpro", 125.5, 1396, new int[]{9, 10, 11});
        System.out.println(Arrays.toString(emp2.getNumbers()));
        int[] myArray = emp2.getNumbers();

        System.out.println(emp1.getName());
        System.out.println(emp2.getName());

        myArray[0] = 1232;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(emp2.getNumbers()));


        if (emp1.eq(emp2))
            System.out.println("objects are equal");
        else
            System.out.println("objects are not equal");
    }
}

//class pk1.Employee {
//    //fields
//    private String name;
//    private double salary;
//    private int hireYear;
//
//    public pk1.Employee(String n, double sa, int year) {
//        this.name = n;
//        this.salary = sa;
//        this.hireYear = year;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    public int getHireYear() {
//        return hireYear;
//    }
//
//    public void setHireYear(int hireYear) {
//        this.hireYear = hireYear;
//    }
//}
