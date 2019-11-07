package CodingInterviews;

public class _23_EntryNodeInListLoop {
    static ListNode entryNodeOfLoop(ListNode pHead) {

        if (pHead == null) return null;

        ListNode meetNode = meetingNode(pHead);
        if (meetNode == null) return null;

        int nodesInLoop = 1;
        ListNode currNode = meetNode;
        while (currNode.next != meetNode) {
            currNode = currNode.next;
            nodesInLoop++;
        }

        ListNode firstNode = pHead;
        for (int i = 0; i < nodesInLoop; i++) firstNode = firstNode.next;

        while (pHead != firstNode) {
            pHead = pHead.next;
            firstNode = firstNode.next;
        }

        return pHead;
    }

    static ListNode meetingNode(ListNode pHead) {
        if (pHead == null || pHead.next == null || pHead.next.next == null) return null;

        ListNode fastNode = pHead.next.next;
        ListNode slowNode = pHead;

        while (fastNode != slowNode &&
                fastNode != null &&
                fastNode.next != null) {
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
        }

        return fastNode.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        entryNodeOfLoop(node1);
    }
}
