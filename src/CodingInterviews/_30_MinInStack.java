package CodingInterviews;

import java.util.Stack;

public class _30_MinInStack {

    Stack<Integer> minStack = new Stack<>();
    Stack<Integer> stack = new Stack<>();

    public void push(int node) {
        if (!minStack.isEmpty())
            if (minStack.lastElement() > node)
                minStack.push(node);
            else
                minStack.push(minStack.lastElement());
        else
            minStack.push(node);
        stack.push(node);
    }

    public void pop() {
        minStack.pop();
        stack.pop();
    }

    public int top() {
        return stack.lastElement();
    }

    public int min() {
        return minStack.lastElement();
    }

}
