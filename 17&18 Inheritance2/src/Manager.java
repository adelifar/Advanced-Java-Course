import pk1.Employee;

public class Manager extends Employee {
    public Manager(String name){
        super(name);
    }
    public final void plan(){
        System.out.println("manager " +getName()+" is planning for thin month");
    }

    public void work() {
        System.out.println("manager "+getName()+" is working");
    }
//super
    @Override
    public double getSalary() {
        return super.getSalary()*1.5;
    }
}
