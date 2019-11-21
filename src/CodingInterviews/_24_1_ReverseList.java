package CodingInterviews;

public class _24_1_ReverseList {

    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;

            if (next == null) {
                curr.next = prev;
                break;
            }

            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return curr;
    }

}
