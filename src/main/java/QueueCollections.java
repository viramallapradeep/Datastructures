import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class QueueCollections {


    public static void main(String[] args) {


        String str = "{()}}";


        if (null == str || ((str.length() % 2) != 0)) {
            System.out.println("ooooNB");
        } else {
            char[] ch = str.toCharArray();
            for (char c : ch) {
                if (!(c == '{' || c == '[' || c == '(' || c == '}' || c == ']' || c == ')')) {
                    System.out.println("0000NB");
                }
            }
        }


        Stack<Character> stack = new Stack<>();

        for (Character ch : str.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            } else {
                if (!stack.empty()) {
                    if (ch == ')' && stack.peek().toString().equals("(")
                            || ch == ']' && stack.peek().toString().equals("[")
                            || ch == '}' && stack.peek().toString().equals("{")) {
                        stack.pop();
                    }
                }
            }
        }

        System.out.println(stack.empty() ? "B" : "NB");

    }


    private static boolean dequeWay(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char ch : str.toCharArray()) {

            if (ch == '{' || ch == '[' || ch == '(') {
                deque.offerFirst(ch);
            } else {
                if (!deque.isEmpty()
                        && ((deque.peekFirst() == '{' && ch == '}')
                        || (deque.peekFirst() == '[' && ch == ']')
                        || (deque.peekFirst() == '(' && ch == ')'))) {
                    deque.pollFirst();
                }
            }
        }

        return deque.isEmpty();
    }

}
