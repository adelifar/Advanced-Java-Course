import java.io.*;

public class SerializationTest {
    static class Student  {
        public Student(String name) {
            this.name = name;
        }

        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Employee implements Serializable {
        private double salary;
        private String name;
        private int age;
        private transient int tempData;
        private transient Student student;
private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException{
    System.out.println("Reading Objects from file or other source");
    in.defaultReadObject();
}
private void writeObject(ObjectOutputStream out) throws IOException{
    System.out.println("Writing Serialized Object ");
    out.defaultWriteObject();
}
        public Student getStudent() {
            return student;
        }

        public void setStudent(Student student) {
            this.student = student;
        }

        public Employee(String name, int age, double salary) {
            this.salary = salary;
            this.name = name;
            this.age = age;
        }

        public Employee() {
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
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

        @Override
        public String toString() {
            return name + " age:" + age + " with salary:" + salary;
        }

    }

    static class Manager extends Employee {
        private Employee Secretary;

        public Manager(String name, int age, double salary) {
            super(name, age, salary);
        }


        public Employee getSecretary() {
            return Secretary;
        }

        public void setSecretary(Employee secretary) {
            Secretary = secretary;
        }
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Employee("Mehdi Adeli", 30, 1000);
        employees[0].setStudent(new Student("Student 1"));
        employees[1] = new Employee("Hosein Ahmadi", 36, 1500);
        employees[2] = new Employee("Mohammad nasiri", 37, 2000);
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objects.dat"));
            out.writeObject(employees);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects.dat"));
            Employee[] readData = (Employee[]) in.readObject();
            for (Employee e : readData) {
                System.out.println(e);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Manager hosein = new Manager("Hosein", 37, 1500);
        Manager mohammad = new Manager("Mohammad", 35, 2000);
        Employee mehdi = new Employee("Mehdi", 30, 1000);
        hosein.setSecretary(mehdi);
        mohammad.setSecretary(mehdi);
        mehdi.setAge(35);
        System.out.println(mohammad.getSecretary().getAge());
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("objects2.dat"));
            Employee[] employees1 = new Employee[3];
            employees1[0] = hosein;
            employees1[1] = mohammad;
            employees1[2] = mehdi;
            out.writeObject(employees1);
            out.close();
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("objects2.dat"));
            Employee[] readData = (Employee[]) in.readObject();
            for (Employee e : readData) {
                System.out.println(e);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
