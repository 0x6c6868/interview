package CodingInterviews;

public class _22_KthNodeFromEnd {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k < 0) return null;

        ListNode first = head;
        ListNode second = head;

        for (int i = 0; i < k; i++) {
            if (second == null) return null;
            second = second.next;
        }

        while (second != null) {
            second = second.next;
            first = first.next;
        }
        return first;
    }

}
