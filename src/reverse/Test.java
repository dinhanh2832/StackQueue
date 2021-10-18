package reverse;

import java.util.Stack;
public class Test {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String str = "123456";
        String[] arr = str.split("");
        for (String s : arr) {
            stack.push(s);
        }
        Stack<String> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            stack2.push(stack.pop());
        }
        System.out.println(stack2);
    }
}