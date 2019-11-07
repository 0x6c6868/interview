package CodingInterviews;

public class _24_ReverseList {
    static ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;

            if(next == null) {
                curr.next = prev;
                break;
            }

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return curr;
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

        ListNode rst = reverseList(node1);

    }
}
