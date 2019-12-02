package CodingInterviews;

public class _18_1_DeleteNodeInList {

    public ListNode deleteNode(ListNode head, ListNode node) {
        if (head == null || node == null) return head;

        if (head == node) return head.next;

        if (node.next == null) {
            ListNode prev = head;
            while (prev.next != null && prev.next != node) prev = prev.next;

            if (prev.next != node) return head;

            prev.next = node.next;
        } else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
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

        _18_1_DeleteNodeInList p = new _18_1_DeleteNodeInList();

        ListNode dummy = p.deleteNode(node1, node5);
    }
}
