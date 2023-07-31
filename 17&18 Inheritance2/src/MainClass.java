import pk1.Employee;
import pk1.Person;

public class MainClass {
    public static void main(String[] args) {
        //employee
            //manager
        Employee employee = new Employee("Mehdi");
//        employee.setName("Mehdi");
        employee.setSalary(1500);
        employee.work();

        Manager manager=new Manager("Mehdi Adeli");
//        manager.setName("Mehdi Adeli");
        manager.setSalary(1500);
        manager.work();

        System.out.println(employee.getSalary());
        System.out.println(manager.getSalary());
        Employee em1=new Manager("newManager");
        em1.work();

        System.out.println(employee.getSalary());
        System.out.println(manager.getSalary());
        CEO ceo=new CEO("Tosinso");
        //is-a relation

        Employee em2=new Employee("sdfwewe");
        em2=new Manager("sdfwef");
        em2=ceo;
        ceo.plan();
//        em2.plan();   error       //polymorphism

//        pk1.Person person=new pk1.Person();       person is abstract
        Person p=new Employee("sdsd");
        p=new Manager("sdf");
        p=new CEO("sdcwe");

        //instanceof
        if (p instanceof Manager){
            System.out.println("manager");
        }
        if (p instanceof Employee){
            System.out.println("employee");

        }

        float p1=3.14f;
        int pInteger= (int) p1;
        //casting
        Employee employee1= (Employee) p;
        employee1.work();

//        Manager manager1= (Manager) p;      ///class cast exception because p is employee
//        manager1.plan();
        if (p instanceof Manager){
            Manager manager1= (Manager) p;
            manager1.plan();
        }
    }
}
