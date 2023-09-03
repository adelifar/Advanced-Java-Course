import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("name","mehdi");
        map.put("color","blue");
        map.put("color","red");
        for (String string :
                map.keySet()) {
            System.out.println(string);
            System.out.println(map.get(string));
        }
        System.out.println(map.containsKey("age"));
        System.out.println(map.containsKey("color"));
        System.out.println(map.values());
    }
}
