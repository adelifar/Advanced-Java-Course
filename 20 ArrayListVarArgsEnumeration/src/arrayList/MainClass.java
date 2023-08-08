package arrayList;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        //array
        int[] a = new int[10];
        a[9] = 45;
        a = new int[1000];

        Employee[] employees = new Employee[10000];


        int n = 200;
        Employee[] employees1 = new Employee[n];

        Employee employee = new Employee();
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
//        employeeArrayList.add(employee);


        employees[0] = new Employee();
        employees[0].setNumber(1);
        employees[0].setName("Mehdi adeli");

        Employee emp = new Employee();
        emp.setName("tosinso.com");
        emp.setNumber(2);
        employees1[1] = emp;
        for (Employee em :
                employees) {
            System.out.println(em);
        }


        employee.setNumber(1);
        employee.setName("Hosein");
        employeeArrayList.add(employee);
        Employee emp1 = new Employee();
        emp1.setName("Mohammad");
        emp1.setNumber(2);
        employeeArrayList.add(emp1);
        employeeArrayList.add(new Employee(3,"Ahmadi"));
        employeeArrayList.add(new Employee(8,"Mehdi Adeli far"));
        employeeArrayList.set(1,new Employee(78,"tosinso.com website"));
        employeeArrayList.add(1,new Employee(88,"tosinsosoooo"));
        employeeArrayList.remove(1);
//        employeeArrayList.add(25,new Employee(48,"sdfds"));       //exception
        for (Employee emp2 :
                employeeArrayList) {
            System.out.println(emp2);
        }

        for (int i = 0; i < employeeArrayList.size(); i++) {
            System.out.println(employeeArrayList.get(i));
        }

        ArrayList<String> stringArrayList=new ArrayList<>();
        stringArrayList.add("something");

        ArrayList arrayList=new ArrayList();
        arrayList.add("mehdi");
        arrayList.add(12);

        System.out.println(employeeArrayList.size());

        //[]
        //add()
        //new array [*][-]
        //add
        //[*][*]
        ArrayList<String> stringArrayList1=new ArrayList<>(20);
        stringArrayList1.ensureCapacity(20);
        //5
        stringArrayList1.trimToSize();
        Employee tempE=employeeArrayList.get(0);
        System.out.println(tempE);

        ArrayList<Integer> ints=new ArrayList<>();
        System.out.println(employeeArrayList.indexOf(employee));
        System.out.println(employeeArrayList.indexOf(new Employee()));

        Employee[] myEmployees=new Employee[employeeArrayList.size()];
        myEmployees=employeeArrayList.toArray(myEmployees);
        System.out.println(myEmployees.length);


    }
}
