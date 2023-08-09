public class MainClass {
    public static void main(String[] args) {
        //class
        //inheritance
        //class 1 parent
        Employee c=new Employee();
        c.send("my messages");
        c.showHello("tosinso");
        c.eat();
        TestInterface manager=new Manager();
        manager.send("message2");
        manager.showHello("msm");

        TestInterface testInterface=new TestInterface() {
            @Override
            public void showHello(String name) {

            }

            @Override
            public void send(String message) {

            }
        };
        testInterface.showHello("");

        System.out.println(c instanceof TestInterface);

        System.out.println(TestInterface.NUM);
    }
}
