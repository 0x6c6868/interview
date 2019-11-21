package CodingInterviews;

public class _22_KthNodeFromEnd {

    public ListNode findKthToTail(ListNode head, int k) {
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

}
