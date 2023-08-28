import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class TestLinkedList {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<>();
        list1.add("red");
        list1.add("blue");
        list1.add("green");
        printList(list1);

        List<String> list2 = new LinkedList<>();
        list2.add("white");
        list2.add("yellow");
        list2.add("black");
        printList(list2);
        list2.addAll(list1);
        printList(list2);
        convertToUpper(list2);
        printList(list2);
        printReverse(list2);
        removeRange(list2,2,4);
        printList(list2);
    }

    public static void printList(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "  ");
        }
        System.out.println();
    }
    public static void convertToUpper(List<String> list){
        ListIterator<String> iterator=list.listIterator();
        while (iterator.hasNext()) {
            String color=iterator.next();
            iterator.set(color.toUpperCase());
        }
    }
    public static void printReverse(List<String> list){
        ListIterator<String> iterator=list.listIterator(list.size());
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous()+" ");

        }
        System.out.println();
    }
    public static void removeRange(List<String> list,int min, int max){
        list.subList(min,max).clear();
    }
}
