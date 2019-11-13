package CodingInterviews;

public class _18_2_DeleteDuplicatedNode {

    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null) return null;

        ListNode head = null;

        ListNode preNode = null;
        ListNode currNode = pHead;
        while (currNode != null) {
            ListNode nextNode = currNode.next;

            if (nextNode != null && currNode.val == nextNode.val) {
                while (nextNode.next != null && nextNode.next.val == nextNode.val) nextNode = nextNode.next;

                if (preNode == null || preNode.val == currNode.val) {
                    preNode = nextNode.next;
                    head = preNode;
                } else {
                    preNode.next = nextNode.next;
                }

                currNode = nextNode.next;
            } else {

                if (preNode == null)
                    head = currNode;

                preNode = currNode;
                currNode = nextNode;
            }
        }
        return head;
    }

}
