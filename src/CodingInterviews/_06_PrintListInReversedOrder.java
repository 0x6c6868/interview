package CodingInterviews;

import java.util.ArrayList;

public class _06_PrintListInReversedOrder {

  private final ArrayList<Integer> rst = new ArrayList<>();

  public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    if (listNode == null) return rst;

    if (listNode.next != null) printListFromTailToHead(listNode.next);
    rst.add(listNode.val);

    return rst;
  }
}
