public class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
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

    public class EmployeeProperties{
        private String message;
        public void showProperties(){
            message="name is: "+name +" and age is: "+age;
            System.out.println(message);
        }
    }
    private class EmployeeProperties1{
        private String message;
        public void showProperties(){
            message="name is: "+name +" and age is: "+age;
            System.out.println(message);
        }
    }
    public void properties(){
        EmployeeProperties1 prper=new EmployeeProperties1();
        prper.showProperties();
    }
    public static  class EmployeeBuilder{
        public Employee getInstance(){
            return new Employee();
        }
    }
}
