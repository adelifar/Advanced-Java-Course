public class Employee extends Human implements TestInterface,Comparable<Employee> {
    public void showHello(String name) {
        System.out.println("Hello "+name+" how are you");
    }

    public void send(String message) {
        System.out.println("it is sending "+ message);
    }

    @Override
    public int compareTo(Employee o) {
        if (getAge()==o.getAge())return 0;
        if (this.getAge()<o.getAge())return -1;
        if (this.getAge()>o.getAge())return 1;
        return 0;
    }
    //showHello
    //send
}
