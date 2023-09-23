public class CompareGeneric<T extends Comparable> {
    public T getMax(T first,T second){
        int result = first.compareTo(second);
        if (result>0)
            return first;
        if (result==0)
            return first;
        if (result<0)
            return second;
        return first;
    }
    public Integer getIntMax(Integer first , Integer second){
        return first>second?first:second;
    }


}
