public class Student implements Comparable<Student> {
    private int age;
    private String name;
    private String field;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    @Override
    public int compareTo(Student o) {
        Student iStudent= (Student) o;
        if (age> iStudent.getAge())
            return 1;
        else if (age< iStudent.getAge())
            return -1;
       else return 0;
    }
}
