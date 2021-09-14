package com.tosinso;

import java.io.*;

//record
public class Main {
    public static final int NAME_SIZE=50;
    //100+4+8=62
    public static final int RECORD_SIZE=112;
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
	//file pointer
        //seek
        //getFilePointer
        Employee[] employees=new Employee[3];
        employees[0]=new Employee("Mehdi Adeli ",29,1000.2);
        employees[1]=new Employee("Hosein Ahmadi ",35,2500.65);
        employees[2]=new Employee("Mohammad Nasiri",35,3000.2);
        try {
            DataOutputStream out=new DataOutputStream(new FileOutputStream("randomAccess.dat"));
            for (Employee e:employees){
                writeData(out,e);
            }
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            RandomAccessFile in=new RandomAccessFile("randomAccess.dat","r");

            int n= (int) (in.length()/RECORD_SIZE);
            Employee[] readEmployees=new Employee[n];
            for (int i = n-1; i >=0; i--) {
                in.seek(i*RECORD_SIZE);
                readEmployees[n-i-1]=readData(in);
            }
            in.close();
            for (Employee e:readEmployees)
                System.out.println(e);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static Employee readData(RandomAccessFile in) throws IOException {
        Employee employee=new Employee();
        employee.setName(readFixedString(NAME_SIZE,in));
        employee.setSalary(in.readDouble());
        employee.setAge(in.readInt());
        return employee;
    }

    private static void writeData(DataOutputStream out, Employee e) throws IOException {
        writeFixedString(e.getName(),NAME_SIZE,out);
        out.writeDouble(e.getSalary());
        out.writeInt(e.getAge());
    }
    private static void writeFixedString(String str, int size, DataOutput output) throws IOException {
        char ch;
        for (int i = 0; i < size; i++) {
            ch=0;
            if (i<str.length())ch=str.charAt(i);
            output.writeChar(ch);
        }
    }
    private static String readFixedString(int size,DataInput input) throws IOException {
        StringBuilder builder=new StringBuilder();
        int i=0;
        boolean more=true;
        while (more && i<size){
            char ch=input.readChar();
            if (ch==0)more=false;
            else builder.append(ch);
            i++;
        }
        input.skipBytes(2*(size-i));
        return builder.toString();
    }
}
