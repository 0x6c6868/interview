package CodingInterviews;

public class _52_FirstCommonNodesInLists {

  public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    if (pHead1 == null || pHead2 == null) return null;

    int listOneLength = getCount(pHead1);
    int listTwoLength = getCount(pHead2);

    if (listOneLength > listTwoLength) pHead1 = goAhead(pHead1, listOneLength - listTwoLength);
    else if (listOneLength < listTwoLength) pHead2 = goAhead(pHead2, listTwoLength - listOneLength);

    while (pHead1 != null && pHead2 != null) {
      if (pHead1 == pHead2) return pHead1;
      pHead1 = pHead1.next;
      pHead2 = pHead2.next;
    }

    return null;
  }

  private int getCount(ListNode currNode) {
    int len = 0;
    while (currNode != null) {
      len++;
      currNode = currNode.next;
    }
    return len;
  }

  private ListNode goAhead(ListNode currNode, int step) {
    for (int i = 0; i < step; i++) currNode = currNode.next;
    return currNode;
  }
}
