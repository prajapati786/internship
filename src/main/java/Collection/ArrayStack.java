package Collection;

import java.util.LinkedList;
import java.util.Stack;

public class ArrayStack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();//LIFO = Last In First Out
        stack.push("Vivek");
        stack.push("Dhaval");
        stack.push("Ajay");
        stack.push("Ajay");

        System.out.println(stack);
        stack.pop();//last In First Out
        System.out.println(stack);


    }
}
