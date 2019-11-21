package CodingInterviews;

public class _24_2_ReverseListRecursion {

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        return reverseListCore(head, head.next, 1);
    }

    private ListNode reverseListCore(ListNode curr, ListNode next, int lvl) {
        if (next == null) return curr;

        if (lvl == 1) curr.next = null;

        ListNode nextNext = next.next;
        next.next = curr;

        return reverseListCore(next, nextNext, lvl + 1);
    }

}
