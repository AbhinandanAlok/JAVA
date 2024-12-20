package stacks;
import java.util.*;
public class infix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> val = new Stack<>(); // stack for operands
        Stack<Character> op = new Stack<>(); // stack for operators

        // Iterate through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                // Handle multi-digit numbers
                int num = 0;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }
                i--;  // Adjust index to account for the last increment
                val.push(num);  // Push the number onto the value stack
            }
            else if (ch == '(') {
                op.push(ch);  // Push opening parenthesis onto the operator stack
            }
            else if (ch == ')') {
                // Process the expression inside the parentheses
                while (op.peek() != '(') {
                    val.push(performOperation(val.pop(), val.pop(), op.pop()));
                }
                op.pop();  // Pop the '(' from the stack
            }
            else if (ch == '+' || ch == '-') {
                // Process operators with lower precedence (handle + and -)
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    val.push(performOperation(val.pop(), val.pop(), op.pop()));
                }
                op.push(ch);
            }
            else if (ch == '*' || ch == '/') {
                // Process operators with higher precedence (*, /)
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    val.push(performOperation(val.pop(), val.pop(), op.pop()));
                }
                op.push(ch);
            }
        }

        // Perform remaining operations
        while (!op.isEmpty()) {
            val.push(performOperation(val.pop(), val.pop(), op.pop()));
        }

        // The final result will be the only item left in the value stack
        System.out.println(val.pop());
    }

    // Function to determine operator precedence
    private static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }

    // Function to perform arithmetic operations
    private static int performOperation(int b, int a, char op) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            default: return 0;
        }
    }

}