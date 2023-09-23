import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSyncList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("mehdi");
        list.add("adeli");
        List<String> sList= Collections.synchronizedList(list);
        List<String> mList=Collections.unmodifiableList(list);
//        mList.add("tosinso");     Error
    }
}
