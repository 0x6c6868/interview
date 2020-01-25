package CodingInterviews;

import java.util.Stack;

// 用两个栈实现队列
public class _09_QueueWithTwoStacks {
  Stack<Integer> stack1 = new Stack<>();
  Stack<Integer> stack2 = new Stack<>();

  public void push(int node) {
    stack1.push(node);
  }

  public int pop() {
    if (stack2.isEmpty()) while (!stack1.isEmpty()) stack2.push(stack1.pop());
    return stack2.pop();
  }
}
