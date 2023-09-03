import javafx.scene.effect.SepiaTone;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("blue");
        colors.add("yellow");
        colors.add("brown");
        colors.add("cyan");
        colors.add("grey");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        Set<String> strings=deleteDuplicate(colors);
        System.out.println("After delete duplicate");
//        for (String str :
//                strings) {
//            System.out.println(str);
//        }

        System.out.println(strings);
        SortedSet<String> strings2=deleteDuplicate2(colors);
        SortedSet<String> headGreen = strings2.headSet("green");
        System.out.println(headGreen);
        System.out.println(strings2.tailSet("green"));
    }
    public static Set<String> deleteDuplicate(List<String> list){
//        Set<String> mySet=new HashSet<>();
        Set<String> mySet=new TreeSet<>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            mySet.add(iterator.next());

        return mySet;
    }
    public static SortedSet<String> deleteDuplicate2(List<String> list){
//        Set<String> mySet=new HashSet<>();
        SortedSet<String> mySet=new TreeSet<>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
            mySet.add(iterator.next());

        return mySet;
    }
}
