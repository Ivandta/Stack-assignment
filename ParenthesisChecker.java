public class ParenthesisChecker {

    public static boolean check(String expression) {
        MyStack stack = new MyStack();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(String.valueOf(ch));
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char open = stack.pop().charAt(0);

                if (ch == ')' && open != '(') {
                    return false;
                } else if (ch == ']' && open != '[') {
                    return false;
                } else if (ch == '}' && open != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
