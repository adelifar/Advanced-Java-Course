import java.io.*;

public class SerialCloneTest {
    static class SerialClone implements Serializable,Cloneable{
        @Override
        protected Object clone() throws CloneNotSupportedException {

            try {
                ByteArrayOutputStream bout=new ByteArrayOutputStream();
                ObjectOutputStream out=new ObjectOutputStream(bout);
                out.writeObject(this);
                ByteArrayInputStream bin=new ByteArrayInputStream(bout.toByteArray());
                ObjectInputStream in=new ObjectInputStream(bin);
                return in.readObject();
            } catch (IOException e) {
               throw new CloneNotSupportedException(e.getMessage());
            } catch (ClassNotFoundException e) {
                throw new CloneNotSupportedException(e.getMessage());
            }
        }
    }
    static class Employee extends SerialClone {
        private double salary;
        private String name;
        private int age;
        private transient int tempData;



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

    public static void main(String[] args) {
        Employee employee=new Employee("Mehdi Adlei",30,1000);
        try {
            Employee employee1= (Employee) employee.clone();
            System.out.println(employee1.getName());
            employee1.setName("Hosein Ahmadi");
            System.out.println(employee);
            System.out.println(employee1);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
