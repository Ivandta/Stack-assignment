public class InfixToPostfix {

    public static String convert(String expression) {
        MyStack stack = new MyStack();
        String postfix = "";

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(ch)) {
                postfix = postfix + ch;
            } else if (ch == '(') {
                stack.push(String.valueOf(ch));
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek().charAt(0) != '(') {
                    postfix = postfix + stack.pop();
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && priority(stack.peek().charAt(0)) >= priority(ch)) {
                    postfix = postfix + stack.pop();
                }
                stack.push(String.valueOf(ch));
            }
        }

        while (!stack.isEmpty()) {
            postfix = postfix + stack.pop();
        }

        return postfix;
    }

    public static int priority(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else {
            return 0;
        }
    }
}
