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
    }
}
