import java.util.Arrays;

public class Employee {
    //fields
//    private String name;
    private final String firstName;
    private String lastname;
    private double salary;
    private int hireYear;


    private int[] numbers;

    public Employee(String n, double sa, int year, int[] nn) {
//        this.name = n;
        this.firstName = n;
        this.lastname = "itpro";
        this.salary = sa;
        this.hireYear = year;
        numbers = nn;
    }

    public Employee() {
        firstName = "";
    }

    public Employee(String n) {
//        firstName="";
        this(n, 158, 851, new int[]{1});
    }

    public String getName() {
        return firstName + " " + lastname;
    }

    //accessor [return type] [method name](arguments int a , String b, double c, Employee ee, String[] sArray)
    public double getSalary() {

        //return data
        return salary;
    }

    public Employee getNewEmployee() {
        return new Employee("sdf", 15, 65, new int[]{});
    }

    public void changeEmployeeYear(Employee employee) {
        employee.hireYear = 144;
    }

    public int add(int a, int b, int c) {
        return 0;
    }

    public int add(double a, double b) {
        return 0;
    }

    public int add(int a, int b) {
        int c = a + b;
//        getSalary();
        a = 78;
        String str = String.valueOf(c);
        System.out.println(str);
        if (c > 50)
            return c;
        else {
            c = c + 52;
            return c;
        }
//        c=789;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int year) {
        if (year > 1396 || year < 1300)
            System.out.println("Hire year is invalid");
        else
            this.hireYear = year;
    }

    private int addNumbers() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public int[] getNumbers() {
//        return numbers;
        return Arrays.copyOf(numbers, numbers.length);
    }

    public boolean eq(Employee employee) {
        boolean b = this.firstName.equals(employee.firstName);
        boolean b1 = this.lastname.equals(employee.lastname);
        boolean b2 = this.salary == employee.salary;
        return b && b1 && b2;
    }
}
