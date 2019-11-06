package CodingInterviews;

public class _18_2_DeleteDuplicatedNode {

    static ListNode deleteDuplication(ListNode pHead) {
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

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(3);
        ListNode node7 = new ListNode(4);
        ListNode node8 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;

        ListNode node9 = deleteDuplication(node1);

        System.out.println(node9);

    }
}
