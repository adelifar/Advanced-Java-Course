import java.time.LocalDate;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        String string="";
        LocalDate localdate= LocalDate.now();
        arrayList.add(string);
        arrayList.add(localdate);

        String ss= (String) arrayList.get(0);
        //ClassCastException

        ArrayList<String> stringArrayList=new ArrayList<String>();
//        stringArrayList.add(localdate);

        //int , boolean , long , char, double, float
        int a=10;
        Integer aa=12;
        aa.intValue();

        Integer a1=12;  //boxing
        int b=a1;       //unboxing


    }
}
