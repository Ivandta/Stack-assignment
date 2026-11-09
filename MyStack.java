public class MyStack {
    String[] data = new String[100];
    int top = -1;

    public void push(String value) {
        top++;
        data[top] = value;
    }

    public String pop() {
        String value = data[top];
        top--;
        return value;
    }

    public String peek() {
        return data[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
