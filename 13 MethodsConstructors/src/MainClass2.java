public class MainClass2 {
    public static void main(String[] args) {
        Employee employee=new Employee("mehdi",12,12,new int[]{});

        System.out.println(employee.getHireYear());
        employee.changeEmployeeYear(employee);
        System.out.println(employee.getHireYear());
        int firstNumber=25;
        int result=employee.add(firstNumber,45);
        System.out.println(firstNumber);
        Employee employee1=employee.getNewEmployee();
        System.out.println(result);

        TestClass testClass=new TestClass();
        System.out.println(testClass.getName());

        Employee employee2=new Employee();
    }
}
