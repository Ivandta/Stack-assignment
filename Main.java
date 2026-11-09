public class Main {
    public static void main(String[] args) {
        // Contoh ekspresi yang akan diuji
        String parenthesis = "{x+(y-[a+b])}";
        String infix = "6-(2+3)*3";
        String postfix = "623+-382/+*";

        System.out.println("===== STACK ASSIGNMENT =====");

        System.out.println("\n1. CHECKING PARENTHESIS");
        System.out.println("Expression: " + parenthesis);
        if (ParenthesisChecker.check(parenthesis)) {
            System.out.println("Parenthesis are balanced.");
        } else {
            System.out.println("Parenthesis are not balanced.");
        }

        System.out.println("\n2. INFIX TO POSTFIX");
        System.out.println("Infix: " + infix);
        System.out.println("Postfix: " + InfixToPostfix.convert(infix));

        System.out.println("\n3. EVALUATING POSTFIX");
        System.out.println("Postfix: " + postfix);
        System.out.println("Result: " + PostfixEvaluator.evaluate(postfix));
    }
}