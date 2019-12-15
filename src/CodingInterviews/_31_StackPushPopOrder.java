package CodingInterviews;

import java.util.Stack;

public class _31_StackPushPopOrder {

  public boolean IsPopOrder(int[] pushA, int[] popA) {
    if (pushA == null && popA == null) return true;
    if (pushA == null || popA == null) return false;

    Stack<Integer> stack = new Stack();
    for (int i = 0, j = 0; i < pushA.length; ) {
      stack.push(pushA[i++]);

      while (j < popA.length && stack.peek() == popA[j]) {
        stack.pop();
        j++;
      }
    }
    return stack.empty();
  }
}
