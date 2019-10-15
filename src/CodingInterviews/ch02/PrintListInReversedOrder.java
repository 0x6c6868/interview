package CodingInterviews.ch02;

import CodingInterviews.util.ListNode;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListInReversedOrder {

    static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
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

    public static void main(String[] args) {
        ListNode n1 = new ListNode(67);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(24);
        ListNode n4 = new ListNode(58);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        printListFromTailToHead(n1);
    }
}
