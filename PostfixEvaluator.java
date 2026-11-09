public class PostfixEvaluator {

    public static int evaluate(String expression) {
        MyStack stack = new MyStack();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isDigit(ch)) {
                stack.push(String.valueOf(ch));
            } else {
                int angka2 = Integer.parseInt(stack.pop());
                int angka1 = Integer.parseInt(stack.pop());
                int hasil = 0;

                if (ch == '+') {
                    hasil = angka1 + angka2;
                } else if (ch == '-') {
                    hasil = angka1 - angka2;
                } else if (ch == '*') {
                    hasil = angka1 * angka2;
                } else if (ch == '/') {
                    hasil = angka1 / angka2;
                }

                stack.push(String.valueOf(hasil));
            }
        }

        return Integer.parseInt(stack.pop());
    }
}
