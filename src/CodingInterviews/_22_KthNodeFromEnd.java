package CodingInterviews;

import CodingInterviews.util.ListNode;

public class _22_KthNodeFromEnd {
    static ListNode findKthToTail(ListNode head, int k) {
        if (head == null) return head;

        ListNode kNode = null;
        ListNode currNode = head;
        int index = 0;
        while (currNode != null) {
            if (index == k - 1) {
                kNode = head;
            }
            index++;

            currNode = currNode.next;
            if (kNode != null && currNode != null) {
                kNode = kNode.next;
            }
        }
        return kNode;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        findKthToTail(node1, 5);
    }
}
