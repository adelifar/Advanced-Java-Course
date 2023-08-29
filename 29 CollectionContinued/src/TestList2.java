import java.util.*;

public class TestList2 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("red");
        list1.add("blue");
        list1.add("green");
        list1.add("red");
        list1.add("white");
        list1.add("yellow");
        list1.add("black");
        list1.add("white");

        System.out.println(list1);
        //sort
        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1);

        Integer[] ints={5,6,1,12,201,32,84};
        List<Integer> numbers=new ArrayList<>();
        numbers=Arrays.asList(ints);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers,Comparator.reverseOrder());
        System.out.println(numbers);

        Person[] people={new Person(15,"Mehdi"),new Person(33,"Mohammad"),new Person(12,"Hosein")};
        List<Person> personList=Arrays.asList(people);
        Collections.sort(personList);
        System.out.println(personList);
        Collections.sort(personList,Collections.reverseOrder());
        System.out.println(personList);
        //bobble sort merge sort insertion sort ,quick sort

        //shuffle
        Collections.shuffle(numbers);
        System.out.println(numbers);

        //search
        System.out.println(numbers.contains(5));

        //binary search
        Collections.sort(numbers);
        int result=Collections.binarySearch(numbers,13);
        System.out.println(result);
        System.out.println(Collections.binarySearch(numbers,6));

        Collections.reverse(numbers);


        //fill
//        Collections.fill(numbers,0);
        System.out.println(numbers);

        Integer[] nums=new Integer[numbers.size()];
        List<Integer> numbers2=Arrays.asList(nums);
        Collections.copy(numbers2,numbers);
        System.out.println(numbers2);



        //min max
        System.out.println(Collections.min(numbers));
        System.out.println(Collections.max(numbers));

        //addAll
//        numbers.addAll(numbers2);
        List<Integer> numbers3=new ArrayList<>();
        numbers3.addAll(numbers);
        numbers3.addAll(numbers2);
        System.out.println(numbers3);

        //frequency
        System.out.println(Collections.frequency(list1,"red"));
        System.out.println(Collections.frequency(list1,"blue"));
        System.out.println(Collections.frequency(list1,"white"));

        //disjoint
        List<String> list=new ArrayList<>();
//        list.add("blue");
        list.add("Mehdi");
        System.out.println(Collections.disjoint(list1,list));

    }
}

