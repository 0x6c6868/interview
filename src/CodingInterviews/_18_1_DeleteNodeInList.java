package CodingInterviews;

import CodingInterviews.util.ListNode;

public class _18_1_DeleteNodeInList {
    static ListNode deleteNode(ListNode head, ListNode node) {
        if (head == null || node == null) return head;

        // 删除头节点
        if (head == node) {
            return head.next;
        }

        // 需要删除节点是尾节点
        if (node.next == null) {
            ListNode curr = head;
            while (curr.next == node) {
                curr.next = null;
                node = node.next;
            }
        }

        // 下个节点指向当前
        node.val = node.next.val;
        node.next = node.next.next;
        return head;
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

        deleteNode(node1, node1);

    }
}
