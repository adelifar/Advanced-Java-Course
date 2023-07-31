package pk1;

public class Employee extends Person {
    //private , public, nothing , protected
//    private String name;
//    private double salary;
    protected double salary;

    public Employee(String name) {

//        this.name = name;
        super(name);
    }

    @Override
    public String getMyName() {
        return getName()+" "+getName();
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void work(){
        System.out.println(getName()+" working...");
    }
}
