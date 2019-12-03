package CodingInterviews;

public class _23_EntryNodeInListLoop {

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) return null;
        if (pHead.next == null) return null;

        ListNode fast = pHead.next.next;
        ListNode slow = pHead.next;

        while (fast != slow) {
            fast = fast.next.next;
            slow = slow.next;
        }

        int len = 1;
        fast = fast.next;
        while (fast != slow) {
            fast = fast.next;
            len++;
        }

        ListNode first = pHead;
        ListNode second = pHead;

        for (int i = 0; i < len; i++) first = first.next;
        while (first != second) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

}
