package com.tosinso;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Class
        String s = "";
        Random random = new Random();
        Class cls = random.getClass();
        cls.getName();
        System.out.println(cls.getName());
        Main m = new Main();
        System.out.println(m.getClass().getName());

        Employee employee = new Employee();
        System.out.println(employee.getClass().getName());

        String className = "com.tosinso.Employee";
        try {
            Class clss = Class.forName(className);
            System.out.println(clss.getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//wrong
//        String className1="com.Tosinso.Employe";
//        try {
//            Class clss= Class.forName(className1);
//            System.out.println(clss.getName());
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        Class cl1 = Employee.class;
        System.out.println(cl1.getName());
        Class cl2=int.class;
        System.out.println(cl2.getName());
        Class cl3=char[].class;
        System.out.println(cl3.getName());
        Class cl4=Employee[].class;
        System.out.println(cl4.getName());


        Employee employee1=new Employee();
        employee1.setAge(20);
        employee1.setName("Mehdi");
        employee1.setSalary(100);

        Employee employee2=new Employee();
        employee2.setAge(22);
        employee2.setName("hOSEIIN");
        employee2.setSalary(200);

        if(employee1==employee2){
            System.out.println("Equal");
        }
        if(employee1.getClass()==employee2.getClass()){
            System.out.println("Classes are equal");
        }
        if(employee1.getClass()==Employee.class){
            System.out.println("Class is Employee");
        }
        if(employee1 instanceof Employee){
            System.out.println("Class is Employee");
        }


        String clName = "com.tosinso.Employee";
        try {
            Class clss = Class.forName(clName);
            System.out.println(clss.getName());
          Employee emp= (Employee) clss.newInstance();
          emp.setName("mehdi");
            System.out.println(emp.getName());

            Employee e= (Employee) Class.forName(clName).newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
