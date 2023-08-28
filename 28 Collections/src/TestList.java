import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestList {
    public static void main(String[] args) {
//        ArrayList<String> colorList=new ArrayList<>();
//        List<String> colorList=new ArrayList<>();
        List<String> colorList=new Vector<>();
        colorList.add("blue");
        colorList.add("green");
        colorList.add("black");
        colorList.add("red");
        colorList.add("white");
        colorList.add("yellow");
        colorList.remove(0);
        colorList.remove("red");
        colorList.add(2,"brown");
        int size=colorList.size();
        for (int i = 0; i < size; i++) {
            System.out.println(colorList.get(i));
        }
        //iterator
        for (String s :
                colorList) {
            System.out.println(s);
        }

        Iterator<String> iterator=colorList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(colorList.contains("cyan"));
        colorList.clear();
    }
}
