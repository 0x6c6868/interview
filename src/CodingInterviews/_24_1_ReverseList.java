package CodingInterviews;

public class _24_1_ReverseList {

    public ListNode ReverseList(ListNode head) {
        if (head == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while (next != null) {
            curr.next = prev;

            prev = curr;
            curr = next;
            next = curr.next;
        }

        curr.next = prev;
        return curr;
    }

}
