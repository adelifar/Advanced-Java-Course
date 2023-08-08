package arrayList;

public class Employee {
    public Employee(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Employee() {
    }

    private int number;
    private String name;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: "+name+" number: "+number;
    }
}
