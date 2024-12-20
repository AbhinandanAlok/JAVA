package stacks;
import java.util.Stack;
public class infixTOpostfic {
    private static int precedence(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        }
        return 0;
    }

    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        System.out.println("Infix Expression: " + infix);

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);

            // If it's a digit, push it to the value stack
            if (Character.isDigit(ch)) {
                val.push(String.valueOf(ch));
            }
            // If it's '(', push it to the operator stack
            else if (ch == '(') {
                op.push(ch);
            }
            // If it's ')', process the operators until '(' is encountered
            else if (ch == ')') {
                while (op.peek() != '(') {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
                }
                op.pop(); // Pop '(' from the operator stack
            }
            else {
                // Operator: process the stack based on precedence
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    String v2 = val.pop();
                    String v1 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 + o;
                    val.push(t);
                }
                op.push(ch);
            }
        }

        // After the loop, pop all remaining operators
        while (!op.isEmpty()) {
            String v2 = val.pop();
            String v1 = val.pop();
            char o = op.pop();
            String t =  v1 + v2 + o;
            val.push(t);
        }

        // The final prefix expression
        String postfix = val.pop();
        System.out.println("postfix Expression: " + postfix);
    }
}
