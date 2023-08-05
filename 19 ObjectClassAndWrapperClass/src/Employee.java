public class Employee {
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
    public String introduce(){
        return name+" "+number;
    }

    @Override
    public boolean equals(Object obj) {
//        if (obj.getClass()==this.getClass())
        if (obj instanceof Employee){
            Employee emp= (Employee) obj;
            if (emp.number==this.number && emp.name.equals(this.name))
                return true;
            else return false;
        }else
            return false;
    }

    @Override
    public int hashCode() {
        return 1000;
    }

    @Override
    public String toString() {
        return introduce();
    }
}
