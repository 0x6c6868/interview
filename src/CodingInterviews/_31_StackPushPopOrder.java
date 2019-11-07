package CodingInterviews;

import java.util.Stack;

public class _31_StackPushPopOrder {

    static boolean isPopOrder(int[] pushA, int[] popA) {
        if (pushA == null && popA == null) return true;
        if (pushA == null || popA == null) return false;

        if (pushA.length != popA.length) return false;

        Stack<Integer> stack = new Stack();

        int i = 0;
        int j = 0;
        while (i < pushA.length || j < popA.length) {
            if (i < pushA.length && j < popA.length && pushA[i] == popA[j]) {
                i++;
                j++;
                continue;
            }

            if (j < popA.length && !stack.isEmpty() && stack.peek() == popA[j]) {
                stack.pop();
                j++;
                continue;
            }

            if (i == pushA.length) return false;

            stack.push(pushA[i]);
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
    }
}
