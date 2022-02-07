import java.util.Stack;

public class BalancedBrackets2 {

    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr) {
        // Using ArrayDeque is faster than using Stack class
        Stack<Character> stack = new Stack<Character>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);


            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty()) {
                return false;
            }
           
          /*  Character pop = stack.pop();
            
            if ((pop == '(' && (x == ']' || x == '}')) || (pop == '[' && (x == ')' || x == '}')) || (pop == '{' && (x == ')' || x == ']'))) {
            		return false;
			}*/

            Character peek = stack.peek();

            if (peek == '(' && x == ')') {
                stack.pop();
            } else if (peek == '[' && x == ']') {
                stack.pop();
            } else if (peek == '{' && x == '}') {
                stack.pop();
            } else {
                return false;
            }

        }
        return (stack.isEmpty());
    }

    // Driver code
    public static void main(String[] args) {
        String expr = "([)])";

        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}