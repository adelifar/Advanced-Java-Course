package action_classes;

import interfaces.ActionInterface;

public class SubtractClass implements ActionInterface {
    @Override
    public int action(int a, int b) {
        int c=a-b;
        return c;
    }
}
