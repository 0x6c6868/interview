package CodingInterviews;

public class _35_CopyComplexList {

    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;

        RandomListNode curr = pHead;
        while (curr != null) {
            RandomListNode copy = new RandomListNode(curr.label);
            RandomListNode next = curr.next;
            curr.next = copy;
            copy.next = next;
            curr = next;
        }

        curr = pHead;
        while (curr != null) {
            if (curr.random != null)
                curr.next.random = curr.random.next;
            curr = curr.next.next;
        }

        curr = pHead;
        while (curr != null) {
            RandomListNode next = curr.next.next;
            if (curr.next.next != null)
                curr.next.next = curr.next.next.next;
            curr = next;
        }

        return pHead.next;
    }

    public static void main(String[] args) {

        RandomListNode node1 = new RandomListNode(1);
        RandomListNode node2 = new RandomListNode(2);
        RandomListNode node3 = new RandomListNode(3);
        RandomListNode node4 = new RandomListNode(4);
        RandomListNode node5 = new RandomListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        node1.random = node3;
        node2.random = node5;
        node4.random = node2;

        _35_CopyComplexList p = new _35_CopyComplexList();
        RandomListNode c = p.Clone(node1);
    }

}
