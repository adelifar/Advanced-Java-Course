import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Boolean(false));
        list.add(new Integer(47));
        list.add(LocalDateTime.now());
        Boolean bn = (Boolean) list.get(0);
//        Boolean bn1 = (Boolean) list.get(1); can not cast

        List<Integer> list1 = new ArrayList<>();
//        list1.add(true); //error
        list1.add(15);
        list1.add(785);
//        list1.add("Mehdi adeli"); //error

        MyGeneric<String> stringMyGeneric = new MyGeneric<>("Tosinso", "Website");
        System.out.println(stringMyGeneric.getFirst());
        System.out.println(stringMyGeneric.getSecond());

        MyGeneric<Integer> integerMyGeneric = new MyGeneric<>(74, 180);
        System.out.println(integerMyGeneric.getFirst());
        System.out.println(integerMyGeneric.getSecond());

        MyGeneric<LocalDate> localDateMyGeneric = new MyGeneric<>(LocalDate.now(), LocalDate.of(2018, 7, 5));
        System.out.println(localDateMyGeneric.getFirst());
        System.out.println(localDateMyGeneric.getSecond());

        MyGeneric myGeneric = new MyGeneric("Mehdi", 456);

        CompareGeneric<Integer> compareGeneric = new CompareGeneric<>();
//        int a=compareGeneric.getIntMax(157,21);
        int a = compareGeneric.getMax(157, 21);
//        int b=compareGeneric.getIntMax("mehdi","hosein")
        System.out.println(a);

        CompareGeneric<String> compareGeneric1 = new CompareGeneric<>();
        System.out.println(compareGeneric1.getMax("Mehdi", "Hosein"));


        CompareGeneric<Student> studentCompareGeneric = new CompareGeneric<Student>();
        Student st1 = new Student();
        st1.setAge(15);
        st1.setName("Mehdi");
        st1.setField("Computer engineering");

        Student st2 = new Student();
        st2.setAge(23);
        st2.setName("pouyan");
        st2.setField("electronic engineering");

        Student student = studentCompareGeneric.getMax(st1, st2);
        System.out.println(student.getName());


        //Number
        List<Number> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(14.2);
        numbers.add(155.85f);
        printList(numbers);

        List<Integer> integers = new ArrayList<>();
        integers.add(74);
        integers.add(123);
        integers.add(96);
        printList(integers);

        List<Double> doubles=new ArrayList<>();
        doubles.add(74.254);
        doubles.add(852.321);
        doubles.add(410.258);
        printList(doubles);

        List<String> strings=new ArrayList<>();
        strings.add("Mehdi");
        strings.add("Hosein");
        strings.add("mohammad");
//        printList(strings);  //error
    }

    public static void printList(List<? extends Number> numberList) {
        for (Number number :
                numberList) {
            System.out.print(number);
            System.out.print("\t");
        }
        System.out.println();
    }
    //wildcard

    class TestClass implements Comparable {

        @Override
        public int compareTo(Object o) {
            return 0;
        }
    }
}