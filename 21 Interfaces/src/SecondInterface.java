public interface SecondInterface  extends TestInterface{
    default int addNumbers(int a,int b){
        return 0;
    }
}
