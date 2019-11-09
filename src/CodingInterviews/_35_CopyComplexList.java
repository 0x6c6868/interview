package CodingInterviews;

public class _35_CopyComplexList {
    static RandomListNode clone(RandomListNode pHead) {
        if (pHead == null) return null;

        RandomListNode rst = null;

        // step 1 copy
        RandomListNode node = pHead;
        while (node != null) {
            RandomListNode copyNode = new RandomListNode(node.label);
            if (node == pHead) rst = copyNode;

            RandomListNode next = node.next;
            node.next = copyNode;
            copyNode.next = next;

            node = next;
        }

        // step 2 connect
        node = pHead;
        while (node != null) {
            if (node.random != null) node.next.random = node.random.next;
            node = node.next.next;
        }

        //step 3 break
        node = pHead;
        while (node != null) {
            RandomListNode nextNode = node.next;
            RandomListNode nextNextNode = node.next.next;

            node.next = nextNextNode;

            if (nextNextNode != null) {
                nextNode.next = nextNextNode.next;
            }

            node = nextNextNode;
        }

        return rst;
    }

    public static void main(String[] args) {
    }
}
