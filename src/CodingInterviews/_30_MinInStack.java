package CodingInterviews;

import java.util.Stack;

public class _30_MinInStack {

    private Stack<Integer> stack1 = new Stack();
    private Stack<Integer> stack2 = new Stack();

    public void push(int node) {
        stack1.push(node);

        if (stack2.isEmpty()) {
            stack2.push(node);
            return;
        }

        int tmp = stack2.pop();
        if (node < tmp) {
            stack2.push(tmp);
            stack2.push(node);
        } else {
            stack2.push(tmp);
            stack2.push(tmp);
        }
    }

    public void pop() {
        stack1.pop();
        stack2.pop();
    }

    public int top() {
        if (stack1.isEmpty()) return -1;

        int tmp = stack1.pop();
        stack1.push(tmp);
        return tmp;
    }

    public int min() {
        if (stack2.isEmpty()) return -1;

        int tmp = stack2.pop();
        stack2.push(tmp);
        return tmp;
    }

}
