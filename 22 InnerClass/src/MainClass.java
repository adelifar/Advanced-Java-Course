public class MainClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Tosinso", 6);
        employee.properties();
        Employee.EmployeeProperties sdf;
        sdf = employee.new EmployeeProperties();
        sdf.showProperties();
        Employee.EmployeeBuilder builder = new Employee.EmployeeBuilder();
        Employee employee1 = builder.getInstance();
        EmployeeProperties p = new EmployeeProperties();
        p.showProperties();

        TestInterface t = new TestInterface() {
            @Override
            public void showMessage() {
                System.out.println("hi");
            }

            @Override
            public int addNumber(int a, int b) {
                return a + b;
            }
        };

        t.showMessage();


        class MyClass{
            public void showM(){
                System.out.println("this is message from inner class inside of main method");
            }
        }
        MyClass m=new MyClass();
        m.showM();
    }

    private static class EmployeeProperties {
        private String message;

        public void showProperties() {
            message = "hello tosinso member";
            System.out.println(message);
        }
    }
}
