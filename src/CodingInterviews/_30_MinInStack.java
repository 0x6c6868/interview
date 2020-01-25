package CodingInterviews;

import java.util.Stack;

// 包含min函数的栈
public class _30_MinInStack {

  private final Stack<Integer> minStack = new Stack<>();
  private final Stack<Integer> dataStack = new Stack<>();

  public void push(int node) {
    dataStack.push(node);
    if (minStack.isEmpty() || node < minStack.peek()) minStack.push(node);
    else minStack.push(minStack.peek());
  }

  public void pop() {
    minStack.pop();
    dataStack.pop();
  }

  public int top() {
    return dataStack.peek();
  }

  public int min() {
    return minStack.peek();
  }
}
