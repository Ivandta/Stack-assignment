# Stack Assignment

This project is a from-scratch implementation of the **Stack** data structure using the Java programming language. The project demonstrates how Stacks can be utilized to solve three classic computer science problems.

## 🚀 Features and Applications

This project applies the Stack data structure to three main use cases:

1. **Checking Parenthesis**: Verifies whether the parentheses (regular `()`, square `[]`, and curly `{}`) within a mathematical expression or string are balanced.

2. **Infix to Postfix Conversion**: Converts mathematical expressions from Infix notation (e.g., `A+B`) into Postfix notation (e.g., `AB+`).

3. **Evaluating Postfix**: Calculates and evaluates the final result of a mathematical expression written in Postfix format.

## 📂 File Structure

The project consists of several Java files, detailed as follows:

* `MyStack.java`: A custom implementation of a Stack data structure using an Array with a capacity of 100 `String` elements. It supports fundamental stack operations such as `push()`, `pop()`, `peek()`, and `isEmpty()`.

* `ParenthesisChecker.java`: Contains the logic to iterate through a string's characters and uses a stack to ensure every opening bracket has a corresponding and correctly ordered closing bracket.

* `InfixToPostfix.java`: Contains a simplified *shunting-yard* algorithm to convert an infix string into its postfix equivalent.

* `PostfixEvaluator.java`: Utilizes a stack to temporarily store operands and performs arithmetic calculations as soon as an operator is encountered to evaluate the final postfix result.

* `Main.java`: The driver class containing the main method and test cases to demonstrate the three applications above.

## 💻 How to Run the Program

Ensure that you have the **Java Development Kit (JDK)** installed on your machine.

1. Open your terminal or command prompt.

2. Navigate (using the `cd` command) to the directory where these Java files are located.

3. Compile all the Java files by running the following command:

   ```bash
   javac *.java
   ```

4. Execute the main program by running:

   ```bash
   java Main
   ```

## 📋 Example Output

When the program is executed, the expected output in the terminal is as follows:

```text
===== STACK ASSIGNMENT =====

1. CHECKING PARENTHESIS
Expression: {x+(y-[a+b])}
Parenthesis are balanced.

2. INFIX TO POSTFIX
Infix: 6-(2+3)*3
Postfix: 623+3*-

3. EVALUATING POSTFIX
Postfix: 623+-382/+*
Result: -11
```

*(Note: The exact output will depend on the expressions being tested inside `Main.java`)*