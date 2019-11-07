package CodingInterviews;

public class _24_2_ReverseListRecursion {

    static ListNode reverseList(ListNode head) {
        if (head == null) return null;
        return reverseListCore(head, head.next, 1);
    }

    static ListNode reverseListCore(ListNode curr, ListNode next, int lvl) {
        if (next == null) return curr;

        if (lvl == 1) curr.next = null;

        ListNode nextNext = next.next;
        next.next = curr;

        return reverseListCore(next, nextNext, lvl + 1);
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

        reverseList(node1);
    }
}
