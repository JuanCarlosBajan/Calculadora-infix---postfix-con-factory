public class Traductor<E> {

    Stack<Character> stack;
    StackFactory factory = new StackFactory<E>();

    public Traductor(String value){
        stack = factory.getStack(value);
    }

    // A utility function to return
    // precedence of a given operator
    // Higher returned value means
    // higher precedence
    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    // The main method that converts
    // given infix expression
    // to postfix expression.
    public String infixToPostfix(String exp) {
        // initializing empty String for result
        String result = new String("");

        // initializing empty stack


        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);

            // If the scanned character is an
            // operand, add it to output.
            if (Character.isLetterOrDigit(c))
                result += c;

                // If the scanned character is an '(',
                // push it to the stack.
            else if (c == '(')
                stack.push(c);

                //  If the scanned character is an ')',
                // pop and output from the stack
                // until an '(' is encountered.
            else if (c == ')') {
                while (!stack.empty() &&
                        stack.peek() != '(')
                    result += stack.pop();

                stack.pop();
            } else // an operator is encountered
            {
                while (!stack.empty() && Prec(c)
                        <= Prec(stack.peek())) {

                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        // pop all the operators from the stack
        while (!stack.empty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
        }
        return result;


    }
}
