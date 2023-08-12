package action_classes;

import interfaces.ActionInterface;

public class DivideClass implements ActionInterface {
    @Override
    public int action(int a, int b) {
        int c=0;
        try {
            c = a / b;
        }catch (Exception e){
            System.err.println("Wrong value");;
        }
        finally {
            return c;
        }

    }
    //Exception
}
