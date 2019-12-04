package CodingInterviews;

import java.util.Stack;

public class _31_StackPushPopOrder {

    public boolean IsPopOrder(int[] pushA, int[] popA) {
        if (pushA == null || popA == null) return false;
        if (pushA.length != popA.length) return false;

        Stack<Integer> s = new Stack<Integer>();
        int j = 0;
        for (int i = 0; i < pushA.length; ) {
            if (pushA[i] == popA[j]) {
                i++;
                j++;
                continue;
            }
            if (!s.isEmpty() && s.lastElement() == popA[j]) {
                s.pop();
                j++;
                continue;
            }
            s.push(pushA[i]);
            i++;
        }

        while (!s.isEmpty()) {
            if (s.pop() == popA[j]) {
                j++;
                continue;
            }
        }

        if (s.isEmpty() && j == popA.length) return true;
        return false;
    }

}
