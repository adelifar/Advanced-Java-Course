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

    public String getName() {
        return firstName + " " + lastname;
    }


    public double getSalary() {
        return salary;
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

    private int addNumbers(){
        int sum=0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        return sum;
    }
    public int[] getNumbers() {
//        return numbers;
        return Arrays.copyOf(numbers, numbers.length);
    }

    public boolean eq(Employee employee) {
        boolean b=this.firstName.equals(employee.firstName) ;
        boolean b1=this.lastname.equals(employee.lastname);
        boolean b2=this.salary==employee.salary;
        return b&&b1&&b2;
    }
}
