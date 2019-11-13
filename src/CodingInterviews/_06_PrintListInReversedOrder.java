package CodingInterviews;

import java.util.ArrayList;
import java.util.Stack;

public class _06_PrintListInReversedOrder {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack();

        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> rst = new ArrayList<>(stack.size());
        while (!stack.isEmpty()) {
            rst.add(stack.pop());
        }

        return rst;
    }

}
