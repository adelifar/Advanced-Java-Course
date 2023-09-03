import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        //stack
        //xyz
        Stack<String> stringStack = new Stack<>();
        stringStack.push("mehdi");
        stringStack.push("hosein");
        stringStack.push("mohammad");
        System.out.println(stringStack.size());

        //use stack like vector
        for (int i = 0; i < stringStack.size(); i++) {
            System.out.println(stringStack.get(i));
        }



        //
        for (int i = 0; i <= stringStack.size(); i++) {
            System.out.println(stringStack.pop());
        }
        System.out.println(stringStack.peek());
        if (!stringStack.isEmpty())
            System.out.println(stringStack.pop());

        int a = ((45 * 2) + (14 - 12 - (78 / 5 + (22 * 4))));
        //|((9=> |((2(15(88=>|((2(15=>|((2 =>( =>|

        //a()12->b()21->c()4->d()
        stringStack.empty();
        //stack uses vector
    }
}
