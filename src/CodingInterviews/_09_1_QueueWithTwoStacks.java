package CodingInterviews;

import java.util.Stack;

public class _09_1_QueueWithTwoStacks {

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    static void push(int node) {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }

        stack1.push(node);
    }

    static int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        pop();
        pop();

        push(4);
        pop();

        push(5);
        pop();
        pop();

    }
}
