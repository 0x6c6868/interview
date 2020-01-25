package CodingInterviews;

// 复杂链表的复制
public class _35_CopyComplexList {

  public RandomListNode Clone(RandomListNode pHead) {
    if (pHead == null) return null;

    // step 1
    RandomListNode currNode = pHead;
    while (currNode != null) {
      RandomListNode copyNode = new RandomListNode(currNode.label);
      copyNode.next = currNode.next;
      currNode.next = copyNode;
      currNode = copyNode.next;
    }

    // step 2
    currNode = pHead;
    while (currNode != null) {
      if (currNode.random != null) currNode.next.random = currNode.random.next;
      currNode = currNode.next.next;
    }

    // step 3
    RandomListNode nHead = pHead.next;
    currNode = pHead;
    while (currNode.next != null) {
      RandomListNode nextNode = currNode.next;
      currNode.next = nextNode.next;
      currNode = nextNode;
    }
    return nHead;
  }
}
