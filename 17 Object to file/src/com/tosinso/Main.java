package com.tosinso;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    static class Employee{
        private String name;
        private int age;
        private double salary;

        public Employee(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public Employee() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return this.name +" has age:"+this.age+ " with salary:"+salary;
        }
    }

    public static void main(String[] args) {
        Employee[] employees=new Employee[3];
        employees[0]=new Employee("Mehid Adeli",30,1000);
        employees[1]=new Employee("Hosein Ahmadi",35,2000);
        employees[2]=new Employee("MOhammad Nasiri",35,3000);
        //format objCount name|age|salary
        try {
            PrintWriter writer=new PrintWriter("employee.txt","UTF-8");
            writeData(writer,employees);
            System.out.println("All of Data wrote to file");
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            Scanner reader=new Scanner(new FileInputStream("employee.txt"),"UTF-8");
            Employee[] newEmployees=readData(reader);       //todo implement readDAta
            for (Employee e:newEmployees){
                System.out.println(e);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }












    }

    private static Employee[] readData(Scanner reader) {
        int numberOfRecords=reader.nextInt();
        Employee[] employees=new Employee[numberOfRecords];
        reader.nextLine();
        for (int i=0;i<numberOfRecords;i++){
            employees[i]=readEmployee(reader);
        }
        return employees;
    }

    private static Employee readEmployee(Scanner reader) {
        String line=reader.nextLine();
        String[] tokens=line.split("\\|");
        String name=tokens[0];
        int age=Integer.parseInt( tokens[1]);
        double salary=Double.parseDouble(tokens[2]);
        return new Employee(name,age,salary);
    }

    private static void writeData(PrintWriter writer, Employee[] data) {
        writer.println(data.length);
        for (Employee e:data){
            writeEmployee(writer,e);
        }
    }

    private static void writeEmployee(PrintWriter writer, Employee e) {
        writer.println(e.getName()+"|"+e.getAge()+"|"+e.getSalary());
    }

}
