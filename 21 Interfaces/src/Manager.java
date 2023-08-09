public class Manager extends Human implements SecondInterface{
    //implements
    public void showHello(String name) {
        System.out.println("Hello from manager "+name);
    }

    public void send(String message) {
        System.out.println("manager sending "+message);
    }
    //dependency injection
    public void testMethod(TestInterface test){

    }

//    @Override
//    public int addNumbers(int a, int b) {
//        return a+b;
//    }
}
