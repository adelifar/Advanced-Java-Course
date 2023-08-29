public class Person implements Comparable<Person> {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

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

    @Override
    public int compareTo(Person o) {
        //compare to  this>input +1 if this==input 0 if this<input -
        int number=this.age-o.age;
        return number;

//        if (this.age>o.age)
//            return 1;
//        else if(this.age<o.age)
//            return -1;
//        else if (this.age==o.age)
//            return 0;
//        return 0;
    }

    @Override
    public String toString() {
        return "Name: "+name+" age: "+age;
    }


}
